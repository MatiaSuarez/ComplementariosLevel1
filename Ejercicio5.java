import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int a = teclado.nextInt();
        System.out.println("Ingrese otro numero: ");
        int b = teclado.nextInt();
        int suma = 0;
        for(int i=0;i<b;i++){
            suma = suma + a;
        }
        System.out.println(a+"*"+b+" = "+suma);
    }
}