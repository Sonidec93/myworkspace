package com.practice.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexExample{    
	public static void main(String[] args){    
		Scanner sc=new Scanner(System.in);  
		while (true) {    
			System.out.println("Enter regex pattern:");  
			Pattern pattern = Pattern.compile(sc.nextLine());    
			System.out.println("Enter text:");  
			Matcher matcher = pattern.matcher(sc.nextLine());    
			boolean found = false;    
			System.out.println(matcher.groupCount());
			//System.out.println(matcher.group(1));
			//System.out.println(matcher.group(2));//to use a groupcount i have to use a delimiter() to get the groupcount
			//System.out.println(matcher.group(1));
			while (matcher.find()) {   
				
				System.out.println(matcher.group(0));//to use a group(int value) first a find or a matches needs to be invoked of matcher class 
				System.out.println(matcher.group(2));
				//System.out.println(matcher.group(3));
				
				System.out.println("I found the text "+matcher.group()+" starting at index "+    
						matcher.start()+" and ending at index "+matcher.end());    
				found = true;    
			}    
			if(!found){    
				System.out.println("No match found.");    
				break;
			}    

		}
		sc.close();
	}    
}    