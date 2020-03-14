import java.util.Random;

public class Game {

	public static void main(String[] args) {
		batalha();
		
	}
	
	public static void batalha() {
		int x=1;
		
		Humano combatente1 = new Humano(60, "Augusto");
		Dragao combatente2 = new Dragao(60, "Philipe");
		int jogador = personagem();
		
		// imprime a batalha na tela
		do {
			System.out.println(combatente1.getNome() + ", Vida atual: " + combatente1.getVida());
			System.out.println(combatente2.getNome() + ", Vida atual: " + combatente2.getVida());
			System.out.println("-----------------------");

			if (jogador == 1) {
				if (combatente1.estaVivo()) {
					combatente2.receberAtaque(ataque());
				}
				if (combatente2.estaVivo()) {
					combatente1.receberAtaque(ataque());
				}
			} else if (jogador == 2) {
				if (combatente2.estaVivo()) {
					combatente1.receberAtaque(ataque());
				}
				if (combatente1.estaVivo()) {
					combatente2.receberAtaque(ataque());
				}
			}

		} while (combatente2.estaVivo() && combatente1.estaVivo());

		System.out.println(jogador);

		// mostra quem ganhou
		if (combatente1.estaVivo()) {
			System.out.println(combatente1.getNome() + " ganhou com: " + combatente1.getVida() + " de vida!");
			System.out.println(combatente2.getNome() + " perdeu com: " + combatente2.getVida() + " de vida!");
		} else {
			System.out.println(combatente2.getNome() + " ganhou com: " + combatente2.getVida() + " de vida!");
			System.out.println(combatente1.getNome() + " perdeu com: " + combatente1.getVida() + " de vida!");
		}
	}
	
	

	// gera o ataque
	public static int ataque() {
		Random rand = new Random();
		int dano = rand.nextInt(11);
		return dano;
	}

	// Soerteia personagem que vai começar
	public static int personagem() {
		Random rand = new Random();
		int persona = rand.nextInt(2) + 1;
		return persona;
	}

}
