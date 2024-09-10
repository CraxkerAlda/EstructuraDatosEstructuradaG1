package edu.mx.uttt.recursividad;

public class Operaciones {
    private int n;
    
    public  Operaciones() {
        this.n = 1;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n>0)?n:1;
    }

    //Iterativo
    public void Imprimir() {
        int i = 1;
        do{
            System.out.println("Hola mundo");
            i++;
        }while(i<=this.n);
    }
   
    //Recursivo
    public void Imprimir(int n) {
        if (n == 1){
            System.out.println("Hola mundo");
        }else {
            //Caso general
            System.out.println("Hola mundo");
            Imprimir(n-1);
        }
    }

}
