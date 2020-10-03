package com.epam.tasks.fifth.data.input;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.InputStream;

public class ConsoleLinesReaderTest {
    private static final String LINE = "line";
    private static final String LINES = "line 1\r\nline 2\r\nline 3";
    private final ConsoleLinesReader reader = new ConsoleLinesReader();
    private static final MockInputStream MOCK_INPUT_STREAM = new MockInputStream();
    private static InputStream inputStream;

    @BeforeClass
    public static void toDoBeforeAllTests() {
        inputStream = System.in;
        System.setIn(MOCK_INPUT_STREAM);
    }

    @AfterClass
    public static void toDoAfterAllTests() {
        System.setIn(inputStream);
    }

    @Test
    public void testReadLine() {
        MOCK_INPUT_STREAM.setInput(LINE);

        String actual = reader.readLine();

        Assert.assertEquals(LINE, actual);
    }

    @Test
    public void testReadLines() {
        MOCK_INPUT_STREAM.setInput(LINES);

        String actual = reader.readLines(3);

        Assert.assertEquals(LINES, actual);
    }
}