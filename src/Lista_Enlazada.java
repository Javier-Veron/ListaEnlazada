public class Lista_Enlazada{

    Nodo head = new Nodo();
    int tamanio = 0;

    public void agregar(int valor){
        Nodo puntero = this.head;
        while (puntero.siguiente != null){
            puntero = puntero.siguiente;
        }
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.Nodo(valor);
        puntero.siguiente = nuevoNodo;
        this.tamanio += 1;

    }

    public int tamanio(){

        return this.tamanio;

    }

    public boolean buscar(int valor){
        Nodo puntero = this.head;
        while (puntero.siguiente != null){
            puntero = puntero.siguiente;
            if (puntero.valor() == valor){
                return true;
            }
        }
        return false;
    }

    public void eliminar(int valor){
        Nodo puntero = this.head;
        Nodo anterior;
        while (puntero.siguiente != null){
            anterior = puntero;
            puntero = puntero.siguiente;
            if (puntero.valor() == valor){
                anterior.siguiente = puntero.siguiente;
                this.tamanio -= 1;
                return;
            }
        }
    }

}

