public class Carro extends Vehiculos {

    private int numPuertas;

    public Carro (String marca, String modelo, int velocidadMaxima, int numPuertas) {
        super(marca, modelo, velocidadMaxima);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNúmero de puertas: " + numPuertas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numPuertas;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Carro other = (Carro) obj;
        if (numPuertas != other.numPuertas)
            return false;
        return true;
    }

}
