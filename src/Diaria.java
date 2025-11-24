import java.time.LocalDate;

public class Diaria extends Carro {

    private Carro carro;
    private LocalDate dataInicio = LocalDate.now();
    private int quantidadeDias;


    public Diaria(Carro c, int quantidadeDias) {
        this.carro = c;
        this.quantidadeDias = quantidadeDias;
    }

    @Override
    public String toString() {
        return "Diaria [carro=" + carro.getModelo() + ", dataInicio=" + dataInicio + "]";
    }

}
