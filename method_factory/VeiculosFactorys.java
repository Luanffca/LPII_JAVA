package method_factory;

public abstract class VeiculosFactorys {

    // Factory Method
    abstract Veiculos getVeiculos(String VeiculosName);

    Veiculos pickUp(String customerName, String VeiculosName){
        Veiculos car = this.getVeiculos(VeiculosName);
        car.pickUp(customerName);
        return car;
    }
    
}
