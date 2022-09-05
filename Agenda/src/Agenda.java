/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luiz.seibel
 */
public class Agenda {
    int dia;
    int mes;
    int ano;
    String anotacao;
    
    void anotar(int d, int m, String nota) {
        dia=d;
        mes=m;
        anotacao=nota;
    }
    void validaData(){
        if ((dia<1)||(dia>31)||(mes>12)) {
            dia=0;
            mes=0;
            anotacao = "Anotação não inserida devido a data inválida";
        }
    }
    void mostrarAnotacao(){
        System.out.println(dia+"/"+mes+" : "+anotacao);
    }
}
