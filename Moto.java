public class Moto extends Vehiculos{

    private boolean tieneSidecar;

    public Moto (String marca, String modelo, int velocidadMaxima, boolean tieneSidecar) {
        super(marca, modelo, velocidadMaxima);
        this.tieneSidecar = tieneSidecar;
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTiene Side Car: " + (tieneSidecar ? "Si" : "No");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (tieneSidecar ? 1231 : 1237);
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
        Moto other = (Moto) obj;
        if (tieneSidecar != other.tieneSidecar)
            return false;
        return true;
    }

}
