import java.util.Scanner;

public class Ejercicio6{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int a = teclado.nextInt();
        System.out.println("Ingrese otro numero: ");
        int b = teclado.nextInt();
        int multiplicacion = 1;
        for(int i=0;i<b;i++){
            multiplicacion = multiplicacion * a;
        }
        System.out.println(a+" elevado a "+b+" = "+multiplicacion);
    }
}