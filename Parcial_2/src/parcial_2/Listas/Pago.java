package parcial_2.Listas;

public class Pago {
    
   int id;
    String nombreCliente;
    double monto;
    Pago siguiente;

    public Pago(int id, String nombreCliente, double monto) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.monto = monto;
        this.siguiente = null;
    }
}
