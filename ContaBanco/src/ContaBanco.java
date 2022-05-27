

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	
	// metodos especiais
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
		
	}
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	// metodos personalizados
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
		}else if (t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!");
	}
	
	public void fecharConta(float saldo) {
		if (this.getSaldo() > 0) {
			System.out.println("Conta n�o pode ser fechada, porque possui dinheiro!");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta n�o pode ser fechada, porque possui d�bitos!");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}
	
	public void depositar( float v) {
		if (this.getStatus() ) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito realizado com sucesso na conta de: " + this.getDono());
		} else {
			System.out.println("Impossivel depositar, conta fechada! ");
		}
	}
	
	public void sacar(float v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado com sucesso na conta de: " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente para saque");
			}
		}  else {
			System.out.println("Imposs�vel sacar de uma conta fechada!");
		}
	}
	
	public void pagarMensalidade() {
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		}else if (this.getTipo() == "CP") {
			v = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por" + this.getDono());
		} else {
			System.out.println("Impossivel pagar uma conta fechada");
		}
	}
	
	public void info() {
		System.out.println("N�mero da Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Titular: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	
	
	
	
	
}
