package POO;

/*
 * Herança: Características e comportamentos comuns, podem ser elevados e compartilhados através de uma hierarquia de objetos.
 * 
 * Exemplo: Um MSN Messenger, um Facebook Messenger e um Telegram possuem propriedades como verificar se está conectado a internet, enviar mensagem e salvar histórico.
 * Logo, para não ser um processo de codificação redundante, podemos desfrutar da herança criando uma classe ServicoMensagemInstantanea
 * para que seja herdada por MSNMessenger, FacebookMessenger e Telegram.
 * 
 */

public class MSNMessenger extends ServicoMensagemInstantanea {
	
	// Metodo Encapsulado:
		public void enviarMensagem() {
			//primeiro confirmar se esta conectado a internet
			validarConectadoInternet();
			System.out.println("Enviando mensagem pelo MSN Messenger");
			//depois de enviada, salva o histórico da mensagem
			salvarHistoricoMensagem();
		}
		public void receberMensagem() {
			System.out.println("Recebendo mensagem pelo MSN Messenger");
		}
		
}
