package aula05;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        if (raio > 0) {
            this.raio = raio;
        }
    }

    public double area() {
        return Math.PI * (raio * raio);
    }

    public double perimetro() {
        return Math.PI * 2 * raio;
    }

    @Override
    public String toString() {
        return "Circulo [raio=" + raio + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Circulo other = (Circulo) obj;
        if (Double.doubleToLongBits(raio) != Double.doubleToLongBits(other.raio))
            return false;
        return true;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio > 0) {
            this.raio = raio;
        }
    }
}
