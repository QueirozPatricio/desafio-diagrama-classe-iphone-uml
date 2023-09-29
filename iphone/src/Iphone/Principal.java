
public class Principal {
    public static void main(String[] args) throws Exception {
        System.out.println("Tela Principal do Iphone!");

        //RepdorutorMusical
        ReprodutorMusical musica = new ReprodutorMusical("Giz", "Legião Urbana");
        System.out.println("Utilizando o reprodutor de música:");
        musica.tocar();
        musica.pausar();
        musica.selecionarMusica();
        System.out.println();

        //Telefone
        System.out.println("Utilizando o Telefone: ");
        Telefone telefone = new Telefone("Patrício", 999999990);
        telefone.atender();
        telefone.ligar();
        telefone.iniciarCorreioVoz();
        System.out.println();

        //Navegador de Internet
        System.out.println("Utilizando navegador de Internet: ");
        NavegadorInternet navegador = new NavegadorInternet("www.bandazepa.com.br");
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

    }    
}
