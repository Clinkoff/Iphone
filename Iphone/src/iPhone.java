public class iPhone implements navegador.NavegadorInternet, telefone.AparelhoTelefonico, reprodutorMusical.ReprodutorMusical {
      @Override
    public void tocar() {
        System.out.println(" Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println(" Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println(" Selecionando: " + musica);
    }

    // Implementação do Aparelho Telefônico
    @Override
    public void ligar(String numero) {
        System.out.println(" Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println(" Chamada atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println(" Iniciando correio de voz...");
    }

    // Implementação do Navegador Internet
    @Override
    public void exibirPagina(String url) {
        System.out.println(" Acessando: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println(" Nova aba aberta");
    }

    @Override
    public void atualizarPagina() {
        System.out.println(" Página atualizada");
    }

    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        
        // Testando funcionalidades
        meuIphone.ligar("(11) 9876-5432");
        meuIphone.atender();
        meuIphone.selecionarMusica("Bohemian Rhapsody - Queen");
        meuIphone.tocar();
        meuIphone.exibirPagina("https://www.apple.com");
    }
}
