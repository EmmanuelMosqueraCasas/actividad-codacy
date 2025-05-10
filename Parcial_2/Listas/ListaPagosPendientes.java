package parcial_2.Listas;

public class ListaPagosPendientes {
    private Pago cabeza;
    private int contadorId = 1;

    public void agregarPago(String nombreCliente, double monto) {
        Pago nuevoPago = new Pago(contadorId++, nombreCliente, monto);
        if (cabeza == null) {
            cabeza = nuevoPago;
        } else {
            Pago temporal = cabeza;
            while (temporal.siguiente != null) {
                temporal = temporal.siguiente;
            }
            temporal.siguiente = nuevoPago;
        }
    }

    public Pago procesarPago() {
        if (cabeza == null) {
            return null;
        }
        Pago procesado = cabeza;
        cabeza = cabeza.siguiente;
        procesado.siguiente = null;
        return procesado;
    }

    public void mostrarPagosPendientes() {
        Pago temporal = cabeza;
        while (temporal != null) {
            System.out.println("ID: " + temporal.id + ", Cliente: " + temporal.nombreCliente + ", Monto: $" + temporal.monto);
            temporal = temporal.siguiente;
        }
    }
}