/**
 * Created with IntelliJ IDEA,
 * User: corat
 * Date: 21.08.2020
 * Time: 14:05
 */
public class Gui {
    public static void main(String[] args) {

        //ButtonFrame demo = new ButtonFrame("Demo");
        //demo.setSize(300,75);
        //demo.setVisible(true);

        //EinButtonFuerAlles colorDemo = new einButtonFuerAlles("ColorDemo");
        //colorDemo.setSize(300,75);
        //colorDemo.setVisible(true);

        //DreiAusEinButton dreiAusEinButton = new DreiAusEinButton("Einer gewinnt");
        //dreiAusEinButton.setSize(300,75);
        //dreiAusEinButton.setVisible(true);

        //Zahlenschloss zahlenschloss = new Zahlenschloss("Drücke die drei richtigen Schalter zum schließen");
        //zahlenschloss.setSize(zahlenschloss.breite, zahlenschloss.hoehe);
        //zahlenschloss.setVisible(true);

        //TxtBsp textBsp = new TxtBsp("TextBeipiel");
        //textBsp.setSize(400, 100);
        //textBsp.setVisible(true);

        //TemperatureCalculator temperatureCalcultaor = new TemperatureCalculator("Temperaturrechner");
        //temperatureCalcultaor.setSize(200,150);
        //temperatureCalcultaor.setVisible(true);

        //KalorienRechner kalorienRechner = new KalorienRechner("Calories from Fat");
        //kalorienRechner.setSize(150,300);
        //kalorienRechner.setVisible(true);

        //IdealWeight weightApp = new IdealWeight() ;
        //weightApp.setSize( 350, 225 );
        //weightApp.setResizable( false );
        //weightApp.setVisible( true );

        //SliderFive theApp = new SliderFive() ;
        //theApp.setSize( 400, 150 );
        //theApp.setResizable( false );
        //theApp.setVisible( true );

        //Idealgewicht idealGewicht = new Idealgewicht();
        //idealGewicht.setSize(300,400);
        //idealGewicht.setVisible(true);

        //CookieCalculator cookieCalculator = new CookieCalculator();
        //cookieCalculator.setSize(300,300);
        //cookieCalculator.setVisible(true);

        Fredchen fredchen = new Fredchen();

        Freds thread1 = new Freds("Thread 1", fredchen, false);
        Freds thread2 = new Freds("Thread 2", fredchen,true);
        Freds thread3 = new Freds("Thread 3",fredchen, false);
        Freds thread4 = new Freds("Thread 4",fredchen, false);
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);
        Thread t4 = new Thread(thread4);
        fredchen.first();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        //try {
        //    t1.join();
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}
        //try {
        //    t2.join();
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}
        //try {
        //    t3.join();
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}
        //try {
        //    t4.join();
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}
        System.out.println("FINITO AT " + (System.nanoTime()- thread1.time));
        System.out.println("FINITO AT " + (System.nanoTime()- thread2.time));
        System.out.println("FINITO AT " + (System.nanoTime()- thread3.time));
        System.out.println("FINITO AT " + (System.nanoTime()- thread4.time));

    }
}
