package com.epam.tasks.fifth.domain;

import java.util.HashSet;
import java.util.Set;

public class StringAsArrayProcessor implements StringProcessor {
    private final Set<Character> vowels;

    public StringAsArrayProcessor() {
        vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
    }

    public String removeConsonantStartingWords(String line, int wordLength) {
        StringBuilder stringBuilder = new StringBuilder();
        String word;
        int i = 0;

        while (i < line.length()) {
            if (isConsonant(line.charAt(i))) {
                word = scanWordFromIndex(line, i);

                if (word.length() != wordLength) {
                    stringBuilder.append(word);
                }

                i += word.length();
            } else {
                stringBuilder.append(line.charAt(i));
                i++;
            }
        }

        return stringBuilder.toString();
    }

    private boolean isConsonant(char ch) {
        return Character.isLetter(ch) && !vowels.contains(ch);
    }

    private String scanWordFromIndex(String line, int index) {
        StringBuilder stringBuilder = new StringBuilder();

        while (index < line.length() && Character.isLetter(line.charAt(index))) {
            stringBuilder.append(line.charAt(index));
            index++;
        }

        return stringBuilder.toString();
    }

}
