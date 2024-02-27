import java.util.Scanner;
public class App {
    public static void main(String[] args) {
       Aluno aluno[] = new Aluno[3];
        aluno[0] = new Aluno();
        aluno[1] = new Aluno();
        aluno[2] = new Aluno();



        for (int i = 0; i < 3; i++) {
            Scanner input = new Scanner(System.in);

            System.out.println("Digite o nome do Aluno: ");
            String inputName1 = input.nextLine();
            aluno[i].setNome(inputName1);

            System.out.println("Digite a idade do Aluno: ");
            int inputidade1 = input.nextInt();
            aluno[i].setIdade(inputidade1);
            input.nextLine();

            System.out.println("Digite a materia do Aluno: ");
            String inputMateria1 = input.nextLine();
            aluno[i].setMateria(inputMateria1);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("===============");
            System.out.println("Nome: " + aluno[i].getNome());
            System.out.println("Idade: " + aluno[i].getIdade());
            System.out.println("Matéria: " + aluno[i].getMateria());
            System.out.println("===============");

        }

    }
}
