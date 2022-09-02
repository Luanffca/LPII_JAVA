public abstract class ProdutosFactorys {

    // Factory Method
    abstract Produtos getProduto(String ProdutoName, String dados);

    Produtos Comprando(String customerName, String ProdutoName, String dados){
        Produtos car = this.getProduto(ProdutoName, dados);
        car.Comprando(customerName);
        return car;
    }
    
}
