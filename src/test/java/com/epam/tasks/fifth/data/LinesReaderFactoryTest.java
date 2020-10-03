package com.epam.tasks.fifth.data;

import com.epam.tasks.fifth.data.exceptions.FactoryNotExistsException;
import com.epam.tasks.fifth.data.input.ConsoleLinesReader;
import com.epam.tasks.fifth.data.input.FileLinesReader;
import com.epam.tasks.fifth.data.input.LinesReader;
import org.junit.Assert;
import org.junit.Test;
import java.io.FileNotFoundException;

public class LinesReaderFactoryTest {
    private static final String NOT_EXISTING_FACTORY_NAME = "not existing factory";
    private static final String CONSOLE_FACTORY_NAME = "console";
    private static final String PATH_TO_EMPTY_FILE = "src/test/resources/empty";
    private static final String FILE_FACTORY_NAME = "file";
    private final LinesReaderFactory factory = new LinesReaderFactory();

    @Test
    public void testCreateReaderShouldReturnConsoleReader()
            throws FileNotFoundException, FactoryNotExistsException {

        LinesReader reader = factory.createReader(CONSOLE_FACTORY_NAME, "");

        Assert.assertTrue(reader instanceof ConsoleLinesReader);
    }

    @Test
    public void testCreateReaderShouldReturnFileReader()
            throws FileNotFoundException, FactoryNotExistsException {

        LinesReader reader = factory.createReader(FILE_FACTORY_NAME, PATH_TO_EMPTY_FILE);

        Assert.assertTrue(reader instanceof FileLinesReader);
    }

    @Test(expected = FactoryNotExistsException.class)
    public void testCreateNumberAcquirerWithIncorrectFactory()
            throws FileNotFoundException, FactoryNotExistsException {

        factory.createReader(NOT_EXISTING_FACTORY_NAME, "");
    }
}