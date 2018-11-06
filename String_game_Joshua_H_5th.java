package string_game_joshua_h_5th;

import java.util.Scanner;

public class String_game_Joshua_H_5th {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        
        String Go = null, Look, Pantry, Eat;
        
        System.out.println("Hello there, You are going to participate in a adventure. "+ "We will determine your story by the answers you reply with. "+ "First we need your information. What is your name?");
        System.out.print("> ");
         
        String name = sc.nextLine(); 
  
         System.out.println("What do you Identify as?");
         
        char gender = sc.next().charAt(0); 
        
        System.out.println("How old are you?");
        System.out.print("> ");
        
        int age = sc.nextInt();
  
        System.out.println("Name: "+name);
        
        System.out.println("Gender: "+gender);
        
        System.out.println("Age: "+age); 
        
        if (Go.equalsIgnoreCase("kitchen")){
            System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the 'refrigerator' or look in the 'pantry'. ");}

        System.out.print(">  ");
 
        Look = sc.next();


    if (Look.equalsIgnoreCase( "refrigerator" )){ 
        
    System.out.println("Inside the refrigerator you see food and stuff. It looks pretty nasty. Would you like to eat some of the food, 'Yes' or 'No'?");}

    System.out.print(">  ");

    Eat = sc.next();

    if (Eat.equalsIgnoreCase("Yes")){
    
        System.out.println("> ");
    
        System.out.println("You live!");

    } else if (Eat.equalsIgnoreCase("No")){
    
        System.out.println("> ");
    
        System.out.println("You die of starvation!");

    } else if (Look.equalsIgnoreCase( "pantry" )){
    
            System.out.println("There is a killer inside. Do you want to 'fight' them, or 'run away'?");

        System.out.print(">  ");

        Pantry = sc.next();

        if (Pantry.equalsIgnoreCase("fight")){
            System.out.println("> ");
    
            System.out.println("You are weak and commited die");
        
        }

        else if(Pantry.equalsIgnoreCase("run away")){
            System.out.println(">  ");
    
            System.out.println(name+" has died at the age of "+age "because he was slow and lost a lot of blood.");
        System.exit(0);    
        }

        }
    }
    }
    