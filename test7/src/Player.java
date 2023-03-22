import weapon.*;

public class Player {
    private weapon.Weapon[] weaponSlots;

    public Player(){
        weaponSlots = new weapon.Weapon[]{ // Снаряжаем нашего игрока
                new weapon.Automachine(), new weapon.Pistol(), new weapon.RPG(), new weapon.Slingshot(), new weapon.WaterPistol()
        };
    }

    public int getSlotsCount(){
        return weaponSlots.length; // length позволяет узнать, сколько слотов с оружием у игрока
    }

    public void shotWithWeapon(int slot){
        if (slot >= this.getSlotsCount() || slot < 0) {
            System.out.println("Выберите оружие " + (this.getSlotsCount() - 1));
        } else {
            weapon.Weapon weapon = weaponSlots[slot]; // получаем оружие из выбранного слота
            weapon.shot(); // Огонь
        }
    }
}

