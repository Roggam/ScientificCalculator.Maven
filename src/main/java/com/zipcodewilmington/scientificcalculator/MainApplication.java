package com.zipcodewilmington.scientificcalculator;

<<<<<<< HEAD
import java.sql.SQLOutput;
=======
import java.util.InputMismatchException;
>>>>>>> b1fcd00dfa2f73fb6179efa6ffe7dde0c95d316b
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {


<<<<<<< HEAD

        Scanner scan = new Scanner(System.in);

        System.out.println("select\n 1) add \n 2) subtract\n 3) multiply \n 4) divison\n 5) TESTING CASE\n");
        Integer choice = scan.nextInt();






        System.out.println("Enter first number");
        Double input1 = scan.nextDouble();

        System.out.println("Enter second number");
        Double input2 = scan.nextDouble();

        ScFunction calcSc = new ScFunction();
=======
>>>>>>> b1fcd00dfa2f73fb6179efa6ffe7dde0c95d316b
        BasicCalculator calc = new BasicCalculator();
        Scanner scan = new Scanner(System.in);
        Integer choice;


        //INPUT VALIDATION
        while (true) { // first while loop to verify valid input

            System.out.println("Please select between 1) Basic Calculator and 2) Scientific Calculator");
            choice = scan.nextInt();

            if (choice == 1) { // Option 1 (if statement will execute if value is 1)

                while (true) {  // second while loop to verify valid input
                    System.out.println("Please select from the options below\n 1) add \n 2) subtract\n 3) multiply \n 4) divison\n");
                    choice = scan.nextInt();


                    if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {

                        Double input2;

                        Double input1;
                        while (true) // Checks for valid input(numbers)
                        {
                            try
                            {
                                System.out.println("Please enter first number");
                                input1 = scan.nextDouble();
                                break;
                            }
                            catch (Exception e)
                            {
                                scan.next();
                                System.out.print("That’s not "
                                        + "a Number. Try again: \n");
                            }
                        }

                        while (true) // Checks for valid input(numbers)
                        {
                            try
                            {
                                System.out.println("Please enter second number");
                                input2 = scan.nextDouble();
                                break;
                            }
                            catch (Exception e)
                            {
                                scan.next();
                                System.out.print("That’s not "
                                        + "a Number. Try again: \n");
                            }
                        }
                       // System.out.println("Enter first number");
                       // input1 = scan.nextDouble();


                       // System.out.println("Enter second number");
                       // input2 = scan.nextDouble();




                        switch (choice) {
                            case 1:
                                System.out.println(calc.add(input1, input2));
                                break;
                            case 2:
                                System.out.println(calc.subtract(input1, input2));
                                break;
                            case 3:
                                System.out.println(calc.multiply(input1, input2));
                                break;
                            case 4:
                                System.out.println(calc.divide(input1, input2));
                                break;
                        }

                        break;

                    } else {
                        System.out.println("###############################");
                        System.out.println("# Please enter a valid option #");
                        System.out.println("###############################");
                        System.out.println();
                        continue;
                    }

                }//second loop
                break;
            } else if (choice == 2) { //Option 2 (else if statement will execute if value is 2)

                while (true) {  // third while loop to verify valid input
                    System.out.println("Please select from the options below\n" +
                            "1) degree\n" +
                            "2) natural log\n" +
                            "3) base log\n" +
                            "4) inverse log\n" +
                            "5) square root\n" +
                            "6) inverse\n" +
                            "7) square\n" +
                            "8) exponent\n" +
                            "9) change sign\n" +
                            "10) sine\n" +
                            "11) cos\n" +
                            "12) tan\n" +
                            "13) inverseCosine\n" +
                            "14) inverseTangent\n" +
                            "15) inverseSine\n" +
                            "16) radian\n" +
                            "17) factorial\n" +
                            "18) fibonacci\n");
                    choice = scan.nextInt();

                    if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6 || choice == 7 || choice == 8
                            || choice == 9 || choice == 10 || choice == 11 || choice == 12 || choice == 13 || choice == 14 || choice == 15
                            || choice == 16 || choice == 17 || choice == 18) {
                        break;

                    } else {
                        System.out.println("###############################");
                        System.out.println("# Please enter a valid option #");
                        System.out.println("###############################");
                        System.out.println();
                        continue;
                    }

                }//third loop ends here

                break;
            } else {
                System.out.println("###############################");
                System.out.println("# Please enter a valid option #");
                System.out.println("###############################");
                System.out.println();
                continue;

            }
        } // first loop
        //INPUT VALIDATION END

<<<<<<< HEAD
        switch (choice){
            case 1:
                System.out.println(calc.add(input1, input2));
            break;
            case 2:
                System.out.println(calc.subtract(input1, input2));
            break;
            case 3:
                System.out.println(calc.multiply(input1, input2));
            break;
            case 4:
                System.out.println(calc.divide(input1, input2));
                break;
            case 5:
                System.out.println(calcSc.log(input1, input2));
                break;


        }
=======
>>>>>>> b1fcd00dfa2f73fb6179efa6ffe7dde0c95d316b

    }





}
// hey there