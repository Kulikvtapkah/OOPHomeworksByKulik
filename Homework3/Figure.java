package OOPHomeworksByKulik.Homework3;

// Написать программу на языках Java, в которой идёт со следующими геометрическими фигурами:
// 1.Треугольник
// 2.Квадрат
// 3.Прямоугольник
// 4.Круг
// В программе имеется массив фигур, с которым можно сделать следующие операции:
// 1.Добавить новую фигуру
// 2.Посчитать периметр у всех фигур
// 3.Посчитать площадь у всех фигур
// Для фигуры использовать базовый абстрактный класс фигуры, у которого есть методы посчитать периметр и посчитать площадь фигуры.
// Создать класс-коллекцию фигур В классе-коллекции реализовать методы: 
// 1. Dывода информации о всех периметрах, площадях и длинах окружности всех фигур, где это возможно,
// 2. добавления новой фигуры,
// 3. удаления фигуры,
// 4. изменения фигуры по индексу,
// 5. сортировки по площади, вывод информации о всех фигурах.
// При создании фигур необходимо осуществлять проверку входных данных на возможность создания данной фигуры
//  и в случае ошибки выдавать соответствующие сообщения. Перодумать собственную иерархию исключений

public abstract class Figure implements Comparable<Figure> {
    protected double area;

    protected Figure() {

    }

    public double getArea() {
        return area;
    }

    protected void figureInfo() {
        System.out.printf("площадь: %.2f ед2\n", area);
    }

    @Override
    public int compareTo(Figure otherFigure) {
        return Double.compare(this.area, otherFigure.area);

    }

    protected double geometryValidation(double parameter) throws InvalidGeometryExeption {
        try {
            if (parameter == 0) {
                throw new InvalidGeometryExeption(" с нулевой геометрией такая себе фигура");
            } else if (parameter < 0)
                throw new InvalidGeometryExeption(
                        "ууу, похоже, пространство... наизнанку? Жаль, я пока в таком не ориентируюсь(");
        } finally {}

        return parameter;
    }

}
