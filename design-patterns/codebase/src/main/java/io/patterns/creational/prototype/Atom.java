package io.patterns.creational.prototype;

public class Atom {
    private final String name;
    private final int atomicNumber;
    private final int massNumber;

    public Atom(String name, int atomicNumber, int massNumber) {
        this.name = name;
        this.atomicNumber = atomicNumber;
        this.massNumber = massNumber;
    }

    String symbol() {
        return String.format("%s(A=%d, Z=%d)", name, massNumber, atomicNumber);
    }

    protected Atom copy() {
        return new Atom(this.name, this.atomicNumber, this.massNumber);
    }
}
