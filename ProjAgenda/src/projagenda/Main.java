package projagenda;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Agenda objAgenda = new Agenda();
        ArrayList<Contato> lista = objAgenda.getListaDeContatos();

        byte op;

        do {
            op = Byte.parseByte(JOptionPane.showInputDialog(null, "::::::::::::::::::::::::::::::::::::::::::SISTEMA DE AGENDA::::::::::::::::::::::::::::::::::::::::::::\n"
                    + "::  1 - CADASTRAR CONTATO\n"
                    + "::  2 - MOSTRAR TODOS OS CONTATOS\n"
                    + "::  3 - MOSTRAR QUANTIDADE DE CONTATOS\n"
                    + "::  4 - PESQUISAR ANIVERSARIANTES DO MÊS\n"
                    + "::  5 - PESQUISAR CONTATO POR NOME\n"
                    + "::  6 - ALTERAR TELEFONE DO CONTATO PESQUISANDO POR NOME\n"
                    + "::  7 - REMOVER CONTATO PESQUISANDO POR NOME\n"
                    + "::  8 - EXCLUIR TODOS OS CONTATOS\n"
                    + "::  0 - SAIR\n"
                    + "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                    + "DIGITE A OPÇÃO:", "AGENDA DE CONTATOS", JOptionPane.DEFAULT_OPTION));
            Object[] meses = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
            switch (op) {
                case 1:
                    Contato objContato = new Contato();
                    Contato conta;
                    JOptionPane.showMessageDialog(null, ":::::::::::::Informe os Dados do Contato:::::::::::::", "CADASTRO DE CONTATOS", JOptionPane.DEFAULT_OPTION);
                    objContato.setNome(JOptionPane.showInputDialog(null, "Nome:", "CADASTRO DE CONTATOS", JOptionPane.DEFAULT_OPTION));
                    objContato.setFone(JOptionPane.showInputDialog(null, "Telefone:", "CADASTRO DE CONTATOS", JOptionPane.DEFAULT_OPTION));
                    JOptionPane.showMessageDialog(null, ":::::::::::::Informe a Data de Nascimento:::::::::::::", "CADASTRO DE CONTATOS", JOptionPane.DEFAULT_OPTION);
                    do {
                        objContato.getDataDeNascimeto().setDia(Byte.parseByte(JOptionPane.showInputDialog(null, "Dia:", "DATA DE NASCIMENTO", JOptionPane.DEFAULT_OPTION)));
                        objContato.getDataDeNascimeto().setMes(Byte.parseByte(JOptionPane.showInputDialog(null, "Mês:", "DATA DE NASCIMENTO", JOptionPane.DEFAULT_OPTION)));
                        objContato.getDataDeNascimeto().setAno(Integer.parseInt(JOptionPane.showInputDialog(null, "Ano:", "DATA DE NASCIMENTO", JOptionPane.DEFAULT_OPTION)));
                        if (!objContato.getDataDeNascimeto().validarData()) {
                            JOptionPane.showMessageDialog(null, "Data Inválida!\nDigite Novamente...", "SISTEMA", JOptionPane.DEFAULT_OPTION);
                        }
                    } while (!objContato.getDataDeNascimeto().validarData());

                    lista.add(objContato);
                    break;
                case 2:
                    if (lista.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "::::::::::::::::::::::::NÃO EXISTEM CONTATOS CADASTRADOS::::::::::::::::::::::::", "SISTEMA", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Lista de Contatos\n" + objAgenda.mostrarContatos(), "AGENDA", JOptionPane.DEFAULT_OPTION);
                    }
                    break;
                case 3:
                    if (lista.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "::::::::::::::::::::::::NÃO EXISTEM CONTATOS CADASTRADOS::::::::::::::::::::::::", "SISTEMA", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Existem " + lista.size() + " cadastrados no sistema!", "AGENDA", JOptionPane.DEFAULT_OPTION);
                    }
                    break;
                case 4:
                    if (lista.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "::::::::::::::::::::::::NÃO EXISTEM CONTATOS CADASTRADOS::::::::::::::::::::::::", "SISTEMA", JOptionPane.ERROR_MESSAGE);
                    } else {
                        ArrayList<Contato> contatos;
                        do {
                            contatos = objAgenda.pesquisarAniversariantesMes(Byte.parseByte((String) JOptionPane.showInputDialog(null, "ESCOLHA O MÊS CONFORME ABAIXO:", "MÊS", JOptionPane.QUESTION_MESSAGE, null, meses, meses[0])));
                            if (contatos.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "NENHUM CONTATO FOI ENCONTRADO");
                            } else {
                                String resposta = "\n";
                                for (int i = 0; i < contatos.size(); i++) {
                                    resposta += contatos.get(i) + "\n";
                                }
                                JOptionPane.showMessageDialog(null, "OS ANIVERSARIANTES DO MÊS SÃO\n" + resposta);
                            }
                        } while (contatos.isEmpty());
                    }
                    break;
                case 5:
                case 6:
                case 7:
                    if (lista.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "::::::::::::::::::::::::NÃO EXISTEM CONTATOS CADASTRADOS::::::::::::::::::::::::", "SISTEMA", JOptionPane.ERROR_MESSAGE);
                    } else {
                        do {
                            conta = objAgenda.pesquisarContatoNome((String) JOptionPane.showInputDialog("Digite o nome que deseja pesquisar: "));
                            if (conta == null) {
                                JOptionPane.showMessageDialog(null, "::::::::::::::::::::::::CONTATO NÃO CADASTRADO::::::::::::::::::::::::", "SISTEMA", JOptionPane.ERROR_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "O contato é: " + conta, "AGENDA", JOptionPane.DEFAULT_OPTION);
                                if (op == 6) {
                                    conta.setFone(JOptionPane.showInputDialog(null, "Digite o novo telefone: ", "AGENDA", JOptionPane.DEFAULT_OPTION));
                                } else if (op == 7) {
                                    op = (byte) JOptionPane.showConfirmDialog(null, "Deseja realmente excluir este contato?");
                                    switch (op) {
                                        case 0:
                                            op = 1;
                                            JOptionPane.showMessageDialog(null, "::::::::::::::::::::::::CONTATO EXCLUÍDO COM SUCESSO::::::::::::::::::::::::", "SISTEMA", JOptionPane.DEFAULT_OPTION);
                                            lista.remove(conta);
                                            break;
                                        case 1:
                                        case 2:
                                            JOptionPane.showMessageDialog(null, "::::::::::::::::::::::::EXCLUSÃO CANCELADA::::::::::::::::::::::::", "SISTEMA", JOptionPane.DEFAULT_OPTION);
                                    }
                                }
                            }
                        } while (conta == null);

                    }
                    break;

                case 8:
                    if (lista.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "::::::::::::::::::::::::NÃO EXISTEM CONTATOS CADASTRADOS::::::::::::::::::::::::", "SISTEMA", JOptionPane.ERROR_MESSAGE);
                    } else {
                        op = (byte) JOptionPane.showConfirmDialog(null, "Deseja realmente excluir todos os contatos?");
                        switch (op) {
                            case 0:
                                op = 1;
                                JOptionPane.showMessageDialog(null, "::::::::::::::::::::::::CONTATOS EXCLUÍDOS COM SUCESSO::::::::::::::::::::::::", "SISTEMA", JOptionPane.DEFAULT_OPTION);
                                lista.clear();
                                break;
                            case 1:
                            case 2:
                                JOptionPane.showMessageDialog(null, "::::::::::::::::::::::::EXCLUSÃO CANCELADA::::::::::::::::::::::::", "SISTEMA", JOptionPane.DEFAULT_OPTION);
                        }
                    }
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Sistema encerrado!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA...\nTENTE NOVAMENTE!", "SISTEMA", JOptionPane.ERROR_MESSAGE);
            }
        } while (op != 0);
    }
}
