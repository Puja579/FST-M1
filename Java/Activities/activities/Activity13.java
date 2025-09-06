package activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
	public static void main(String[]args) {
		
		List<Integer> intlist = new ArrayList<>();
		Scanner scan= new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Enter the number to add to list:");
		
		while(scan.hasNextInt()) {
			intlist.add(scan.nextInt());
		}
		
		System.out.println("List of numbers: " + intlist);
		scan.close();
		
		int genIndex = rand.nextInt(intlist.size()-1);
		System.out.println("Generated Index: " + genIndex);
		
		System.out.println("value at Index: " + intlist.get(genIndex));
		
		
	}

}
