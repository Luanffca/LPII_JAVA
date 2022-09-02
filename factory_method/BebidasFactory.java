

public class BebidasFactory extends ProdutosFactorys{
    @Override
    Produtos getProduto(String ProdutoName, String validade ) {
        return new Bebidas(ProdutoName, validade);
    }
    
}
