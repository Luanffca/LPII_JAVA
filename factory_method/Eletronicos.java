public class Eletronicos implements Tipo{
    private String nome;
    private String garantia;

    public Eletronicos(String nome, String garantia){
        this.nome = nome;
        this.garantia = garantia;
    }
    public void update(String nome) {
        this.nome = nome;
        this.garantia = garantia;
    }

    public String nome() {
        return nome;
    }

    public String data(){
        return this.garantia;
    }
    @Override
    public Type type() {
        // TODO Auto-generated method stub
        return Type.ELETRONICOS;
    }

    @Override
    public void Comprar(String nome) {
        // TODO Auto-generated method stub
        System.out.println( nome  + " esta comprando " + nome());
    } 
}
