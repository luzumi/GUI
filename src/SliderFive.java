import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Created with IntelliJ IDEA,
 * User: corat
 * Date: 24.08.2020
 * Time: 14:35
 */
public class SliderFive extends JFrame implements ChangeListener {
    JSlider sliderA, sliderB;
    JTextField textA, textB;
    public SliderFive()
    {
        setTitle( "Change Listener" );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        sliderA = new JSlider( JSlider.HORIZONTAL, 0, 1000, 400);
        sliderA.setMajorTickSpacing( 100 );
        sliderA.setMinorTickSpacing( 50 );
        sliderA.setPaintTicks( true );
        sliderA.setPaintLabels( true );
        sliderA.setPreferredSize( new Dimension(300,50) ) ;
        sliderA.addChangeListener( this );
        sliderA.setName("sliderA");
        textA = new JTextField( 4 );
        textA.setText( sliderA.getValue() + " " );
        sliderB = new JSlider( JSlider.HORIZONTAL, 0, 1000, 400 );
        sliderB.setMajorTickSpacing( 100 );
        sliderB.setMinorTickSpacing( 50 );
        sliderB.setPaintTicks( true );
        sliderB.setPaintLabels( true );
        sliderB.setPreferredSize( new Dimension(300,50) ) ;
        sliderB.addChangeListener( this );
        sliderB.setName("sliderB");
        textB = new JTextField( 4 );
        textB.setText( sliderB.getValue() + " " );
        // Frame
        setLayout( new FlowLayout() );
        add( textA );
        add( sliderA );
        add( textB );
        add( sliderB );
    }


    @Override
    public void stateChanged(ChangeEvent e) {
        JSlider source;
        source = (JSlider)e.getSource();
        if ( !source.getValueIsAdjusting() ) {
            if (source.getName().equals("sliderA"))
                textA.setText(source.getValue() + " ");
            if (source.getName().equals("sliderB"))
                textB.setText(source.getValue() + " ");
        }
    }
}