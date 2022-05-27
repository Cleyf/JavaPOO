package aula13;

public class Cachorro extends Lobo{
	
	@Override
	public void emitirSom() {
		System.out.println("Au AU AU AU AU!");
		
	}
	
	public static void reagir(String frase) {
		if (frase == "Toma comida" || frase == "Ola") {
			System.out.println("Abanar e Latir");
		} else {
			System.out.println("Rosnar");
		}
	}
	
	public static void reagir(int hora, int minuto) {
		if( hora < 12) {
			System.out.println("Abanar o rabo");
		} else if ( hora >= 18) {
			System.out.println("Ignorar");
		} else {
			System.out.println("Rosnar e Latir");
		}
	}
	
    public static void reagir(boolean dono) {
		if(dono) {
			System.out.println("Abanar");
		} else {
			System.out.println("Rosnar e Latir");
		}
	}
    
    public static void reagir(int idade, float peso) {
		if (idade < 5) {
			if (peso < 10) {
				System.out.println();
			} else {
				System.out.println();
			}
		}else {
			System.out.println();
		}
    }
}
