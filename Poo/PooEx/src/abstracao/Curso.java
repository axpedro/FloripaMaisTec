package abstracao;

import java.util.ArrayList;

public class Curso {

    public String Nome;
    public String Descricao;

    public ArrayList<String> Professores;

    public int CargaHoraria;

    public  void  Progresso(){

      System.out.println("Mostrtar progresso");

    }
    public void Notas(){
        System.out.println("Mostrar notas");

    }
    public void Participacao(){
        System.out.println("Mostrar participacao");
    }


}
