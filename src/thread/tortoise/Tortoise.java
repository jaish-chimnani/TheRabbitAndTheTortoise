package thread.tortoise;

import java.lang.Runnable;

public class Tortoise implements Runnable {
    private static final byte TOTAL_NUMBER_OF_MILESTONES = (byte) 5;
    private final Thread tortoise;

    private float timeInSeconds = 0f;

    public Tortoise() {
        this.tortoise = new Thread (this, "Tortoise");
    }

    public float getTimeInSeconds() {
        return timeInSeconds;
    }

    public Thread getTortoise() {
        return tortoise;
    }

    @Override
    public void run() {
        for (int index = 0; index < TOTAL_NUMBER_OF_MILESTONES; index++) {
            switch (index) {
                case 0:
                    System.out.println ("the tortoise has left the start line");
                    break;
                case 1:
                    System.out.println ("tortoise has reached the cool River");
                    break;
                case 2:
                    System.out.println ("Tortoise reached the mountain hill");
                    break;
                case 3:
                    System.out.println ("Tortoise reached the Big Dark Tree");
                    break;
                case 4:
                    System.out.println ("Tortoise reached the finish line");
                    break;
            }
            try {
                Thread.sleep (300l);
                timeInSeconds = timeInSeconds + 3;
            } catch (InterruptedException ie) {
                System.out.println ("Tortoise lost his path");
            }
        }
    }
}
