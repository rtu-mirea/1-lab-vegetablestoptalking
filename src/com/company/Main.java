package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int n = 10;
        Scanner in = new Scanner(System.in);
        Set x = new Set(n);


        while (true) {
            System.out.println("Операции над объектами");
            System.out.println("1. Ввод с клавиатуры");
            System.out.println("2. Ввод рандом");
            System.out.println("3. Распечатать  ");
            System.out.println("4. Сортировка  ");
            System.out.println("5. Степень  ");
            System.out.println("Выбериет объект");
            int num = in.nextInt();
            switch (num) {
                case 1:
                    x.consolInput();
                    break;
                case 2:
                    x.randInput(-100, 100);
                    break;
                case 3:
                    x.consolOutput();
                    break;
                case 4:
                    x.sort();
                    x.consolOutput();
                    break;
                case 5:
                    System.out.println(x.log());
                    break;

            }
        }



	    // write your code here
    }
}
