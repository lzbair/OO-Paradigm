package io.patterns.behavioral.visitor;

import io.patterns.behavioral.visitor.visitees.ProgramNode;
import io.patterns.behavioral.visitor.visitors.CodeQualityRule;

import java.util.ArrayList;
import java.util.List;

public class ProgramAuditor {
    List<CodeQualityRule> codeQualityRules = new ArrayList<>();

    public void run(ProgramNode node) {
        for (CodeQualityRule rule : codeQualityRules) {
            node.audit(rule);
        }
        // codeQualityRules.stream().forEach(node::audit);
    }
}
