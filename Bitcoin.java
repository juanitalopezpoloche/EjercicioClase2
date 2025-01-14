public class Bitcoin  implements MetodoPago {

    private String nombreMetodoPago = "Bitcoin";

    public String getNombreMetodoPago() {
        return nombreMetodoPago;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("El pago por " + monto + " TBC se proceso de forma exitosa a través de " + this.nombreMetodoPago);
    }

    @Override
    public String obtenerDetalles(double monto) {
        return "Metodo de pago: " + this.nombreMetodoPago + "\nMonto: " + monto + " \nEstado: " + (this.validarMonto(monto) ? "Aprobado" :  "Rechazado");
    }

    @Override
    public Boolean validarMonto(double monto) {
        return (monto >= 0.001) ? true : false;
    }

}
