package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List <String> listaDesideri = new ArrayList<>();  //creata collection
		
//		listaDesideri.add("desiderio prova");  //aggiungere un desiderio
//		listaDesideri.add("desiderio prova2");
		
//		System.out.println(listaDesideri);
//		for(String desiderio: listaDesideri) {
//			
//			System.out.println(desiderio);  //visualizzare a video lista desideri
//		}
		
		for(int i = -1; i < listaDesideri.size(); i++) {
		
			System.out.println("Vuoi aggiungere un desiderio? (Digitare 'si' o 'no')");
			String domanda = sc.nextLine();
		
			
			if(domanda.equalsIgnoreCase("si")) {
				
				System.out.println("Digitare desiderio");
				String des = sc.nextLine();
				listaDesideri.add(des);
//				System.out.println("Desiderio espresso: " + des);
			
				System.out.println("Lunghezza lista: " + listaDesideri.size());				
			}
		}
		
		listaDesideri.sort(null);
		System.out.println("Lista dei desideri ordinata: " + listaDesideri);
		
//		listaDesideri.clear();
		
	}
}
