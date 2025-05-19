package com.example.sample.ramudasample;

public class MethodReferenceSample {
    public static void main(String[] args) {
        Multiplication multiplication = MethodReferenceSample::multiply;

        int answer = multiplication.multi(3, 4);
        System.out.println(answer); // 12
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
