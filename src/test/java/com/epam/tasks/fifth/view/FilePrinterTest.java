package com.epam.tasks.fifth.view;

import org.junit.Assert;
import org.junit.Test;
import java.io.*;

public class FilePrinterTest {
    private final File file = new File("src/test/resources/output.txt");
    private final FilePrinter printer = new FilePrinter(file);
    private final BufferedReader reader = new BufferedReader(new FileReader(file));

    public FilePrinterTest() throws FileNotFoundException {
    }

    @Test
    public void testPrintLineShouldPrintLine() throws IOException {
        String expected = "line";

        printer.printLine(expected, false);
        String actual = reader.readLine();

        Assert.assertEquals(expected, actual);
    }
}