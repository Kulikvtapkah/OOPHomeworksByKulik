package OOPHomeworksByKulik.Homework3;

// Создать класс-коллекцию фигур В классе-коллекции реализовать методы: 
// 1. Dывода информации о всех периметрах, площадях и длинах окружности всех фигур, где это возможно,
// 2. добавления новой фигуры,
// 3. удаления фигуры,
// 4. изменения фигуры по индексу,
// 5. сортировки по площади, вывод информации о всех фигурах.

import java.util.ArrayList;
import java.util.Collections;

public class FigureArray {
    private ArrayList<Figure> figures;

    protected FigureArray() {
        this.figures = new ArrayList<Figure>();
    }

    public void addFigure(Figure newFigure) {
        this.figures.add(newFigure);
    }

    public void deleteFigure(int index) {
        if (inCollection(index))
            this.figures.remove(index - 1);
    }

    public void figureInfo(int index) {
        if (inCollection(index))
            this.figures.get(index - 1).figureInfo();
    }

    public void figureReset(int index, Figure newFigure) {
        if (inCollection(index)) {
            this.deleteFigure(index);
            this.figures.add(index - 1, newFigure);
        }

    }

    private boolean inCollection(int index) {
        if (index <= 0 || index > figures.size()) {
            System.out.printf("\nФигуры с номером %s нет в коллекции\n", index);
            return false;
        } else
            return true;

    }

    public void allAreas() {
        System.out.printf("\nПлощади фигур:\n");
        for (Figure currentFigure : this.figures) {
            System.out.printf("%.2f; ", currentFigure.getArea());
        }
        System.out.println("");
    }

    public void allPerimeters() {
        System.out.printf("\nПериметры фигур:\n");
        for (Figure currentFigure : this.figures) {
            if (currentFigure instanceof Polygon)
                System.out.printf("%.2f; ", ((Polygon) currentFigure).getPerimeter());
        }
        System.out.println("");
    }

    public void allCircleLengths() {
        System.out.printf("\nДлины окружностей фигур:\n");
        for (Figure currentFigure : this.figures) {
            if (currentFigure instanceof Circle)
                System.out.printf("%.2f; ", ((Circle) currentFigure).getCircleLength());
        }
        System.out.println("");
    }

    protected void allFiguresInfo() {
        System.out.printf("\nТекущий набор фигур:\n");
        int i = 1;
        for (Figure currentFigure : this.figures) {
            System.out.printf("%s. ", i);
            currentFigure.figureInfo();
            i++;
        }
    }

    public void sortFigures() {
        sortFigures(false);
    }

    public void sortFigures(boolean reverse) {
        System.out.printf("\nКоллекция фигур отсортирована ");
        if (reverse) {
            System.out.printf("по убыванию площади ");
            Collections.sort(figures, Collections.reverseOrder());
        } else {
            System.out.printf("по убыванию площади ");
            Collections.sort(figures);
        }
        allFiguresInfo();
    }

}
