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
	//Metodos set y get
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
	//Metodos para obtener y establecer el siguiente nodo 
    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

}
