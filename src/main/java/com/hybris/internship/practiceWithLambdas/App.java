package com.hybris.internship.practiceWithLambdas;

public class App {

    public static void main(String[] args) {

        Human tom = new Human();
//        walker(tom);

        Robot wale = new Robot();
//        walker(wale);

        Walkable walkable = () -> System.out.println("Custom object walking...");
//        walker(walkable);
        walkable.walk();

        Calculate sumVar = (a, b) -> a + b;
        System.out.println(sumVar.compute(4, 6));

        Calculate nonZeroDivider = (a, b) -> {
            if (a == 0) {
                return 0;
            }

            return a / b;
        };
        System.out.println(nonZeroDivider.compute(10, 5));

        StringWorker stringWorker = (s) -> {
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                result += s.charAt(i);
            }

            return result;
        };
        System.out.println(stringWorker.work("Vehicle"));

        NumberWorker numberWorker = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }

            return result;
        };

        System.out.println(numberWorker.compute(10));

        MyGenericInterface<String> stringWorkerGen = (s) -> {
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                result += s.charAt(i);
            }

            return result;
        };
        System.out.println(stringWorkerGen.work("Vehicle"));

        MyGenericInterface<Integer> numberWorkerGen = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println(numberWorkerGen.work(10));
    }

    private static void walker(Walkable walkableEntity) {
        walkableEntity.walk();
    }

    public void sayHello() {
        System.out.println("hello there");
    }
}
