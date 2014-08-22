package CodigoStrategy;

public class FuncionarioGerente implements FuncionarioStrategy {

	private Funcionario funcionario;

	public Funcionario cadastrar(String rg, String cpf, String codigoDaEmpresa) {
		this.funcionario = new Funcionario();

		this.funcionario.setRg(rg);
		this.funcionario.setCpf(cpf);
		this.funcionario.setProfissao("Gerente");
		this.funcionario.setCodigoDaEmpresa(codigoDaEmpresa);

		return funcionario;
	}
}
