// gerente eh uma  funcionario, gerente herda da class funcionario, assionacontrato autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	} 
	
	
	public double getBonificacao() {
		return super.getSalario()+ 300;
	}

	@Override
	public void setSenha(int senha) {
	   this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		boolean autenticou = this.autenticador.autentica(senha);
		return autenticou;
	}
	
	
	
}
