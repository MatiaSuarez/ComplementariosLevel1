import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su Nombre y Apellido: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese su edad: ");
        String edad = teclado.nextLine();
        System.out.println("Ingrese su ciudad: ");
        String ciudad = teclado.nextLine();
        System.out.println("Ingrese su direccion: ");
        String direccion = teclado.nextLine();
        teclado.close();

        System.out.println(ciudad+" - "+direccion+" - "+edad+" - "+nombre);
    }
}
