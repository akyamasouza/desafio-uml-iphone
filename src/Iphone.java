public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("O aparelho está tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("O aparelho está em pausa");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música "+musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Página "+url+" está sendo aberta");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número "+numero);
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Adicione a sua mensagem ao Correio de Voz");
    }

}
