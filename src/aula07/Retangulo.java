package aula07;

public class Retangulo extends Forma {
    private double comprimento;
    private double altura;

    public Retangulo(String cor, double comprimento, double altura) {
        super(cor);
        if (comprimento > 0 && altura > 0) {
            this.comprimento = comprimento;
            this.altura = altura;
        } else {
            this.setCor(null);
        }
    }

    public double area() {
        return altura * comprimento;
    }

    public double perimetro() {
        return comprimento * 2 + altura * 2;
    }

    @Override
    public String toString() {
        return super.toString() + "Retangulo [altura=" + altura + ", comprimento=" + comprimento + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Retangulo other = (Retangulo) obj;
        if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura))
            return false;
        if (Double.doubleToLongBits(comprimento) != Double.doubleToLongBits(other.comprimento))
            return false;
        if (getCor() == null) {
            if (other.getCor() != null)
                return false;
        } else if (!getCor().equals(other.getCor()))
            return false;
        return true;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        if (comprimento > 0) {
            this.comprimento = comprimento;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }
}
