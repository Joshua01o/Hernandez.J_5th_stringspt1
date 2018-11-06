package string_game_joshua_h_5th;

import java.util.Scanner;

public class String_game_Joshua_H_5th {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        
        String Go; 

        String Look; 

        String Pantry;

        String Eat;

        //Multiple strings utilized
        
        System.out.println("Hello there, You are going to participate in a adventure. "+ "We will determine your story by the answers you reply with. "+ "First we need your information. What is your name?");
    
        System.out.print("> "); //Just to give it astetic
         
        String name = sc.nextLine(); 
  
         System.out.println("What do you Identify as?"); //Male or Female
         
         System.out.print("> ");
         
        char gender = sc.next().charAt(0); 
        
        System.out.println("How old are you?"); //No child murders
        System.out.print("> ");
        
        int age = sc.nextInt();
  
        System.out.println("Name: "+name); //Prints out the line
        
        System.out.println("Gender: "+gender); //Prints it out
        
        System.out.println("Age: "+age); // prints
        
        System.out.println(" WELCOME TO MY MURDER HOUSE!!!");

        System.out.println("  ");

        System.out.println( " You are in a creepy house! Would you like to go 'upstairs' or into the 'kitchen'? ");

        System.out.print( "> ");

        Go = sc.next();
        
        if (Go.contains("kitchen")){

            System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the 'refrigerator' or look in the 'pantry'. ");}

        System.out.print(">  ");
 
        Look = sc.next();


    if (Look.contains( "refrigerator" )){ 
        
    System.out.println("Inside the refrigerator you see food and stuff. It looks pretty nasty. Would you like to eat some of the food, 'Yes' or 'No'?");}

    System.out.print(">  ");

    Eat = sc.next();

    if (Eat.contains("Yes")){
    
        System.out.println("> ");
    
        System.out.println("You live!");

    } else if (Eat.contains("No")){
    
        System.out.println("> ");
    
        System.out.println("You die of starvation!");

    } else if (Look.contains( "pantry" )){
    
            System.out.println("There is a killer inside. Do you want to 'fight' them, or 'run away'?");

        System.out.print(">  ");

        Pantry = sc.next();

        if (Pantry.contains("fight")){

            System.out.println("> ");
    
            System.out.println(name+ " was weak and commited die");
        
        }

        else if(Pantry.contains("run away")){
        
            System.out.println(">  ");
    
            System.out.println(name+" has died because he was dumb");
        
            System.exit(0);    

        }

        }
    }
    
}