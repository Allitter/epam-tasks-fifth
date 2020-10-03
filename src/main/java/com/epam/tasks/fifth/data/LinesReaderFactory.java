package com.epam.tasks.fifth.data;

import com.epam.tasks.fifth.data.exceptions.FactoryNotExistsException;
import com.epam.tasks.fifth.data.input.ConsoleLinesReader;
import com.epam.tasks.fifth.data.input.FileLinesReader;
import com.epam.tasks.fifth.data.input.LinesReader;
import java.io.FileNotFoundException;
import java.io.File;

public class LinesReaderFactory {

    public LinesReader createReader(String name, String path)
            throws FileNotFoundException, FactoryNotExistsException {

        switch (name.toLowerCase()) {
            case "console" :
                return new ConsoleLinesReader();
            case "file" :
                return new FileLinesReader(new File(path));
            default:
                throw new FactoryNotExistsException(
                        String.format("%s factory not exists", name));
        }
    }

}
