package io.patterns.creational.singleton;

public final class Writer {

    private static final Writer INSTANCE = writer();


    private Writer() throws IllegalAccessException {
        if (INSTANCE != null) throw new IllegalAccessException(getClass().getName() + " Cannot be instantiated");
    }

    private static Writer writer() {
        if (INSTANCE == null) {

            try {
                return new Writer();
            } catch (IllegalAccessException e) {
                // The exception is not supposed to be raised at this level;
            }
        }
        return INSTANCE;

    }

    public static Writer getInstance() {
        return INSTANCE;
    }

    public void write() {
        System.out.println(Thread.currentThread().getId());
    }

}
