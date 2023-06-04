package OOPHomeworksByKulik.Homework7.Models;

import OOPHomeworksByKulik.Homework7.Models.Heroes.Fighter;
import OOPHomeworksByKulik.Homework7.Models.Heroes.Heroe;

public class Battle {
   protected  Fighter aFighter;
   protected  Fighter bFighter;
   protected BattleField field;
 
   protected int distance;
   protected Heroe activeFighter;

public Battle(Heroe aFighter, Heroe bFighter, BattleField newField) {
    this.aFighter = new Fighter(aFighter, field.startPose);
    this.bFighter = new Fighter(bFighter, field.startPose);;
    this.field = newField;
    distance = this.aFighter.getPosition() + this.bFighter.getPosition();
    activeFighter = aFighter;
}

public Heroe start(){
    Heroe winner;
while (aFighter.healthLevel() > 0 && bFighter.healthLevel() > 0){
//выбор действия (атака, оборона, перевязка, идти вперед/назад)
// выполнение
//проверка не помер ли кто-то
//переход хода

}



return winner;
}

    
}
