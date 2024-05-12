package HerancaEncapsulamento;
//ENCAPSULAMENTO, classes que não precisam ser acessadas por fora, esconder os métodos

public class ComputadorPedrinho {
    public static void main(String[] args) {
		//abrindo MSN Messenger
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
        //abrindo facebook
		FacebookMessenger fbm = new FacebookMessenger();
		fbm.enviarMensagem();
		fbm.receberMensagem();
		
        //abrindo telegram
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}
}
