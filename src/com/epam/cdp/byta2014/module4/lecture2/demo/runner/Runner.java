package com.epam.cdp.byta2014.module4.lecture2.demo.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.epam.cdp.byta2014.module4.lecture2.demo.exception.FindByNameException;
import com.epam.cdp.byta2014.module4.lecture2.demo.model.*;

public class Runner {


	public static void main(String[] args) {
		boolean repeat = true;
		
		/*Car car;
        Ball ball = new Ball();
        Cubic cubic = new Cubic();
        Doll doll = new Doll();*/

		List<Toy> toyList = new ArrayList<>();

        //for (Toy elem : toyList) {                            //Заполняем коллекцию рандомным количеством объектов-игрушек.
            for (int i=1; i < (Math.random() * 100) + 1; i++){
            toyList.add(new Car());
            }
            for (int i=1; i < (Math.random() * 100) + 1; i++){
            toyList.add(new Ball());
            }
            for (int i=1; i < (Math.random() * 100) + 1; i++){
            toyList.add(new Cubic());
            }
            for (int i=1; i < (Math.random() * 100) + 1; i++){
            toyList.add(new Doll());
            }

       // }
       // public static void shuffle(List<?> toyList){   } тут мне надо его перемешать, эррейлист

        for (Toy elem : toyList) {
            String s = String.valueOf(elem.getPrice());  //вот тут я по идее не знаю, что это за класс. И надо либо делать GetClass, либо использовать Generics.
            System.out.print(s + " "); //Надо вывести какую-то дефолтную характеристику подкласса игрушки.
        }
//        Теперь надо вывести этот список пользователю - имена обектам чтоли попридумывать.
//                и типа что бы был список из оъектов, типа машики - 2, кубики - 4

		/*while(repeat) {
			System.out.println("1. - add a child to list");
			System.out.println("2. - find a child by name");
			System.out.println("3. - show list");
			System.out.println("0. - exit");


			Scanner scanner = new Scanner(System.in);
			int action = scanner.nextInt();
			
			switch(action) {
			case 0:
				repeat = false;
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
		}*/
	}

	
}
