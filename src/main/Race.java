package main;

import thread.rabbit.Rabbit;
import thread.tortoise.Tortoise;

import javax.swing.*;

public class Race {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.getRabbit().start();
        Tortoise tortoise = new Tortoise ();
        tortoise.getTortoise ().start ();
        String winner;

        while((rabbit.getRabbit ().isAlive () || tortoise.getTortoise ().isAlive ())){
            if(tortoise.getTimeInSeconds () < rabbit.getTimeInSeconds ()){
                winner = "TORTOISE";
            }
            else if(rabbit.getTimeInSeconds () == tortoise.getTimeInSeconds ()){
                winner ="NOBODY";
            }
            else {
                winner = "RABBIT";
            }
            System.out.println ("Rabbit has finished in " + rabbit.getTimeInSeconds ()+" sec ");
            System.out.println ("Tortoise has finished in "+ tortoise.getTimeInSeconds ()+" sec ");
            JOptionPane.showMessageDialog (null,"Winner of the race is "+winner,"RESULTS",1);
        }
    }
}
