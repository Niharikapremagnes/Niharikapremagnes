package com.la.app.controller;



import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.la.app.model.*;
import com.la.app.service.*;

@Controller
public class LeagueController {
	
	@Autowired
	LeagueRepository repository;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// Date - dd/MM/yyyy
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, false));
	}

	@RequestMapping(value = "/list-league", method = RequestMethod.GET)
	public String showTodos(ModelMap model) {
		String name = getLoggedInUserName(model);
		model.put("leagues", repository.findByUser(name));
		//model.put("todos", service.retrieveTodos(name));
		return "list-league";
	}

	private String getLoggedInUserName(ModelMap model) {
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		
		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}
		
		return principal.toString();
	}

	@RequestMapping(value = "/add-league", method = RequestMethod.GET)
	public String showAddLeaguePage(ModelMap model) {
		model.addAttribute("league", new League(0, getLoggedInUserName(model),
				"Default Desc", new Date(), false));
		return "league";
	}

	@RequestMapping(value = "/delete-league", method = RequestMethod.GET)
	public String deleteLeague(@RequestParam int id) {

		//if(id==1)
			//throw new RuntimeException("Something went wrong");
		repository.deleteById(id);
		//service.deleteTodo(id);
		return "redirect:/list-league";
	}

	@RequestMapping(value = "/update-league", method = RequestMethod.GET)
	public String showUpdateLeaguePage(@RequestParam int id, ModelMap model) {
		League league = repository.findById(id).get();
		//Todo todo = service.retrieveTodo(id);
		model.put("league", league);
		return "league";
	}

	@RequestMapping(value = "/update-league", method = RequestMethod.POST)
	public String updateLeague(ModelMap model, @Valid League league,
			BindingResult result) {

		if (result.hasErrors()) {
			return "league";
		}

		league.setUser(getLoggedInUserName(model));

		repository.save(league);
		//service.updateTodo(todo);

		return "redirect:/list-league";
	}

	@RequestMapping(value = "/add-league", method = RequestMethod.POST)
	public String addLeague(ModelMap model, @Valid League league, BindingResult result) {

		if (result.hasErrors()) {
			return "league";
		}

		league.setUser(getLoggedInUserName(model));
		repository.save(league);
		/*service.addTodo(getLoggedInUserName(model), todo.getDesc(), todo.getTargetDate(),
				false);*/
		return "redirect:/list-league";
	}
}
