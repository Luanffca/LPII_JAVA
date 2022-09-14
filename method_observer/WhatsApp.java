public class WhatsApp implements Notification{

    @Override
    public void EnviarMensagens(Usuario user){
        System.out.println("WhatsApp Enviado com Sucesso para " + user.nome() + " e de numero " + user.telefone());
    }

    
    
    
}
