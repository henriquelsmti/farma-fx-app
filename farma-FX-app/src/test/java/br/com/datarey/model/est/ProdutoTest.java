package br.com.datarey.model.est;

import br.com.datarey.test.BaseModelTest;
import br.com.datarey.test.JUnit4Runner;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintViolation;
import javax.validation.constraints.NotNull;
import java.util.Set;

@RunWith(JUnit4Runner.class)
public class ProdutoTest extends BaseModelTest {

	@Test
	public void testarNCM() {
		Produto produto = new Produto();
		produto.setId(1l);
		produto.setCodigo(1l);
		produto.setNome("Tijolo");

		Set<ConstraintViolation<Produto>> val = validator.validate(produto);

		assertEquals(val.size(), 1);

	}

}
