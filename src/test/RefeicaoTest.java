package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import servicos.Refeicao;;

public class RefeicaoTest {

	private Refeicao refeicao1;
	private Refeicao refeicao2;

	@Before
	public void setUp() throws Exception {
		refeicao1 = new Refeicao(52.89f,
				"Pra nao morrer de fome");
		refeicao2 = new Refeicao(199.89f,
				"sss Pra ostentar");

	}

	@Test
	public void testConstrutor() throws Exception {
		try {
			Refeicao refeicao1 = new Refeicao(52.89f, null);
		} catch (NullPointerException e) {
		}

	}

	@Test
	public void testEquals() {
		Assert.assertFalse(refeicao1.equals(refeicao2) == true);
		refeicao2.alteraDescricao(refeicao1.getDescricao());
		refeicao2.alteraPreco(refeicao1.getPreco());
		Assert.assertEquals(refeicao1, refeicao2);

	}

	@Test
	public void testToString() {
		Assert.assertEquals(refeicao1.toString(),
				"Refeicao [Descricao=Pra nao morrer de fome, Preco=52.89]");
		Assert.assertEquals(
				refeicao2.toString(),
				"Refeicao [Descricao=sss Pra ostentar, Preco=199.89]");
		refeicao2.alteraDescricao(refeicao1.getDescricao());
		refeicao2.alteraPreco(refeicao1.getPreco());
		Assert.assertEquals(refeicao1.toString(), refeicao2.toString());
	}
}