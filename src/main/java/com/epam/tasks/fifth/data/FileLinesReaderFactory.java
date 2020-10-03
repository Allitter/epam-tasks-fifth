package com.epam.tasks.fifth.data;

import com.epam.tasks.fifth.data.input.FileLinesReader;
import com.epam.tasks.fifth.data.input.LinesReader;
import java.io.File;
import java.io.FileNotFoundException;

public class FileLinesReaderFactory implements ReaderFactory {
    private static final String PATH = "input.txt";

    @Override
    public LinesReader createReader() throws FileNotFoundException {
        File file = new File(PATH);
        return new FileLinesReader(file);
    }
}
