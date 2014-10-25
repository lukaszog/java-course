package pl.umk.course.controllers;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class EncodeControllerTest {
    @Test
    public void should_return_hello_spring_message_when_index_called() {
        EncodeController controller = new EncodeController();

        String output = controller.index();

        assertThat(output).isEqualTo("Hello Spring!");
    }

}
