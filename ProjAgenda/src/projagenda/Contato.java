
package projagenda;

public class Contato {
    private String nome;
    private String fone;
    private Data dataDeNascimeto;

    public Contato() {
        this.dataDeNascimeto = new Data();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Data getDataDeNascimeto() {
        return dataDeNascimeto;
    }

    public void setDataDeNascimeto(Data dataDeNascimeto) {
        this.dataDeNascimeto = dataDeNascimeto;
    }

    @Override
    public String toString() {
        return "\n"
                + "Nome: " + nome + "\n"
                + "Telefone: " + fone + "\n"
                + "Data de Nascimeto: " + dataDeNascimeto;
    }
    
    
    
}
