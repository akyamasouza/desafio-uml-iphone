public class TesteIphone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.ligar("95991297787");
        iphone.iniciarCorreioVoz();
        iphone.atender();

        iphone.exibirPagina("google.com.br");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Bleach Opening 05");
    }
}
