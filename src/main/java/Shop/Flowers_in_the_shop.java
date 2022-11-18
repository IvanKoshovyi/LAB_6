package Shop;

import Flowers.*;

import java.io.*;
import java.util.Scanner;

public class Flowers_in_the_shop {

    static Scanner scanner = new Scanner(System.in);
    private static Flowers[] flowers = new Flowers[100];
    private static int num;

    public static Flowers[] getFlowers() {
        return flowers;
    }

    public static int getNum() {
        return num;
    }


    public static void setNum() {
        num +=1;
    }

    public static void Flowers() {
        num = 0;
        try {

            BufferedReader br = new BufferedReader(new FileReader("Flowers.txt"));
            BufferedReader dr = new BufferedReader(new FileReader("Flowers.txt"));
            Scanner scanner = new Scanner(br);
            String k = dr.readLine();
            String s = scanner.next();

            while (k != null) {
                switch (s) {
                    case "Rose":
                        flowers[getNum()] = new Rose(scanner.nextInt(), scanner.next(), scanner.nextInt());
                        setNum();
                        k = dr.readLine();
                        if (k == null) {
                            break;
                        } else {
                            s = scanner.next();
                            break;
                        }
                    case "Tulip":
                        flowers[getNum()] = new Tulip(scanner.nextInt(), scanner.next(), scanner.nextInt());
                        setNum();
                        k = dr.readLine();
                        if (k == null) {
                            break;
                        } else {
                            s = scanner.next();
                            break;
                        }
                    case "Lily":
                        flowers[getNum()] = new Lily(scanner.nextInt(), scanner.next(), scanner.nextInt());
                        setNum();
                        k = dr.readLine();
                        if (k == null) {
                            break;
                        } else {
                            s = scanner.next();
                            break;
                        }
                    case "Iris":
                        flowers[getNum()] = new Iris(scanner.nextInt(), scanner.next(), scanner.nextInt());
                        setNum();
                        k = dr.readLine();
                        if (k == null) {
                            break;
                        } else {
                            s = scanner.next();
                            break;
                        }
                }
            }
            br.close();
            dr.close();


        } catch (IOException e) {
            System.out.println("Помилка зчитування з файлу!");
        }
    }
    public static void wotch(){
        System.out.println("***** Квіти в магазині *****");

        for (int i = 0; i < getNum(); i++) { // виведення квітів в магазині
            System.out.print(i + 1 + ". ");
            System.out.println(flowers[i]);
        }
    }

    public static void update() {
        try {
            int i = 0;
            BufferedReader flower = new BufferedReader(new FileReader("Flowers.txt"));
            BufferedWriter temp = new BufferedWriter(new FileWriter("Temp.txt"));
            String k = flower.readLine();
            do {
                temp.write(k + "\n");
                k = flower.readLine();
            }while (k!=null);
            flower.close();
            int command;
            do{
                do {
                    System.out.println("\nВиберіть квітку:\n" +
                            "1. Роза.\n" +
                            "2. Тульпан.\n" +
                            "3. Ірис\n" +
                            "4. Лілія\n" +
                            "5. Вихід"
                    );
                    System.out.print("-> ");
                    command = scanner.nextInt();
                    if(command != 1 && command !=2 && command !=3 && command !=4 && command !=5){
                        System.out.println("Ви ввели невірну команду!!!");
                    }
                }while (command != 1 && command !=2 && command !=3 && command !=4 && command !=5);
                if(command != 5) {

                    System.out.println("\nВведіть ціну квітки:");
                    System.out.print("-> ");
                    int prise = scanner.nextInt();
                    System.out.println("\nВиберіть якої свіжості квітка::\n" +
                            "1. FullFresh \n" +
                            "2. MiddleFresh\n" +
                            "3. OldFresh"
                    );
                    System.out.print("-> ");
                    int fresh = scanner.nextInt();
                    String Fresh;
                    if (fresh == 2) {
                        Fresh = "MiddleFresh";
                    } else if (fresh == 3) {
                        Fresh = "OldFresh";
                    } else {
                        Fresh = "FullFresh";
                    }
                    System.out.println("\nВведіть довжину квітки");
                    System.out.print("-> ");
                    int StalkLength = scanner.nextInt();
                    if(i != 0){
                        temp.write("\n");
                    }

                    switch (command) {

                        case 1:
                            temp.write("Rose " + prise + " " + Fresh + " " + StalkLength);
                            break;

                        case 2:
                            temp.write("Tulip " + prise + " " + Fresh + " " + StalkLength);
                            break;
                        case 3:
                            temp.write("Iris " + prise + " " +  Fresh + " " + StalkLength);
                            break;
                        case 4:
                            temp.write("Lily " + prise +" "+ Fresh + " " + StalkLength);
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("Ви ввели невірну команду! Спробуйте ще раз:)");
                            break;
                    }
                    if(i==0){
                        i++;
                    }
                }
            }while(command != 5);
            temp.close();
            BufferedReader t = new BufferedReader(new FileReader("Temp.txt"));
            BufferedWriter f = new BufferedWriter(new FileWriter("Flowers.txt"));
            k = t.readLine();
            while (k!=null){
                f.write(k);
                k = t.readLine();
                if(k!=null){
                    f.write("\n");
                }
            }
            t.close();
            f.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Flowers_in_the_shop.Flowers();
    }

    public static void delete() {
        int k = 0;
        do {
            Flowers();
            wotch();
            System.out.println("Яку квітку ви хочете видалити?(Якщо хочете вийти введіть 0)");
            System.out.print("-> ");
            k = scanner.nextInt();
            if(k != 0) {
                try {
                    int l = 1;
                    BufferedReader flower = new BufferedReader(new FileReader("Flowers.txt"));
                    BufferedWriter temp = new BufferedWriter(new FileWriter("Temp.txt"));
                    String i = flower.readLine();
                    do {
                        if (l != k) {
                            temp.write(i + "\n");
                            i = flower.readLine();
                            l++;
                        }else {
                            i = flower.readLine();
                            l++;
                        }
                    }while (i != null);
                    flower.close();
                    temp.close();
                    BufferedReader t = new BufferedReader(new FileReader("Temp.txt"));
                    BufferedWriter f = new BufferedWriter(new FileWriter("Flowers.txt"));
                    i = t.readLine();
                    while (i!=null){
                        f.write(i);
                        i = t.readLine();
                        if(i!=null){
                            f.write("\n");
                        }
                    }
                    t.close();
                    f.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        }while (k!=0);
    }

}








