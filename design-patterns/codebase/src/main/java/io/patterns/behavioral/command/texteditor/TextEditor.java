package io.patterns.behavioral.command.texteditor;

import java.util.Stack;

/**
 * Invoker
 */

public class TextEditor {
    private final Stack<Action> redoStack;
    private final Stack<Action> undoStack;

    private final Cursor current;

    public TextEditor(Cursor current) {
        this.current = current;
        this.redoStack = new Stack<>();
        this.undoStack = new Stack<>();
    }

    public static TextEditor open(Text text) {
        return new TextEditor(new Cursor(text));
    }

    void deleteCharacter(char deleted) {
        Action delete = new DeleteAction(deleted, current);
        delete.doIt();
        undoStack.push(delete);
    }

    void insertCharacter(char inserted) {
        Action insert = new DeleteAction(inserted, current);
        insert.doIt();
        undoStack.push(insert);
    }

    void process(Action action) {
        action.doIt();
        undoStack.push(action);
    }

    void undo() {
        Action action = undoStack.pop();
        action.udoIt();
        redoStack.push(action);
    }

    void redo() {
        Action action = redoStack.pop();
        action.doIt();
        undoStack.push(action);
    }
}
