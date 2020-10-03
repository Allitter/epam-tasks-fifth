package com.epam.tasks.fifth.data;

import com.epam.tasks.fifth.data.input.LinesReader;

import java.io.FileNotFoundException;

public interface ReaderFactory  {

    LinesReader createReader() throws FileNotFoundException;

}
