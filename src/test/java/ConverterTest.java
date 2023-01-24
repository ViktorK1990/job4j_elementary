
import org.junit.Assert;
import org.junit.Test;
public class ConverterTest {

    @Test
    public void whenConvert600RublesThen2610Eur10() {
        float in = 500f;
        float expected = 10f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);

    }

    @Test
     public void whenConvert50000RubleThen684Dollar() {
        float in = 600f;
        float expected = 10f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void main() {
    }
}