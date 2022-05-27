package aula011;

public class Professor extends Pessoa{
	private String especialidade;
	private float salario;
	
	public void receberAumento(float a) {
		this.setSalario(this.getSalario() + a);
	}
	
	public void infoAdulto() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("Especialidade: " + this.getEspecialidade());
		System.out.println("Salario: " + this.getSalario());
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
