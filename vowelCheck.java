package com.nt.practice;

public class vowelCheck {

	public static boolean checkVowel(String word) {
		return word.toLowerCase().matches(".*[aeiou].*");
	}
	
	public static void main(String[] args) {
			System.out.println(checkVowel("TV"));
	}
}
/*
 
public static void main(String[] args) {

		System.out.println(stringContainsVowels("Hello")); // true
		System.out.println(stringContainsVowels("TV")); // false

	}

	public static boolean stringContainsVowels(String input) {

		return input.toLowerCase().matches(".*[aeiou].*");

	}
 */