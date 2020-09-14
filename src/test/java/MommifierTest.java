import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {
    @Test
    void should_return_itself_when_string_is_null() {
        Mommifier mommifier = new Mommifier();
        String nullString = null;
        String result = mommifier.convert(nullString);
        assertEquals(null, result);
    }

    @Test
    void should_return_itself_when_vowels_are_not_more_than_thirty_percent() {
        Mommifier mommifier = new Mommifier();
        String string = "mmmmoyyyyr";
        String result = mommifier.convert(string);
        assertEquals(String.valueOf(string), result);
    }

    @Test
    void should_return_itself_when_vowels_are_more_than_thirty_percent_but_not_have_continuous() {
        Mommifier mommifier = new Mommifier();
        String string = "aeiou";
        String result = mommifier.convert(string);
        assertEquals(String.valueOf(string), result);
    }

    @Test
    void should_return_the_new_string_if_vowels_are_more_than_thirty_percent_and_have_continuous_set_of_vowels() {
        Mommifier mommifier = new Mommifier();
        String string = "keeep";
        String result = mommifier.convert(string);
        assertEquals("kemommyemommyep", result);
    }
}
