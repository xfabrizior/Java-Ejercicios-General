//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args)
    {

        double circulord = Double.parseDouble((JOptionPane.showInputDialog("Ingresa el radio de un circulo")));

        JOptionPane.showMessageDialog(null,"El área de tu círculo es: "+(Math.PI*Math.pow(circulord,2)));

       /* System.out.println("La suma de los 2 numeros es: "+ (num1+num2));
        System.out.println("La resta de los 2 numeros es: "+ (num1-num2));
        System.out.println("La multiplicación de los 2 numeros es: "+ (num1*num2));
        System.out.println("La división de los 2 numeros es: "+ (num1/num2));*/
    }
}