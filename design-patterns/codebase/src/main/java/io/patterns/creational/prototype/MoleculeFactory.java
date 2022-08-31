package io.patterns.creational.prototype;

import static io.patterns.creational.prototype.AtomRegistry.AtomCode.C;
import static io.patterns.creational.prototype.AtomRegistry.AtomCode.H;
import static io.patterns.creational.prototype.AtomRegistry.AtomCode.O;


public class MoleculeFactory {

    private final AtomRegistry atomRegistry;

    public MoleculeFactory(AtomRegistry atomRegistry) {
        this.atomRegistry = atomRegistry;
    }


    String water() {
        return atomRegistry.get(H, H, O);
    }

    String ozone() {
        return atomRegistry.get(O, O, O);
    }

    String carbonMonoxide() {
        return atomRegistry.get(C, O);
    }

    public static void main(String[] args) {
        MoleculeFactory factory = new MoleculeFactory(new AtomRegistry());
        System.out.println(factory.water());
        System.out.println(factory.ozone());
        System.out.println(factory.carbonMonoxide());

    }

}
