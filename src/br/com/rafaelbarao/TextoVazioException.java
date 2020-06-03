package br.com.rafaelbarao;

public class TextoVazioException extends Exception
{
    private String mensagemCustomizada = "NÃO IMPLEMENTADO";

    public TextoVazioException()
    {
        super("TEXTO ESTA VAZIO");
    }

    public String getMensagemCustomizada() {
        return mensagemCustomizada;
    }

    public void setMensagemCustomizada(String mensagemCustomizada) {
        this.mensagemCustomizada = mensagemCustomizada;
    }
}
