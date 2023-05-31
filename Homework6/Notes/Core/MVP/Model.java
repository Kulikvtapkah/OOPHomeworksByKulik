package Notes.Core.MVP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

import Notes.Core.Models.INotebook;
import Notes.Core.Models.Note;
import Notes.Core.Models.Notebook;

public class Model {

    INotebook consoleNotebook;
    private String path;

    public Model(String path) {
        consoleNotebook = new Notebook();
        this.path = path;
    }

    public void load() {
        try {

            // CharSequence s = "2023-05-31T01:34:43.470";
            // date = LocalDateTime.parse(s) ;

            File file = new File(path);
            FileReader fr = new FileReader(file);

            BufferedReader reader = new BufferedReader(fr);
            String ID = reader.readLine();
            while (ID != null) {
                CharSequence dateSequence = reader.readLine();
                String headder = reader.readLine();
                String mainText = reader.readLine();
                this.consoleNotebook.addNote(new Note(headder, mainText, LocalDateTime.parse(dateSequence)));
                ID = reader.readLine();
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save() {

        try (FileWriter writer = new FileWriter(path, false)) {
            for (int i = 0; i < consoleNotebook.notesNumber(); i++) {
                Note currentNote = consoleNotebook.getNote(i);
                writer.append(String.format("%s\n", currentNote.getID()));
                writer.append(String.format("%s\n", currentNote.getDate()));
                writer.append(String.format("%s\n", currentNote.headder));
                writer.append(String.format("%s\n", currentNote.mainText));
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public INotebook consoleNotebook() {
        return this.consoleNotebook;
    }

}