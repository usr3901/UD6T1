package ejercicio1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Queue<Pedido> cola = new LinkedList<>();

        cola.add(new Pedido("P001", "Carla", "Café con leche", true));
        cola.add(new Pedido("P002", "Mario", "Bocadillo de pollo", false));
        cola.add(new Pedido("P003", "Nerea", "Zumo natural", true));
        cola.add(new Pedido("P004", "Iván", "Tostada integral", false));
        cola.add(new Pedido("P005", "Laura", "Té verde", true));

        System.out.println("PEDIDOS PENDIENTES");

        for (Pedido p : cola) {
            System.out.println(p);
        }

        System.out.println("\nPrimer pedido:");
        System.out.println(cola.peek());

        Stack<Pedido> preparados = new Stack<>();

        for (int i = 0; i < 3; i++) {
            preparados.push(cola.poll());
        }

        System.out.println("\nÚltimo preparado:");
        System.out.println(preparados.peek());

        System.out.println("\nPedido extraído:");
        System.out.println(preparados.pop());

        System.out.println("\nPedidos pendientes:");
        System.out.println(cola.size());

        System.out.println("\n¿Cola vacía?");
        System.out.println(cola.isEmpty());
    }
}