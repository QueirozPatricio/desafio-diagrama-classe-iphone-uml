public class ReprodutorMusical {
    //atributos
    private String nomeMusica;
    private String nomeArtista;  
    public ReprodutorMusical(String nomeMusica, String nomeArtista) {
        this.nomeMusica = nomeMusica;
        this.nomeArtista = nomeArtista;
    }
    public String getNomeMusica() {
        return nomeMusica;
    }
    public String getNomeArtista() {
        return nomeArtista;
    }
    
    public void tocar(){
        System.out.println("Tocando a música " + getNomeMusica()+ " de "+ getNomeArtista() );
    }

    public void pausar() {
        System.out.println("Música Pausada");
    }

    public void selecionarMusica() {
        System.out.println("Selecione a música: ");
    }
    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }
    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }
}
