import java.util.Observable;
import java.util.Observer;

public class DonoConta implements Observer {

    private String numConta;
    private String ultimaNotificacao;

    public DonoConta(String numConta){
        this.numConta = numConta;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void vincularConta(Banco banco) {
        banco.addObserver(this);
    }

    public void update(Observable banco, Object arg1) {
        this.ultimaNotificacao = this.numConta + ", transação lançada no " + banco.toString();
        // System.out.println(this.ultimaNotificacao);
    }
}
