package Classes;

public class Estado {
	private String Nome;
	private int Numero;
	private boolean Acessado;
	private boolean Final;
	private boolean Inicial;
	private boolean Ativo;
	private Estado NovoEstado;
	
	public boolean isAtivo() {
		return Ativo;
	}

	public void setAtivo(boolean ativo) {
		Ativo = ativo;
	}

	public Estado getNovoEstado() {
		return NovoEstado;
	}

	public void setNovoEstado(Estado novoEstado) {
		NovoEstado = novoEstado;
	}

	public boolean isInicial() {
		return Inicial;
	}

	public void setInicial(boolean inicial) {
		Inicial = inicial;
	}

	public boolean isFinal() {
		return Final;
	}

	public void setFinal(boolean final1) {
		Final = final1;
	}

	public int getNumero() {
		return Numero;
	}

	public boolean isAcessado() {
		return Acessado;
	}

	public void setAcessado(boolean acessado) {
		Acessado = acessado;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public Estado(String Nome, int Numero, boolean Final, boolean Ativo) {
		this.Nome = Nome;
		this.Numero = Numero;
		this.Final = Final;
		this.Ativo = Ativo;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
}
