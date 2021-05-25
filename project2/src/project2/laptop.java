/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.Date;

/**
 *
 * @author SOFT
 */
public class laptop {
    public laptop(){}
    
    
    private String color;
    int size;
    int price;
    int birthdate;
   
    
      public laptop(int size,int price,int birthdate ){
      
        size=size;
        price=price;
        birthdate=birthdate;
        
     }
      
        
    
    
    
    
    Date d=new Date();
    int year=d.getYear()+1900;
    
    public void setColor(String color)
    {
        this.color=color;
    }
    
    int getAge(int birthdate){
        return year-birthdate;
    }
   
      int getsize(){
        return size;
    }
      int getprice(){
        return price;
    }
      String getcolor(){
        return color;
    }
    
}
