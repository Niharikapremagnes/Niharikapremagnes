package com.client;
import java.util.Scanner;
import com.service.*;
;

public class ClientReverseService {
	public static void main(String[] args) {
		ReverseService service=new ReverseServiceImpl();
		 Scanner input=new Scanner(System.in);
		 String originalString;
		 System.out.println("Enter a String to reverse :");
		 originalString= input.next();
		 System.out.println("Entered Original String :"+ originalString);
		  service.ReverseOrder(originalString);
		 input.close();	 
}}
