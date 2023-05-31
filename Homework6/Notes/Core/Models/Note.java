package Notes.Core.Models;

import java.time.LocalDateTime;

public class Note {
    private LocalDateTime date;
    public String headder;
    public String mainText;
    private int ID;

    public Note(String headder, String mainText) {
        this.headder = headder;
        this.mainText = mainText;
        date = LocalDateTime.now();

    }

    public Note(String headder, String mainText, LocalDateTime date) {
        this.headder = headder;
        this.mainText = mainText;
        this.date = date;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public int getID() {
        return ID;
    }

    public LocalDateTime getDate() {
        return date;
    }

}
