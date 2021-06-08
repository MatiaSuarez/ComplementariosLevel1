import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = teclado.nextInt();
        int factorial= 1;
        for(int i=1;i<=numero;i++){
            factorial = factorial*i;
        }
        System.out.println("El factorial de "+numero+" es: " + factorial);
        }
    }