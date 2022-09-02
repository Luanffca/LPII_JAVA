public class Produto {

    private String nome;
    private double preco;
    private Tipo resposta;

    public Produto(String nome, double preco, Tipo resposta){
        this.nome = nome;
        this.preco = preco;
        this.resposta = resposta;
    }

    public String nome(){
        return this.nome;
    }

    public double preco(){
        return this.preco;
    }

    public Tipo Resposta(){
        return this.resposta;
    }
}
