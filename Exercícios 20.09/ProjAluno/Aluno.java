public class Aluno{
    private String nome;
    private double media;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setMedia(double media){
        this.media = media;
    }
    
    public String getNome(){
        return this.nome;
    }
    public double getMedia(){
        return this.media;
    }
    
    public String verificarConceito(){
        if(this.media>=9){
            return "A";
        }else if(this.media>=8){
            return "B";
        }else if(this.media>=6){
            return "C";
        }else{
            return "D";
        }
    }
}