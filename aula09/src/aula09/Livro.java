package aula09;

public class Livro implements Publicacao{
	private String titulo;
	private Pessoa autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public void detalhes(Pessoa p) {
		if (p == this.autor) {
			System.out.println("Titulo: " + this.getTitulo());
			System.out.println("Autor: " + this.getAutor().getNome());
			System.out.println("Quantidade de páginas: " + this.getTotPaginas());
		} else if (p == leitor) {
			System.out.println("Nome do Leitor: " +  this.getLeitor().getNome());
			System.out.println("Idade: " + this.getLeitor().getIdade());
			System.out.println("Livro que está lendo: " + this.getTitulo());
			System.out.println("Autor: " + this.getAutor().getNome());
			System.out.println("Pagina atual " + this.getPagAtual());
		}
		
		
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Pessoa getAutor() {
		return autor;
	}
	public void setAutor(Pessoa autor) {
		this.autor = autor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean getAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		this.setAberto(true);
		
	}

	@Override
	public void fechar() {
		this.setAberto(false);
		
	}

	@Override
	public void folhear() {
		if(this.getAberto()) {
			for (int i = 0;i <= this.getTotPaginas(); i ++) {
				System.out.println(i);
			}
		}else {
			System.out.println("É necessário abrir o livro! ");
		}
		
	}

	@Override
	public void avancarPag() {
		if(this.getAberto()) {
			this.setPagAtual(getPagAtual() + 1);
		} else {
			System.out.println("É necessário abrir o livro! ");
		}
		
	}

	@Override
	public void voltarPag() {
		if (this.getAberto()) {
			this.setPagAtual(getPagAtual() - 1);
		} else {
			System.out.println("É necessário abrir o livro! ");
		}
		
	}
	
	
}
