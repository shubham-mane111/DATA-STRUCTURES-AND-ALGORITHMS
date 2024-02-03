package com.programs;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Shubham";
		char ch[] = str.toCharArray();
		int first = 0;
		char temp;
		int last = ch.length-1;
		while (first < last) {
			temp = ch[first];
			ch[first] = ch[last];
			ch[last] = temp;
			first++;
			last--;
		}
		
		String str1 = new String(ch);
		System.out.println(str1);
	}
}
