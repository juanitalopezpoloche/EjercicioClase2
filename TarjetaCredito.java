public class TarjetaCredito implements MetodoPago{

    private String nombreMetodoPago = "Tarjeta Crédito";

    public String getNombreMetodoPago() {
        return nombreMetodoPago;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("El pago por $" + monto + " se proceso de forma exitosa a través de la " + this.nombreMetodoPago);
    }

    @Override
    public String obtenerDetalles(double monto) {
        return "Metodo de pago: " + this.nombreMetodoPago + "\nMonto: " + monto + " \nEstado: " + (this.validarMonto(monto) ? "Aprobado" :  "Rechazado");
    }

    @Override
    public Boolean validarMonto(double monto) {
        return (monto > 0) ? true : false;
    }

}
