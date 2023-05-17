public int[] invertirArray(int[] Array){
    int aux=0
    for (int i=0; i<Array.length/2; i++) {
        aux = Array[i];
        Array[i] = Array[Array.length-1-i];
        Array[Array.length-1-i] = aux;
    }
 

 return Array[];
}
