package pl.umk.course.utils;

import java.util.List;

public class AlphabetValidator {

    public boolean isValid(List<Character> alphabet, String validateString) {
        for (Character c : validateString.toCharArray()) {
            if (!alphabet.contains(c) && c != ' ') {
                return false;
            }
        }
        return true;
    }

}
