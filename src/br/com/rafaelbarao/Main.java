package br.com.rafaelbarao;

public class Main {
    private static Console consoleNull = null;

    public static void main(String[] args) {
        try {
            ValidacaoTexto.validaTextoVazioPorExcecao("");
        } catch (TextoVazioException e) {
            e.printStackTrace();
        }
        Console console = new Console();
        do {
            try {
                console.escreveConsole("DENTRO DO BLOCO TRY");
                console.escreveConsole("ESCREVA UM TEXTO");
                String texto = console.leLinhaTexto();

                boolean validacao = ValidacaoTexto.validaTextoVazio(texto);
                if (!validacao)
                    console.escreveConsole("TEXTO ESTÁ VAZIO");

                ValidacaoTexto.validaTextoVazioPorExcecao(texto);

                char[] arrayDoTextp = texto.toCharArray();
                //
                console.escreveConsole("POSICAO 10 DO TEXTO É " + String.valueOf(arrayDoTextp[10]));
                //
                consoleNull.leLinhaTexto();
                //
            } catch (NullPointerException ex) {
                console.escreveConsole("EXISTE UM OBJETO NULL");
            } catch (ArrayIndexOutOfBoundsException ex) {
                console.escreveConsole("Texto possui menos de 11 caracteres");
            } catch (TextoVazioException ex) {
                console.escreveConsole("TEXTO ESTÁ VAZIO EXCECAO");
                console.escreveConsole(ex.getMensagemCustomizada());
            } catch (Exception ex) {
                console.escreveConsole("OCORREU UM ERRO INESPERADO");
            } finally {
                console.escreveConsole("FINALIZOU OS COMANDOS ");
            }
        } while (true);
        //console.escreveConsole("OCORREU UMA EXCEÇÃO " + ex.toString());
    }
}
