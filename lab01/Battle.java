public class Battle {
	public static void main(String[] args) {
		float kroggAttack = 38.5f;
		float kroggDefense = 20.0f;
		float kroggHP = 200f;

		float bossAttack = 25f;
		float bossDefense = 12.5f;
		float bossHP = 200f;

		int round = 1;
		
		while ((kroggHP > 0) && (bossHP > 0)) {
			System.out.println("\nRound " + round);
			
			float kroggDamage = kroggAttack - bossDefense;
			bossHP -= kroggDamage;
			System.out.printf("Krogg does %f points of damage to Boss\n", kroggDamage);

			float bossDamage = bossAttack - kroggDefense;
			kroggHP -= bossDamage;
			System.out.printf("Boss does %f points of damage to Krogg\n", bossDamage);
			
			System.out.println("Boss:  " + bossHP);
			System.out.println("Krogg: " + kroggHP);

			round++;
		}
		
		if (kroggHP > 0) {
			System.out.println("\nKrogg has won.  You are victorious!");
		} else {
			System.out.println("\nBoss has won.  You have been defeated.");
		}
	}
}
