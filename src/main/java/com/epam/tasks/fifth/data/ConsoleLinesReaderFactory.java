package com.epam.tasks.fifth.data;

import com.epam.tasks.fifth.data.input.ConsoleLinesReader;
import com.epam.tasks.fifth.data.input.LinesReader;

public class ConsoleLinesReaderFactory implements ReaderFactory {

    @Override
    public LinesReader createReader() {
        return new ConsoleLinesReader();
    }

}
