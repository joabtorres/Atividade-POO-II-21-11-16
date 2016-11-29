

/**
 * Peixe [Filha de Animal] 
 * Descricao: Está Classe é referência para animais do tipo peixe
 *
 * @copyright (c) 21/11/2016, Joab Torres Alencar - Analista de Sistema
 */
public class Peixe extends Animal{

    private String caracteristicas;
    public Peixe(){
        this.setNumPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzento");
        this.setCaracteristicas("Barbatanas e cauda");
    }
    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
}
