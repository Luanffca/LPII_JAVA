package factory_method.factory;

public class Produto {
    private String id;
    private String nome;
    private String type;

    public Produto(String id, String nome, String type){
        this.id = id;
        this.nome = nome;
        this.type = type;
    }
    public static Produto of(String id, String nome, String type) {
        return new Produto(id, nome, type);
    }
    public void update(String id, String nome, String type) {
        this.id = id;
        this.nome = nome;
        this.type = type;
    }
    public String id() {
        return id;
    }
    public String nome() {
        return nome;
    }
    public String type() {
        return type;
    }
}
