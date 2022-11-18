package Bouquest;

import Flowers.Flowers;
import java.util.Scanner;
public class Bouquest {
    static Scanner scanner = new Scanner(System.in);
    public static void bouquest(Flowers[] flowers, Flowers[] bouq, int num, int numb) {
        int command;
        int number = 0;
        int[] array1 = new int[num];
        for (int l = 0; l<num; l++){
            array1[l] = 1000;
        }
        do{
            System.out.println("\nВиберіть квітку яку добавити до букета: ");
            System.out.print("-> ");
            int k =0;
            command = scanner.nextInt();
            command-= 1;
            for (int l = 0; l<num; l++){
                if (array1[l]== command){
                    k++;
                }
            }
            if(command>=num){
                System.out.println("Квітки під таким номером немає!");
            }else if (k == 1) {
                System.out.println("Ця квітка вже в букеті!");
            }
            else {
                    bouq[number] = flowers[command];
                    number++;
                    array1[number] = command;
            }
        }while(number<numb);
    }
}
