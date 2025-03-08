package org.utils.stringutils;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.utils.exceptions.InvalidStringInputException;

// JUnit TESTING
class StringParserTest {

    @Test
    void splitString_oneSeparator_expectTwoParts() throws InvalidStringInputException {
        StringParser sp = new StringParser();
        String separator = "\\|"; // escaping using \\
        String input = "Hello|World";
        ArrayList<String> parts = sp.splitString(input, separator);

        // JUnit testing
        assertEquals(2, parts.size());
    }

    @Test
    // test null string
    void splitString_nullInput_expectException() throws InvalidStringInputException {
        StringParser sp = new StringParser();
        String separator = "\\|"; // escaping using \\
        String input = null;

//        ArrayList<String> parts = sp.splitString(null, separator);
//        assertEquals(0, parts.size());

        // running negative (null) tests
        assertThrows(InvalidStringInputException.class,
                () -> sp.splitString(input, separator));
    }
}