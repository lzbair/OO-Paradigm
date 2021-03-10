package io.patterns.behavioral.visitor.visitees;

import io.patterns.behavioral.visitor.visitors.CodeQualityRule;

public class FunctionNode extends ProgramNode {
    public static void arguments() {
    }

    @Override
    public void audit(CodeQualityRule rule) {
        rule.auditFunction(this);
    }
}
