public class CarroDeLuxo extends Carro{

    private String statusConforto;
    private boolean seguroIncluso;

    public CarroDeLuxo(String placa, String modelo, String marca, int ano, double valorDiaria, String statusConforto, boolean seguroIncluso) {
        super(placa, modelo, marca, ano, valorDiaria);
        this.seguroIncluso = seguroIncluso;
        this.statusConforto = statusConforto;
    }


    public String getStatusConforto() {
        return statusConforto;
    }

    public void setStatusConforto(String statusConforto) {
        this.statusConforto = statusConforto;
    }

    public boolean isSeguroIncluso() {
        return seguroIncluso;
    }

    public void setSeguroIncluso(boolean seguroIncluso) {
        this.seguroIncluso = seguroIncluso;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %-10s %-6s", statusConforto, seguroIncluso ? "Sim" : "Não");
    }
}
