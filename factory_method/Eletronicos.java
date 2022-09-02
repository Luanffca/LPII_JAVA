
public class Eletronicos implements Produtos{
    private String nome;
    private String data_garantia;

    Eletronicos(String nome, String data_garantia){
        this.nome = nome;
        this.data_garantia = data_garantia;
    }

    public static Eletronicos of(String nome, String data_garantia) {
        return new Eletronicos(nome, data_garantia);
        
    }
    public void update(String nome, String data_garantia) {
        this.nome = nome;
        this.data_garantia = data_garantia;
        
    }

    public String nome() {
        return nome;
    }

    public String data(){
        return data_garantia;
    }

    @Override
    public void Comprando(String customerName) {
        System.out.println( customerName + "esta comprando " + nome() + " com garantia " + data());
        
    }
    @Override
    public void Comprado() {
        // TODO 
        System.out.println( nome() + " comprado ");
        
    }
    
}
