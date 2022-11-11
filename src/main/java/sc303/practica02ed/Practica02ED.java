
package sc303.practica02ed;

public class Practica02ED {

    public static void main(String[] args) throws Exception {
        
        Ejer1();
        
        Ejer2();
    }
    
    public static void Ejer1() throws Exception{
        
        Lista lista = new Lista();
        
        System.out.println("<<-- Ejemplo de lista simple -->>\n");
        
        lista.Lista(5);
        lista.Lista(4);
        lista.Lista(3);
        lista.Lista(2);
        lista.Lista(1);
        
        System.out.println("<<-- Los numeros de la lista es la siguiente -->>");
        lista.listar();
        
       
        System.out.println("\n<<-- Obtener el valor del nodo en la posicion 3 -->>");
        System.out.println(lista.getValor(3));
        
        
        
        System.out.println("\n\n<<-- Fin de ejemplo lista simple -->>");
        
        System.out.println("\n<<-- Obtener el valor del nodo en la posicion anterior -->>");
        System.out.println(lista.getValor(2));
    }
    
    public static void Ejer2(){
        ListaCircular listaCircular = new ListaCircular();

      
        // Agregar al final de la lista circular
        listaCircular.agregarAlFinal(12);
        listaCircular.agregarAlFinal(15);
        listaCircular.agregarAlFinal(8);
        listaCircular.agregarAlInicio(41);
        listaCircular.agregarAlInicio(6);

       
      
        System.out.println("\nElimina el nodo en la Ultima posicion");
        
        listaCircular.Eliminar((listaCircular.getTamanio()-1));        
        listaCircular.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(listaCircular.getTamanio());
        
        System.out.print(" | Tamaño: ");
        System.out.println(listaCircular.getTamanio());
    }
}
