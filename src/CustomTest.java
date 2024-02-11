import org.junit.Test;
import java.lang.Integer;
import static org.junit.Assert.*;

public class CustomTest
{
    @Test(expected = NumberFormatException.class)
    public void checkZeroLength()
    {
        Integer.decode("");
    }

    @Test
    public void checkPositiveNum()
    {
        assertEquals(Integer.decode("2"),
                new Integer(2));
    }

    @Test
    public void checkNegativeNum()
    {
        assertEquals(Integer.decode("-2"),
                new Integer(-2));
    }

    @Test(expected = NumberFormatException.class)
    public void checkNotNum()
    {
        Integer.decode("reference");
    }

    @Test(expected = NumberFormatException.class)
    public void checkUnCorrectEightBase(){
        Integer.decode("008");
    }

    @Test
    public void checkCorrectEightBase(){
        assertEquals(Integer.decode("0171"), (Integer) 121);
    }

    @Test
    public void checkNegativeEightBase(){
        assertEquals(Integer.decode("-0354"),
                new Integer(-236));
    }

    @Test(expected = NullPointerException.class)
    public void checkNull()
    {
        Integer.decode(null);
    }
}