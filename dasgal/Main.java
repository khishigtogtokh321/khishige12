package dasgal;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Suzuki", "Swift", 2015, 15.1);
        car.displayDetails(); 
        Truck truck = new Truck("Ford", "F-150", 2016, 3.5);
        truck.displayDetails(); 
    }
}