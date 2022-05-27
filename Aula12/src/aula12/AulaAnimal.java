package aula12;

public class AulaAnimal {

	public static void main(String[] args) {
		//Animal n = new Animal(); não pode ser criado classe abstrata
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Tartaruga t = new Tartaruga();
		Cobra j = new Cobra();
		Goldfish g = new Goldfish();
		Arara e = new Arara();
		
		
		c.locomover();
		c.usarBolsa();
		k.emitirSom();
	}

}
