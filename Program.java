package org.example.calc;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Calc calc_1 = new Calc();
        Calc calc_2 = new Calc();
        // сумма
//        System.out.println(calc_1.sum(new ArrayList<>(Arrays.asList(1,2,3))));

        // умножение
//        System.out.println(calc_1.multiplication(new ArrayList<>(Arrays.asList(1,2))));
        calc_1.multiplication(new ArrayList<>(Arrays.asList(1,2)));

        // деление двух чисел. Если записать три или более, то будут делиться по парам
//        calc_2.division_of_numbers(new ArrayList<>(Arrays.asList(6.0,5.0,4.0)));
    }
}
