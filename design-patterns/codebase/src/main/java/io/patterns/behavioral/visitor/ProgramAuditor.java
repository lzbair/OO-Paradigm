package io.patterns.behavioral.visitor;

import io.patterns.behavioral.visitor.visitees.ProgramNode;
import io.patterns.behavioral.visitor.visitors.CodeQualityRule;

import java.util.ArrayList;
import java.util.List;

public class ProgramAuditor {
    List<CodeQualityRule> codeQualityRules = new ArrayList<>();

    public void run(ProgramNode program) {
        codeQualityRules.stream().forEach(program::audit);
    }
}
