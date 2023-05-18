
import java.util.*;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros");
        n=scan.nextInt();
        int num[] =new int[n];
        insertar(num);
        
        imprimir(num);
        
        invertirArray(num);
                
	}
    
public static int[] insertar(int[] Array){
    int aux=0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese los numeros");
    for (int i=0; i<Array.length; i++) {
        Array[i]=scan.nextInt();
    }
      return Array;
}
    
public static void invertirArray(int[] Array){
    int aux=0;
    for (int i=0; i<Array.length/2; i++) {
        aux = Array[i];
        Array[i] = Array[Array.length-1-i];
        Array[Array.length-1-i] = aux;
    }
      imprimir(Array);
}
private static void imprimir(int[] array){
        String nums="";
        for (int i = 0; i < array.length; i++) {
            nums += array[i] + ", ";
        }

        System.out.println(nums);
    }


	  

    
}
