/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mad.lib.java;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class MadLib {
    
    
      void delayedPrint(int delay, String s) {
    try {
        for (char c : s.toCharArray()) {
            System.out.print(c);  // print characters without newline
            Thread.sleep(delay);  // wait for some milli seconds
        }
    } catch (InterruptedException e) {
    }
    System.out.println(); // finally, add a line break
    
      }
    
    private String command, plural_noun, animal, location, singular_noun;
    private String[] adjectives = new String[2];
    private String[] past_participles = new String[2];
    
    Scanner input = new Scanner(System.in);
    
    private void inoutGetters()
    {   
        
        
        
//        System.out.println("Enter a command (e.g. eat, pray, slay): ");
//        this.command = input.next();
              
        
        delayedPrint(250, "Please enter a command (e.g. eat, pray, slay): ");
        
        String word = input.next();
        word = word.substring(0,1).toUpperCase()+word.substring(1, word.length());
        this.command = word;
        
        delayedPrint(250, "Please enter a plural noun (e.g. trees, books): ");
        this.plural_noun = input.next();
        
        delayedPrint(250, "Please enter an animal (e.g. goat, cow): ");
        this.animal = input.next();
        
        delayedPrint(250, "Please enter a location (e.g. Noah Kally, playground): ");
        this.location = input.next();
        
        delayedPrint(250, "Please enter a singular noun (e.g. tree, car): ");
        this.singular_noun = input.next();
        
        delayedPrint(250, "Please enter an adjective (e.g. big, sexy): ");
        this.adjectives[0] = input.next();
        
        delayedPrint(250, "Please enter another adjective (e.g. small, hot): ");
        this.adjectives[1] = input.next();
        
        delayedPrint(250, "Please enter a past participle (e.g. played, ate): ");
        this.past_participles[0] = input.next();
        
        delayedPrint(250, "Please enter another past participle (e.g. lived, sung): ");
        this.past_participles[1] = input.next();
        
    }
    
    
    private void labResult()
    {
        delayedPrint(250, "");
        delayedPrint(250, "");
        delayedPrint(250, "##################################################################");
        delayedPrint(250, command + ". But! " + command + " only if ye be " +  plural_noun + " of valor!");
        delayedPrint(250, "For the " + location + " is guarded by a " + animal + " so " + adjectives[1]  + ",");
        delayedPrint(250, "So " + adjectives[0] + ", that no " + singular_noun + " yet has " + past_participles[1] + " with it... And " + past_participles[0] + "!");
        delayedPrint(250, "##################################################################");
    }
    
    
    public void gameOn()
    {   
            
            String choice;
            int counter = 0;
            
        do {      
            counter++;
            if (counter == 1)
            {
            delayedPrint(250, "Welcome to the JMad Lab!");
            delayedPrint(250, "Do you want to play the game?");
            delayedPrint(250, "1) Yupp! 2) Nope!");
            
             choice = input.next();
            
            if (choice.equals("1"))
            {
                inoutGetters();
                labResult();
            }
            
            else if(choice.equals("2"))
            {
                delayedPrint(250, "Goodbye!");
            }
            
            else
                delayedPrint(250, "Wrong pick bro, try again!");
            
            }
            
            else
            {
            delayedPrint(250, "Welcome back to the JMad Lab!");
            delayedPrint(250, "Do you want to play the game again?");
            delayedPrint(250, "1) Yupp! 2) Nope!");
            
             choice = input.next();
            
            if (choice.equals("1"))
            {
                inoutGetters();
                labResult();
            }
            
            else if(choice.equals("2"))
            {
                delayedPrint(250, "Goodbye!");
            }
            
            else
                delayedPrint(250, "Wrong pick bro, try again!");
            
            }
        } while (!choice.equals("2"));
        
    }
    
    
  

    
}
