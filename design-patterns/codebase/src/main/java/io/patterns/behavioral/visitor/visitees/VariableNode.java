package io.patterns.behavioral.visitor.visitees;

import io.patterns.behavioral.visitor.visitors.CodeQualityRule;

import java.util.Collections;
import java.util.List;

public class VariableNode extends ProgramNode {
    @Override
    public void audit(CodeQualityRule visitor) {
        visitor.auditVariable(this);
    }

    public List<Object> accessors() {
        return Collections.emptyList();
    }
}
