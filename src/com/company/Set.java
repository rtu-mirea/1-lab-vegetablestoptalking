package com.company;
import java.util.Scanner;
public class Set {
    private int n; // size
    private int x[];

    Set(int n) {
        this.n = n;
        this.x = new int[this.n];

    }

    public int[] get_arr(){ //Возвращает массив
        return x;
    }

    public void set(int index, int item){ // Устанавливает значение массива для элемента с индексом index
        x[index] = item;
    }

    private void swap(int n, int m){ // Смена элементов в массиве
        int b = x[n];
        x[n] = x[m];
        x[m] = b;
    }

    public void sort(){ // Сортировка согласно правилам из варианта
        int first = x[0];
        int m = 0;
        for (int i = 1; i < n; i++)

            {
                if (x[i] < first){
                    if ((i-m) > 1) {
                        swap(i, m+1);
                        swap(m, m+1 );
                        ++m;

                    }
                    else {
                        swap(i, m);
                        m = i;
                    }
                }
            }
    }

    private boolean pow_check(int num, int n){ // Проверка на степень числа
        while (num != 1 && num % n == 0) {
            num /= n;
        }

        return (num == 1);
    }

    public int log(int number){ // Подсчет элементов, которые являются степенью заданного числа
        int count = 0;

        for (int i = 0; i < n; ++i) {
            boolean flag = false;
            flag = pow_check(Math.abs(x[i]), number);
            if (flag){
                ++count;
            }
        }
        return count;
    }

}
