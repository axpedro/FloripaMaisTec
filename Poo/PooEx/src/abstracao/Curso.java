package abstracao;

import java.util.ArrayList;

public class Curso {

    public String nome;
    public String descricao;

    public ArrayList<String> professores;

    public int cargaHoraria;

    public  void  progresso(){

      System.out.println("Mostrar progresso");

    }
    public void notas(){
        System.out.println("Mostrar notas");

    }
    public void participacao(){
        System.out.println("Mostrar participacao");
    }


}
