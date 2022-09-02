public class Prins {
    public static void main(String[] args){
        EletronicosFactorys carFactory = new EletronicosFactorys();
        Eletronicos fusca = (Eletronicos) carFactory.getProduto("Asus 5 PRO", "1 ano");
        fusca.Comprando("Joaana");
        fusca.Comprado();
    }
}
