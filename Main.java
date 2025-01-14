import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<MetodoPago> metodosPago = new ArrayList<>();
        metodosPago.add(new TarjetaCredito());
        metodosPago.add(new PayPal());
        metodosPago.add(new TransferenciaBancaria());   
        metodosPago.add(new Bitcoin());
        metodosPago.add(new TarjetaRegalo());
        
        Scanner entrada = new Scanner(System.in);

        for (MetodoPago metodoPago : metodosPago) {
            String nombreMetodoPagoActual = metodoPago.getNombreMetodoPago();

            System.out.println("\n¿Desea realizar un pago por " + nombreMetodoPagoActual + "? Respuestas (s/n)");
            char continuarPago = entrada.nextLine().charAt(0);

            switch (Character.toLowerCase(continuarPago)) {
                case 's':
                    System.out.println("\nDigite el monto del pago que desea realizar: ");
                    double monto = entrada.nextDouble();
        
                    System.out.println("\n--------------- PROCESANDO PAGO ---------------");
                    
                    if (metodoPago.validarMonto(monto)) {
                        metodoPago.procesarPago(monto);
                        System.out.println("Detalle Pago --------------------");
                        System.out.println(metodoPago.obtenerDetalles(monto));
                        System.out.println("\n--------------- ------ ---------------");
                    } else {
                        System.out.println("Error al procesar el pago de " + monto + " a través del método de pago " + nombreMetodoPagoActual + ". El monto ingresado no es valido");
                        System.out.println("\n--------------- ------ ---------------");
                    }
                    
                    entrada.nextLine();
                    
                    break;
                case 'n':
                    System.out.println("Pasamos al siguiente método de pago");
                    break;
                default:
                    System.out.println("La opción digitada no es valida, pasamos al siguiente mepetodo de pago");
            }
        }        
    }
}
