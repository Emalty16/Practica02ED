
package sc303.practica02ed;


public class Buscador {
    
    private int id;


    public Buscador(int id) {
        this.id = id;
    }
    public Buscador() {

    }
    @Override 
    public String toString(){
        return "Persona{" + "id" + id +  '}';
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
