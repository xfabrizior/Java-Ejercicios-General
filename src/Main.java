//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args)
    {

        int num1 = Integer.parseInt((JOptionPane.showInputDialog("Intruduce un número")));

        int num2 = Integer.parseInt((JOptionPane.showInputDialog("Intruduce otro número")));

        JOptionPane.showMessageDialog(null,"La suma de los 2 numero es: "+(num1+num2)+"\n"+
                "La resta de los 2 numero es: "+(num1-num2)+"\n"+
                "La multiplicación de los 2 numero es: "+(num1*num2)+"\n"+
                "La división de los 2 numero es: "+(num1/num2));

       /* System.out.println("La suma de los 2 numeros es: "+ (num1+num2));
        System.out.println("La resta de los 2 numeros es: "+ (num1-num2));
        System.out.println("La multiplicación de los 2 numeros es: "+ (num1*num2));
        System.out.println("La división de los 2 numeros es: "+ (num1/num2));*/
    }
}