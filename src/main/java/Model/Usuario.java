package Model;

public class Usuario {
    private int id;
    private String senha;
    private String nome;
    private int fg_ativo;
    
    public Usuario(){
        
    }

    public Usuario(int id, String nome, String senha, int fg_ativo) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.fg_ativo = fg_ativo;
    }

    public int getFg_ativo() {
        return fg_ativo;
    }

    public void setFg_ativo(int fg_ativo) {
        this.fg_ativo = fg_ativo;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
