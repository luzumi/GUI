/**
 * Created with IntelliJ IDEA,
 * User: corat
 * Date: 24.08.2020
 * Time: 17:58
 */
public class Fredchen {
    Integer flagFredchen = 0;

    public synchronized void first(){
        System.out.println("FIRST FRED" +flagFredchen);
        flagFredchen ++;
        notify();
    }

    public synchronized void second(){
        System.out.println("SECOND FRED" + flagFredchen);
        flagFredchen++;
        notify();
    }
}
