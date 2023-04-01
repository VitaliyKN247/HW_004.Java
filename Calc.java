package org.example.calc;

import java.util.List;

public class Calc {
    public Double sum(List<? extends Number> items){  // метод суммирования
        double sum = 0;
        for (Number i : items)
            sum += i.doubleValue();
        return sum;
    }

    public Double multiplication(List<? extends Number> items){  // метод умножения
        double multiplication = 1;
        for (Number i : items)
            multiplication *= i.doubleValue();
//        boolean b = Math.IEEEremainder(multiplication, 1) == 0; первый метод по округлению

        // второй способ через стринг формат, для округления дробной части, если она равно нулю
        //for (int i = 0; i < items.size() ; i++) {
        //            multiplication *= (Double) items.get(i);
        //            System.out.println(String.format(String.valueOf(multiplication)));
        //        }
        return multiplication;
    }

    public Double division_of_numbers(List<? extends Number> items){  // метод деления двух чисел.
        double division_of_numbers = 0;
        double sum = 0;
        for (int i = 1; i < items.size() ; i++) {
            division_of_numbers = (Double)items.get(i-1) / (Double)items.get(i);
            System.out.println(String.format(String.valueOf(division_of_numbers)));
//            System.out.println(String.format("%.2f",division_of_numbers));
        }
        return division_of_numbers;
    }
}


