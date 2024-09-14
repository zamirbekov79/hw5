public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setDefenseType("Magic Shield");


        System.out.println("Boss health: " + boss.getHealth());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss defense type: " + boss.getDefenseType());


        Hero[] heroes = createHeroes();
        for (Hero hero : heroes) {
            System.out.println("Hero health: " + hero.getHealth() +
                    ", damage: " + hero.getDamage() +
                    ", super power: " + hero.getSuperPower());
        }
    }


    public static Hero[] createHeroes() {

        Hero hero1 = new Hero(200, 30, "Invisibility");
        Hero hero2 = new Hero(150, 25);
        Hero hero3 = new Hero(180, 35, "Fireball");


        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}
