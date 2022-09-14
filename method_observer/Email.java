public class Email implements Notification{
    
    @Override
    public void EnviarMensagens(Usuario user){
        System.out.println("Email Enviado com Sucesso para " + user.nome() + " e de numero " + user.email());
    }
    
}