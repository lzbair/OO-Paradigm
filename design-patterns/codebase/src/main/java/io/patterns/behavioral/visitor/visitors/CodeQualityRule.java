package io.patterns.behavioral.visitor.visitors;

import io.patterns.behavioral.visitor.visitees.FunctionNode;
import io.patterns.behavioral.visitor.visitees.VariableNode;

public interface CodeQualityRule {
   void auditVariable(VariableNode variableNode);
   void auditFunction(FunctionNode functionNode);

}
