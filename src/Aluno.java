public class Aluno {
    private String nome;
    private int idade;
    private String materia;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getIdade() {
        return idade;
    }

    public String getMateria() {
        return materia;
    }

    public String getNome() {
        return nome;
    }
}
