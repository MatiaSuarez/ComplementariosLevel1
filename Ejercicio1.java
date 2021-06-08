import java.util.Scanner;
public class Ejercicio1
{   
    public static void main(String[] args){
        String usuario = null;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        usuario = teclado.nextLine();
        System.out.println("Hola " + usuario);
    }
}