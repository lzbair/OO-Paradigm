package io.patterns.structural.flyweight;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LogDashboard {

    //java -Xmx512m -cp OO-Paradigm\design-patterns\codebase\target\classes io.patterns.structural.flyweight.LogDashboard
    // light implementation --> passes with success
    // heavy implementation -->  leads to out of memory error
    public static void main(String[] args) {
        final List<LogMessage> messages = load(1000000);

        // more logic in between

        messages.forEach(LogMessage::print);
    }

    private static List<LogMessage> load(int maxRows) {
        return Stream.generate(LogSupplier.HEAVY)
                .limit(maxRows)
                .map(LogEntry::logMessage)
                .collect(Collectors.toList());
    }


}
