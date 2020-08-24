import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Created with IntelliJ IDEA,
 * User: corat
 * Date: 24.08.2020
 * Time: 16:41
 */
public class CookieCalculator extends JFrame{
    public JSlider getHungerSlider() {
        return HungerSlider;
    }

    public JSlider getAussehenSlider() {
        return aussehenSlider;
    }

    public JSlider getGeruchSlider() {
        return geruchSlider;
    }

    private JSlider HungerSlider;
    private JSlider aussehenSlider;
    private JSlider geruchSlider;
    private JPanel cookicalc;

    public void setlAusgabe(JLabel lAusgabe) {
        this.lAusgabe = lAusgabe;
    }

    private JLabel lAusgabe;

    public CookieCalculator() {
        super("CookiCalc");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(cookicalc);

        HungerSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                einkaufen();
            }
        });
        aussehenSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                einkaufen();
            }
        });
        geruchSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                einkaufen();
            }
        });

    }

    public void einkaufen(){
        if(getHungerSlider().getValue() + getGeruchSlider().getValue() + getAussehenSlider().getValue() >= 15) {
            lAusgabe.setText("Lecker - Kaufen und weiter");
            setlAusgabe(lAusgabe);
        }
        else {
            lAusgabe.setText("nicht gut, weiterschauen");
            setlAusgabe(lAusgabe);
        }
    }

}
