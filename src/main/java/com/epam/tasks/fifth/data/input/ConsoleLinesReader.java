package com.epam.tasks.fifth.data.input;

import com.epam.tasks.fifth.data.filters.FilterNotToCloseSystemIn;
import java.util.Scanner;

public class ConsoleLinesReader extends LinesReader {
    private final Scanner scanner = new Scanner(
            new FilterNotToCloseSystemIn(System.in));

    @Override
    public String readLine() {
        return scanner.nextLine();
    }

    public void close() {
        scanner.close();
    }
}
