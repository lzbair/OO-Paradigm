package io.patterns.behavioral.visitor.visitees;

import io.patterns.behavioral.visitor.visitors.CodeQualityRule;

public abstract class ProgramNode {
    public abstract void audit(CodeQualityRule rule);
}
