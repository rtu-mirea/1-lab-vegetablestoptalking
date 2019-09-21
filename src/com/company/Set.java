package com.company;
import java.util.Scanner;
public class Set {
    private int n;
    private int x[];

    Set(int n) {
        this.n = n;
        this.x = new int[this.n];

    }
    void randInput(int min, int max) {
        for (int i = 0; i < n; i ++){
            x[i] = (int) (Math.random() * ++max + min);
        }
    }
    void randInputInterval(int min, int max){
        for (int i = 0; i < n; ++i){
            x[i] = (int) (Math.random()*max + min);
        }
    }

    void consolInput(){
        System.out.println("Введите " + n + " чисел");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; ++ i)
        {
            x[i] = in.nextInt();
        }

        System.out.println("---------------------------------");
    }
    void consolOutput(){
        System.out.print("Массив чисел:");
        for (int i = 0; i < n; ++i){
            System.out.print(" " + x[i]);
        }
        System.out.println();
    }
    int findIndexNumber(int a){
        for (int i = 0; i < n; ++i){
            if (x[i] == a){
                return i;
            }
        }
        return -1;
    }
    void swap(int n, int m){
        int b = x[n];
        x[n] = x[m];
        x[m] = b;
    }
    void sort(){
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
    boolean l_check(int num, int n){
        while (num != 1 && num % n == 0) {
            num /= n;
        }
        if (num == 1)
            return true;
        else
            return false;

    }

    int log(){
        int count = 0;

        for (int i = 0; i < n; ++i) {
            int k =2;
            boolean flag = false;
            while((Math.abs(x[i]) != k) & !flag){
                flag = l_check(Math.abs(x[i]), k);
                ++k;
                if (flag){
                    ++count;
                    break;
                }
            }

        }
        return count;
    }

}
