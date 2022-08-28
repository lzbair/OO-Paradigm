package io.patterns.creational.singleton;

public final class Writer {

    // Use a holder to defer INSTANCE initialization (lazy loading)
    private static class WriterHolder {
        // Static declaration on nested classes is allowed since Java 17
        private static final Writer INSTANCE = new Writer();
    }


    public static Writer instance() {
        return WriterHolder.INSTANCE;
    }

    public void write() {
        System.out.println(Thread.currentThread().getId());
    }

}
