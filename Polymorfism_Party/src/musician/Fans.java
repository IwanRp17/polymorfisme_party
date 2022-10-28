/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musician;

/**
 *
 * @author ngend
 */
public class Fans {
    String name;
    public Fans(){
    name="Noname";
    }
    public Fans(String name){
    this.name=name;
    }
    
    public void showName(){
         System.out.println(name);
    }
    public void watchingPerformance(){
    System.out.println(name+": melihat idolanya dari youtube");
    }
    
    public void watchingPerformance(Musician musician){
    System.out.println(name+": melihat idolanya");
    musician.perform();
            
    }     
}
