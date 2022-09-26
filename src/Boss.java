public class Boss extends GameEntity{

    Weapon weapon = new Weapon();

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public String getInfo() {
        return "Название Оружия: " + weapon.getNameWeapon() + "\nТип Оружия: " + weapon.getTypeWeapon() + "\nЗдоровье босса: " +
                getHealth() + "\nУрон босса: " + getDamage() + "\nТип босса: " + getType();

    }

}
