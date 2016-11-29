

/**
 * Curso
 *
 * Descricao: Referente aos cursos do projeto
 *
 * @copyright (c) 28/11/2016, Joab Torres Alencar - Analista de Sistema
 */
public class Curso {

    private String nome;
    
    //Array dos alunos matriculados no curso;
    private Aluno alunos[];
    
    //Endreço de memória do Professor ministrante do Curso;
    private Professor professor;

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    private String horario;

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * viewAllCurso()
     *
     * Descrição: Exibe todos os campos referente ao curso, como por exemplo, dados do curso, dados do professor, dados do alunos é média da turma
     *
     */
    public void viewAllCurso() {
        System.out.println("-------SOBRE O CURSO ----------");
        System.out.println("Curso: " + this.getNome());
        System.out.println("Horário: " + this.getHorario());
        
        System.out.println("-------SOBRE O PROFESSOR ----------");
        System.out.println("Professor: " + this.professor.getNome());
        System.out.println("Departamento: " + this.professor.getDepartamento());
        System.out.println("E-mail: " + this.professor.getEmail());
        System.out.println("-------SOBRE OS ALUNOS ----------");

        double MediaDaTurma = 0;
        for (int i = 0; i < this.getAlunos().length; i++) {
            System.out.println("Nome: " + this.getAlunos()[i].getNome());
            System.out.println("Matricula: " + this.getAlunos()[i].getMatricula());
            System.out.println("- NOTAS -");
            System.out.println("1ª: " + this.getAlunos()[i].getNotas()[0]);
            System.out.println("2ª: " + this.getAlunos()[i].getNotas()[1]);
            System.out.println("3ª: " + this.getAlunos()[i].getNotas()[2]);
            System.out.println("4ª: " + this.getAlunos()[i].getNotas()[3]);
            System.out.println("Média: " + this.getAlunos()[i].getMedia(this.getAlunos()[i]));
            if (this.getAlunos()[i].getMedia(this.getAlunos()[i]) >= 7) {
                System.out.println("Aluno APROVADO!");
            } else {
                System.out.println("Aluno REPROVADO!");
            }
            MediaDaTurma += this.getAlunos()[i].getMedia(this.getAlunos()[i]);
            System.out.println("-------------------");
        }
        
        MediaDaTurma /= this.getAlunos().length;
        System.out.printf("MÉDIA DA TURMA: %.2f",MediaDaTurma);
    }

}
