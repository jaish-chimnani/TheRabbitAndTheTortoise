package thread.tortoise;
import java.lang.Runnable;
public class Tortoise implements Runnable {
    private static final byte TOTAL_NUMBER_OF_MILESTONES = (byte)5;
    private final Thread tortoise;

    private float timeInSeconds = 0f;

    public float getTimeInSeconds(){
        return timeInSeconds;
    }

    public Tortoise(){
        this.tortoise = new Thread(this,"Tortoise");
    }

    public Thread getTortoise(){
        return tortoise;
    }

    @Override
    public void run() {

    }
}
