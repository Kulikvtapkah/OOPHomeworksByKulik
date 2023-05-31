package Notes.Core.Models;

import java.util.ArrayList;
import java.util.List;

public class Notebook implements INotebook {

    private List<Note> notes;

    public Notebook() {
        notes = new ArrayList<Note>();
    }

    // create
    public void addNote(Note newNote) {
        newNote.setID(notes.size() + 1);
        notes.add(newNote);
    }


    // read
    public Note getNote(int index) {
        if (contains(index))
            return notes.get(index);
        else
            return null;
    }

    // edit
    public void editNote(int index, Note note) {
        if (contains(index)) {
            notes.set(index, note);
            note.setID(index + 1);
        }

    }

    // delete
    public void deleteNote(int index) {
        if (contains(index)){
            notes.remove(index);
            for (int i = index; i < notes.size(); i++) {
                notes.get(i).setID(i + 1);
            }
        }
    }

    protected boolean contains(int index) {
        return notes != null
                && notes.size() > index;
    }
    public int notesNumber(){
        return notes.size();
    }

}
