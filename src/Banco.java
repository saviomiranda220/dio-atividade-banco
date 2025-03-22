import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;
	public Banco() {
		this.contas = new ArrayList<>();
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;

	}
	public void setContas() {
		this.contas = new ArrayList<Conta>();

	}
	public void mostrarContas() {

		for (Conta conta : contas) {
			System.out.println("Cliente: " + conta.getCliente().getNome());
		}

	}
	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}

}
