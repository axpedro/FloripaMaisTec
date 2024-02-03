import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCursosProf {


    public static void addCurso(Scanner scan, ArrayList<String> cursos) {
        System.out.println("Diga o nome de um curso:");
        String curso = scan.next();
        cursos.add(curso);
        System.out.println("Curso: " + curso + " adicionado");

    }

    public static void addProf(Scanner scan, ArrayList<String> professores) {
        System.out.println("Diga o nome de um Professor:");
        String professor = scan.next();
        professores.add(professor);
        System.out.println("Professor: " + professor + " adicionado");

    }

    public static void listarTudo(ArrayList<String> professores, ArrayList<String> cursos) {
        for (int i = 0; i < professores.size(); i++) {
            String item = professores.get(i);
            System.out.println("Professor: " + i + " - " + item);

        }
        for (int i = 0; i < cursos.size(); i++) {
            String item = cursos.get(i);
            System.out.println("Curso: " + i + " - " + item);

        }
    }

    public static void listarProfessores(ArrayList<String> professores) {
        for (int i = 0; i < professores.size(); i++) {
            String item = professores.get(i);
            System.out.println("Professor: " + i + " - " + item);

        }
    }

    public static void listarCursos(ArrayList<String> cursos) {
        for (int i = 0; i < cursos.size(); i++) {
            String item = cursos.get(i);
            System.out.println("Curso: " + i + " - " + item);

        }
    }

    public static int retornaIndiceCurso(Scanner scan, ArrayList<String> cursos) {
        listarCursos(cursos);

        System.out.println("Digite o indice que voce deseja manipular:");
        int indice = scan.nextInt();

        return indice;
    }


    public static void removerItemLista(Scanner scan, ArrayList<String> cursos) {

        int indicee = retornaIndiceCurso(scan, cursos);
        removerItemCurso(indicee, cursos);

    }

    public static void removerItemCurso(int indice, ArrayList<String> cursos) {
        System.out.println("Item removido: " + cursos.get(indice));
        cursos.remove(indice);


    }

    public static void marcarComoConcluido(Scanner scan, ArrayList<String> cursos, ArrayList<String> cursosConcluidos) {
        int retorno = retornaIndiceCurso(scan, cursos);

        cursosConcluidos.add(cursos.get(retorno));
        //System.out.println("Curso " + cursosConcluidos.get(retorno) + "marcado como concluído" );
        removerItemCurso(retorno, cursos);

    }

    public static void listarCursosConcluidos(ArrayList<String> cursosConcluidos) {
        for (int i = 0; i < cursosConcluidos.size(); i++) {
            String item = cursosConcluidos.get(i);
            System.out.println("Cursos concluidos: " + i + " - " + item);

        }
    }


    public static int retornaIndiceProfessor(Scanner scan, ArrayList<String> professores) {
        listarProfessores(professores);

        System.out.println("Digite o indice que voce deseja manipular:");
        int indice = scan.nextInt();

        return indice;
    }

    public static void removerItemListaProf(Scanner scan, ArrayList<String> professores) {

        int indicee = retornaIndiceProfessor(scan, professores);
        removerItemProfessor(indicee, professores);

    }

    public static void removerItemProfessor(int indice, ArrayList<String> professores) {

        professores.remove(indice);

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> cursos = new ArrayList<>();
        ArrayList<String> professores = new ArrayList<>();
        ArrayList<String> cursosConcluidos = new ArrayList<>();
        int option = -1;

        do {
            System.out.println("-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");

            System.out.println("#   Lista Cursos e Professores    #");
            System.out.println();
            System.out.println("Digite 1 : Adicionar um Curso ou Professor");
            System.out.println("Digite 2 : Listar Cursos e Professores");
            System.out.println("Digite 3 : Remover um Curso ou Professor");
            System.out.println("Digite 4 : Lista com indice de  Professor");
            System.out.println("Digite 5 : Lista com indice de  Curso");
            System.out.println("Digite 6 : Marcar curso como concluído");
            System.out.println("Digite 7 : Listar cursos concluídos");


            System.out.println("Digite 0 : para Sair");
            option = scan.nextInt();
            if (option == 1) {

                System.out.print("Digite 1 para adicionar Curso ou 2 para adicionar Professor:");
                int escolha = scan.nextInt();
                switch (escolha) {

                    case 1:
                        addCurso(scan, cursos);
                        break;

                    case 2:
                        addProf(scan, professores);
                        break;
                }
            }  else if (option == 2) {
                listarTudo(professores, cursos);


            } else if (option == 3) {
                System.out.print("Digite 1 para remover Curso ou 2 para remover Professor:");
                int escolha = scan.nextInt();
                switch (escolha) {

                    case 1:
                        removerItemLista(scan, cursos);
                        break;

                    case 2:
                        removerItemListaProf(scan, professores);
                        break;
                }


            }  else if (option == 4) {
                retornaIndiceProfessor(scan, professores);

            } else if (option == 5) {
                retornaIndiceCurso(scan, cursos);

            } else if (option == 6) {
                marcarComoConcluido(scan, cursos, cursosConcluidos);
            } else if (option == 7) {
                listarCursosConcluidos(cursosConcluidos);
            }

        }

        while (option != 0);
        listarTudo(professores, cursos);
    }
}
