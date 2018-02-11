package com.practice.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample2 {


	public static void main(String [] arg){
		String input="M@12hesh";
		
		Pattern pattern=Pattern.compile("[^a-zA-Z0-9]\\d{2}");
		Matcher matcher=pattern.matcher(input);
		System.out.println(matcher.lookingAt());
		System.out.println(matcher.matches());//this function also searches the entire string
		System.out.println(Pattern.matches(".*[^a-zA-Z0-9]\\d{2}.*",input));//static method matches will try to match the entire string
		System.out.println(pattern.pattern());
		while(matcher.find()){//find function will search for a subsequence in the input string to match the pattern
			System.out.println(matcher.group());
			System.out.println("Start: "+matcher.start()+" End :"+matcher.end());
		}
		System.out.println("Group COunt:"+matcher.groupCount());
		String [] stringArray=pattern.split(input);

		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}

	}
}
