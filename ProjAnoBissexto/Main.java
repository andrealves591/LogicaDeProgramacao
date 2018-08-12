import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        
        byte dia;
        byte mes;
        int ano;
        String data;
        
        System.out.println(":::Informe a Data:::");
        System.out.print("Dia: ");
        dia = leia.nextByte();
        System.out.print("Mês: ");
        mes = leia.nextByte();
        System.out.print("Ano: ");
        ano = leia.nextInt();
        
        if(dia>0 && dia<32 && mes>0 && mes<13 && ano>0 &&((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) || ((mes==4 ||mes==6 ||mes==9 ||mes==11) && dia<=30) || (mes==2 && (dia<=29 && ano%4==0 &&(ano%100!=0 ||ano%400==0)) || dia<=28))){
            System.out.print("Data Vàlida: "+dia+"/"+mes+"/"+ano);
        }else{
            System.out.print("Data Inválida!");
        }
        
    }
}