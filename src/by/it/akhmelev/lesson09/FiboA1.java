package by.it.akhmelev.lesson09;

import java.math.BigInteger;

/*
 * Вам необходимо выполнить рекурсивный способ вычисления чисел Фибоначчи
 */

public class FiboA1 {

    private long startTime = System.currentTimeMillis();

    private long time() {
        long result=System.currentTimeMillis() - startTime;
        startTime = System.currentTimeMillis();
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {
        FiboA1 fibo = new FiboA1();
        int n = 33;
        System.out.printf("calc(%d)=%d \n\t time=%d \n\n", n, fibo.calc(n), fibo.time());

        //вычисление чисел фибоначчи медленным методом (рекурсией)
        fibo = new FiboA1();
        n = 33;
        System.out.printf("slowA(%d)=%d \n\t time=%d \n\n", n, fibo.slowA(n), fibo.time());
    }


    private int calc(int n) {
        //здесь простейший вариант, в котором код совпадает с мат.определением чисел Фибоначчи
        //время O(2^n)
        //составим мы этот алгоритм на занятии
        if (n<=1) return n;
        return calc(n-2)+calc(n-1);
    }


    BigInteger slowA(int n) {
        //рекурсия
        //здесь нужно реализовать вариант без ограничения на размер числа,
        //в котором код совпадает с мат.определением чисел Фибоначчи
        //время O(2^n)
        if (n==0) return BigInteger.ZERO;
        if (n==1) return BigInteger.ONE;
        return slowA(n-2).add(slowA(n-1));
    }



}
