// This code defines a panel for radio buttons & check boxes

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class PizzaOrderPanel extends JPanel implements ActionListener
{
    private JRadioButton smallPizzaButton,
                         mediumPizzaButton,
                         largePizzaButton;
    
    private JCheckBox    plainCheckBox,
                         sausageCheckBox,
                         mushroomCheckBox,
                         pepperoniCheckBox;
    
    private JLabel pizzaTotalLabel;
    
    private JTextField pizzaTotalField;
    
    public PizzaOrderPanel()
    {
        // Create buttons
        smallPizzaButton = new JRadioButton( "Small" );
        smallPizzaButton.addActionListener( this );
        
        mediumPizzaButton = new JRadioButton( "Medium" );
        mediumPizzaButton.addActionListener( this );
        
        largePizzaButton = new JRadioButton( "Large" );
        largePizzaButton.addActionListener( this );
        
        // Create a button group & add buttons
        ButtonGroup sizeGroup = new ButtonGroup();
        sizeGroup.add( smallPizzaButton );
        sizeGroup.add( mediumPizzaButton );
        sizeGroup.add( largePizzaButton );
        
        // Create a button border
        Border buttonBorder = BorderFactory.createEtchedBorder();
        buttonBorder = BorderFactory.createTitledBorder( buttonBorder, "Pizza Size" );
        
        // Create a button panel & add buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout( new FlowLayout( FlowLayout.LEFT ) );
        buttonPanel.add( smallPizzaButton );
        buttonPanel.add( mediumPizzaButton );
        buttonPanel.add( largePizzaButton );
        buttonPanel.setBorder( buttonBorder );
        
        // Create check boxes
        plainCheckBox = new JCheckBox( "Plain" );
        plainCheckBox.addActionListener( this );
        
        sausageCheckBox = new JCheckBox( "Sausage" );
        sausageCheckBox.addActionListener( this );
        
        mushroomCheckBox = new JCheckBox( "Mushroom" );
        mushroomCheckBox.addActionListener( this );
        
        pepperoniCheckBox = new JCheckBox( "Pepperoni" );
        pepperoniCheckBox.addActionListener( this );
        
        // Create a border for toppings group
        Border toppingBorder = BorderFactory.createEtchedBorder();
        toppingBorder = BorderFactory.createTitledBorder( toppingBorder, "Toppings" );
        
        // Create a toppings panel & add toppings check boxes
        JPanel toppingPanel = new JPanel();
        toppingPanel.setLayout( new FlowLayout( FlowLayout.LEFT ) );
        toppingPanel.add( plainCheckBox );
        toppingPanel.add( sausageCheckBox );
        toppingPanel.add( mushroomCheckBox );
        toppingPanel.add( pepperoniCheckBox );
        toppingPanel.setBorder( toppingBorder );
        
        // Create a panel for label & text field
        JPanel pizzaTotalPanel = new JPanel();
        pizzaTotalPanel.setLayout( new FlowLayout( FlowLayout.RIGHT ) );
        
        // Create Label
        pizzaTotalLabel = new JLabel( "Order Total:     " );
        
        // Create text field
        pizzaTotalField = new JTextField( 6 );
        pizzaTotalField.setEditable( false );
        
        // Add items to pizza total panel
        pizzaTotalPanel.add( pizzaTotalLabel );
        pizzaTotalPanel.add( pizzaTotalField );
        
        // Add panels to main panel
        this.setLayout( new BorderLayout() );
        this.add( buttonPanel, BorderLayout.NORTH );
        this.add( toppingPanel, BorderLayout.CENTER );
        this.add( pizzaTotalPanel, BorderLayout.SOUTH );
    }
    
    // Action listener method to calculate price
    public void actionPerformed( ActionEvent size )
    {
        // Create pizzPrice object
        Pizza pizzaPrice = new Pizza();
        
        Object source = size.getSource();
        
        ArrayList<Double> list = new ArrayList<Double>();
        
        double sum = 0.0;
        
        // If statements to see what the user selected
        if(smallPizzaButton.isSelected())
        {
            list.add( pizzaPrice.getSmallPizza() );
        }
        if(mediumPizzaButton.isSelected() )
        {
            list.add( pizzaPrice.getMediumPizza() );
        }
        if(largePizzaButton.isSelected() )
        {
            list.add( pizzaPrice.getLargePizza() );
        }
        if(plainCheckBox.isSelected() )
        {
            list.add( pizzaPrice.getPlainTop() );
        }
        if(sausageCheckBox.isSelected() )
        {
            list.add( pizzaPrice.getSausageTop() );
        }
        if(mushroomCheckBox.isSelected() )
        {
            list.add( pizzaPrice.getMushroomTop() );
        }
        if(pepperoniCheckBox.isSelected() )
        {
            list.add( pizzaPrice.getPepperoniTop() );
        }
        
        // For loop to display the total
        for ( int i = 0 ; i < list.size() ; i++ )
        {
            sum += list.get(i);
            pizzaTotalField.setText( "$" + pizzaTotal( sum ) );
        }
        
    }
    
    // Method to calculate the total
    public String pizzaTotal( double sum)
    {
        String display = "";
        display = String.valueOf( sum );
        return display;
    }
}
















