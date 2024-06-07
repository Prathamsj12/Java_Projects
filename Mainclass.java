//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package java_calculator;

import java.util.Scanner;

public class MainClass {
    public MainClass() {
    }

    public void calculator() {
        Scanner scanner;
        label27: {
            System.out.println(" Java Console Calculator");
            scanner = new Scanner(System.in);
            System.out.println("\n Please enter two to perform calculation");
            System.out.print("\n First number: ");
            int firstNumber = scanner.nextInt();
            System.out.print("\n Second number: ");
            int secondNumber = scanner.nextInt();
            System.out.println("\n Select between (*,/,+,-)\n Type out the character in a single letter: ");
            switch (operation) {
                case "*":
                    System.out.println("\n Your Result: " + firstNumber * secondNumber);
                    break label27;
                case "+":
                    System.out.println("\n Your Result: " + (firstNumber + secondNumber));
                    break label27;
                case "-":
                    System.out.println("\n Your Result: " + (firstNumber - secondNumber));
                    break label27;
                case "/":
                    System.out.println("\n Your Result: " + firstNumber / secondNumber);
                    break label27;
            }

            System.out.println("\n Please select a valid character");
        }

        scanner.close();
    }
}
