
public class Prin {

    public static void main(String[] args) {
        Usuario user = new Usuario("Luan","França", "francaluan@gmail.com", "84 9 8588-7262");

        new CadastraUser().cadastrar(user);
    } 
}
