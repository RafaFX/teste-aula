import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;


public class ParOuImparTest  {
    private ParOuImpar parOuImpar;

    @Test
    public void testPar() {
        parOuImpar = new ParOuImpar();
        int resultado = parOuImpar.parOuImpar(2);
        Assertions.assertEquals("PAR", resultado);
    }
    @Test
    public void testImpar() {
        parOuImpar = new ParOuImpar();
        int resultado = parOuImpar.parOuImpar(3);
        Assertions.assertEquals("IMPAR", resultado);
    }
}