package Oops;
abstract class Restaurant {
    abstract void displayMenu();
    abstract void calculateBill();
}
class PizzaRestaurant extends Restaurant {
    void displayMenu() {
        System.out.println("1. Pizza - Rs.250");
        System.out.println("2. Mushroom Pizza - Rs.350");
    }
    void calculateBill() {
        int price=350;
        System.out.println("Pizza Bill Amount: Rs." + price);
    }
}
class BurgerRestaurant extends Restaurant {
    void displayMenu() {
        System.out.println("1. Veg Burger - Rs.120");
        System.out.println("2. Cheese Burger - Rs.180");
    }
    void calculateBill() {
        int price=180;
        System.out.println("Burger Bill Amount: Rs." + price);
    }
}
public class Food{
    public static void main(String[] args) {
        Restaurant p=new PizzaRestaurant();
        Restaurant b=new BurgerRestaurant();
        System.out.println("Pizza Restaurant");
        p.displayMenu();
        p.calculateBill();
        System.out.println("\nBurger Restaurant");
        b.displayMenu();
        b.calculateBill();
    }
}