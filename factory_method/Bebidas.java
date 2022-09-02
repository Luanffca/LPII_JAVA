public class Bebidas implements Tipo {

    private String nome;
    private String data_validade;

    public Bebidas(String nome, String data_validade){
        this.nome = nome;
        this.data_validade = data_validade;
    }

    public void update(String nome) {
        this.nome = nome;
        this.data_validade = data_validade;
    } 

    public String nome() {
        return nome;
    }

    public String data(){
        return this.data_validade;
    }

    @Override
    public Type type() {
        // TODO Auto-generated method stub
        return Type.BEBIDAS;
    }

    @Override
    public void Comprar(String nome) {
        // TODO Auto-generated method stub
        System.out.println( nome  + " esta comprando " + nome());
    }
}
