
package sc303.practica02ed;

public class Lista {
    
    
    private Node<Buscador> head;
    
    public Lista(){
        
        
    }
    
    public void insertar(Buscador value){
        Node<Buscador> node = new Node<Buscador>(value);
        if (head == null ){
            head = node;
        }
        else if( head.getValue().getId()> node.getValue().getId()){
            
            node.setNext(head);
            head = node;
        }
        else if(head.getValue().getId()<node.getValue().getId() && head.getNext() == null){
            
            head.setNext(node);
        }
        else{
            Node <Buscador> aux=head;
            while(aux.getNext() != null && aux.getNext().getValue().getId()< node.getValue().getId()){
               aux = aux.getNext();
            }
            node.setNext(aux.getNext());
            aux.setNext(node);
        }
    }
    
    
    public boolean buscar(int referencia){
        // Crea una copia de la lista.
        Node aux = head;
        // Bandera para indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta 
        // llegar al final de la lista.
        while(aux != null && encontrado != true){
            // Consulta si el valor del nodo es igual al de referencia.
            if (referencia == aux.getValue()){
                // Cambia el valor de la bandera.
                encontrado = true;
            }
            else{
                // Avanza al siguiente nodo
                aux = aux.getNext();
            }
        }
        // Retorna el resultado de la bandera
        return encontrado;
    }
    
    
    public void imprimir (){
        Node<Buscador> aux= head;
        while(aux != null){
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();
                      
        }
    }
}
