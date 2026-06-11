import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        CALCULATOR calc = new CALCULATOR();
        double num1 , num2 , result;


        while (true){
            System.out.println("====CALCULATOR====");
            System.out.println("1- ADD");
            System.out.println("2- SUB");
            System.out.println("3- MULTIPLY");
            System.out.println("4- DIVIDE");
            System.out.println("5- EXIT");
            System.out.println("6- get last result");
            System.out.println("7- clear last result");
            System.out.println("8- Show last 10 results");
            System.out.println("ENTER CHOICE: ");
            int choice = reader.nextInt();



            switch (choice){

                case 1:
                    System.out.println("enter 2 numbers: ");
                    num1 = reader.nextDouble();
                    num2 = reader.nextDouble();

                     result= calc.add(num1, num2);
                     System.out.println(result);
                    break;
                case 2:
                    System.out.println("enter 2 numbers: ");
                    num1 = reader.nextDouble();
                    num2 = reader.nextDouble();
                     result= calc.sub(num1, num2);
                    System.out.println(result);
                    break;
                case 3:
                    System.out.println("enter 2 numbers: ");
                    num1 = reader.nextDouble();
                    num2 = reader.nextDouble();
                     result= calc.multiply(num1, num2);
                    System.out.println(result);
                    break;
                case 4:
                    System.out.println("enter 2 numbers: ");
                    num1 = reader.nextDouble();
                    num2 = reader.nextDouble();
                    if (num2 == 0)
                        System.out.println("can't divide by zero");
                    else {
                        result= calc.divide(num1, num2);
                        System.out.println(result);
                    }

                    break;
                case 5:
                    System.out.println("GOODBYE");
                    return;
                case 6:
                    result = calc.getLastResult();
                    System.out.println(result);
                    break;
                case 7:
                    calc.clearLastResult();
                    System.out.println("last result cleared");
                    break;
                case 8:
                    calc.showHistory();
                    break;
                default:
                    System.out.println("INVALID CHOICE");
            }

        }


    }
}