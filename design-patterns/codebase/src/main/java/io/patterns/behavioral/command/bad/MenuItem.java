package io.patterns.behavioral.command.bad;

public interface MenuItem {
    void execute(Document document);

    void describe();
}
