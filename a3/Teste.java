

import java.util.Scanner;

/**
 * Teste
 *
 * Descricao: Classe responsável para execução do projeto, pois possui o método MAIN;
 *
 * @copyright (c) 28/11/2016, Joab Torres Alencar - Analista de Sistema
 */
public class Teste {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
	
        Curso curso = new Curso();
        System.out.print("Nome do Curso: ");
        curso.setNome(read.nextLine());
        System.out.print("Horário do Curso: ");
        curso.setHorario(read.nextLine());

        Professor professor = new Professor();
        System.out.print("Nome do Professor: ");
        professor.setNome(read.nextLine());
        System.out.print("Departamento do Professor: ");
        professor.setDepartamento(read.nextLine());
        System.out.print("E-mail do Professor: ");
        professor.setEmail(read.nextLine());

        curso.setProfessor(professor);

        Aluno alunos[] = new Aluno[5];
        int numAluno = 1;
        for (int i = 0; i < 5; i++) {
			Scanner sc = new Scanner(System.in);
            Aluno aluno = new Aluno();
            System.out.print("Nome do Aluno " + numAluno + ": ");
            aluno.setNome(sc.nextLine());
            System.out.print("Número da MATRICULA do Aluno " + numAluno + ": ");
            aluno.setMatricula(read.nextInt());
            double notas[] = new double[4];

            for (int j = 0; j < 4; j++) {
                System.out.print((j + 1) + "ª nota do Aluno " + numAluno + ": ");
                notas[j] = read.nextDouble();
            }
            aluno.setNotas(notas);
            alunos[i] = aluno;

            numAluno++;
        }
        
        curso.setAlunos(alunos);

        curso.viewAllCurso();
    }
}
