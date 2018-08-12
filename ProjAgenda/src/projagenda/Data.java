
package projagenda;

public class Data {
    private byte dia;
    private byte mes;
    private int ano;

    public byte getDia() {
        return dia;
    }

    public void setDia(byte dia) {
        this.dia = dia;
    }

    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean validarData(){
        return dia>0 && dia<32 && mes>0 && mes<13 && ano>0 &&((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) || ((mes==4 ||mes==6 ||mes==9 ||mes==11) && dia<=30) || (mes==2 && (dia<=29 && ano%4==0 &&(ano%100!=0 ||ano%400==0)) || dia<=28));
    }
    
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
