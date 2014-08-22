package CodigoStrategy;

public class Empresa {
private String codigoEmpresa, nomeEmpresa;
	
	public Empresa(String nome){
		this.codigoEmpresa = "213124";
		this.nomeEmpresa = nome;
	}
	
	public String getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public Funcionario cadastrarFuncionario(FuncionarioStrategy funcionario, String info1, String info2, String info3){
		return funcionario.cadastrar(info1, info2, info3);
	}

}
