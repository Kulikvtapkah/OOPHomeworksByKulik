package OOPHomeworksByKulik.Homework7.Models;

public class BattleField {
    public final int radius; //по факту, поле не круг, а прямая с координаами от -radius до +radius
    public final int startPose;

public BattleField(int radius) {
    this.radius = radius;
    startPose = (int)radius/2; //стартуем середине своей половины поля, чтобы было, куда отступать и наступать
}

    
}
