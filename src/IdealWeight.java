import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA,
 * User: corat
 * Date: 23.08.2020
 * Time: 15:57
 */
public class IdealWeight extends JFrame implements ActionListener {
    JRadioButton genderM, genderF, statusSmall, statusMedium, statusStrong;
    ButtonGroup genderGroup, statusGroup;
    JPanel genderPanel, statusPanel;

    JRadioButton heightA, heightB, heightC, heightD, heightE;
    ButtonGroup heightGroup;
    JPanel heightPanel;
    JTextField resultText;
    JLabel resultLabel;
    Box resultPanel;

    public IdealWeight() {
        setTitle("Your IdealWeight");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        genderM = new JRadioButton("Male", true);
        genderF = new JRadioButton("Female", false);
        genderGroup =new ButtonGroup();
        genderGroup.add(genderM);
        genderGroup.add(genderF);
        genderPanel = new JPanel();
        genderPanel.setLayout(new BoxLayout(genderPanel, BoxLayout.Y_AXIS));
        genderPanel.add(new JLabel("Your Gender"));
        genderPanel.add(genderM);
        genderPanel.add(genderF);

        statusSmall = new JRadioButton("small", true);
        statusMedium = new JRadioButton("medium",false);
        statusStrong = new JRadioButton("strong", false);
        statusGroup = new ButtonGroup();
        statusGroup.add(statusSmall);
        statusGroup.add(statusMedium);
        statusGroup.add(statusStrong);
        statusPanel = new JPanel();
        statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.X_AXIS));
        statusPanel.add(new JLabel("Status"));
        statusPanel.add(statusSmall);
        statusPanel.add(statusMedium);
        statusPanel.add(statusStrong);
        genderPanel.add(statusPanel);

        statusSmall.addActionListener(this);
        statusMedium.addActionListener(this);
        statusStrong.addActionListener(this);
        statusSmall.setActionCommand("small");
        statusSmall.setActionCommand("medi");
        statusStrong.setActionCommand("strong");




        genderF.addActionListener(this);
        genderM.addActionListener(this);
        genderF.setActionCommand("fem");
        genderM.setActionCommand("male");


        // Height-Gruppe
        heightA = new JRadioButton("60 to 64 inches", true );
        heightB = new JRadioButton("64 to 68 inches", false );
        heightC = new JRadioButton("68 to 72 inches", false );
        heightD = new JRadioButton("72 to 76 inches", false );
        heightE = new JRadioButton("76 to 80 inches", false );

        heightGroup = new ButtonGroup();
        heightGroup.add( heightA );
        heightGroup.add( heightB );
        heightGroup.add( heightC );
        heightGroup.add( heightD );
        heightGroup.add( heightE );

        heightA.addActionListener(this);
        heightB.addActionListener(this);
        heightC.addActionListener(this);
        heightD.addActionListener(this);
        heightE.addActionListener(this);
        heightA.setActionCommand("hA");
        heightB.setActionCommand("hB");
        heightC.setActionCommand("hC");
        heightD.setActionCommand("hD");
        heightE.setActionCommand("hE");

        heightPanel = new JPanel();
        heightPanel.setLayout( new BoxLayout( heightPanel, BoxLayout.Y_AXIS ) );
        heightPanel.add( new JLabel("Your Height") );
        heightPanel.add( heightA ); heightPanel.add( heightB );
        heightPanel.add( heightC ); heightPanel.add( heightD );
        heightPanel.add( heightE );

        // Result-Panel
        resultText = new JTextField(7);
        resultText.setEditable( false );
        resultLabel = new JLabel("Ideal Weight in pounds");
        resultPanel = new Box(BoxLayout.X_AXIS);
        resultPanel.add( resultLabel );
        resultPanel.add( resultText );

        // Frame: verwendet den Standard Layoutmanager
        add( genderPanel, BorderLayout.WEST );
        add( heightPanel, BorderLayout.EAST );
        add( resultPanel, BorderLayout.SOUTH );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        switch (e.getActionCommand()) {
            case "hA":
                if (genderF.isSelected()) {
                    resultText.setText("" + femaleCalculator(60) + " - " + femaleCalculator(64));
                } else resultText.setText("" + maleCalculator(60) + " - " + maleCalculator(64));
                break;
            case "hB":
                if (genderF.isSelected()) {
                    resultText.setText("" + femaleCalculator(64) + " - " + femaleCalculator(68));
                } else resultText.setText("" + maleCalculator(64) + " - " + maleCalculator(68));
                break;
            case "hC":
                if (genderF.isSelected()) {
                    resultText.setText("" + femaleCalculator(68) + " - " + femaleCalculator(72));
                } else resultText.setText("" + maleCalculator(68) + " - " + maleCalculator(72));
                break;
            case "hD":
                if (genderF.isSelected()) {
                    resultText.setText("" + femaleCalculator(72) + " - " + femaleCalculator(76));
                } else resultText.setText("" + maleCalculator(72) + " - " + maleCalculator(76));
                break;
            case "hE":
                if (genderF.isSelected()) {
                    resultText.setText("" + femaleCalculator(76) + " - " + femaleCalculator(80));
                } else resultText.setText("" + maleCalculator(76) + " - " + maleCalculator(80));
                break ;
        }

    }

    double femaleCalculator(int height){
        return Math.round(((double)height * height / 30*2)*status());
    }

    double maleCalculator(int height){
        return Math.round(((double)height * height / 28*2)*status());
    }

    double status(){
        if (statusSmall.isSelected()) return 0.95;
        else if(statusMedium.isSelected()) return 1.0;
        else if(statusStrong.isSelected()) return 1.05;
        else return 0;
    }
}
