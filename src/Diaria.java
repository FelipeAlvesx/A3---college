import java.time.LocalDate;

public class Diaria {

    private Carro carro;
    private LocalDate dataInicio = LocalDate.now();
    private int quantidadeDias;
    private String cpfCliente;


    public Diaria(Carro c, int quantidadeDias, String cpfCliente) {
        this.cpfCliente = cpfCliente;
        this.carro = c;
        this.quantidadeDias = quantidadeDias;
    }


    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        return "------------------------------------\n" +
                "Diária do Carro: " + carro.getModelo() + " (Placa: " + carro.getPlaca() + ")\n" +
                "Início: " + dataInicio + "\n" +
                "Quantidade de Dias: " + quantidadeDias + "\n" +
                "CPF CLIENTE:    " + cpfCliente + "\n" +
                "Valor Total: R$ " + String.format("%.2f", valorTotal()) + "\n" +
                "------------------------------------";
    }

    public double valorTotal(){
        return carro.getValorDiaria() * quantidadeDias;
    }


}
