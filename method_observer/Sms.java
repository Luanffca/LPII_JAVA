public class Sms implements Notification{

    public void EnviarMensagens(Usuario user){
        System.out.println("SMS Enviado com Sucesso para " + user.nome() + " e de numero " + user.telefone());
    }
    
}