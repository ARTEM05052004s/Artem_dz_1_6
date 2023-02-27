public class Main {
    public static void main(String[] args) {
 Boss boss=new Boss();
 boss.setHP(600);
 boss.setDamage(100);
 boss.weapon.setWeaponType(WeaponType.GUNSHOOT);
 boss.weapon.setWeaponName("M416");
        System.out.println(" HP:"+boss.getHP() + " Damage: "+boss.getDamage()+" WeaponType: " +  boss.weapon.getWeaponType() +" Weapon Name:" +boss.weapon.getWeaponName() );
    }
}