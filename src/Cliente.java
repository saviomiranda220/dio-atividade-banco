
public class Cliente {

	private String nome;
	private Banco banco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public String toString() {  //configurado toString pra mostrar lista com nomes de banco e cliente
			return "Cliente {" +
					"banco=" + banco.getNome() + ", nome='" + this.getNome() +
					'}';

	}
}
