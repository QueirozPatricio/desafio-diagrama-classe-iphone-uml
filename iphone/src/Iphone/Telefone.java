public class Telefone {
    private String contato;
    private int numero;
    public Telefone(String contato, int numero) {
        this.contato = contato;
        this.numero = numero;
    }
    public String getContato() {
        return contato;
    }

    public int getNumero() {
        return numero;
    }
    
    public void ligar() {
        System.out.println("Realizando chamada para: " + getContato() + " - " +getNumero());
    }

    public void atender() {
        System.out.println("Recebendo ligação!" + getContato() + " - " +getNumero());
    }

    public void iniciarCorreioVoz() {
        System.out.println("Realizando correio de Voz!" + getContato() + " - " +getNumero());
    }
}
