package com.epam.cdp.byta2014.module4.lecture2.demo.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.epam.cdp.byta2014.module4.lecture2.demo.exception.FindByNameException;
import com.epam.cdp.byta2014.module4.lecture2.demo.model.Child;
import com.epam.cdp.byta2014.module4.lecture2.demo.model.Person;

public class Runner {

	
	
	public static void main(String[] args) {
		boolean repaeat = true;
		
		Person mother = new Person("Irina", "Ivanova");
		Person father = new Person("Ivan", "Ivanov");
		
		List<Person> childList = new ArrayList<>();
		
		while(repaeat) {
			System.out.println("1. - add a child to list");
			System.out.println("2. - find a child by name");
			System.out.println("3. - show list");
			System.out.println("0. - exit");
			
			
			Scanner scanner = new Scanner(System.in);
			int action = scanner.nextInt();
			
			switch(action) {
			case 0:
				repaeat = false;
				System.out.println("Completed");
				break;
			
			case 1:
				System.out.println("Type First Name: ");
				String firstName = new Scanner(System.in).nextLine();
				System.out.println("Type Last Name: ");
				String lastName = new Scanner(System.in).nextLine();
				childList.add(new Child(firstName, lastName, mother, father));
				break;
				
			case 2:
				System.out.println("Type a name for search: ");
				String searchBy = new Scanner(System.in).nextLine();
				try {
					Utils.finadByName(searchBy, childList);
				} catch (FindByNameException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 3: 
				for(Person child : childList){
					System.out.println(child.getInfo());
				}
				break;
			default:
				System.out.println("Incorrect value! Please, try again.");
				break;
			}
		}
	}
	
	
}
