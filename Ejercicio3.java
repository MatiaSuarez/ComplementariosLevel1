import java.util.Scanner;

public class Ejercicio3{

    public static void main(String[] args){
        String num = "";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = teclado.nextInt();
        if (numero>0){
            for (int i=1; i<=numero; i++){
                System.out.println(num += i );
            }
        }
        else{
            System.out.println("Debe ingresar un numero mayor a 0");
        }
    }}