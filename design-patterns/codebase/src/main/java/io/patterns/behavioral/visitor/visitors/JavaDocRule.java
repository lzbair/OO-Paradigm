package io.patterns.behavioral.visitor.visitors;

import io.patterns.behavioral.visitor.visitees.FunctionNode;
import io.patterns.behavioral.visitor.visitees.VariableNode;

public class JavaDocRule implements CodeQualityRule {
    @Override
    public void auditVariable(VariableNode variableNode) {

        if (variableNode.comments().isEmpty()) {
            throw new CodeQualityRuleException();
        }
    }

    @Override
    public void auditFunction(FunctionNode functionNode) {

    }
}
