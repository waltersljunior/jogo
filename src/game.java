import java.util.Random;

public class Game {

	public static void main(String[] args) {

		Humano combatente1 = new Humano(40, "Augusto");
		Dragao combatente2 = new Dragao(50, "Philipe");

		// imprime a batalha na tela
		do {
			System.out.println(combatente1.getNome() + ", Vida atual: " + combatente1.getVida());

			System.out.println(combatente2.getNome() + ", Vida atual: " + combatente2.getVida());
			System.out.println("-----------------------");

			combatente2.receberAtaque(ataque());
			combatente1.receberAtaque(ataque());
		} while (combatente2.getVida() > 0 && combatente1.getVida() > 0);

		// mostra qeum ganhou
		if (combatente1.getVida() > 0) {
			System.out.println("Combatente " + combatente1.getNome() + " ganhou! ");
		} else {
			System.out.println("Combatente " + combatente2.getNome() + " ganhou! ");
		}

	}

	// gera o ataque
	public static int ataque() {
		Random rand = new Random();
		int dano = rand.nextInt(10);
		return dano;
	}

}
