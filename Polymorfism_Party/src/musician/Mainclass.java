package musician;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author ngend
 */
public class Mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Fans fans1 = new Fans();
        Fans fans2 = new Fans("Mona");
        Fans fans3 = new KpopFans("Tomi");
        KpopFans fans4 = new KpopFans("Febi");
            
        fans1.watchingPerformance();
        fans2.watchingPerformance(new Musician());
        fans2.watchingPerformance(new Singer());
        fans3.watchingPerformance(new Biduan());
             fans4.watchingPerformance(new Kpop(), "teriak histeris");
    }
    
}
