package aula08;

public abstract class AlimentoVegetariano extends Alimento {

    public AlimentoVegetariano(double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
    }

    @Override
    public String toString() {
        return "AlimentoVegetariano []";
    }
    
}
