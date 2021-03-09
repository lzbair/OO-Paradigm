package io.patterns.behavioral.visitor.visitees;

import io.patterns.behavioral.visitor.visitors.CodeQualityRule;

public class VariableNode extends ProgramNode {
    @Override
    public void audit(CodeQualityRule visitor) {
        visitor.auditVariable(this);
    }
}
