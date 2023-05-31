package Notes.Core.MVP;

import Notes.Core.Models.Note;

public class Presenter {

    private Model model;
    private View view;

    public Presenter(View view, String pathDb) {
        this.view = view;
        model = new Model(pathDb);
    }

    public void LoadFromFile() {
        model.load();

        // if (model.consoleNotebook.notesNumber() > 0) {
        // model.setCurrentIndex(0);
        // Note contact = model.currentContact();

        // view.setFirstName(contact.firstName);
        // view.setLastName(contact.lastName);
        // view.setDescription(contact.description);
        // }
    }

    public void userInfo(String message) {
        System.out.println(message);

    }

    public void createNote() {
        view.userInfo("Добавим записку:\n");
        model.consoleNotebook().addNote(
                new Note(view.getHeadder(), view.getMainText()));
        model.save();
    }

    public void showNote() {
        view.userInfo("Читаем записку:\n");
        try {
            int index = view.getID() - 1;
            view.showNote(model.consoleNotebook().getNote(index));
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            view.userInfo("Нет записи с таким номером \n");
        } catch (Exception e) {
            view.userInfo("Что-то пошло не так...");
        }

    }

    public void showAllNotes() {
        view.userInfo("Все записки:\n");
        for (int index = 0; index < model.consoleNotebook.notesNumber(); index++) {
            view.showNote(model.consoleNotebook().getNote(index));
            view.userInfo("\n");
        }
    }

    public void editNote() {
        view.userInfo("Редактируем записку:\n");
        try {
            int index = view.getID() - 1;
            view.showNote(model.consoleNotebook().getNote(index));
            view.userInfo("Запись будет заменена:\n");
            model.consoleNotebook().editNote(index, new Note(view.getHeadder(), view.getMainText()));
            model.save();

        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            view.userInfo("Нет записи с таким номером \n");
        } catch (Exception e) {
            view.userInfo("Что-то пошло не так...");
        }

    }

    public void deleteNote() {
        view.userInfo("Удаляем записку:\n");
        try {
            int index = view.getID() - 1;
            model.consoleNotebook().deleteNote(index);
            view.userInfo(String.format("Запись %s удалена:\n", index + 1));

            model.save();

        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            view.userInfo("Нет записи с таким номером \n");
        } catch (Exception e) {
            view.userInfo("Что-то пошло не так...");
        }

    }

}
