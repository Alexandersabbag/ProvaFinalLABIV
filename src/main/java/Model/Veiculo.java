package Model;

public class Veiculo {
    
    private String placa;
    private String cor;
    private String modelo;
    private String marca;
    private String motorista;
    private int fg_ativo;

    public Veiculo() {
    }

    public Veiculo(String placa, String cor, String modelo, String marca, String motorista, int fg_ativo) {
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.motorista = motorista;
        this.fg_ativo = fg_ativo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public int getFg_ativo() {
        return fg_ativo;
    }

    public void setFg_ativo(int fg_ativo) {
        this.fg_ativo = fg_ativo;
    }
}
