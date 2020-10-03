package com.epam.tasks.fifth.domain;

import org.junit.Assert;
import org.junit.Test;

public class StringAsArrayProcessorTest {
    private static final String TEXT_FOR_TEST = "Text to test, words deletion";
    private static final int WORDS_LENGTH = 4;
    private final StringAsArrayProcessor processor = new StringAsArrayProcessor();

    @Test
    public void testRemoveConsonantStartingWords() {
        String expected = " to , words deletion";
        String actual = processor.removeConsonantStartingWords(TEXT_FOR_TEST, WORDS_LENGTH);

        Assert.assertEquals(expected, actual);
    }
}