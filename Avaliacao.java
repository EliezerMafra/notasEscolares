import java.util.Date;
import java.io.File;

public class Avaliacao {

    private int codigoAvaliacao;
    private int valor;
    private Date dataAplicacao;
    private FILE arquivo;

    public avaliacao(){}

    public int getCodigoAvaliacao() {
        return codigoAvaliacao;
    }

    public void setCodigoAvaliacao(int codigoAvaliacao) {
        this.codigoAvaliacao = codigoAvaliacao;
    }

    public Date getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(Date dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public FILE getArquivo() {
        return arquivo;
    }

    public void setArquivo(FILE arquivo) {
        this.arquivo = arquivo;
    }

    public void uploadDocumento(FILE arquivo){
        setArquivo(FILE arquivo);
    }

    public void editarDocumento(FILE arquivo){
    }

    public void removerDocumento(FILE arquivo){
    }



}