package pl.umk.course;

import static org.fest.assertions.Assertions.*;
import org.junit.Test;

public class Rot13Test {

    @Test
    public void should_encrypt_text() throws Throwable {
        String encryptedText = rot13.encrypt("abc");

        assertThat(encryptedText).isEqualTo("nop");
    }

    @Test
    public void should_encrypt_other_text() throws Throwable {
        String encryptedText = rot13.encrypt("bcd");

        assertThat(encryptedText).isEqualTo("opq");
    }

    @Test
    public void should_encryt_text_with_alphabet_ending_letters() throws Throwable {
        String encryptedText = rot13.encrypt("xyz");

        assertThat(encryptedText).isEqualTo("klm");
    }

    @Test
    public void should_encryt_text_with_space() throws Throwable {
        String encryptedText = rot13.encrypt("abc xyz");

        assertThat(encryptedText).isEqualTo("nop klm");
    }


    @Test
    public void should_decrypt_text() throws Throwable {
        String decryptedText = rot13.decrypt("nop");

        assertThat(decryptedText).isEqualTo("abc");
    }

    @Test
    public void should_decrypt_other_text() throws Throwable {
        String decryptedText = rot13.decrypt("opq");

        assertThat(decryptedText).isEqualTo("bcd");
    }

    @Test
    public void should_decryt_text_with_alphabet_ending_letters() throws Throwable {
        String decryptedText = rot13.decrypt("klm");

        assertThat(decryptedText).isEqualTo("xyz");
    }

    @Test
    public void should_decryt_text_with_space() throws Throwable {
        String decryptedText = rot13.decrypt("nop klm");

        assertThat(decryptedText).isEqualTo("abc xyz");
    }

    @Test(expected = EncodingExcpetion.class)
    public void should_throw_error_when_unexpected_char() throws Throwable {
        rot13.decrypt("a$");
    }

    Rot13 rot13 = new Rot13();

}