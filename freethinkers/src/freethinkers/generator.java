package freethinkers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class generator {

	public static void main(String[] args) {
		
		
		System.out.println(generatePassword(8));

	}
	 private static char[] generatePassword(int length)
	 {
	// TODO Auto-generated method stub
	
			String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String lowerCaseLetters = upperCaseLetters.toLowerCase();
			List<Character> specialCharacters = new ArrayList<Character>(getSpecialCharacters());
			/*
			 * for(int i=0; i<specialCharacters.size(); i++) {
			 * System.out.println(specialCharacters.get(i)); }
			 */
			StringBuilder sb = new StringBuilder();
			for(Character speciaChars: specialCharacters) {
				sb.append(speciaChars);
			}
			String special = sb.toString();
			StringBuilder sb1 = new StringBuilder();
			StringBuilder numbers = null;
			for(int i=0;i<10;i++) {
			    numbers = sb1.append(i);
				}
			
			String combinedChars = numbers+special+lowerCaseLetters;
			
			Random random = new Random();
			char[] password = new char[length];
			
			password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
			password[1] = upperCaseLetters.charAt(random.nextInt(upperCaseLetters.length()));
			password[2] = special.charAt(random.nextInt(special.length()));
			password[3] = numbers.charAt(random.nextInt(numbers.length()));
			
			for(int i = 4; i< length ; i++) {
		         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		      }
			
			return password;
	 }
	
	public static List<Character> getSpecialCharacters()
	{
		List<Character> specialCharacters = new ArrayList<Character>();
		for(int i=0;i<256;i++) {
			Character c = new Character((char) i);
			if(!Character.isDigit(c) && !Character.isLetter(c)) {
				specialCharacters.add(c);
			}
		}
		
		return specialCharacters;
		
	}
	

}
