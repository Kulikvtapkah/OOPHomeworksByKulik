package Notes.Core.Models;

public interface INotebook {
    public void addNote(Note newNote);

    public Note getNote(int index);

    public void editNote(int index, Note note);

    public void deleteNote(int index);

    public int notesNumber();

}
