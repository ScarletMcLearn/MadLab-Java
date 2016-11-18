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
    
    private String command, plural_noun, animal, location, singular_noun;
    private String[] adjectives = new String[2];
    private String[] past_participles = new String[2];
    
    
    private void inoutGetters()
    {   
        Scanner input = new Scanner(System.in);
        
        
//        System.out.println("Enter a command (e.g. eat, pray, slay): ");
//        this.command = input.next();
              
        
        System.out.println("Please enter a command (e.g. eat, pray, slay): ");
        
        String word = input.next();
        word = word.substring(0,1).toUpperCase()+word.substring(1, word.length());
        this.command = word;
        
        System.out.println("Please enter a plural noun (e.g. trees, books): ");
        this.plural_noun = input.next();
        
        System.out.println("Please enter an animal (e.g. goat, cow): ");
        this.animal = input.next();
        
        System.out.println("Please enter a location (e.g. Noah Kally, playground): ");
        this.location = input.next();
        
        System.out.println("Please enter a singular noun (e.g. tree, car): ");
        this.singular_noun = input.next();
        
        System.out.println("Please enter an adjective (e.g. big, sexy): ");
        this.adjectives[0] = input.next();
        
        System.out.println("Please enter another adjective (e.g. small, hot): ");
        this.adjectives[1] = input.next();
        
        System.out.println("Please enter a past participle (e.g. played, ate): ");
        this.past_participles[0] = input.next();
        
        System.out.println("Please enter another past participle (e.g. lived, sung): ");
        this.past_participles[1] = input.next();
        
    }
    
    
    private void labResult()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("##################################################################");
        System.out.println(command + ". But! " + command + " only if ye be " +  plural_noun + " of valor!");
        System.out.println("For the " + location + " is guarded by a " + animal + " so " + adjectives[1]  + ",");
        System.out.println("So " + adjectives[0] + ", that no " + singular_noun + " yet has " + past_participles[1] + " with it... And " + past_participles[0] + "!");
        System.out.println("##################################################################");
    }
    
    
    public void gameOn()
    {
        inoutGetters();
        labResult();
    }
    
}
