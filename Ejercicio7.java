import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Ingrese la palabra en minuscula: ");
        Scanner teclado = new Scanner(System.in);
        String palabra = teclado.nextLine();
        teclado.close();

        for(char i: palabra.toCharArray()) {
            if(i >= 'a' && i <= 'z')
               i += 'A' - 'a';
             System.out.print(i);
         }
    }}

    