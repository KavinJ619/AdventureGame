package Lesson;

import java.util.*;

public class Adventuregame {
	public static int ehealth, eattack, uhealth, uattack, useropt,enemyNumber,useropt2,damageE, damageU, run;
	public static String uname, userop;
	public static String[] ename ={"Skeleton", "Warrior", "Fairy", "Dragon"};
	public static Scanner scan = new Scanner(System.in);
	public static Random rand= new Random();
	public static String turn="User";
	public static boolean isplay;
	
	
	public static void main(String[] args) {
		uhealth=100;
		ehealth=100;
		eattack=rand.nextInt(30);
		uattack=rand.nextInt(30);
		System.out.println("*********************************");
		System.out.println();
		System.out.println("Welcome to Kav Advent XII");
		System.out.println();
		System.out.println("*********************************");
		System.out.println("What do you want to do?");
		System.out.println("[1] Play" );
		System.out.println("[2] Exit");
		useropt=scan.nextInt();
		if (useropt == 1){
			play();
		}
		else {
			System.out.println("Hope you have a great time somewhere else!");
		}
		

	}
	
	
	
	public static void play(){
		enemyNumber=rand.nextInt(4);
		System.out.println("Your Enemy is: "+ename[enemyNumber]);
		System.out.println("What is your action?");
		System.out.println("[1] Attack");
		System.out.println("[2] Run!");
		
		
		while ((useropt2=scan.nextInt()) !=2){
			System.out.println("You attacked the: "+ename[enemyNumber]);
			ehealth=ehealth-uattack;
			if (uattack>20){
				System.out.println("Critical! you damaged your opponent "+uattack+" healthpoints");
			}
			else{
				System.out.println("You have attacked the "+ename[enemyNumber]+" and dealt "+uattack+" health points!");
			}
			
			System.out.println();
			System.out.println("The "+ename[enemyNumber]+" health is: "+ehealth);
			eattack = rand.nextInt(30);
			uhealth=uhealth-eattack;
			System.out.println();
			System.out.println();
			if (eattack>20){
				System.out.println("Critical! your opponent dealt "+eattack+" healthpoints");
			}
			else{
				System.out.println("The "+ename[enemyNumber]+" has dealt "+eattack+" health points!");
			}
			System.out.println();
			System.out.println("Your health is: "+uhealth);
			System.out.println();
			System.out.println();
			if (uhealth <= 0){
				System.out.println("You Lost!");
				System.out.println("The dragons still has "+ehealth+" health points!");
				break;
				
			}
			if (ehealth <=0){
				System.out.println("You have lost to the: "+ename[enemyNumber]);
				break;
				
			}
			System.out.println("What is your action?");
			System.out.println("[1] Attack");
			System.out.println("[2] Run!");
			
		
			
			if ((useropt2=scan.nextInt()) == 2){
				run=rand.nextInt(2);
				if (run==1){
					System.out.println("You got away Succesfully!");
					break;
				}
				if (run==2) {
					System.out.println("You failed to run. Stand and fight!");
					System.out.println("[1] Attack");
					System.out.println("[2] Run!");
				}
				
			}
			
			
			
		}
		
	
	
		
	}
	
	public static boolean isWon(){
		if (uhealth==0 || ehealth==0){
			return true;
		}
		
		return false;
	}
	
	
}
