package io.patterns.behavioral.visitor.visitors;


import io.patterns.behavioral.visitor.visitees.FunctionNode;
import io.patterns.behavioral.visitor.visitees.VariableNode;

class NamingRule implements CodeQualityRule {

    @Override
    public void auditVariable(VariableNode variableNode) {

    }

    @Override
    public void auditFunction(FunctionNode functionNode) {

    }
}
