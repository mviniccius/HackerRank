import org.example.banco.ContaBanco;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class ContaBancoTeste {

    private ContaBanco conta = new ContaBanco();
    @BeforeAll
    public void init(){
        conta.setStatus(true);
    }
    @Test
    public void foiDepositado(){
        float valor = 500;
        assertEquals(false,conta.depositar(500));
    }
}
