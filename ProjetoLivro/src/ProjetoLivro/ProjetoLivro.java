package ProjetoLivro;

public class ProjetoLivro {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Bruno", 23, "Masculino");
		p[1] = new Pessoa("Maria", 19, "Feminino");
		
		l[0] = new Livro("Harry Potter", "Rowling", 200, p[0]);
		l[1] = new Livro("Structure", "Arpopire", 6000, p[0]);
		l[2] = new Livro("Hobbit", "Tolkien", 300, p[1]);
		
		l[0].abrir();
		l[0].folhear(11);
		System.out.println(l[0].detalhes());
		System.out.println(l[2].detalhes());
	}

}
