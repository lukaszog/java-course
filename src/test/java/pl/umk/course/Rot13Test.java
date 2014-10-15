package pl.umk.course;

import static org.fest.assertions.Assertions.*;
import org.junit.Test;

public class Rot13Test {

    @Test
    public void should_encrypt_text() {
        Rot13 rot13 = new Rot13();

        String encryptedText = rot13.encrypt("abc");

        assertThat(encryptedText).isEqualTo("nop");
    }

    @Test
    public void should_encrypt_other_text() {
        Rot13 rot13 = new Rot13();

        String encryptedText = rot13.encrypt("bcd");

        assertThat(encryptedText).isEqualTo("opq");
    }

}