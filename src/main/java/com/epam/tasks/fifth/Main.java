package com.epam.tasks.fifth;

//TODO Выполнить и через методы строковых типов, и как работа с символьной строкой и через регулярные выражения.
// Программа обработки текста, который может быть получен как с консоли, так и с файла.
// 5. Из текста удалить все слова заданной длины, начинающиеся на согласную букву.

import com.epam.tasks.fifth.data.ConsoleLinesReaderFactory;
import com.epam.tasks.fifth.data.ReaderFactory;
import com.epam.tasks.fifth.data.input.LinesReader;
import com.epam.tasks.fifth.domain.StringAsArrayProcessor;
import com.epam.tasks.fifth.domain.StringProcessor;
import com.epam.tasks.fifth.view.FilePrinter;
import com.epam.tasks.fifth.view.Printer;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ReaderFactory factory = new ConsoleLinesReaderFactory();
        LinesReader reader = factory.createReader();
        String input = reader.readLines(2);

        StringProcessor processor = new StringAsArrayProcessor();
        String result = processor.removeConsonantStartingWords(input, 4);

        File output = new File("output.txt");
        Printer printer = new FilePrinter(output);
        printer.printLine(result, true);
    }
}
