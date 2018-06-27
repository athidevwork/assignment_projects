package com.intersection;

public class Step1 {
	public String process(int start, int end) {
		if (start > end)
			return "Start index cannot be greater than end";
		
		StringBuilder sb = new StringBuilder();
		for (int i=start; i<=end; i++) {
			if (i == 0)
				sb.append(i);
			else if (i % 3 == 0 && i % 15 != 0)
				sb.append("fizz");
			else {
				if (i % 5 == 0) {
					if (i % 15 == 0)
						sb.append("fizzbuzz");
					else
						sb.append("buzz");
				}
				else
					sb.append(i);
			}
			sb.append(" ");
		}	
		return sb.toString().trim();
	}
}
