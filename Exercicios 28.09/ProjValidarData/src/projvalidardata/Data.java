package projvalidardata;//CRIAÇÃO DO PACOTE "projvalidardata", TODAS AS CLASSES CRIADAS SERÃO ARMAZENADAS NESTE PACOTE
//LINHA EM BRANCO IGNORADA PELO PROGRAMA
public class Data {//CRIAÇÃO DA CLASSE DATA, NELA ESTÃO CONTIDOS TODOS OS MÉTODOS DO OBJETO DATA
    private byte dia;//DECLARAÇÃO DA VARIÁVEL DIA, DO TIPO BYTE PORQUE É UM INTEIRO PEQUENO, E PRIVADO PARA QUE APENAS ESTA CLASSE TENHA ACESSO DIRETO À ELA
    private byte mes;//DECLARAÇÃO DA VARIÁVEL MÊS, DO TIPO BYTE PORQUE É UM INTEIRO PEQUENO, E PRIVADO PARA QUE APENAS ESTA CLASSE TENHA ACESSO DIRETO À ELA
    private int ano;//DECLARAÇÃO DA VARIÁVEL ANO, DO TIPO INT PORQUE É UM INTEIRO, E PRIVADO PARA QUE APENAS ESTA CLASSE TENHA ACESSO DIRETO À ELA
    //LINHA EM BRANCO IGNORADA PELO PROGRAMA
    public byte getDia() {//CRIAÇÃO DO MÉTODO getDia, DO TIPO BYTE PORQUE VAI RETORNAR O DIA, SEM PARÂMETROS PORQUE APENAS RETORNO
        return dia;//RETORNO DO DIA
    }//FIM DO MÉTODO getDia
    //LINHA EM BRANCO IGNORADA PELO PROGRAMA
    public void setDia(byte dia) {//CRIAÇÃO DO MÉTODO setDia, DO TIPO VOID PORQUE NÃO RETORNA NADA, COM PARÂMETRO PORQUE RECEBE DADOS DA CLASSE Main
        this.dia = dia;//ATRIBUI O VALOR DE DIA INSERIDO NA CLASSE MAIN PARA A CLASSE DATA
    }//FIM DO MÉTODO setDia
    //LINHA EM BRANCO IGNORADA PELO PROGRAMA
    public byte getMes() {//CRIAÇÃO DO MÉTODO getMes, DO TIPO BYTE PORQUE VAI RETORNAR O MÊS, SEM PARÂMETROS PORQUE APENAS RETORNO
        return mes;//RETORNO DO MÊS
    }//FIM DO MÉTODO getMes
    //LINHA EM BRANCO IGNORADA PELO PROGRAMA
    public void setMes(byte mes) {//CRIAÇÃO DO MÉTODO setMes, DO TIPO VOID PORQUE NÃO RETORNA NADA, COM PARÂMETRO PORQUE RECEBE DADOS DA CLASSE Main
        this.mes = mes;//ATRIBUI O VALOR DE MÊS INSERIDO NA CLASSE MAIN PARA A CLASSE DATA
    }//FIM DO MÉTODO setMes
    //LINHA EM BRANCO IGNORADA PELO PROGRAMA
    public int getAno() {//CRIAÇÃO DO MÉTODO getAno, DO TIPO INT PORQUE VAI RETORNAR O ANO, SEM PARÂMETROS PORQUE APENAS RETORNO
        return ano;//RETORNO DO ANO
    }//FIM DO MÉTODO getAno
    //LINHA EM BRANCO IGNORADA PELO PROGRAMA
    public void setAno(int ano) {//CRIAÇÃO DO MÉTODO setAno, DO TIPO VOID PORQUE NÃO RETORNA NADA, COM PARÂMETRO PORQUE RECEBE DADOS DA CLASSE Main
        this.ano = ano;//ATRIBUI O VALOR DE ANO INSERIDO NA CLASSE MAIN PARA A CLASSE DATA
    }//FIM DO MÉTODO setAno
    //LINHA EM BRANCO IGNORADA PELO PROGRAMA
    public boolean validarData(){//CRIAÇÃO DO MÉTODO validarData, DO TIPO BOOLEAN PORQUE VAI RETORNAR VERDADEIRO OU FALSO
        if(this.dia>0 && this.dia<32 && this.mes>0 && this.mes<13 && this.ano>0 && ((this.mes==1 || this.mes==3 || this.mes==5 || this.mes==7 || this.mes==8 || this.mes==10 || this.mes==12) || ((this.mes==4 || this.mes==6 || this.mes==9 || this.mes==11) && this.dia<=30) || (this.mes==2 &&(this.dia<=29 && this.ano%4==0 && (this.ano%100!=0 || this.ano%400==0))|| this.dia<=28))){//ESSA LINHA VERIFICA SE A DATA É VÁLIDA
            return true;//RETORNO SE A DATA FOR VERDADEIRA
        }//FIM DA ESTRUTURA CONDICIONAL
        return false;//RETTORNO SE A DATA FOR FALSA
        //LINHA EM BRANCO IGNORADA PELO PROGRAMA
    }//FIM DO MÉTODO validarData
    //LINHA EM BRANCO IGNORADA PELO PROGRAMA
    @Override//DOCUMENTAÇÃO JAVA
    public String toString() {//CRIAÇÃO DO MÉTODO toString, QUE SERVE PARA MOSTRAR NA TELA OS ATRITBUTOS DOS OBJETOS
        if(validarData()){//SE A VALIDAÇÃO DA DATA FOR VERDADEIRA, A LINHA ABAIXO SERÁ EXECUTADA
            return this.dia+"/"+this.mes+"/"+this.ano+" DATA VÁLIDA";//RETORNO DA DATA SE FOR VÁLIDA
        }//FIM DA ESTRUTURA CONDICIONAL
        return "DATA INVÁLIDA";//RETORNO SE A DATA FOR INVÁLIDA
    }//FIM DO MÉTODO toString
    //LINHA EM BRANCO IGNORADA PELO PROGRAMA  
}//FIM DA CLASSE DATA
