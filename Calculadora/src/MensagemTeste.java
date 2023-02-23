import static org.junit.Assert.*;

import org.junit.Test;

public class MensagemTeste {

	Mensagem msg = new Mensagem("Jorge");
	
	@Test
	public void testExibirMsgWelcome() {
		String msgWelcome = msg.exibirMsgWelcome();
		assertEquals(msgWelcome , msg.exibirMsgWelcome());
	}
	
	@Test
	public void testgetComplementNomeUsuario () {
		String msgComplementNomeUsuario = msg.getComplementNomeUsuario(msg.NomeUsuario);
		assertEquals(msgComplementNomeUsuario, msg.getComplementNomeUsuario(msg.NomeUsuario));
	}
}