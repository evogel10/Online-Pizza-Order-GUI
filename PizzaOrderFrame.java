// This code displays the panel in a frame

import javax.swing.*;

public class PizzaOrderFrame extends JFrame
{
    public PizzaOrderFrame()
    {
        setTitle( "Pizza Menu" );
        setSize( 300, 220 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        JPanel panel = new PizzaOrderPanel();
        this.add( panel );
    }
    
    public static void main( String [] args )
    {
        JFrame frame = new PizzaOrderFrame();
        frame.setVisible( true );
    }
}