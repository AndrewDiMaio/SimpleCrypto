import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Sha256UtilTest {

    @Test
    public void applySha256() {
        String expected = "91659CFECA6D5B1602CEE31462B06D875CE40A5065B4BF9C19B065E2CE8CD02B".toLowerCase();
        String actual = Sha256Util.applySha256("Hello, my name is Joe");

        Assert.assertEquals(expected, actual);
    }
}
