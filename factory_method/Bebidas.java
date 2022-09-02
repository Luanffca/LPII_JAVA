

public class Bebidas implements Produtos {
    private String nome;
    private String validade;

    Bebidas(String nome, String validade ){ 
        this.nome = nome;
        this.validade = validade;
    }

    public static Bebidas of(String nome, String validade) {
        return new Bebidas(nome, validade);
    }

    public void update(String nome, String validade) {
        this.nome = nome;
        this.validade = validade;
    }

    public String nome() {
        return nome;
    }

    public String validade() {
        return validade;
    }
    
    @Override
    public void Comprando(String customerName) {
        System.out.println( customerName + " esta comprando " + nome() + " com garantia " + validade());
    }

    @Override
    public void Comprado() {
        // TODO 
        System.out.println( nome() + " comprado "); 
    }
    
}
