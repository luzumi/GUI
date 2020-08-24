import static java.lang.Thread.sleep;

/**
 * Created with IntelliJ IDEA,
 * User: corat
 * Date: 24.08.2020
 * Time: 17:15
 */
public class Freds implements Runnable{
    private final String name;
    Fredchen fredchen;
    Boolean flag;
    long time =System.nanoTime();

    public Freds(String name, Fredchen fredchen, boolean b){
        this.name = name;
        this.fredchen = fredchen;
        this.flag = b;

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("start " + name + " " + i);
            if (!flag){
                fredchen.first();
            }
            else fredchen.second();
        }
        System.out.println("Beende Thread " + name);
        System.out.println(System.nanoTime()-time);


    }
}
