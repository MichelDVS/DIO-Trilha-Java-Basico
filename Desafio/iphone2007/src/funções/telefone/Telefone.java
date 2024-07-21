package funções.telefone;

public class Telefone implements Comunicador {
	
	public void fazerligação() {
		System.out.println("Recebendo ligação");
	}
	
	public void receberligação() {
		System.out.println("Recebendo ligação");
	}
	
	public void acessarListaContatos() {
		System.out.println("Acessando lista de contatos");
	}
	
	public void adicionarContatos() {
		System.out.println("Adicionado contatos");
	}
	
	public void alterarContatos() {
		System.out.println("Alterando contatos");
	}
	
	public void excluirContatos() {
		System.out.println("Excluindo contatos");
	}
		
	public void acessarMensagemCorreioVoz() {
		System.out.println("Acessando o correio de voz");
	}
	
	public void ouvirMensagemCorreioVoz() {
		System.out.println("Ouvindo a mensagem do correio de voz");
	}
	
	public void excluirMensagemCorreioVoz(){
		System.out.println("Excluindo mensagem do correio de voz");
	}
	
}
