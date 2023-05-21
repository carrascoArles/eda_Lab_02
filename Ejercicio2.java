public class Ejercicio2 {
    public static void main(String[] args) {
        final int d = 2;
        int[] array = { 1, 2, 3, 4, 5 };

        mostrarArray(array);

        for (int i = 0; i < d; i++)
            array = rotarIzquierdaArray(array);
        
        System.out.print(" -> ");
        mostrarArray(array);
        System.out.println();
    }

    public static void mostrarArray(int[] A) {
        System.out.print("[ ");

        for (int i = 0; i < A.length; i++)
            System.out.print(A[i] + " ");
        
        System.out.print("]");
    }

    public static int[] rotarIzquierdaArray(int[] A) {
        int tam = A.length;
        int[] Aiz = new int[tam];

        for (int i = 1; i < tam; i++)
            Aiz[i - 1] = A[i];

        Aiz[tam - 1] = A[0];

        return Aiz;
    }
}