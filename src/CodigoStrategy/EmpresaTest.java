package CodigoStrategy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmpresaTest {

	private Empresa empresa;

	@Before
	public void test() {
		this.empresa = new Empresa("Minha empresa");
	}

	@Test
	public void testFuncionarioGerente() {
		Funcionario funcionario = this.empresa.cadastrarFuncionario(
				new FuncionarioGerente(), "1234812", "012.000.070-95", "14q46");

		assertTrue(funcionario.getRg().equals("1234812"));
		assertTrue(funcionario.getCpf().equals("012.000.070-95"));
		assertTrue(funcionario.getProfissao().equals("Gerente"));
		assertTrue(funcionario.getCodigoDaEmpresa().equals("14q46"));
	}

	@Test
	public void testFuncionarioCaixa() {
		Funcionario funcionario = this.empresa.cadastrarFuncionario(
				new FuncionarioCaixa(), "Prioritário", "123.000.520-00", "05");

		assertTrue(funcionario.getTipoDeCaixa().equals("Prioritário"));
		assertTrue(funcionario.getCpf().equals("123.000.520-00"));
		assertTrue(funcionario.getProfissao().equals("Caixa"));
		assertTrue(funcionario.getNºDoCaixa().equals("05"));

	}

	@Test
	public void testFuncionarioVendedor() {
		Funcionario funcionario = this.empresa.cadastrarFuncionario(
				new FuncionarioVendedor(), "Corredor", "123.642.564-65",
				"Infantil");

		assertTrue(funcionario.getTipoDeVendedor().equals("Corredor"));
		assertTrue(funcionario.getCpf().equals("123.642.564-65"));
		assertTrue(funcionario.getProfissao().equals("Vendedor"));
		assertTrue(funcionario.getSetor().equals("Infantil"));

	}
}
