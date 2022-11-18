package Bouquest;

import java.util.Scanner;

public class Accessories {
    static Scanner scanner = new Scanner(System.in);
    public static void Accessories(Suma suma){
        int command;
        do{
            System.out.println("\nВиберіть аксесуари які добавити до букета:\n" +
                    "1. Стрічка $10\n" +
                    "2. Крафтова бумага $20\n" +
                    "3. Кошик $50\n" +
                    "4. Закінчити покупку");
            System.out.print("-> ");

            command = scanner.nextInt();

            switch (command) {

                case 1:
                    suma.setSuma(10);
                    break;
                case 2:
                    suma.setSuma(20);
                    break;
                case 3:
                    suma.setSuma(50);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Ви ввели невірну команду! Спробуйте ще раз:)");
                    break;
            }
        }while(command != 4);
    }
}
