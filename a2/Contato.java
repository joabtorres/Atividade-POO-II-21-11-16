

/**
 * Contato
 *
 * Descricao: Classe refente aos dados do Contato
 *
 * @copyright (c) 21/11/2016, Joab Torres Alencar - Analista de Sistema
 */
public class Contato {

    private String nome;
    private String telefone;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * viewContato();
     *
     * Descrição: Método estático responsável exbir os dados referente ao Contato;
     *
     * @param contato - Referente ao objeto do endeço de memória instânciada de Contato;
     *
     */
    public static void viewContato(Contato contato) {
        System.out.println("Nome: " + contato.getNome());
        System.out.println("Telefone: " + contato.getTelefone());
        System.out.println("Email: " + contato.getEmail());
    }
}
