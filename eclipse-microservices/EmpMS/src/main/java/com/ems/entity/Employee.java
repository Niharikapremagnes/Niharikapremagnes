package com.ems.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private @Getter @Setter Long empId;
	    private @Getter @Setter String Name;
	    private @Getter @Setter Long salary;
	    private @Getter @Setter Long departmentId;

}
