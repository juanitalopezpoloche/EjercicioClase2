public class TransferenciaBancaria  implements MetodoPago {

    private String nombreMetodoPago = "Transferencia Bancaria";

    public String getNombreMetodoPago() {
        return nombreMetodoPago;
    }

    @Override
    public void procesarPago(double monto) {
        if (this.validarMonto(monto)) {
            System.out.println("El pago por $" + monto + " se proceso de forma exitosa a través de la transferencia bancario que realizó");
        } else {
            System.out.println("Error al procesar el pago de " + monto + " a través de una transferencia bancaria. Por favor valide que el monto ingresado sea el correcto");
        }
    }

    @Override
    public String obtenerDetalles(double monto) {
        return "Metodo de pago: " + this.nombreMetodoPago + "\nMonto: " + monto + " \nEstado: " + (this.validarMonto(monto) ? "Aprobado" :  "Rechazado");
    }

    @Override
    public Boolean validarMonto(double monto) {
        return (monto >= 10) ? true : false;
    }

}
