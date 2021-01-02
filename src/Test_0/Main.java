package Test_0;

import java.util.Scanner;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";//цветное название
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) throws Exception {


        System.out.println("\nКалькулятор 1.0\n" + ANSI_BLUE + "Данные передаются в одну строку.Введите..." + ANSI_RESET);
        Scanner in = new Scanner(System.in);
        InputLineToStrNumbers inputLineToStrNumbers = new InputLineToStrNumbers(in.nextLine().trim());
        in.close();
        InputLineToNumbers inputLineToNumbers = new InputLineToNumbers();

        try {
            if (InputLineToNumbers.Number1.geographyNumber == InputLineToNumbers.Number2.geographyNumber) {

                if (InputLineToNumbers.Number1.geographyNumber == true) {//true - арабское чила
                    Arabic.PrintResult(InputLineToNumbers.Number1.value, inputLineToStrNumbers.sign, InputLineToNumbers.Number2.value);
                    System.exit(0);
                } else//false - римские цифры
                    Roman.PrintResult(InputLineToNumbers.Number1.value, inputLineToStrNumbers.sign, InputLineToNumbers.Number2.value);
                System.exit(0);
            }else  throw new NumberFormatException("Либо оба числа арабские, либо оба римские");
        } catch (Exception e) {
            System.out.println("NumberFormatException: " + e.getMessage());
            System.exit(-1);
        }
    }
}