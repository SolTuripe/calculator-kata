package katas.katas.CalculatorKata;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private double total = 0.0;

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
    return total;
    }

    public void getSuma(double num) {
        total += num;
    }

    public void getSubtract(double num) {
        total -= num;
    }

    public void multiply(double num) {
        total *= num;
    }

    public void divide(double num) {
        total /= num;
    }

    public void percentage(double num) {
        total = total * num / 100;
    }

    public boolean isEven(int i) {
        if (i % 2 == 0) return true;
        return false;
    }

    public double getGreater(double num1, double num2) {
        if (num1 > num2) return num1;
        return num2;
    }

    public void sumArray(int[] arrayList) {
        int totalSum = 0;

        for(int i = 0; i < arrayList.length; i++) {
            totalSum += arrayList[i];
        }
        total = totalSum;
    }

    public ArrayList<Integer> greaterOrEqualTo5(int[] numList) {
        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (int i = 0; i < numList.length; i++) {
            if (numList[i] >= 5) {
                newList.add(numList[i]);
            }
        }
        return newList;
    }
}
