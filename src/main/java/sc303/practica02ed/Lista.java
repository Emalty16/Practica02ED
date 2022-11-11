
package sc303.practica02ed;

public class Lista {
    
    
    private Node<Buscador> head;   
    private int tamanio;
    
    public void Lista(){
        head = null;
        tamanio = 0;
    }
    
    public boolean esVacia(){
        return head == null;
    }

    public int getTamanio(){
        return tamanio;
    }
 
    public void Lista(int valor){
        Node nuevo = new Node();
        nuevo.setValue(valor);
        if (esVacia()) {
            head = nuevo;
        } else{

            nuevo.setNext(head);
            head = nuevo;
        }
   
        tamanio++;
    }
    

    public int getValor(int posicion) throws Exception{
        if(posicion>=0 && posicion<tamanio){
            if (posicion == 0) {
                return head.getValue();
            }else{
                Node aux = head;
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getNext();
                }
                return aux.getValue();
            }
        // Crea una excepción de Posicion inexistente en la lista.
        } else {
            throw new Exception("Posicion inexistente en la lista.");
        }
    }
    
    public boolean buscar(int referencia){
        Node aux = head;
        boolean encontrado = false;
        while(aux != null && encontrado != true){
            if (referencia == aux.getValue()){
                encontrado = true;
            }
            else{
                aux = aux.getNext();
            }
        }
        return encontrado;
    }
    

    public void listar(){
        if (!esVacia()) {
            Node aux = head;
            int i = 0;
            while(aux != null){
                System.out.print(i + ".[ " + aux.getValue()+ " ]" + " ->  ");
                aux = aux.getNext();

                i++;
            }
        }
    }
}
