public class Lista_Enlazada{

    Nodo head = new Nodo();
    int tamanio = 0;

    public void agregar(int valor){
        Nodo puntero = this.head;
        while (puntero.siguiente != null){
            puntero = puntero.siguiente;
        }
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.valor = valor;
        puntero.siguiente = nuevoNodo;
        this.tamanio += 1;

    }

    public int tamanio(){

        return this.tamanio;

    }

    public boolean buscar(int valor){
        Nodo puntero = this.head;
        boolean encontrado = false;
        if (this.tamanio > 0) {
            while ( !encontrado || puntero.siguiente() != null){
                puntero = puntero.siguiente;
                if(puntero.valor() == valor){
                    encontrado = true;
                }
            }
            if (puntero.valor() == valor){
                encontrado = true;
            }
        }
        else{
        System.out.println("La lista esta vacia.");
            }
        return encontrado;
    }



}

