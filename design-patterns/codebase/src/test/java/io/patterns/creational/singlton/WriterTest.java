package io.patterns.creational.singlton;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class WriterTest {

    @Test
    public void writerCannotBeInstantiated() throws Exception {
        assertThrows(InvocationTargetException.class, () -> {
            Class<?> w = Class.forName("io.patterns.creational.singleton.Writer");
            Constructor<?> constructor = w.getDeclaredConstructor();
            constructor.setAccessible(true);
            constructor.newInstance();
        });
    }
}
