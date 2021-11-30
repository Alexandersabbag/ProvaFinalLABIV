package Model;

public class Entrega {
    
    private String nf;
    private String placa;
    private String id_remetente;
    private String id_destinatario;
    private String status_entrega;
    private String dta_saida;
    private String dta_entrega;

    public Entrega() {
    }

    public Entrega(String nf, String placa, String id_remetente, String id_destinatario, String status_entrega, String dta_saida, String dta_entrega) {
        this.nf = nf;
        this.placa = placa;
        this.id_remetente = id_remetente;
        this.id_destinatario = id_destinatario;
        this.status_entrega = status_entrega;
        this.dta_saida = dta_saida;
        this.dta_entrega = dta_entrega;
    }

    public String getNf() {
        return nf;
    }

    public void setNf(String nf) {
        this.nf = nf;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getId_remetente() {
        return id_remetente;
    }

    public void setId_remetente(String id_remetente) {
        this.id_remetente = id_remetente;
    }

    public String getId_destinatario() {
        return id_destinatario;
    }

    public void setId_destinatario(String id_destinatario) {
        this.id_destinatario = id_destinatario;
    }

    public String getStatus_entrega() {
        return status_entrega;
    }

    public void setStatus_entrega(String status_entrega) {
        this.status_entrega = status_entrega;
    }

    public String getDta_saida() {
        return dta_saida;
    }

    public void setDta_saida(String dta_saida) {
        this.dta_saida = dta_saida;
    }

    public String getDta_entrega() {
        return dta_entrega;
    }

    public void setDta_entrega(String dta_entrega) {
        this.dta_entrega = dta_entrega;
    }   
   
}
