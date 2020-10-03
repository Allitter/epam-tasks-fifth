package com.epam.tasks.fifth.data.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileLinesReader extends LinesReader {
    private final Scanner scanner;

    public FileLinesReader(File file) throws FileNotFoundException {
        FileInputStream inputStream = new FileInputStream(file);
        scanner = new Scanner(inputStream);
    }

    @Override
    public String readLine() {
        return scanner.nextLine();
    }

    @Override
    public void close() {
        scanner.close();
    }
}
