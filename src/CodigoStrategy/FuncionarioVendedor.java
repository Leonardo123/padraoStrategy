package CodigoStrategy;

public class FuncionarioVendedor implements FuncionarioStrategy {
	
	private Funcionario funcionario;
	
	public Funcionario cadastrar(String tipo, String cpf, String setor) {
		this.funcionario = new Funcionario();

		this.funcionario.setTipoDeVendedor(tipo);
		this.funcionario.setCpf(cpf);
		this.funcionario.setProfissao("Vendedor");
		this.funcionario.setSetor(setor);

		return funcionario;
	}

}
