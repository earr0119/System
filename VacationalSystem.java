package vacsystem;

import java.util.Scanner;

public class VacationalSystem {
	public static void main(String args[]) {
		 
	    Scanner in = new Scanner(System.in);
	    String name = "";
	    int user = 0;
	    int antiquity = 0;

	    System.out.println("**************************************************");
	    System.out.println("**********************ShopApp*********************");
	    System.out.println("**************************************************");
	    System.out.println("");
	    System.out.println("");

	    System.out.print("What is the worker's name?: ");
	    name = in.nextLine().toUpperCase();
	    System.out.println("");

	    System.out.print("What is the worker's antiquity?: ");
	    antiquity = in.nextInt();
	    System.out.println("");
	   
	    System.out.print("What is the worker's user?: ");
	    user = in.nextInt();
	    System.out.println("");
	   
	    if(user == 1){
	     
	      if(antiquity == 1){ // sellers
	        System.out.print("Worker " + name.toUpperCase() + " is entitled to 6 days of vacation");
	      } else if(antiquity >= 2 && antiquity <= 6){
	        System.out.print("Worker " + name.toUpperCase() + " is entitled to 14 days of vacation");
	      } else if (antiquity >= 7){
	        System.out.print("Worker " + name.toUpperCase() + " is entitled to 20 days of vacation");
	      }

	    } else if(user == 2){ //logistic

	      if(antiquity == 1){
	        System.out.print("Worker " + name.toUpperCase() + " is entitled to 7 days of vacation");
	      } else if(antiquity >= 2 && antiquity <= 6){
	        System.out.print("Worker " + name.toUpperCase() + " is entitled to 15 days of vacation");
	      } else if (antiquity >= 7){
	        System.out.print("Worker " + name.toUpperCase() + " is entitled to 22 days of vacation");
	      }
	   
	    } else if(user == 3){//managers

	      if(antiquity == 1){
	        System.out.print("Worker " + name.toUpperCase() + " is entitled to 10 days of vacation");
	      } else if(antiquity >= 2 && antiquity <= 6){
	        System.out.print("Worker " + name.toUpperCase() + " is entitled to 20 days of vacation");
	      } else if (antiquity >= 7){
	        System.out.print("Worker " + name.toUpperCase() + " is entitled to 30 days of vacation");
	      }
	    } else {
	    System.out.print("Error!, the user of the department is wrong, please check!");
	  }
	 }
}
