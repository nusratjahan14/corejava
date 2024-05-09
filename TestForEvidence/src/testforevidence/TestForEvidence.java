
package testforevidence;

import animal.Dog;
import cars.Tracks;
import product.ElectronicProduct;



public class TestForEvidence {

    public static void main(String[] args) {
        
//        Question- a. - Create a super class called Vehicle. The Vehicle class has the following fields and methods. int 
//        speed; double regularPrice; String color; double getSalePrice(); 
//        b. - Create a sub class of Vehicle class and name it as Truck.  
//        The Truck class has the following fields and methods. - - 
//        int weight; 
//        Now override the double getSalePrice() method from its super class and apply 
//        the following logic – if weight>2000, 10% discount. Otherwise no discount on regularPrice. 
        
        Tracks truck= new Tracks(2100, 10, 200, "Black");
        
        System.out.println(truck.getSalePrice());
        
        ElectronicProduct elecProduct = new ElectronicProduct(2, "Television", 20000);
    
        System.out.println(elecProduct.getSalePrice());
        
        Dog dog= new Dog();
        dog.makeSound();
    }
    
}
