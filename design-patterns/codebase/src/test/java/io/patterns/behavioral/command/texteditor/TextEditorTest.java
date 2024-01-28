package io.patterns.behavioral.command.texteditor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TextEditorTest {

    private Text text


    @BeforeEach
    public void setup(){
        this.text = new Text("Hello world");
    }


    @Test
    public void test(){
        TextEditor editor = TextEditor.open(text);

        editor.insertCharacter('Z');
    }
}
