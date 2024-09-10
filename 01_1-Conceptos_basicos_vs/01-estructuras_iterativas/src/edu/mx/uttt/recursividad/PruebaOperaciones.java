package edu.mx.uttt.recursividad;
import javax.swing.JOptionPane;

public class PruebaOperaciones {
    public static void main (String[] args){
        ejecutar();
    }


    public static String menu(){
        String menu ="Menú Principal\n" +
                    "1) Imprimir Iterativo\n" +
                    "2) Imprimir Recursivo\n" +
                    "3) Salida\n" +
                    "Elegir opción: ";
        return JOptionPane.showInputDialog(menu);
    }

    public static void ejecutar(){
        int n = 0;
        String opcion = "";
        boolean sentinel = true;
        Operaciones ope1 = new Operaciones();
    

        do{
            opcion = menu();
            switch (opcion) {
                case "1": //Iterativo
                    n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de veces a imprimir"));
                    ope1.setN(n);
                    ope1.Imprimir();    

                    break;
                case "2":
                    n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de veces a imprimir"));
                    ope1.setN(n);
                    ope1.Imprimir(ope1.getN());
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "I'll be back");
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
            }

        }while(sentinel); {

        }
    }
}

