package method_factory;

public class BicicletaFactory extends VeiculosFactorys{
    @Override
    Veiculos getVeiculos(String VeiculosName) {
        return new Bicicleta(VeiculosName);
    }
    
}
