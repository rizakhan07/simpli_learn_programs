package self_learning_3;
import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
        double number1, number2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        number1 = sc.nextDouble();
        number2 = sc.nextDouble();
        System.out.println("Enter the operator (+,-,*,/)");
        char operation = sc.next().charAt(0);
        double zero = 0;
        switch (operation) {
            case '+':
                zero = number1 + number2;
                break;
            case '-':
                zero = number1 - number2;
                break;
            case '*':
                zero = number1 * number2;
                break;
            case '/':

                zero = number1 / number2;

                break;

            default:

                System.out.println("Enter Valid Opration");

                break;
        }

        System.out.println("Result :");
        System.out.println();
        System.out.println(number1 + " " + operation + " " + number2
                + " = " + zero);
    }

}


