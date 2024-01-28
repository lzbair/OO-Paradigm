package io.patterns.behavioral.command.texteditor;

public class DeleteAction implements Action {

    Cursor where;
    char deleted;

    public DeleteAction(char deleted, Cursor where) {
        this.deleted = deleted;
        this.where = where;
    }

    @Override
    public void doIt() {
        where.deleteCharacterAt();
    }

    @Override
    public void udoIt() {
        where.insertCharacter(deleted);
    }
}
