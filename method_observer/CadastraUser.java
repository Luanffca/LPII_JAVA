import java.util.ArrayList;

public class CadastraUser{
    ArrayList<Notification> notifica = new ArrayList<Notification>(){{
        add( new Email());
        add( new Sms());
        add( new WhatsApp());
    }};

    public void cadastrar(Usuario user) {
        System.out.println("Usuario cadastrado com sucesso!\n");
            for(Notification mensagem: notifica){
                mensagem.EnviarMensagens(user);
            }
    }
    
    // public void cadastrar(EnviarWhatsapp enviarWhatsapp, Usuario user){
    //     System.out.println("Usuário salvo com sucesso");
    //     enviarWhatsapp.EnviarMensagens( user);
    // }
}
