package aula09;

public class Leitor {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Lailo da Silva", 50, "Masculino");
		Livro l = new Livro();
		l.setAutor(p1);
		l.setTitulo("Os Cabras Safados");
		l.setTotPaginas(540);
		l.abrir();
		l.folhear();
		
		l.detalhes(p1);
		
		Pessoa p2 = new Pessoa("Gabriele Maria", 21, "Feminino");
		l.setLeitor(p2);
		l.abrir();
		l.avancarPag();
		l.detalhes(p2);
		

	}

}
