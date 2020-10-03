package com.epam.tasks.fifth.data.input;

import java.io.IOException;
import java.io.InputStream;

public class MockInputStream extends InputStream {
    private static final int INDEX_LOWER_BOUND = -1;
    private String input;
    private int index;

    public MockInputStream(String input) {
        this.input = input;
        index = -1;
    }

    public MockInputStream() {
        input = "";
        index = -1;
    }

    public void setInput(String input) {
        this.input = input;
        index = INDEX_LOWER_BOUND;
    }

    @Override
    public int read() throws IOException {
        if (++index >= input.length()) {
            throw new IOException();
        }

        return input.charAt(index);
    }
}
