public class Endereco {

    private String estado;
    private String cidade;
    private String rua;

    public Endereco(String estado, String cidade, String rua) {
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
    }

    protected void setEstado(String estado) {
    this.estado = estado;
    }   
    public String getEstado() {
        return estado;
    }
    protected void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getCidade() {
        return cidade;
    }
    protected void setRua(String rua) {
        this.rua = rua;
    }
    public String getRua() {
        return rua;

    }
}