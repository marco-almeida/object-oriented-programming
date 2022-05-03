package aula07;

public abstract class Forma {
    private String cor;

    public Forma(String cor) {
        this.cor = cor;
    }

    public abstract double perimetro();

    public abstract double area();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Forma [cor=" + cor + "] ";
    }
}
