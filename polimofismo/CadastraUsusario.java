public class CadastraUsusario{
    private String nome;

    public CadastraUsusario(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void teste(Exerculta e){
        e.EnviaMensagens();
    }
}