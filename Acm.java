import java.util.*;
/*
	Simple Java class to show ACM members how to use Git
	Author: Omar Farooq
	Date: 9-17-15
*/

public class Acm{
	private static String[] members = {
		"Omar Farooq",
		"Alexandru Pana",
		"John Keto",
		"Michael Dombrowski"
	};

	 public static void main(String[] args) {
		System.out.println("ACM Members:\n"+ Arrays.toString(members).replaceAll(",", "\n"));	
	}



}
