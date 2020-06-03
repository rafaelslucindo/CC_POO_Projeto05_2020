package br.com.rafaelbarao;

public class ValidacaoTexto {

    public static boolean validaTextoVazio(String texto)
    {
        if(texto.length() == 0)
            return false;
        else
            return true;
    }

    public static void validaTextoVazioPorExcecao(String texto) throws TextoVazioException
    {
        if(texto.length() == 0)
            throw new TextoVazioException();
    }
}
