public class Nodo{
    int valor = 0;
    Nodo siguiente = null;

    public void Nodo(int valor, Nodo siguiente){

        this.valor = valor;
        this.siguiente = siguiente;
    }

    public void Nodo(int valor){

        this.valor = valor;

    }

    public int valor(){

        return this.valor;
    }

    public Nodo siguiente(){

        return this.siguiente;
    }


}
