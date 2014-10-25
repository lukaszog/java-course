package pl.umk.course.utils;

import com.google.common.collect.Lists;
import pl.umk.course.exceptions.EncodingException;

import java.util.List;

public class Rot13Encoder implements Encoder {

    public static final List<Character> ALPHABET = Lists.charactersOf("abcdefghijklmnopqrstuvwxyz");
    public String encrypt(String input) throws EncodingException {
        String result = "";

        if (!alphabetValidator.isValid(ALPHABET, input)) {
            throw new EncodingException("Not valid alphabet");
        }

        for (Character c : input.toCharArray()) {
            result += encodeCharacter(c);
        }

        return result;
    }

    public String decrypt(String input) throws EncodingException {
        return encrypt(input);
    }

    private Character encodeCharacter(Character c) {
        if (c == ' ') {
            return ' ';
        }
        Integer charPosition = ALPHABET.indexOf(c);
        Integer encryptedCharPosition = (charPosition + 13) % 26;
        Character encryptedChar = ALPHABET.get(encryptedCharPosition);
        return encryptedChar;
    }

    private final AlphabetValidator alphabetValidator;

    public Rot13Encoder(AlphabetValidator alphabetValidator) {
        this.alphabetValidator = alphabetValidator;
    }
}
