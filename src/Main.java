import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número");
        int num1 =sc.nextInt();
        System.out.println("Ingresa otro número");
        int num2 =sc.nextInt();


        System.out.println("La suma de los 2 numeros es: "+ (num1+num2));
        System.out.println("La resta de los 2 numeros es: "+ (num1-num2));
        System.out.println("La multiplicación de los 2 numeros es: "+ (num1*num2));
        System.out.println("La división de los 2 numeros es: "+ (num1/num2));
    }
}