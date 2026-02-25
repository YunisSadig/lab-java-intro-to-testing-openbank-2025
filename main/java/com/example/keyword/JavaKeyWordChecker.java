package com.example.keyword;

import java.util.Arrays;
import java.util.List;

public class JavaKeyWordChecker {
    private static final List<String> JAVA_KEYWORDS = Arrays.asList(
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
            "const", "continue", "default", "do", "double", "else", "enum", "extends", "final",
            "finally", "float", "for", "goto", "if", "implements", "import", "instanceof",
            "int", "interface", "long", "native", "new", "package", "private", "protected",
            "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized",
            "this", "throw", "throws", "transient", "try", "void", "volatile", "while"
    );

    public boolean containsJavaKeyword(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        String[] words = input.split(" ");

        for (String word : words) {
            if (JAVA_KEYWORDS.contains(word)) {
                return true;
            }
        }

        return false;
    }

}
