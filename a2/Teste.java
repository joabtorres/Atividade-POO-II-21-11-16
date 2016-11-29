

import java.util.Scanner;

/**
 * Teste 
 *
 * Descricao: Classe Teste é responsável para executa a aplicação, pois possui o método MAIN()
 *
 * @copyright (c) 21/11/2016, Joab Torres Alencar - Analista de Sistema
 */
public class Teste {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        Agenda agenda = new Agenda();
        System.out.print("Nome da Agenda: ");
        agenda.setNomeAgenda(read.nextLine());

        Contato listContato[] = new Contato[3];
        int count = 0;
        while (count < listContato.length) {
            Contato contato = new Contato();
            System.out.print("Nome: ");
            contato.setNome(read.nextLine());
            System.out.print("Telefone: ");
            contato.setTelefone(read.nextLine());
            System.out.print("Email: ");
            contato.setEmail(read.nextLine());
            listContato[count] = contato;
            count++;
        }
        
        agenda.setContato(listContato);
        
        System.out.println("----------------");
        System.out.println("Nome da Agenda: " + agenda.getNomeAgenda());
        agenda.viewAgenda();
        System.out.println("-------------------");

        Contato.viewContato(agenda.getContato()[0]);
    }
}
