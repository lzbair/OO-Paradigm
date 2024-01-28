package io.patterns.behavioral.command.texteditor;

public class InsertAction implements Action{

    char inserted;
    Cursor where;

    public InsertAction(char inserted, Cursor where) {
        this.inserted = inserted;
        this.where = where;
    }

    @Override
    public void doIt() {
        where.insertCharacter(inserted);
    }

    @Override
    public void udoIt() {
        where.deleteCharacterAt();
    }
}
