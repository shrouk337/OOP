/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.Scanner;

/**
 *
 * @author SOFT
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      laptop hp=new laptop(14,7500,1958);
      laptop dell=new laptop(16,8000,2011);
      hp.setColor("red");
      dell.setColor("green");
      
      
      tablet nokia=new tablet(4,2000,2010,750);
      tablet oppo=new tablet(10,2500,2015,1000);
      nokia.setColor("red");
      oppo.setColor("black");
      
        Scanner input=new Scanner(System.in);
        System.out.println("for laptop  hp press 1");
        System.out.println("for laptop  dell press 2");
         System.out.println("for tablet nokia press 3");
         System.out.println("for tablet oppo press 4");
         System.out.println("what kind do you want");
         
         int n;
         n=input.nextInt();
         switch(n){
             case 1:System.out.println("size "+ hp.getsize() +" price "+hp.getprice()+" birthdate"+hp.getAge(hp.birthdate)+hp.getcolor());
                 break;
             case 2:System.out.println("size"+dell.size+"price"+dell.price+"birthdate"+dell.birthdate+dell.getcolor());
                 break;
             case 3:System.out.println("size"+nokia.size+"price"+nokia.price+"birthdate"+dell.birthdate+dell.getcolor());
             break;
             case 4:System.out.println("size"+oppo.size+"price"+oppo.price+"birthdate"+oppo.birthdate+"ram"+oppo.RAM+oppo.getcolor());
         }      
         
      
     
      
      
      
      
      
      
      
      
        
        
    }
    
}
