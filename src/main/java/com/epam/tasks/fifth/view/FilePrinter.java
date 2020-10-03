package com.epam.tasks.fifth.view;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer {
    private BufferedWriter writer;
    private File file;

    public FilePrinter(File file) {
        this.file = file;
    }

    @Override
    public void printLine(String line, boolean append) throws IOException {
        open(append);
        writer.write(line);
        writer.write("\r\n");
        close();
    }

    protected void close() throws IOException {
        writer.flush();
        writer.close();
    }

    protected void open(boolean append) throws IOException {
        writer = new BufferedWriter(new FileWriter(file, append));
    }
}
