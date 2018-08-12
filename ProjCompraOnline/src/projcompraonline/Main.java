package projcompraonline;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Biblioteca objBiblioteca = new Biblioteca();

        byte op;

        JOptionPane.showMessageDialog(null, "::::::::::::::::::::::::::::::::::::::::::::::::::::::::CADASTRO DE LIVRARIA::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                + "      ::::::::::::::::::::::::::::::::::::::::::::INFORME OS DADOS A SEGUIR::::::::::::::::::::::::::::::::::::::::::::::", "SISTEMA", JOptionPane.DEFAULT_OPTION);

        objBiblioteca.setNome(JOptionPane.showInputDialog(null, "Nome:", "SISTEMA", JOptionPane.DEFAULT_OPTION));
        String nomeDaBiblioteca = objBiblioteca.getNome();

        objBiblioteca.setCnpj(Long.parseLong(JOptionPane.showInputDialog(null, "CNPJ:", "SISTEMA", JOptionPane.DEFAULT_OPTION)));
        do {
            op = Byte.parseByte(JOptionPane.showInputDialog(null, "::::::::::::::::::::::::::::::::::::::::::::::::::::::::LIVRARIA ONLINE::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                    + "::::::::::::::::::::::::::::::::::::::::::::ESCOLHA UMA OPÇÃO ABAIXO::::::::::::::::::::::::::::::::::::::::::::::\n"
                    + ":: 1 - CADASTRAR LIVRO\n"
                    + ":: 2 - MOSTRAR TODOS OS LIVROS\n"
                    + ":: 3 - MOSTRAR QUANTIDADE DE LIVROS\n"
                    + ":: 4 - ESVAZIAR CARRINHO\n"
                    + ":: 0 - SAIR\n"
                    + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                    + "DIGITE AQUI A OPÇÃO DESEJADA:", nomeDaBiblioteca, JOptionPane.DEFAULT_OPTION));

            switch (op) {
                case 1:
                    Livro objLivro = new Livro();

                    JOptionPane.showMessageDialog(null, "::::::::::::::::::::::::::::::::::::::::::::::::::::::::CADASTRO DE LIVROS::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                            + ":::::::::::::::::::::::::::::::::::::::::::::::::INFORME OS DADOS A SEGUIR::::::::::::::::::::::::::::::::::::::::::::::::::::", nomeDaBiblioteca, JOptionPane.DEFAULT_OPTION);
                    objLivro.setTitulo(JOptionPane.showInputDialog(null, "Título:", "DADOS DO LIVRO", JOptionPane.DEFAULT_OPTION));

                    String[] lista = {"Biografias e Memórias","Contos","Cordel","Crônica","Ensaios","Erótico","Ficção científica","Novela","Poesia","Policial","Romance","Teatro","Terror","Tragédia","Baseado em fatos reais","Livro-reportagem","Quadrinhos","Infantil","Outros"};
                    objLivro.setGenero((String) JOptionPane.showInputDialog(null, "Escolha o Gênero:", "DADOS DO LIVRO", JOptionPane.QUESTION_MESSAGE, null, lista, lista[18]));

                    objLivro.setAutor(JOptionPane.showInputDialog(null, "Autor:", "DADOS DO LIVRO", JOptionPane.DEFAULT_OPTION));
                    objLivro.setValorUnitario(Double.parseDouble(JOptionPane.showInputDialog(null, "Valor Unitário: R$", "DADOS DO LIVRO", JOptionPane.DEFAULT_OPTION)));

                    objBiblioteca.getListaDeLivros().add(objLivro);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, objBiblioteca, nomeDaBiblioteca, JOptionPane.DEFAULT_OPTION);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Você tem " + objBiblioteca.getListaDeLivros().size() + " livros cadastrados no momento!", nomeDaBiblioteca, JOptionPane.DEFAULT_OPTION);
                    break;
                case 4:
                    objBiblioteca.getListaDeLivros().clear();
                    JOptionPane.showMessageDialog(null, "Carrinho Vazio!\nVocê tem " + objBiblioteca.getListaDeLivros().size() + " livros cadastrados no momento!", nomeDaBiblioteca, JOptionPane.DEFAULT_OPTION);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Sistema Encerrado...\nTenha um bom dia!", nomeDaBiblioteca, JOptionPane.DEFAULT_OPTION);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA, TENTE NOVAMENTE!", nomeDaBiblioteca, JOptionPane.DEFAULT_OPTION);
            }
        } while (op != 0);
    }
}
