
package cars;

public class Tracks extends Vehicle{
    private int weight;

    public Tracks() {
    }

    public Tracks(int weight) {
        this.weight = weight;
    }

    public Tracks(int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    

    @Override
    public double getSalePrice() {
        
        if(this.weight > 2000){
            return super.getRegularPrice() - super.getRegularPrice()*.10;
        }
        
        return super.getSalePrice(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        
    }
    
    
    

    
    
    
    
}
