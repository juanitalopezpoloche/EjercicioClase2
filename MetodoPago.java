public interface MetodoPago {

    String getNombreMetodoPago();

    public void procesarPago(double monto);

    String obtenerDetalles(double monto);

    Boolean validarMonto(double monto);

}
