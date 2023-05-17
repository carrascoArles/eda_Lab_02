import java.util.Scanner;

public class Ejercicio03{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la altura del triangulo");
        int altura = scan.nextInt();
        imprimirTriangulo(altura,altura);



    }
    public static void imprimirTriangulo(int altura, int alturaTotal){
        if (altura == 0){
        }
        else {
            String linea = "";
            for (int i = 0;i<alturaTotal-altura;i++){
                linea += "*";
            }
            System.out.println(linea);

            imprimirTriangulo(altura--,alturaTotal);
            
        }

    }
}