import java.util.Random;

public class game {

	public static void main(String[] args) {
		
		Humano combatente1 = new Humano(40, "Jose");
		Dragao combatente2 = new Dragao(50, "Philipe");
		
	}
	
	public static int atacar() {
		Random rand = new Random(); int dano = rand.nextInt(10);
		return dano;
	}
}
