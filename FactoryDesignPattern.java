
 abstract class Vehicle {
    public abstract void run();
}

class Bike extends Vehicle{
    @Override
    public  void run(){
        System.out.println("This is Bike!!");
    }
    
}

class Car extends Vehicle{
    @Override
    public void run(){
        System.out.println("This is Car!!");
    }
}

class Factory {
 
 public static Vehicle decide(String choice){
        switch(choice){
            case "Car":
                return new Car();
                
            case "Bike":
                return new Bike();
                
        }
        return null;
    }
}

    
public class FactoryDesignPattern{
    
    public static void main(String[] args){
        Vehicle vehicle1 = Factory.decide("Bike");
        vehicle1.run();
        Vehicle vehicle2 = Factory.decide("Car");
        vehicle2.run();
    } 
}    
