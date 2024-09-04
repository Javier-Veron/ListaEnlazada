import static org.junit.jupiter.api.Assertions.*;

class Lista_EnlazadaTest {

    @org.junit.jupiter.api.Test
    void agregar() {
        Lista_Enlazada nuevaLista = new Lista_Enlazada();
        nuevaLista.agregar(2);

        assertTrue(nuevaLista.tamanio == 1);
        assertTrue(nuevaLista.head.siguiente != null);
    }

    @org.junit.jupiter.api.Test
    void tamanio() {
        Lista_Enlazada nuevaLista = new Lista_Enlazada();
        int anteriorTamanio;
        anteriorTamanio = nuevaLista.tamanio;
        nuevaLista.agregar(2);

        assertTrue(nuevaLista.tamanio > anteriorTamanio);

    }

    @org.junit.jupiter.api.Test
    void buscarTrue() {
        Lista_Enlazada nuevaLista = new Lista_Enlazada();
        nuevaLista.agregar(2);

        assertTrue(nuevaLista.buscar(2));
    }

    @org.junit.jupiter.api.Test
    void buscarFalse() {
        Lista_Enlazada nuevaLista = new Lista_Enlazada();
        nuevaLista.agregar(2);

        assertFalse(nuevaLista.buscar(3));
        }


    @org.junit.jupiter.api.Test
    void eliminar() {
        Lista_Enlazada nuevaLista = new Lista_Enlazada();
        nuevaLista.agregar(2);
        int anteriorTamanio;
        anteriorTamanio = nuevaLista.tamanio;
        nuevaLista.eliminar(2);
        assertTrue(nuevaLista.tamanio < anteriorTamanio);
    }
}