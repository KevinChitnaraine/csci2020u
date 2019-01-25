public class Battle {
	public static void main(String[] args) {
		float alexAttack = 38.5f;
		float alexDefense = 20.0f;
		float alexHP = 200f;

		float bossAttack = 25f;
		float bossDefense = 12.5f;
		float bossHP = 200f;

		int round = 1;
		
		while ((alexHP > 0) && (bossHP > 0)) {
			System.out.println("\nRound " + round);
			
			float alexDamage = alexAttack - bossDefense;
			bossHP -= alexDamage;
			System.out.printf("alex does %f points of damage to Boss\n", alexDamage);

			float bossDamage = bossAttack - alexDefense;
			alexHP -= bossDamage;
			System.out.printf("Boss does %f points of damage to alex\n", bossDamage);
			
			System.out.println("Boss:  " + bossHP);
			System.out.println("alex: " + alexHP);

			round++;
		}
		
		if (alexHP > 0) {
			System.out.println("\nalex has won.  You are victorious!");
		} else {
			System.out.println("\nBoss has won.  You have been defeated.");
		}
	}
}
