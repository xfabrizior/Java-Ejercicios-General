import java.util.Scanner;
//import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número");
        double numero = sc.nextDouble();

        if(numero%2==0)
        {
            System.out.println("El numero ingresado es divisible entre 2");
        }
        else
        {
            System.out.println("El numero ingresado no es divisible entre 2");
        }

    }
}