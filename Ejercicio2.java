import java.util.Scanner;

public class Ejercicio2{

    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero1 = teclado.nextInt();
        System.out.println("Ingrese el siguinte numero");
        int numero2 = teclado.nextInt();
        
        
        System.out.println(numero1 +" + "+ numero2 +" = " + (numero1+numero2));
        System.out.println(numero1 +" - "+ numero2 +" = " + (numero1-numero2));
        System.out.println(numero1 +" * "+ numero2 + " = "+(numero1 * numero2));
        System.out.println(numero1 +" / "+ numero2 +" = "+(numero1 / numero2));
        System.out.println(numero1 +" % "+ numero2 +" = "+(numero1 % numero2));


    }
}