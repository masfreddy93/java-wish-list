package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static class StringComparator implements Comparator<String>{
		
		@Override
		public int compare(String o1, String o2) {
			
			int o1Count = 0;
			for(int i = 0; i < o1.length(); i++) {
				
				if(o1.charAt(i) == 'a' || o1.charAt(i) == 'e' || o1.charAt(i) == 'i' || o1.charAt(i) == 'o' || o1.charAt(i) == 'u') {
					
					o1Count ++;
				}
			}
			
			int o2Count = 0;
			for(int i = 0; i < o2.length(); i++) {
				
				if(o2.charAt(i) == 'a' || o2.charAt(i) == 'e' || o2.charAt(i) == 'i' || o2.charAt(i) == 'o' || o2.charAt(i) == 'u') {
					
					o2Count ++;
				}
			}
			
			if(o1Count > o2Count) return -1;
			else if (o1Count < o2Count) return 1;
			
			return 0;
		}
	}
	
	
	public static class StringCompEs2 implements Comparator<String>{
		
		@Override
		public int compare(String o1, String o2) {
							
			if(o1.compareTo(o2) < 0) return -1;
				
			return 0;
		}
	}
	
	public static void main(String[] args) {
		
//		String a = "lolita";
//		int aCount = 0;
//		
//		for (int i = 0; i < a.length(); i++) {
//			System.out.println(a.charAt(i));
//			
//			if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
//				
//				aCount++;
//			}
//		}
		
//		System.out.println(aCount);
		
		Scanner sc = new Scanner(System.in);
		
		List <String> listaDesideri = new ArrayList<>();  //creata collection
		
//		listaDesideri.add("desiderio prova");  //aggiungere un desiderio
//		listaDesideri.add("desiderio prova2");
		
//		System.out.println(listaDesideri);
//		for(String desiderio: listaDesideri) {  //foreach
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
				
//				continue;
			}
			
//			break;
		}
		
		
		
		listaDesideri.sort(null);
		System.out.println("Lista dei desideri ordinata: " + listaDesideri);
		
//		listaDesideri.clear();
		
		System.out.println("-----------");
		listaDesideri.sort(new StringComparator());
		System.out.println("Lista dei desideri in ordine per vocali contenute: " + listaDesideri);
		
		
		
		//PARTE 2 ES
		/*
		 * 1. Richiede all'utente una stringa e stampare ogni singolo carattere senza ripetizioni (ordinamento irrilevante)
		 *BONUS:* stampare i caratteri in ordine alfabetico
		 */
		
		Set<String> myStr = new HashSet<>();
		System.out.print("Inserire stringa: ");
		String userStr = sc.nextLine();
		
		//scomponi stringa digitata in stringhe di caratteri
		for(int i = 0; i < userStr.length(); i++) {
			
			Character c = userStr.charAt(i);
			String cs = "" + c;
			myStr.add(cs);
		}
		
		//stampa caratteri senza ripetizioni
//		for(String c: myStr) {
//			
//			System.out.println(c);
//		}
		
		System.out.println("Stampa stringa caratteri senza ripetizioni: " + myStr);
		System.out.println("------");
		
		
		//*BONUS:* stampare i caratteri in ordine alfabetico
		
		// per ordinare elementi converto set in list
		List<String> sortedList = new ArrayList<>(myStr);
		sortedList.sort(new StringCompEs2());
		
		System.out.println("Stampa stringa caratteri senza ripetizioni in ORDINE ALFABETICO" + sortedList);
		System.out.println("------");
		
		
		//2. Richiedere all'utente una stringa e mappare ogni singolo carattere con la relativa frequenza
		
		Map<Character, Integer> strEs2 = new HashMap<>();
		System.err.print("Inserire stringa: ");
		String uStrEs2 = sc.nextLine();
				
		

	      for(int i= 0 ; i< uStrEs2.length() ; i++) {
	          Character ch=uStrEs2.charAt(i);
	         if(strEs2.containsKey(ch)) {
	            int count = strEs2.get(ch);
	            strEs2.put(ch,count+1);
	         } else {
	             strEs2.put(ch,1);
	         }
	      }
		
		System.out.println(strEs2);
		
		//*BONUS:* stampare i caratteri in ordine alfabetico
		
		
		
		sc.close();
	}
}
