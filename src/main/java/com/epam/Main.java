package com.epam;
import java.io.*;

public class Main {
	public static void main(String args[])throws IOException{
		System.out.println("New Year Gift");
		int y;
		sweet m=new sweet();
		chocolate n=new chocolate();
		System.out.println("Enter the Sweet u want as New Year Gift : ");
		System.out.println("Press 1 for RASOGULLA");
		System.out.println("Press 2 for RASMALAI");
		System.out.println("Press 3 for GOLAB JAMUN");
		System.out.println("Press 4 for BARFI");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		y=Integer.parseInt(br.readLine());
		switch (y){
			case 1:m.get_it(6,"RASOGULLA");
				break;
			case 2:m.get_it(10,"RASMALAI");
				break;
			case 3:m.get_it(8,"GOLAB JAMUN");
				break;
			case 4:m.get_it(5,"BARFI");
				break;
		}
		System.out.println("Enter the Chocolate u want as New Year Gift : ");
		System.out.println("Press 1 for Dairy Milk");
		System.out.println("Press 2 for 5 Star");
		System.out.println("Press 3 for Kit-Kat");
		System.out.println("Press 4 for mikky bar");
		BufferedReader c=new BufferedReader(new InputStreamReader(System.in));
		y=Integer.parseInt(c.readLine());
		switch (y){
			case 1:n.get_it(20,"perk");
				break;
			case 2:n.get_it(15,"Fuse");
				break;
			case 3:n.get_it(25,"Munch");
				break;
			case 4:n.get_it(35,"mikky bar");
				break;
		}
		System.out.println("You Recieved : ");
		System.out.println("Sweet : "+m.type );
		System.out.println("Chocolate : " +n.type);
		System.out.println("Sweet Weight : " +m.weight );
		System.out.println("Chocolate Weight : " + n.weight);
		System.out.println("Total Weight : "+(m.weight+n.weight));
		System.out.println("Sorted List of Gifts :");
		if(m.type.compareTo(n.type)>0)
			System.out.println(n.type +" -> "+m.type);
		else
			System.out.println(m.type +" -> "+ n.type);
 	
	}

}
