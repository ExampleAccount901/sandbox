import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Loader {

    public static void main(String[] args) {


    }

    /**
     * Returns true if number is valid
     *
     * @param number - phone number
     * @return
     */
    public static boolean isValidPhoneNumber(String number) {
        return number.matches("^\\+?\\d{1}\\s?\\(?\\d{3}\\)?\\s?\\(?\\d{3}\\)?[\\s-]?[\\s-]?[\\s-]?\\d{2}[\\s-]?[\\s-]?[\\s-]?\\d{2}");
    }

    @Test
    void test() {
        assertEquals(true, isValidPhoneNumber("+7(929)6721561"));
        assertEquals(false, isValidPhoneNumber("?79296721561"));
        assertEquals(false, isValidPhoneNumber("+792967215612"));
        assertEquals(true, isValidPhoneNumber("+7(929) 672-15-61"));
        assertEquals(true, isValidPhoneNumber("+7(929) (672) - 15 - 61"));
        assertEquals(true, isValidPhoneNumber("89296721561"));
    }
}













