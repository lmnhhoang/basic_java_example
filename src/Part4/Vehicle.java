package Part4;

abstract class Vehicle {
    abstract void start () ;
    abstract void stop ();
    abstract void accelerate ();
    abstract void brake ();
}

class Car extends Vehicle{
    void start(){
        System.out.println("Car start");
    }
    void stop(){
        System.out.println("Car stop");
    }
    void accelerate() {
        System.out.println("Car accelerate");
    }
    void brake() {
        System.out.println("Car braked");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("Bike start");
    }
    void stop(){
        System.out.println("Bike stop");
    }
    void accelerate() {
        System.out.println("Bike accelerate");
    }
    void brake() {
        System.out.println("Bike braked");
    }
}

