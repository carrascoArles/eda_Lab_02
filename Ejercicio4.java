package EjercicioCompleto4;

public class Node<T> {
   //La clase tiene dos variables mienbro privada
    private T data;
    private Node<T> nextNode;
    
    //Constructor que se utiliza para crear un nuevo objeto
    public Node(T data) {
        this.data = data;
        this.nextNode = null;
    }
}
