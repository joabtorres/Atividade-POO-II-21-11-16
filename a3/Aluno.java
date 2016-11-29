

/**
 * Aluno
 *
 * Descricao: Refere-se aos alunos presente nos cursos;
 *
 * @copyright (c) 28/11/2016, Joab Torres Alencar - Analista de Sistema
 */
public class Aluno {

    private String nome;
    private int matricula;
    private double notas[] = new double[4];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    /**
     * getMedia()
     *
     * Descrição: Funcão responsável para retorna o valor da média do aluno;
     *
     * @param aluno - refere-se ao espaço de mémoria armazenado do objeto aluno;
     * @return resultado - referente ao valor da média do aluno;
     */
    public double getMedia(Aluno aluno) {
        double resultado = 0;
        for (int i = 0; i < aluno.notas.length; i++) {
            resultado += aluno.notas[i];
        }
        resultado /= 4;
        return resultado;
    }
}
