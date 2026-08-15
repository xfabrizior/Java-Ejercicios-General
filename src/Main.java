///import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args)
    {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                ¿Que desea identificar?:
                1. Carácter
                2. Código ASCII"""));

        char caracter;
        int codigo;

        switch(opcion)
    {
            case 1:
                caracter = (JOptionPane.showInputDialog("Ingresa un caracter")).charAt(0);
                codigo= (int)caracter;
                JOptionPane.showMessageDialog(null, "El código ASCII de tu caracter: "+caracter+"\n Es: "+codigo);
                break;

            case 2:
                codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un código ASCII"));
                caracter = (char)codigo;
                JOptionPane.showMessageDialog(null, "El cáracter que genera el códico ASCII que ingresaste: "+codigo+"\n Es: "+caracter);
                break;

            default:
                JOptionPane.showMessageDialog(null, "La opcion ingresada no es correcta");
                break;

        }




    }
}