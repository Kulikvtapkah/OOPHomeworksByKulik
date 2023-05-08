package OOPHomeworksByKulik.Homework3;

public class OOPHmw3_1 {
    // Написать программу на языках Java, в которой идёт со следующими
    // геометрическими фигурами:
    // 1.Треугольник
    // 2.Квадрат
    // 3.Прямоугольник
    // 4.Круг
    // В программе имеется массив фигур, с которым можно сделать следующие операции:
    // 1.Добавить новую фигуру
    // 2.Посчитать периметр у всех фигур
    // 3.Посчитать площадь у всех фигур
    // Для фигуры использовать базовый абстрактный класс фигуры, у которого есть
    // методы посчитать периметр и посчитать площадь фигуры.
    // Создать класс-коллекцию фигур В классе-коллекции реализовать методы:
    // 1. Dывода информации о всех периметрах, площадях и длинах окружности всех
    // фигур, где это возможно,
    // 2. добавления новой фигуры,
    // 3. удаления фигуры,
    // 4. изменения фигуры по индексу,
    // 5. сортировки по площади, вывод информации о всех фигурах.
    // При создании фигур необходимо осуществлять проверку входных данных на
    // возможность создания данной фигуры
    // и в случае ошибки выдавать соответствующие сообщения. Перодумать собственную
    // иерархию исключений

    public static void main(String[] args) throws InvalidGeometryExeption {
        // Scanner animalScanner = new Scanner(System.in);

        FigureArray figureCollection = new FigureArray();
        figureCollection.addFigure(new Square(10));
        figureCollection.addFigure(new Circle(5));
        figureCollection.addFigure(new Square(7));
        figureCollection.addFigure(new Rectangle(7, 10));
        figureCollection.addFigure(new Triangle(12, 8.2, 5));

        figureCollection.allFiguresInfo();
        figureCollection.allAreas();
        figureCollection.allPerimeters();

        figureCollection.allCircleLengths();
        figureCollection.sortFigures(true);

        figureCollection.figureReset(0, new Circle(2));
        figureCollection.allFiguresInfo();
        figureCollection.figureReset(3, new Circle(-2));

    }

}
