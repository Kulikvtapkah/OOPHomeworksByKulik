package OOPHomeworksByKulik.Homework7.Presenter;


import OOPHomeworksByKulik.Homework7.Models.Actions.BattleActions.Attack;
import OOPHomeworksByKulik.Homework7.Models.Actions.GeneralActoins.Drop;
import OOPHomeworksByKulik.Homework7.Models.Actions.GeneralActoins.Take;
import OOPHomeworksByKulik.Homework7.Models.Equipment.Weapons.MagicWeapon.Wand;
import OOPHomeworksByKulik.Homework7.Models.Equipment.Weapons.WarriorWeapons.LongRange.Bow;
import OOPHomeworksByKulik.Homework7.Models.Equipment.Weapons.WarriorWeapons.ShortRange.Sword;
import OOPHomeworksByKulik.Homework7.Models.Heroes.Fighter;
import OOPHomeworksByKulik.Homework7.Models.Heroes.Heroe;
import OOPHomeworksByKulik.Homework7.Models.Heroes.Warriors.LongRangers.Archer;
import OOPHomeworksByKulik.Homework7.Models.Heroes.Warriors.ShortRangers.Samurai;
import OOPHomeworksByKulik.Homework7.Models.Heroes.Wizards.Wizard;


//Хотела сделать все по красоте, но не успела, к сожалению, поэтому пока так(


public class Main {
    public static void main(String[] args) {
        Heroe Bri = new Archer("Bri", 200, 10, 10, 1);
        Heroe Takahiro = new Samurai("Takahiro", 230 , 15, 8, -1);
        Heroe Harry = new Wizard("Harry Potter", 120, 15, 5, 500, 1);

        Sword katana = new Sword("ColdRainBlade", 20, -1, 2);
        Bow lightBow = new Bow("Phoenix Feather", 17, 7, 200);
        Wand elderWand = new Wand("Elder Wand", 1000, -1, 2);

        new Take(Takahiro, katana).take();
        System.out.println("Катана у " + katana.getOwner().getName()); 

        new Take(Bri, lightBow).take();
        System.out.println("Лук у " + lightBow.getOwner().getName()); 

        System.out.println("Так себе атака у Такахиро( Без оружия всего " + Takahiro.mainAttackLevel());
        Takahiro.useEquipment().equipAsMainWeapon(katana);
        
        System.out.println("Такахиро экипировался, теперь его уровень атаки = " + Takahiro.mainAttackLevel());

        new Take(Bri, katana).take();
        System.out.println("Бри тоже хочет катану. Чужое брать не хорошо. Катана осталась у " + katana.getOwner().getName());
        new Take(Bri, elderWand).take();
        System.out.println("Бузинную палочку берет " + elderWand.getOwner().getName());
        
        System.out.println("Бри пытается вооружиться волшебной палочкой\n " + Bri.useEquipment().equipAsBackupWeapon(elderWand) + ": не получилось, печалька( Бри, палочки для волшебников!");

        new Drop(Bri, elderWand).drop();
        new Drop(Bri, lightBow).drop();
        System.out.println("Зачем таскать всякий мусор? Долой его! У Бри теперь " + Bri.useEquipment().getInventory().size() + " предметов.");

        new Take(Harry, elderWand).take(); new Take(Harry, lightBow).take();
    
        System.out.println(Harry.useEquipment().equipAsMainWeapon(elderWand));

        System.out.println(Harry.useEquipment().equipAsBackupWeapon(lightBow));
        System.out.println("Гарри экипировался, теперь его уровень атаки основным оружием: " + Harry.mainAttackLevel() + "\nзапасным оружием: " + Harry.backupAttackLevel() );
        System.out.println("Бузинная палочка сильная, но больше подходит темному волшебнику ");

        System.out.println("\nГарри атаковал беднягу Такахиро! Бузинная палочка - жуткая вещь...");
        Fighter PoorTaka = new Fighter(Takahiro, 0);
        new Attack(new Fighter(Harry, 0), PoorTaka ).mainWeaponAttack();
        System.out.println("Такахиро погиб на месте. его уровень здоровья " + PoorTaka.healthLevel() + "\n Rest in peace, Taka san");
    }
    
}
