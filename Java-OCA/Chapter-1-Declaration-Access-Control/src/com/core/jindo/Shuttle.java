package com.core.jindo;

/**
 * @author ManhKM on 6/2/2022
 * @project Java-OCA
 */
public class Shuttle extends Rocket{
    public static void main(String[] args) {

        new Shuttle().go();
    }

    void go() {
        blastOff();  // logic something
        //Rocket.blastOff();
        Rocket rocket = new Rocket();
        rocket.blastOff();
    }

     void blastOff(){
        System.out.println("sh-bang ");
    }
}
