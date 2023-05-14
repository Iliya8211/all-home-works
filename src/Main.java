import java.util.Scanner;
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        //Product product = new Product("She zaraboti li");
        // System.out.println(product.getName());
        //names();
        //perimeter();
        //triangleArea();
        //fineTunePerimeter();
        //fineTriangleArea();
        //pineTree();
        //triangleFormulas();
        //daysOfTheWeek();
        //eligibleToWork();
        //revenueFromSales();
        //arrayBiggestNumber();
        //vacation();
        //reverseArray();
        //arrayDivisibleByFive();
    }

    public static void printName() {
        String firstName = "Dimitar";
        String middleName = "Nikolaev";
        String lastName = "Tarkalanov";

        System.out.println(firstName + " " + middleName + " " + lastName);
    }

    public static void perimeter() {
        int a = 4;
        int b = 2;
        int sum = a + b;
        System.out.println(sum);
    }

    public static void names() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = myObj.nextLine();
        System.out.println("Your username is " + userName);
    }

    public static void triangleArea() {
        float a = 5.78f;
        float b = 9.20f;
        System.out.println((a * b) / 2);
    }

    public static void fineTunePerimeter() {
        Scanner myCalc = new Scanner(System.in);
        int firstSide;
        int secondSide;
        int answer;

        System.out.println("Enter first side");
        firstSide = myCalc.nextInt();
        System.out.println("Enter second side");
        secondSide = myCalc.nextInt();
        answer = firstSide + secondSide;
        System.out.println("The sum of both sides is: " + answer);
    }

    public static void fineTriangleArea() {
        Scanner MyTriangle = new Scanner(System.in);
        float firstNum;
        float secondNum;
        float answer;
        System.out.println("Enter first num");
        firstNum = MyTriangle.nextFloat();
        System.out.println("Enter second num");
        secondNum = MyTriangle.nextFloat();
        answer = (firstNum * secondNum) / 2;
        System.out.println("The answer is " + answer);
    }

    public static void pineTree() {
        System.out.println("   *");
        System.out.println("  ***");
        System.out.println(" *****");
        System.out.println("********");
    }

    public static void triangleFormulas() {
        Scanner myCalc = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Enter first angle");
        a = myCalc.nextInt();
        System.out.println("Enter second angle");
        b = myCalc.nextInt();
        System.out.println("Enter third angle");
        c = myCalc.nextInt();

        if ((a < 90 && b < 90 && c < 90) && (a != 60 && b != 60 && c != 60) && (a + b + c == 180)) {
            System.out.println("Acute triangle");
        } else if ((a == 90 || b == 90 || c == 90) && (a + b + c == 180)) {
            System.out.println("Right angle triangle");
        } else if ((a > 90 || b > 90 || c > 90) && (a + b + c == 180)) {
            System.out.println("Obtuse triangle");
        } else if ((a == 60 && b == 60 && c == 60)) {
            System.out.println("Equilateral triangle");
        } else if ((a == b || a == c || b == c) && (a + b + c == 180)) {
            System.out.println("Isosceles triangle");
        } else if ((a != b || a != c || b != c) && (a + b + c == 180)) {
            System.out.println("Multifaceted triangle");
        } else {
            System.out.println("Cannot be build");
        }
    }

    public static void daysOfTheWeek() {
        int i = 5;
        switch (i) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Default");
        }
    }

    public static void eligibleToWork() {

        Scanner myAge = new Scanner(System.in);
        int a;
        System.out.println("Enter your age: ");
        a = myAge.nextInt();
        if (a >= 16) {
            System.out.println("You are eligible to work");
        } else {
            System.out.println("You are not old enough to work");
        }
    }

    public static void revenueFromSales() {
        Scanner mySales = new Scanner(System.in);
        float unitPrice;
        float quantity;
        float finalSum;

        System.out.println("Enter unit price");
        unitPrice = mySales.nextFloat();
        System.out.println("Enter quantity");
        quantity = mySales.nextFloat();
        finalSum = unitPrice * quantity;

        if (quantity < 100) {
            System.out.println("The revenue from sale is: " + finalSum);
            System.out.println("There is no discount");
        } else if ((quantity >= 100 && quantity <= 120)) {
            System.out.println("The revenue from sale is: " + (finalSum - (finalSum * 0.15)));
            System.out.println("Discount is:" + finalSum * 0.15 + "(15.0 %)");
        } else {
            System.out.println("The revenue from sale is: " + (finalSum - (finalSum * 0.2)));
            System.out.println("Discount is:" + finalSum * 0.2 + "(20 %)");
        }
    }

    public static void arrayBiggestNumber() {
        int arr[] = {10, 324, 45, 10322, 9808};
        int i;
        int max = arr[0];
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        {
            System.out.println(max);
        }
    }

    public static void vacation() {
        String c;
        int budget;

        Scanner my = new Scanner(System.in);
        System.out.println("Please enter your vacation place - Beach or Mountain");
        c = my.nextLine();
        System.out.println("Please enter your budget per person per day");
        budget = my.nextInt();

        if (c.equals("Beach") && budget < 50) {
            System.out.println("You should go to Bulgaria");
        } else if (c.equals("Beach") && budget > 50) {
            System.out.println("You have to go outside Bulgaria");
        } else if (c.equals("Mountain") && budget < 50) {
            System.out.println("You should go to Bulgaria");
        } else if (c.equals("Mountain") && budget > 50) {
            System.out.println("You should go outside Bulgaria");
        } else {
            System.out.println("There is no information about this vacation");
        }
    }

    public static void reverseArray() {
        int arr[] = {10, 20, 30, 40, 50};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void arrayDivisibleByFive() {
        int arr [] = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        for (int element : arr) {
            if (element % 5 == 0)
                if (element > 150)
                    break;
            System.out.println(element);
        }
    }
}
