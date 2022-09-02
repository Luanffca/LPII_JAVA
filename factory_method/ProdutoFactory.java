public interface ProdutoFactory {
    abstract Produto getProduto(String ProdutoName);

    static Produto Comprar(String customerName, String ProdutoName){
        Produto car = this.getProduto(ProdutoName);
        
        return car;
    }

}
