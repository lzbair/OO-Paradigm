package io.patterns.behavioral.visitor.visitors;

import io.patterns.behavioral.visitor.visitees.FunctionNode;
import io.patterns.behavioral.visitor.visitees.VariableNode;

public class ImmutabilityRule implements CodeQualityRule {

    @Override
    public void auditVariable(VariableNode variableNode) {
        if (!variableNode.accessors().contains("final")){
            throw new CodeQualityRuleException();
        }
    }

    @Override
    public void auditFunction(FunctionNode functionNode) {
        FunctionNode.arguments();
    }
}
