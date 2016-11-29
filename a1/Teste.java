

/**
 * Teste
 *
 * Descricao: Classe Teste é responsável para executa a aplicação, pois possui o método MAIN()
 *
 * @copyright (c) 21/11/2016, Joab Torres Alencar - Analista de Sistema
 */
public class Teste {

    public static void main(String[] args) {
        Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setComprimento(2);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2);

        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);

        Mamifero urso = new Mamifero();
        urso.setNome("Urso-do-canada");
        urso.setComprimento(180);
        urso.setCor("Vermelho");
        urso.setVelocidade(0.5);
        urso.setAlimento("Mel");

        System.out.println("Zoo: ");

        System.out.println("-----------------------------------------");
        System.out.println("Animal: " + camelo.getNome());
        System.out.println("Comprimento: " + camelo.getComprimento() + " metros");
        System.out.println("Patas: " + camelo.getNumPatas());
        System.out.println("Cor: " + camelo.getCor());
        System.out.println("Amibiente: " + camelo.getAmbiente());
        System.out.println("Velocidade: " + camelo.getVelocidade() + " m/s");
        System.out.println("-----------------------------------------");

        System.out.println("Animal: " + tubarao.getNome());
        System.out.println("Comprimento: " + tubarao.getComprimento() + " centimetros");
        System.out.println("Patas: " + tubarao.getNumPatas());
        System.out.println("Cor: " + tubarao.getCor());
        System.out.println("Amibiente: " + tubarao.getAmbiente());
        System.out.println("Velocidade: " + tubarao.getVelocidade() + " m/s");
        System.out.println("Caracteristica: " + tubarao.getCaracteristicas());

        System.out.println("-----------------------------------------");
        System.out.println("Animal: " + urso.getNome());
        System.out.println("Comprimento: " + urso.getComprimento() + " centimetros");
        System.out.println("Patas: " + urso.getNumPatas());
        System.out.println("Cor: " + urso.getCor());
        System.out.println("Amibiente: " + urso.getAmbiente());
        System.out.println("Velocidade: " + urso.getVelocidade() + " m/s");
        System.out.println("Alimento: " + urso.getAlimento());
        System.out.println("-----------------------------------------");
    }
}
