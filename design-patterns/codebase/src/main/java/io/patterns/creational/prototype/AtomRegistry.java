package io.patterns.creational.prototype;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AtomRegistry {

    enum AtomCode {
        O, H, C;

    }

    private final Map<AtomCode, Atom> atoms = new HashMap<>();


    public AtomRegistry() {
        atoms.put(AtomCode.O, new Atom("OXYGEN", 8, 16));
        atoms.put(AtomCode.C, new Atom("CARBON", 6, 12));
        atoms.put(AtomCode.H, new Atom("HYDROGEN", 1, 2));
    }

    public String get(AtomCode... codes) {
        return Arrays.stream(codes).map(atoms::get)
                .map(Atom::copy)     // copy the prototype object
                .map(Atom::symbol)
                .collect(Collectors.joining("--"));
    }
}
