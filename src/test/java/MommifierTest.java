import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MommifierTest {
    Mommifier mommifier;
    @BeforeEach
    void setUp(){
        mommifier = new Mommifier();
    }

    @Test
    void should_return_origin_strings_when_convert_given_strings_has_vowels_but_not_continuous(){
        String strings = "abedijoku";
        String result = mommifier.convert(strings);
        assertEquals("abedijoku",result);
    }

    @Test
    void should_return_origin_strings_when_convert_given_strings_hasnot_enough_vowels(){
        String strings = "sdfgh";
        String result = mommifier.convert(strings);
        assertEquals("sdfgh",result);
    }

    @Test
    void should_return_mommy_insert_strings_when_convert_given_strings_has_enough_and_continuous_vowels_(){
        String strings = "aeidsdsdso";
        String result = mommifier.convert(strings);
        System.out.println("Debug:     " + result);
        assertEquals("amommyemommyidsdsdso",result);
    }




}
