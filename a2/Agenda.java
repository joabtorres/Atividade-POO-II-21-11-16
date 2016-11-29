

/**
 * Agenda 
 * 
 * Descricao: Classe referente a Agenda dos contatos;
 *
 * @copyright (c) 21/11/2016, Joab Torres Alencar - Analista de Sistema
 */
public class Agenda {

    private String nomeAgenda;
    private Contato contato[];

    public Contato[] getContato() {
        return contato;
    }

    public void setContato(Contato[] contato) {
        this.contato = contato;
    }

    public String getNomeAgenda() {
        return nomeAgenda;
    }

    public void setNomeAgenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    /**
     * ViewAgenda() -
     *
     * Descrição: Responsável para exbir alista de contatos na agenda;
     * 
     */

    public void viewAgenda() {
        for (int i = 0; i < this.contato.length; i++) {
            Contato.viewContato(contato[i]);
        }
    }
}
