public class Main {
    public static void main (String[] arg) {

        Carro carro1 = new Carro("Mazda", "2025", 300, 4);
        Carro carro2 = new Carro("Volvo", "2024", 900, 2);
        Moto  moto1  = new Moto("NMAX", "2025", 200, false);
        Moto  moto2  = new Moto("NMAX", "2025", 200, false);

        System.out.println("----------------------- CARROS -----------------------");
        System.out.println("----- Carro " + carro1.getMarca() + "/" + carro1.getModelo() + " -----");
        System.out.println(carro1.toString());
        System.out.println("----- Carro " + carro2.getMarca() + "/" + carro2.getModelo() + " -----");
        System.out.println(carro2.toString());
        System.out.println("Los carros disponibles son iguales: " + (carro1.equals(carro2) ? "Si" : "No"));

        System.out.println("\n----------------------- MOTOS -----------------------");
        System.out.println("----- Moto " + carro1.getMarca() + "/" + carro1.getModelo() + " -----");
        System.out.println(moto1.toString());
        System.out.println("----- Moto " + carro2.getMarca() + "/" + carro2.getModelo() + " -----");
        System.out.println(moto2.toString());
        System.out.println("Las motos disponibles son iguales: " + (moto1.equals(moto2) ? "Si" : "No"));
    }
}
