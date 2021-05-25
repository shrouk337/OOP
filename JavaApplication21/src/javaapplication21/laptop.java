/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.Date;


public class laptop {
    String color;
    int screen_size;
    int RAM;
    int birthdate;
    
    Date d=new Date();
    int year=d.getYear()+1900;
    
    int getAge(int birthdate){
        return year-birthdate;
    }
     int getbirthdate(){
         return birthdate;
     }
     String getcolor(){
         return color;
     }
     int getRAM(){
         return RAM;
     }
     int screen_size(){
         return screen_size;
     }
    
    
}
