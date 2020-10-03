package com.epam.tasks.fifth.data;

import com.epam.tasks.fifth.data.exceptions.FactoryNotExistsException;
import com.epam.tasks.fifth.data.input.LinesReader;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class LinesReaderFactory {
    private final Map<String, ReaderFactory> factories;

    public LinesReaderFactory() {
        factories = new HashMap<>();
        factories.put("console", new ConsoleLinesReaderFactory());
        factories.put("file", new FileLinesReaderFactory());
    }

    public LinesReader createReader(String name)
            throws FileNotFoundException, FactoryNotExistsException {

        name = name.toLowerCase();
        if (!factories.containsKey(name)) {
            throw new FactoryNotExistsException(
                    String.format("factory \"%s\" not exists", name));
        }

        ReaderFactory factory = factories.get(name);
        return factory.createReader();
    }

}
