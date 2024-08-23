
public class Main {
    public static void main(String[] args) {

        Lista_Enlazada lista = new Lista_Enlazada();
        System.out.println(lista.tamanio());
        lista.agregar(10);
        System.out.println(lista.tamanio());
        lista.agregar(20);
        System.out.println(lista.tamanio());


        System.out.println(lista.buscar(5));
        System.out.println(lista.buscar(20));
        System.out.println(lista.buscar(10));
        System.out.println(lista.buscar(0));

    }
}
