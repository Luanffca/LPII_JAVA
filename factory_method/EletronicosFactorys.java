

public class EletronicosFactorys extends ProdutosFactorys {
    @Override
    Produtos getProduto(String ProdutoName, String garantia) {
        return new Eletronicos(ProdutoName, garantia);
    }
}
