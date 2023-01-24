package DataObjects;

import Conta.Conta;
import Exceptions.SenhaIncorretaException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TransacaoBancaria{

    private Conta conta;
    private int valorTransacao;
    private int tipoDaTransacao;//1 saque; 2 deposito; 3 consultar saldo; 4 efetuar pagamento
    private String dataDaTransacao;
    private String canalPorOndeFoiFeita;

    public TransacaoBancaria(Conta conta, int valorTransacao, int tipoDaTransacao, String dataDaTransacao, String canalPorOndeFoiFeita) {
        this.conta = conta;
        this.valorTransacao = valorTransacao;
        this.tipoDaTransacao = tipoDaTransacao;
        this.dataDaTransacao = dataDaTransacao;
        this.canalPorOndeFoiFeita = canalPorOndeFoiFeita;
    }

    public int getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(int valorTransacao) {
        this.valorTransacao = valorTransacao;
    }

    public String getDataDaTransacao() {
        return dataDaTransacao;
    }

    public void setDataDaTransacao(String dataDaTransacao) {
        this.dataDaTransacao = dataDaTransacao;
    }

    public String getCanalPorOndeFoiFeita() {
        return canalPorOndeFoiFeita;
    }

    public void setCanalPorOndeFoiFeita(String canalPorOndeFoiFeita) {
        this.canalPorOndeFoiFeita = canalPorOndeFoiFeita;
    }
}
