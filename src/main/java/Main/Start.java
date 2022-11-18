package Main;

import Command.*;
import Object.Comp;
import Object.User;
import Shop.Flowers_in_the_shop;

import java.util.Scanner;

public class Start {
    static Scanner scanner = new Scanner(System.in);
    public static void start() {
        Flowers_in_the_shop.Flowers();
        Comp c = new Comp();
        User u = new User(new SelectCommand(c),new UpdateCommand(c), new DeleteCommand(c),new CreateCommand(c));
        System.out.println("             Вітаю у квітковому магазині!!!\n(Підготував студент групи КН-204 Кошовий Іван).\n");
        int command;
        do {
            System.out.println("\nВиберіть пункт у меню:\n" +
                    "1. Показати квіти в магазині.\n" +
                    "2. Створити букет.\n" +
                    "3. Додати квітку.\n" +
                    "4. Видалити квітку.\n" +
                    "5. Закінчити");
            System.out.print("-> ");

            command = scanner.nextInt();

            switch (command) {

                case 1:
                    u.selectBouquest();
                    break;
                case 2:
                    u.createBouquest();
                    break;
                case 3:
                    u.updateBouquest();
                    break;
                case 4:
                    u.deleteBouquest();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Ви ввели невірну команду! Спробуйте ще раз:)");
                    break;
            }
        } while (command != 5);
    }

}
