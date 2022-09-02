package method_factory;

public class Carro implements Veiculos{
    private String nome;

    Carro(String nome){
        this.nome = nome;
    }

    public static Carro of(String nome) {
        return new Carro(nome);
    }
    public void update(String nome) {
        this.nome = nome;
        // this.nome = marca;
        // this.ano = ano;
    }
    public String nome() {
        return nome;
    }
    // public String marca() {
    //     return marca;
    // }
    // public String ano() {
    //     return ano;
    // }
    @Override
    public void pickUp(String customerName) {
        System.out.println( nome() + " esta buscando " + customerName);
    }

    @Override
    public void stop() {
        // TODO 
        System.out.println( nome() + " parou ");
        
    }
    public Carro getVeiculos(String string) {
        return null;
    }
    
}
