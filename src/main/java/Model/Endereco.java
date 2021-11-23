package Model;

public class Endereco {
    
    private String nome;
    private String identificacao;
    private String endereco;
    private String cidade;
    private String uf;
    private String cep;

    public Endereco() {
    }

    public Endereco(String nome, String identificacao, String endereco, String cidade, String uf, String cep) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.endereco = endereco;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }   
}
