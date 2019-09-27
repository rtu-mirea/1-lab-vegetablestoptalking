package com.company;
import java.util.Scanner;


public class Main {



    public static void main(String[] args) {
        int n = 10;
        System.out.print("Введите кол-во элементов в массиве: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        Set x = new Set(n);


        while (true) {
            System.out.println("Операции над объектами");
            System.out.println("1. Ввод с клавиатуры");
            System.out.println("2. Ввод рандом");
            System.out.println("3. Распечатать");
            System.out.println("4. Распечатать справа налево ");
            System.out.println("5. Сортировка");
            System.out.println("6. Степень");
            System.out.println("Выбериет объект");
            int num = in.nextInt();
            switch (num) {
                case 1: // Ввод с клавы
                    consoleInput(x, n);
                    break;
                case 2: // Рандомный ввод
                    randInput(x, -100, 100, n);
                    break;
                case 3: // Вывод с клавы
                    consoleOutput(x, n);
                    break;
                case 4: // Вывод с клавы справа-налево
                    consoleOutput_right(x, n);
                    break;
                case 5: // Сортировка по заданию
                    x.sort();
                    consoleOutput(x, n);
                    break;
                case 6: // Проверка на степень
                    System.out.print("Введите число для проверки на его степень: ");
                    int number = in.nextInt();
                    System.out.println(x.log(number));
                    break;

            }
        }



	    // write your code here
    }

    /*
    !!!!!!!!!!!!!!!!!!
    ЗДЕСЬ НАЧИНАЮТСЯ Ф-ИИ ДЛЯ ВВОДА И ВЫВОДА
    !!!!!!!!!!!!!!!!!!
     */
    public static void randInput(Set x, int min, int max, int n) { // Рандомный ввод
        for (int i = 0; i < n; i ++){
            x.set(i, (int) (Math.random() * ++max + min)); // set для инкапсуляции
        }
    }

    public static void consoleInput(Set x, int n){ // Ввод с консоли
        System.out.println("Введите " + n + " чисел");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; ++ i)
        {
            x.set(i, in.nextInt());
        }

        System.out.println("---------------------------------");
    }
    public static void consoleOutput(Set x, int n){ // Вывод с консоли
        System.out.print("Массив чисел:");


        for (int item : x.get_arr()){ // Без индекса
            System.out.print(" " + item);
        }

        System.out.println();
    }

    public static void consoleOutput_right(Set x, int n) { // Вывод справа-налево
        System.out.print("Массив чисел справа-налево:");
        for (int i = n-1; i >= 0; --i) {
            System.out.print(" " + x.get_arr()[i]);
        }

        System.out.println();
    }
}
