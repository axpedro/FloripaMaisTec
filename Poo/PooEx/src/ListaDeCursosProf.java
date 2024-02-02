import java.util.ArrayList;
import java.util.Scanner;
public class ListaDeCursosProf {


    public static void addCurso(Scanner scan , ArrayList<String>cursos){
        System.out.println("Diga o nome de um curso:");
        String curso = scan.next();
        cursos.add(curso);
        System.out.println("Curso: "+ curso +" adicionado");

    }

    public static void addProf(Scanner scan , ArrayList<String>professores){
        System.out.println("Diga o nome de um Professor:");
        String professor = scan.next();
        professores.add(professor);
        System.out.println("Professor: "+ professor +" adicionado");

    }

    public static void listarTudo(ArrayList<String>professores,ArrayList<String>cursos ) {
        for (int i = 0; i < professores.size(); i++) {
            String item = professores.get(i);
            System.out.println("Professor: " + i + " - " + item);

        }
        for (int i = 0; i < cursos.size(); i++) {
            String item = cursos.get(i);
            System.out.println("Curso: " + i + " - " + item);

        }
    }

    public static void listarProfessores(ArrayList<String>professores ) {
        for (int i = 0; i < professores.size(); i++) {
            String item = professores.get(i);
            System.out.println("Professor: " + i + " - " + item);

        }
    }
    public static void listarCursos(ArrayList<String>cursos ) {
        for (int i = 0; i < cursos.size(); i++) {
            String item = cursos.get(i);
            System.out.println("Curso: " + i + " - " + item);

        }
    }
     public static int retornaIndiceCurso(Scanner scan, ArrayList<String>cursos){
           listarCursos(cursos);

         System.out.println("Digite o indice que voce deseja");
         int indice = scan.nextInt();

            return indice;
        }
    public static int retornaIndiceProfessor(Scanner scan, ArrayList<String>professores){
        listarProfessores(professores);

        System.out.println("Digite o indice que voce deseja");
        int indice = scan.nextInt();

        return indice;
    }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> cursos = new ArrayList<>();
        ArrayList<String> professores = new ArrayList<>();
        int option = 9;

        do{
            System.out.println("Lista Cursos e Professores:");
            System.out.println("Digite 1 : para adicionar curso");
            System.out.println("Digite 2 : para adicionar Professor");
            System.out.println("Digite 3 : Listar tudo");
            System.out.println("Digite 4 : para remover Curso");
            System.out.println("Digite 5 : para remover Professor");
            System.out.println("Digite 0 : para Sair");
            option = scan.nextInt();
            if(option == 1){
                addCurso(scan, cursos);

            }
                else if(option ==2) {

                    addProf(scan, professores);
            }
                else if(option ==3){
                    listarTudo(professores, cursos);


            }



        }

        while(option != 0);
    listarTudo(professores, cursos);
    }
}
