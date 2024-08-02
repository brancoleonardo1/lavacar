public class Usuario {
    private String nome;
    private String carro;
    private int servico;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setCarro(String carro){
        this.carro = carro;
    }

    public String getCarro(){
        return this.carro;
    }

    public void setServico(int servico){
        this.servico = servico;
    }

    public int getServico(){
        return this.servico;
    }
}
