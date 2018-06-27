package com.intersection;

import java.util.HashMap;
import java.util.Map;

public class Step3 {
	public String process(int start, int end) {
		Map<String, Integer> wordsMap = new HashMap<String, Integer>();
		
		if (start > end)
			return "Start index cannot be greater than end";
		
		StringBuilder sb = new StringBuilder();
		for (int i=start; i<=end; i++) {
			if (i == 0)
				handleWord(wordsMap, sb, "integer");
			else if (String.valueOf(i).contains("3"))
				handleWord(wordsMap, sb, "lucky");
			else if (i % 3 == 0 && i % 15 != 0)
				handleWord(wordsMap, sb, "fizz");
			else {
				if (i % 5 == 0) {
					if (i % 15 == 0)
						handleWord(wordsMap, sb, "fizzbuzz");
					else
						handleWord(wordsMap, sb, "buzz");
				}
				else
					handleWord(wordsMap, sb, "integer");
			}
			sb.append(" ");
		}
		printTotals(wordsMap, sb);
		return sb.toString().trim();
	}

	private void printTotals(Map<String, Integer> wordsMap, StringBuilder sb) {
		sb.append("\n");
		sb.append("fizz: ").append(wordsMap.get("fizz")).append(" ");
		sb.append("buzz: ").append(wordsMap.get("buzz")).append(" ");
		sb.append("fizzbuzz: ").append(wordsMap.get("fizzbuzz")).append(" ");
		sb.append("lucky: ").append(wordsMap.get("lucky")).append(" ");
		sb.append("integer: ").append(wordsMap.get("integer"));
	}

	private void handleWord(Map<String, Integer> wordsMap, StringBuilder sb, String word) {
		sb.append(word);
		if (wordsMap.get(word) == null)
			wordsMap.put(word, 1);
		else			
			wordsMap.put(word, wordsMap.get(word)+1);
	}
}
