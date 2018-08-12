public class Saque{
    private int valor;
    
    public void setValor(int valor){
        this.valor = valor;
    }
    public int getValor(){
        return this.valor;
    }
    
    public int calcularNotas100(){
        return this.valor/100;
    }
    public int calcularNotas50(){
        return this.valor%100/50;
    }
    public int calcularNotas5(){
        return this.valor%100%50/5;
    }
    public int calcularNotas1(){
        return this.valor%100%50%5/1;
    }
}