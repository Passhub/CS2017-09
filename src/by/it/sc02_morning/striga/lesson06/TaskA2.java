package by.it.sc02_morning.striga.lesson06;
/*
Рисуем долларовый прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник высотой m и шириной n из знаков $.

Пример: m=2, n=4
$$$$
$$$$

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить прямоугольник размером m на n из знаков $.
4. В программе должен использоваться цикл for.

 */

import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        char doll = '$';
        int i;

        for (i = 1; i <= m; i++) {

            int j = 1;
            while (j <= n) {
                System.out.print(doll);
                j++;
            }
            System.out.println();
        }
    }
}



