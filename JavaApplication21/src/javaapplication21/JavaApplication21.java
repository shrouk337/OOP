/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       laptop hp=new laptop();
       laptop dell=new laptop();
       
       hp.birthdate=2010;
       dell.birthdate=2011;
        
       Scanner input=new Scanner(System.in);
        System.out.println("for hp press 1");
        System.out.println("for dell press 2");
        int choice=input.nextInt();
        switch(choice){
            case 1:System.out.println("Age is "+hp.getAge(hp.birthdate));
                break;
            case 2:System.out.println("Age is "+dell.getAge(dell.birthdate));
                break;
        }
    }
    
}
