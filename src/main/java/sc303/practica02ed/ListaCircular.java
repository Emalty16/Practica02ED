
package sc303.practica02ed;

import java.util.Scanner;

public class ListaCircular {
 
    private Node inicio;
  
    private Node ultimo;

    private int tamanio;
    
   
    public void Lista(){
        inicio = null;
        ultimo = null;
        tamanio = 0;  
    }

    public boolean esVacia(){
        return inicio == null;
    }
   
    public int getTamanio(){
        return tamanio;
    }
  
    public void agregarAlFinal(int valor){
        Node nuevo = new Node();
        nuevo.setValue(valor);
        if (esVacia()) {
            inicio = nuevo;
            ultimo = nuevo;
            ultimo.setNext(inicio);
        } else{
            ultimo.setNext(nuevo);
            nuevo.setNext(inicio);
            ultimo = nuevo;
        }
        tamanio++;
    }
  
    public void agregarAlInicio(int valor){
   
        Node nuevo = new Node();
  
        nuevo.setValue(valor);
  
        if (esVacia()) {
      
            inicio = nuevo;
            ultimo = nuevo;  
            ultimo.setNext(inicio);
        } else{
            nuevo.setNext(inicio);
            inicio = nuevo;
            ultimo.setNext(inicio);
        }
        tamanio++;
    }

    public boolean buscar(int referencia){
       
        Node aux = inicio;
      
        boolean encontrado = false;
   
        do{

            if (referencia == aux.getValue()){

                encontrado = true;
            }
            else{

                aux = aux.getNext();
            }
        }while(aux != inicio && encontrado != true);

        return encontrado;
    }
  
    public void listar(){
      
        if (!esVacia()) {
         
            Node aux = inicio;
         
            int i = 0;
            System.out.print("-> ");
       
            do{
      
                System.out.print(i + ".[ " + aux.getValue()+ " ]" + " ->  ");
     
                aux = aux.getNext();
            
                i++;
            }while(aux != inicio);
        }
}

    public void Eliminar(int posicion){
   
        
        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingrese el ultimo de la fila que quiere eliminar ");

        int Borrar = lectura.nextInt();
    
    
        if (Borrar == ultimo.getValue()){
            
        if(posicion>=0 && posicion<tamanio){
 
            if(posicion == 0){

                inicio = inicio.getNext();
            }

            else{

                Node aux = inicio;

                for (int i = 0; i < posicion-1; i++) {
                    aux = aux.getNext();
                }

                Node siguiente = aux.getNext();

                aux.setNext(siguiente.getNext());
            }
            
            tamanio--;
        }
    }
            
        }
  
            
                } 
   


