package aula07;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String nome;
    private String endereco;
    private List<Alojamento> alojamentos;
    private List<Viatura> viaturas;
    
    public Agencia(String nome, String endereco, List<Alojamento> alojamentos, List<Viatura> viaturas) {
        this.nome = nome;
        this.endereco = endereco;
        this.alojamentos = alojamentos;
        this.viaturas = viaturas;
    }

    
}
