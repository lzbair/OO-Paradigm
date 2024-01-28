package io.patterns.behavioral.command.texteditor;

/**
 * Receiver
 */
public class Cursor {
    Text text;
    Position underScore;

    public Cursor(Text text, Position underscore) {
        this.text = text;
        this.underScore = new Position(0, text.first());
    }

    public Cursor(Text text) {
        this(text, new Position(0, text.first()));
    }

    char characterAt() {
        return underScore.character;
    }

    void deleteCharacterAt() {
        final Text newText = text.deleteCharAt(underScore.index);
        this.text = newText;
        this.underScore = underScore.previous(newText);
    }

    public void insertCharacter(char character) {
        final Text newText = text.insert(underScore.index, character);
        this.text = newText;
        this.underScore = underScore.next(newText);
    }


    private static class Position {
        int index;
        char character;

        public Position(int index, char character) {
            this.index = index;
            this.character = character;
        }


        Position next(Text text) {
            return new Position(index++, text.charAt(index++));
        }

        Position previous(Text text) {
            return new Position(index--, text.charAt(index--));
        }
    }
}
