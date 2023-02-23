public class Mensagem {
	
	protected String NomeUsuario;
	
	public Mensagem (String NomeUsuario) {
		this.NomeUsuario = NomeUsuario;
	}
	
	public String exibirMsgWelcome() {
		String msgWelcome = "Seja bem vindo à sua calculadora digital"; 
		System.out.println(msgWelcome);
		return msgWelcome;
	}
	
	public String getComplementNomeUsuario(String nome) {
		String msgGetComplement = nome + "! \n Confira o resultado dos testes na JUNIT!"; 
		System.out.println(msgGetComplement);
		return msgGetComplement;
	}
}
