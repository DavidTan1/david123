package binarySearch;

public abstract class Attack implements Battle{

	public Attack() {
		// TODO Auto-generated constructor stub
	}

	
	 public void attack(Pokemon target, Attack attack){
		 if(Math.random() < .9){
		 attack.attack(target);
		 System.out.println("The attack hit");
		 }else{
		 System.out.println("The attack missed");
		 }
		 }
	 
	
	 
	 public static void main(String[] args) {
		 Pokemon squirtle = new Pokemon("Squirtle",26);
		 Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		 squirtle.iChooseYou();
		 bulbasaur.iChooseYou();
		 System.out.println("Squirtle is preparing to attack with water blast");
		 squirtle.attack(bulbasaur, new Attack() {
		 
		 public void attack(Pokemon target) {
		 int hp = target.getHP();
		 target.setHP(hp/2);
		 }
		 });
		 System.out.println("Bulbasaur is preparing to attack with poison.");
		 bulbasaur.attack(squirtle, new Attack() {
		 
		 public void attack(Pokemon target) {
		 target.setPoisoned(true);
		 }
		 });
		 squirtle.lapse();
		 bulbasaur.lapse();
		 printScore(squirtle, bulbasaur);
		 }
	 
	 
	 public void happen()
	 {
		 squirtle.setHP(100);
		 
	 }
}
