package parcial_2.Listas;

public class NodoDoble {
    Pago pago;
    NodoDoble siguiente;
    NodoDoble anterior;

    public NodoDoble(Pago pago) {
        this.pago = pago;
        this.siguiente = null;
        this.anterior = null;
    }
}