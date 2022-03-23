package io.patterns.behavioral.visitor.visitees;

import io.patterns.behavioral.visitor.visitors.CodeQualityRule;

import java.util.Collection;
import java.util.Collections;

public abstract class ProgramNode {
    public abstract void audit(CodeQualityRule rule);

    public Collection<Object> comments() {
        return Collections.emptyList();
    }
}
