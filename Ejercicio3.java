import java.util.Scanner;

public class Ejercicio3{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la altura del triangulo");
        int altura = scan.nextInt();
        imprimirTriangulo(altura,altura);
        scan.close();

    }
    
    public static void imprimirTriangulo(int altura, int alturaTotal){
        if (altura != 0){
            String linea = "";
            int cantidad = alturaTotal-altura;
            linea = getLinea(cantidad,linea);

            System.out.println(linea);

            imprimirTriangulo(altura-1,alturaTotal);
        }

    }
    
    public static String getLinea(int cantidad, String linea) {
    	if (cantidad != 0) {
    		linea = linea+getLinea(cantidad-1,linea);	
    	}
    	return linea+"*";
    	
    }
}