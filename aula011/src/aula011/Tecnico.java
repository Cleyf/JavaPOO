package aula011;

public class Tecnico extends Aluno{
	private boolean registrop;
	
	public void praticar(){
		if (this.registrop == true) {
			System.out.println("Aprendendo uma nova profissão na pratica!");
		} else {
			System.out.println("Tá na hora de arrumar um registro");
		}
	}
	
	@Override
	public void pagarMensalidade() {
		if (this.registrop == true) {
			System.out.println("O aluno " + this.getNome() + " tem a mensalidade paga graças ao seu registro profissional");
		} else {
			System.out.println("Tem que arrumar um registro, por hora valor a ser cobrado normalmente");
		}
	}
	
	public void info() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("idade: " + this.getIdade());
		System.out.println("Curso: " + this.getCurso());
		System.out.println("Matricula: " + this.getMatricula());
		System.out.println("Registro Profissional: " + this.getRegistrop());
		
	}

	public boolean getRegistrop() {
		return registrop;
	}

	public void setRegistrop(boolean registrop) {
		this.registrop = registrop;
	}
	
	
}
