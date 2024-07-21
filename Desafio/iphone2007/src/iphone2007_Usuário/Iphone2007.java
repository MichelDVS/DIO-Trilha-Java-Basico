package iphone2007_Usuário;

import funções.internet.Internet;
import funções.multimidia.Ipod;
import funções.telefone.Comunicador;


public class Iphone2007 implements Internet, Comunicador, Ipod{
	
	public void escolherNavegador() {
		System.out.println("Escolhendo o navegador para explorar a internet");
	}
	public void exibirPagina() {
		System.out.println("Exibindo Página no navegador da internet");
	}
	public void atualizarPagina() {
		System.out.println("Atualizando página no navegador da internet");
	}
	public void abrirNovaAba() {
		System.out.println("Abrindo nova aba no navegador da internet");
	}
	public void acessarEmail() {
		System.out.println("Acessando o E-mail");
	}
	public void abrirGoogleMaps() {
		System.out.println("Acesssando o Google Maps");		
	}
	public void consultarWidget() {
		System.out.println("Consultando o Widget");		
	}
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
	public void executarMidia() {
		System.out.println("Executando Midia");
	}	
	public void pausarMidia() {
		System.out.println("Pausando Midia");
	}	
	public void adicionarMidia() {
		System.out.println("Adicionando Midia");
	}	
	public void excluirMidia() {
		System.out.println("Excluindo Midia");	
	}	

}
