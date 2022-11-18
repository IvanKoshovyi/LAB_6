package Bouquest;

import Flowers.Flowers;
import Shop.Flowers_in_the_shop;

import java.util.Arrays;
import java.util.Scanner;


public class Create_Bouquest {


    public static Scanner scanner = new Scanner(System.in);
    private static int num;
    public static void Create() {
        System.out.println("***** Квіти в магазині *****");
        Flowers_in_the_shop.Flowers();
        for (int i = 0; i < Flowers_in_the_shop.getNum(); i++) { // виведення квітів в магазині
            System.out.print(i + 1 + ". ");
            System.out.println(Flowers_in_the_shop.getFlowers()[i]);
        }

        System.out.println("Введіть кількість квітів в букеті: ");
        System.out.print("-> ");
        int number = scanner.nextInt();

        Flowers[] bouquest = new Flowers[number];
        if (number != 0){
        Bouquest.bouquest(Flowers_in_the_shop.getFlowers(), bouquest, Flowers_in_the_shop.getNum(), number);
        }
        num = number;
        Suma suma = new Suma(0); // загальна ціна букета
        for (int i = 0; i < number; i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(bouquest[i]);
            suma.setSuma(bouquest[i].getCost());
        }
        if (number != 0) {
            Accessories.Accessories(suma);
        }
        System.out.println("---------------------------< БУКЕТ >---------------------------");
        for (int i = 0; i < number; i++) {
            System.out.print( (i + 1) + ". ");
            System.out.println(bouquest[i]);
        }
        System.out.println(" Ціна букета: $" + suma.getSuma() );
        System.out.print("--------------------------------------------------------------");
        int command;

        do{
            System.out.println("\nВиберіть пункт у меню:\n" +
                    "1. Сортувати букет.\n" +
                    "2. Показати квіти які мають довжину 40 см. або більше.\n" +
                    "3. Закінчити");
            System.out.print("-> ");
            command = scanner.nextInt();

            switch (command) {

                case 1:
                    Sort(bouquest);
                    break;

                case 2:
                    Length(bouquest);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Ви ввели невірну команду! Спробуйте ще раз:)");
                    break;
            }
        }while(command != 3);

    }

    public static void Sort(Flowers[] bouquest) {
        Arrays.sort(bouquest);
        System.out.println("\n***** Букет квітів сортованний *****");
        for (int i = 0; i < num; i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(bouquest[i]);
        }
    }

    public static void Length(Flowers[] bouquest){
        System.out.println("\n***** Квіти зі стеблом більше або дорівнює 40 *****");
        int k = 0;
        for (int i = 0; i < num; i++){
            if(bouquest[i].getStalkLength() >= 40) {
                System.out.println(bouquest[i]);
                k++;
            }
        }
        if(k == 0){
            System.out.println("      Таких квітів немає в букеті!");
        }
    }
}
