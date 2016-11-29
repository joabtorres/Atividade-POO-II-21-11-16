

/**
 * Mamifero [Filha de Animal]  - 
 * Descricao: Está classe é referência para animais Mamiferos;
 *
 * @copyright (c) 21/11/2016, Joab Torres Alencar - Analista de Sistema
 */
public class Mamifero extends Animal {

    private String alimento;

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Mamifero() {
        this.setAmbiente("Terra");
    }
}
