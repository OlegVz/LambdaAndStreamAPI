package com.hybris.internship.lambda.functionalInterfacesAndLambdas;

public class App {

    public static void main(String[] args) {

        Human tom = new Human();
        walker(tom);

        Robot wale = new Robot();
        walker(wale);

        ALambdaInterface aBlokeOfCOde = () -> System.out.println("Custom object walking...");

        Walkable walkable = () -> System.out.println("Custom object walking...");
        walker(walkable);

    }

    private static void walker(Walkable walkableEntity) {
        walkableEntity.walk();
    }
}
