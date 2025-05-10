package parcial_2.Listas;

public class HistorialPagosRealizados {
    private NodoDoble cabeza;
    private NodoDoble cola;

    public void agregarPago(Pago pago) {
        NodoDoble nuevo = new NodoDoble(pago);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    public void mostrarAdelante() {
        NodoDoble temporal = cabeza;
        while (temporal != null) {
            System.out.println("ID: " + temporal.pago.id + ", Cliente: " + temporal.pago.nombreCliente + ", Monto: $" + temporal.pago.monto);
            temporal = temporal.siguiente;
        }
    }

    public void mostrarAtras() {
        NodoDoble temporal = cola;
        while (temporal != null) {
            System.out.println("ID: " + temporal.pago.id + ", Cliente: " + temporal.pago.nombreCliente + ", Monto: $" + temporal.pago.monto);
            temporal = temporal.anterior;
        }
    }
}