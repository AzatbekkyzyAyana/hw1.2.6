public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(70);
        boss.setHealth(56);
        boss.setType("Kinetic");
        boss.weapon.setTypeWeapon(WeaponType.HOT);
        boss.weapon.setNameWeapon("Adil");
        System.out.println(boss.getInfo());

    }
}