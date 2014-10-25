package pl.umk.course.controllers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import pl.umk.course.exceptions.EncodingException;
import pl.umk.course.utils.Encoder;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class EncodeControllerTest {
    @Mock
    Encoder encoder;

    EncodeController controller;

    @Test
    public void should_return_hello_spring_message_when_index_called() {
        String output = controller.index();

        assertThat(output).isEqualTo("Hello Spring!");
    }

    @Test
    public void should_return_encrypted_text_when_encode_called() throws EncodingException {
        when(encoder.encrypt("hello")).thenReturn("uryyb");

        String output = controller.encode();

        assertThat(output).isEqualTo("uryyb");
    }

    @Before
    public void setUp() {
        initMocks(this);
        controller = new EncodeController(encoder);
    }

}
