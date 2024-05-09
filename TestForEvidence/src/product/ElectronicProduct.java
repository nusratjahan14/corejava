
package product;

public class ElectronicProduct extends Product{
    private int warrantyPeriod;

    public ElectronicProduct() {
    }

    public ElectronicProduct(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public ElectronicProduct(int warrantyPeriod, String name, double regularPrice) {
        super(name, regularPrice);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public double getSalePrice() {
//        double warrantyMonth = warrantyPeriod / 12;
//        
//        if(warrantyMonth > 1){
//            return super.getRegularPrice() - super.getRegularPrice() * 0.15;
//        }
        
        if(this.warrantyPeriod > 1){
            return super.getRegularPrice() * 0.85;
        }
        
        return super.getRegularPrice(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
