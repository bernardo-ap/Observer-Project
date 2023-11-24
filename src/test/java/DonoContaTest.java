import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DonoContaTest {
    @Test
    void deveNotificarUmDono() {
        Banco banco = new Banco("Banco ABC", 100);
        DonoConta donoA = new DonoConta("Dono 1");
        donoA.vincularConta(banco);
        banco.transacaoEnviada();
        assertEquals("Dono 1, transação lançada no Banco{nome=Banco ABC, valorContaAtual=100.0}", donoA.getUltimaNotificacao());
    }

    @Test
    void deveNotificarDoisDonos() {
        Banco banco = new Banco("Banco ABC", 100);
        DonoConta donoA = new DonoConta("Dono 1");
        DonoConta donoB = new DonoConta("Dono 2");
        donoA.vincularConta(banco);
        donoB.vincularConta(banco);
        banco.transacaoEnviada();
        assertEquals("Dono 1, transação lançada no Banco{nome=Banco ABC, valorContaAtual=100.0}", donoA.getUltimaNotificacao());
        assertEquals("Dono 2, transação lançada no Banco{nome=Banco ABC, valorContaAtual=100.0}", donoB.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarDono() {
        Banco banco = new Banco("Banco ABC", 100);
        DonoConta donoA = new DonoConta("Dono 1");
        banco.transacaoEnviada();
        assertEquals(null, donoA.getUltimaNotificacao());
    }


}