package com.sapient.test.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Enter the text to crypto:");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		parseExerciseOne(str);
		
		
		System.out.println("Enter the text to print the number of occurrences of the letters:");
		scanner = new Scanner(System.in);
		str = scanner.nextLine();
		parseExerciseTwo(str);
	}

	/*
	 * [a,A] -> 4 [e,E] -> 3 [i,I] -> 1 [o,O] -> 0 [s,S] -> 5 [t,T] -> 7 [b,D] -> 5
	 */
	private static void parseExerciseOne(String str) {
		if (str != null && !str.equals("")) {
			Map<Character, Character> map1 = new HashMap<>();
			map1.put('A', '4');
			map1.put('a', '4');
			map1.put('e', '3');
			map1.put('E', '3');
			map1.put('i', '1');
			map1.put('I', '1');
			map1.put('o', '0');
			map1.put('O', '0');
			map1.put('s', '5');
			map1.put('S', '5');
			map1.put('t', '7');
			map1.put('T', '7');
			map1.put('b', '5');
			map1.put('D', '5');
			System.out.print("Crypto text: ");
			List<Character> chars = str.chars().mapToObj(e->(char)e).collect(Collectors.toList());
			chars.forEach(c-> System.out.print(map1.containsKey(c)?map1.get(c):c));
			System.out.println("\n");
		} else {
			System.out.print("Field text is required");
		}
	}

	private static void parseExerciseTwo(String str) {
		if (str != null && !str.equals("")) {
			System.out.print("Result: ");
			int cont = 1;
			char ch = str.charAt(0);			
			for (int i = 1; i < str.length(); i++) {
				char c = str.charAt(i);
				if (ch == c) {
					cont++;
				} else {
					System.out.print(""+ ch + cont);
					cont = 1;
					ch=c;
				}
			}
			System.out.print(""+ ch + cont);
		} else {
			System.out.print("Field text is required +\n");
		}
	}
}
