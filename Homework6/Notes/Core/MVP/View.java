package Notes.Core.MVP;

import Notes.Core.Models.Note;

public interface View {
    String getHeadder();

    String getMainText();

    int getID();

    void showNote(Note note);

    void userInfo(String message);
}
