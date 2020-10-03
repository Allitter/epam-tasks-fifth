package com.epam.tasks.fifth.data.input;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

public class FileLinesReaderTest {
    private final File file = new File("src/test/resources/input.txt");
    private final FileLinesReader reader = new FileLinesReader(file);

    public FileLinesReaderTest() throws FileNotFoundException {
    }

    @Test
    public void testReadLine() {
        String expected = "line 1";
        String actual = reader.readLine();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReadLines() {
        String expected = "line 1\r\nline 2\r\nline 3";
        String actual = reader.readLines(3);

        Assert.assertEquals(expected, actual);
    }
}