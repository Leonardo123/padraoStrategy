package CodigoStrategy;

public class FuncionarioCaixa implements FuncionarioStrategy {
		
	private Funcionario funcionario;
	
	public Funcionario cadastrar(String tipo, String cpf, String nDoCaixa) {
		this.funcionario = new Funcionario();

		this.funcionario.setCpf(cpf);
		this.funcionario.setProfissao("Caixa");
		this.funcionario.setNºDoCaixa(nDoCaixa);
		this.funcionario.setTipoDeCaixa(tipo);

		return funcionario;
	}

}
