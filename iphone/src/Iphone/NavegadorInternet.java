public class NavegadorInternet {
    //atributo
    private String site;

    public NavegadorInternet(String site) {
        this.site = site;
    }

    public String getSite() {
        return site;
    }

    public void exibirPagina() {
        System.out.println("Exibindo a página do site: " + getSite());
    }

    public void adicionarNovaAba() {
        System.out.println("Exibindo nova aba!");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página do site: " + getSite());
    }
}
