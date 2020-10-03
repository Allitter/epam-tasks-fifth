package com.epam.tasks.fifth.data.input;

import java.io.Closeable;

public abstract class LinesReader implements Closeable {

    public abstract String readLine();

    public String readLines(int amount) {
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        for (int i = 0; i < amount - 1; i++) {
            line = readLine();
            stringBuilder.append(line);
            stringBuilder.append("\r\n");
        }
        line = readLine();
        stringBuilder.append(line);

        return stringBuilder.toString();
    }

}
