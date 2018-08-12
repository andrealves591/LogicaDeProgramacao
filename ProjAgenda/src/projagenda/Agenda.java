package projagenda;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> listaDeContatos;

    public Agenda() {
        this.listaDeContatos = new ArrayList<>();
    }

    public ArrayList<Contato> getListaDeContatos() {
        return listaDeContatos;
    }

    public void setListaDeContatos(ArrayList<Contato> listaDeContatos) {
        this.listaDeContatos = listaDeContatos;
    }

    public ArrayList<Contato> pesquisarAniversariantesMes(byte mes) {
        ArrayList<Contato> listaDeEncontrados = new ArrayList<>();
        for (int i = 0; i < this.listaDeContatos.size(); i++) {
            if (this.listaDeContatos.get(i).getDataDeNascimeto().getMes() == mes) {
                listaDeEncontrados.add(this.listaDeContatos.get(i));
            }
        }
        return listaDeEncontrados;
    }

    public Contato pesquisarContatoNome(String nome) {
        for (int i = 0; i < this.listaDeContatos.size(); i++) {
            if (this.listaDeContatos.get(i).getNome().equalsIgnoreCase(nome)) {
                return this.listaDeContatos.get(i);
            }
        }
        return null;
    }
    
    public String mostrarContatos() {
        String resposta = "\n";
        for (int i = 0; i < this.listaDeContatos.size(); i++) {
            resposta += ":::::::::::::::::::::::::::CONTATO " + (i + 1) + ":::::::::::::::::::::::::::\n"
                    + this.listaDeContatos.get(i) + "\n";
        }
        return resposta;
    }

    @Override
    public String toString() {
        return "\n:::::::::::::Lista De Contatos:::::::::::::\n\n" + listaDeContatos;
    }

}
