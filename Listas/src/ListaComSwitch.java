import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaComSwitch {

    public static void verLista(List<String> listaCompras) {
        for (int i = 0; i < listaCompras.size(); i++) {
            String item = listaCompras.get(i);
            System.out.println(i + " - " + item);

        }
    }

    public static void adicionarLista(Scanner entrada, List<String> listaCompras) {
        System.out.print("Informe o item: ");
        String item = entrada.next();
        listaCompras.add(item);
    }
//    public static void removerItemId(Scanner entrada, List<String> listaCompras){
//        System.out.print("Informe o id do item: ");
//        int item = entrada.nextInt();
//        listaCompras.remove(item);
//        verLista(listaCompras);


     public static void remover(Scanner entrada, List<String> listaCompras) {
         System.out.print("Informe o nome do item: ");
         String item = entrada.nextLine();


             if (listaCompras.contains(item)) {
                 listaCompras.remove(item);
                 System.out.println("Produto removido pelo nome");

             }
             else{
                 System.out.print("Produto nao encontrado");

             }




     }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<String> listaCompras = new ArrayList<>();
        listaCompras.add("Feijão");
        listaCompras.add("Arroz");
        listaCompras.add("Batata");
        listaCompras.add("Macarrão");
        listaCompras.add("Requeijão");
        listaCompras.add("Leite");
        listaCompras.add("Limão");
        listaCompras.add("Laranja");
        listaCompras.add("Goiaba");
        listaCompras.add("Manjericão");

        System.out.println("Bem vindo à lista de compras");

        do {

            System.out.print("Deseja (v)er | (a)dicionar | (r)emover | (s)air: ");
            String opcao = entrada.nextLine();

            /** DESAFIO: Converter IFs para SWITCH */

            switch (opcao) {

                case "v":
                    verLista(listaCompras);
                    break;
                case "s":
                    break;

                case "a":
                    adicionarLista(entrada, listaCompras);
                    break;

                case "r":

                    remover(entrada, listaCompras);
                    // removerItemId(entrada, listaCompras);
                    break;

                //System.out.print("Informe o indice: ");
                //int indice = entrada.nextInt();
                //listaCompras.remove(indice);
                //break;

            }


        } while (true);

    }
}

