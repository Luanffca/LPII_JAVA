public class Usuario {

    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;
    

    Usuario(String nome, String sobrenome, String email, String telefone){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.email = email;
    }

    public String nome(){
        return nome;
    }

    public String sobrenome(){
        return sobrenome;
    }
    public String email(){
        return email;
    }

    public String telefone(){
        return telefone;
    }

    public void EnviarMensagens() {
    }
    

}
