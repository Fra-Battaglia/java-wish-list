package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<String> wishList = new ArrayList<>();
		
		while (true) {
			System.out.println("1 - Inserire desiderio");
			System.out.println("2 - Uscire e stampare lista");
			
			int userValue = in.nextInt();
			
			if(userValue < 1 || userValue > 2) {
				
				System.out.println("Valore non valido: Riprova");
				continue;
				
			}
			
			if(userValue == 2) {
				in.close();
				break;
			}
			
			in.nextLine();
			
			System.out.println("Esprimi un desiderio: ");
			String wish = in.nextLine();
			
			wishList.add(wish);
		}
		
		System.out.println("Lista dei desideri: ");
		System.out.println(wishList);
		
	}
}
