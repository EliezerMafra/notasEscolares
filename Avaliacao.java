package projetoStraus;

import java.util.Date;
import java.io.File;

public class Avaliacao {

    private int codigoAvaliacao;
    private int valor;
    private Date dataAplicacao;
    private File arquivo;

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

    public File getArquivo() {
        return arquivo;
    }

    public void setArquivo(File arquivo) {
        this.arquivo = arquivo;
    }

    public void uploadDocumento(File arquivo){
        setArquivo(File arquivo);
    }

    public void editarDocumento(File arquivo){
    }

    public void removerDocumento(File arquivo){
    }



}
