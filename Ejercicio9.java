import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una palabra/oracion/texto: ");
        String texto = teclado.nextLine();
        System.out.println("Ingrese una letra: ");
        String letra = teclado.nextLine();
        teclado.close();
        int cantidad = 0;
        for(int i=0; i<texto.length();i++){
                cantidad = cantidad+ 1;}
        System.out.println(cantidad);
    }
}
