package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by lixueying on 16/1/29.
 */
public class ConsoleTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldPrintContentToOutputStreamWhenIWantToPrintIt() {
        Console printer = new Console();

        printer.print("print me to console");

        assertThat(outContent.toString(), is("print me to console"));
    }

    @Test
    public void shouldCanPrintSpecialCharacter() {
        Console printer = new Console();

        printer.print("@#$%^&*\n");

        assertThat(outContent.toString(), is("@#$%^&*\n"));
    }
}
