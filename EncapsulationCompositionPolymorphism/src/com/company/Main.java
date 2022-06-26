package com.company;

import com.company.exercise38.Printer;
import com.company.exercise40.DeluxeBurger;
import com.company.exercise40.Hamburger;
import com.company.exercise40.HealthyBurger;

public class Main {

  public static void main(String[] args) {
    // Exercise38
//        Printer printer = new Printer(50, false);
//        System.out.println("initial page count = " +printer.getPagesPrinted());
//        int pagesPrinted = printer.printPages(4);
//        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
//        pagesPrinted = printer.printPages(2);
//        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());

    // Exercise39
//        Car car = new Car(8, "Base car");
//        System.out.println(car.startEngine());
//        System.out.println(car.accelerate());
//        System.out.println(car.brake());
//
//        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
//        System.out.println(mitsubishi.startEngine());
//        System.out.println(mitsubishi.accelerate());
//        System.out.println(mitsubishi.brake());
//
//        Ford ford = new Ford(6, "Ford Falcon");
//        System.out.println(ford.startEngine());
//        System.out.println(ford.accelerate());
//        System.out.println(ford.brake());
//
//        Holden holden = new Holden(6, "Holden Commodore");
//        System.out.println(holden.startEngine());
//        System.out.println(holden.accelerate());
//        System.out.println(holden.brake());

    // Exercise 40
    Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
    double price = hamburger.itemizeHamburger();
    hamburger.addHamburgerAddition1("Tomato", 0.27);
    hamburger.addHamburgerAddition2("Lettuce", 0.75);
    hamburger.addHamburgerAddition3("Cheese", 1.13);
    System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

    HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
    healthyBurger.addHamburgerAddition1("Egg", 5.43);
    healthyBurger.addHealthAddition1("Lentils", 3.41);
    System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

    DeluxeBurger db = new DeluxeBurger();
    db.addHamburgerAddition3("Should not do this", 50.53);
    System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
  }
}
