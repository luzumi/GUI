import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA,
 * User: corat
 * Date: 24.08.2020
 * Time: 15:53
 */
public class Idealgewicht extends JFrame implements ActionListener, ChangeListener {
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JSlider slider1;
    private JTextField textField1;
    private JPanel guiForm;

    public Idealgewicht(){
        super("Idealgewicht");
        add(guiForm);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider source = (JSlider)e.getSource();
            }
        });
        maleRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(calculateWeight()+"");
            }
        });
        femaleRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(calculateWeight()+"");
            }
        });
    }

    public JRadioButton getFemaleRadioButton() {
        return femaleRadioButton;
    }

    public JSlider getSlider1() {
        return slider1;
    }

    int calculateWeight(){
        if(!getFemaleRadioButton().isSelected()){
            return (int)((getSlider1().getValue()-100)*0.9);
        }
        else return (int)((getSlider1().getValue()-100)*0.8);
    }






    @Override
    public void actionPerformed(ActionEvent e) {

    }
    @Override
    public void stateChanged(ChangeEvent e) {

    }
}
