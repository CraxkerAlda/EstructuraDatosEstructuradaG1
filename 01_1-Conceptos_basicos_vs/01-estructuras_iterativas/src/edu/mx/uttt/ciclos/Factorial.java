package edu.mx.uttt.ciclos;

public class Factorial {
    private int n;

    public Factorial(){
        this.n =1;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n>0)?n:1;
    }

    public long CalcularFactorial(){
        long fact = 1;
        for (int i = 1; i <= this.n; i++) {
            fact+=1;
        }
        return fact;
    }

    public long CalcularFactReverse(){
        long fact = 1;
        for (int i = this.n; i <= 1; i++) {
            fact+=1;
        }
        return fact;
    }
}
