package method_factory;

public class Prins {
    public static void main(String[] args){
        CarroFactorys carFactory = new CarroFactorys();
        Carro fusca = (Carro) carFactory.getVeiculos("Fusca");
        fusca.pickUp("Joaana");
        fusca.stop();
    }
}
