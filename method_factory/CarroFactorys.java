package method_factory;

public class CarroFactorys extends VeiculosFactorys {
    @Override
    Veiculos getVeiculos(String VeiculosName) {
        return new Carro(VeiculosName);
    }
}
