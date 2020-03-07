
public class Combatente {
		int vida;
		String nome;
		
		public Combatente(int vida, String nome) {
			this.vida = vida;
			this.nome = nome;
			
		}
				
		public boolean estaVivo() {
			
			return this.vida > 0;
		}

		public void receberAtaque(int dano) {
			
			this.vida -= dano;
		}
	}
