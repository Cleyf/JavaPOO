package aula011;

public class Aula11 {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		a1.setNome("Lailo");
		a1.setIdade(14);
		a1.setCurso("Mecatr�nica");
		a1.setMatricula(1111);
		a1.setSexo("M");
		a1.pagarMensalidade();
		Bolsista b1 = new Bolsista();
		b1.setNome("Noemio");
		b1.setIdade(14);
		b1.setCurso("Mecatr�nica");
		b1.setBolsa(20f);
		b1.setSexo("M");
		b1.pagarMensalidade();
		Tecnico t = new Tecnico();
		t.setNome("Bruna");
		t.setIdade(14);
		t.setMatricula(1234);
		t.setCurso("Mecatr�nica");
		t.setSexo("F");
		t.setRegistrop(true);
		t.pagarMensalidade();
		t.info();
		
		Professor pf = new Professor();
		pf.setNome("Gabriel");
		pf.setIdade(29);
		pf.setSexo("M");
		pf.setEspecialidade("Hist�ria");
		pf.setSalario(4000f);
		pf.infoAdulto();
		pf.receberAumento(5000f);
		pf.infoAdulto();
		
	}
}
