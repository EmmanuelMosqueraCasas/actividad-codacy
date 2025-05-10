package parcial_2.Listas;

public class Principal {
    public static void main(String[] args) {
        ListaPagosPendientes pagosPendientes = new ListaPagosPendientes();
        HistorialPagosRealizados pagosRealizados = new HistorialPagosRealizados();

        pagosPendientes.agregarPago("Emmanuel Mosquera", 850000);
        pagosPendientes.agregarPago("Daniel Amaya", 700000);
        pagosPendientes.agregarPago("Yenny Gómez", 350000);

        System.out.println("\nPagos pendientes:");
        pagosPendientes.mostrarPagosPendientes();

        Pago pagoProcesado;
        while ((pagoProcesado = pagosPendientes.procesarPago()) != null) {
            pagosRealizados.agregarPago(pagoProcesado);
        }

        System.out.println("\nPagos realizados (adelante):");
        pagosRealizados.mostrarAdelante();

        System.out.println("\nPagos realizados (atrás):");
        pagosRealizados.mostrarAtras();
    }
}