import java.util.Observable;

public class Banco extends Observable {

    private String nome;
    private float valorContaAtual;


    public Banco(String nome, float valorContaAtual){
        this.nome = nome;
        this.valorContaAtual = valorContaAtual;
    }

    public void transacaoEnviada(){
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome=" + nome +
                ", valorContaAtual=" + valorContaAtual +
                '}';
    }
}
