package projetoStraus;

public abstract class Usuario {
	private int codIdentificacao;
	private String nome;
	private int cpf;
	private String endereco;
	private String senha;
	
	public boolean efetuarLogin() {return true;}
	
	public void recuperarSenha() {}
	
	public int getCodIdentificacao() {
		return codIdentificacao;
	}
	public void setCodIdentificacao(int codIdentificacao) {
		this.codIdentificacao = codIdentificacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
		
}
