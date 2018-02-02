// Pizza class
public class Pizza
{
    // Declare the prices all pizza sizes and toppings
    private double smallPizza = 10.95,
    mediumPizza = 13.95,
    LargePizza = 16.95,
    plainTop = 0.00,
    sausageTop = 1.00,
    mushroomTop = 1.00,
    pepperoniTop = 1.00;
    
    // Default constructor
    public Pizza()
    {
    }
    
    // Getter and setters for all the prices and toppings
    public double getSmallPizza() {
        return smallPizza;
    }
    
    public void setSmallPizza(double smallPizza) {
        this.smallPizza = smallPizza;
    }
    
    public double getMediumPizza() {
        return mediumPizza;
    }
    
    public void setMediumPizza(double mediumPizza) {
        this.mediumPizza = mediumPizza;
    }
    
    public double getLargePizza() {
        return LargePizza;
    }
    
    public void setLargePizza(double largePizza) {
        LargePizza = largePizza;
    }
    
    public double getPlainTop() {
        return plainTop;
    }
    
    public void setPlainTop(double plainTop) {
        this.plainTop = plainTop;
    }
    
    public double getSausageTop() {
        return sausageTop;
    }
    
    public void setSausageTop(double sausageTop) {
        this.sausageTop = sausageTop;
    }
    
    public double getMushroomTop() {
        return mushroomTop;
    }
    
    public void setMushroomTop(double mushroomTop) {
        this.mushroomTop = mushroomTop;
    }
    
    public double getPepperoniTop() {
        return pepperoniTop;
    }
    
    public void setPepperoniTop(double pepperoniTop) {
        this.pepperoniTop = pepperoniTop;
    }
}