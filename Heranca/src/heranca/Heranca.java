/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author luiz.seibel
 */
public class Heranca {
    public static void main(String[] args) {
        Automovel carro = new Automovel();
        Automovel moto = new Automovel();
        
        carro.setNumPlaca("GRO 9565");
        carro.setNumPlaca("3");
        carro.setNumRodas(4);
        carro.setCapacidade(5);
        carro.setNumPortas(4);
        
        carro.ImprimeDadosCarro();
        
        
    }
}
