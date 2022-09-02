public class Main {
    public static void main(String[] args) {
        Produto bebida = ProdutoFactory.create("Guarana", 5.99,  "10/10/2022");

        System.out.println(bebida.nome());
        System.out.println(bebida.preco());
        System.out.println(bebida.Resposta().type());
        
        System.out.println("\n");

        Produto eletronico = ProdutoFactory.create("Xiaomi Poco F4", 2650.0,  "1 ano");

        System.out.println(eletronico.nome());
        System.out.println(eletronico.preco());
        System.out.println(eletronico.detalhes().tipo());           


    }
}
