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
public class KpopFans extends Fans {
    
    public KpopFans(){
    } 
       public KpopFans(String name){
     super(name);
    } 
     public void watchingPerformance(Musician musician,String ekspresi){
             System.out.println(name+":"+ekspresi+" melihat idolanya");
            musician.perform();
     }

}
