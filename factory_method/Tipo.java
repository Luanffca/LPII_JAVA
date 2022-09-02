public interface Tipo {
    Type type();
    enum Type {
        BEBIDAS,
        ELETRONICOS
    }

    public void Comprar(String nome);

}
