/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.xml.crypto.Data;

/**
 *
 * @author João Henrique
 */
public class aaaa {
    public static void main(String[] args) {
        Componente componente1 = new Componente();
        Componente data1 = new Componente();
        componente1.getUsoDiscoAtual();
      //  componente1.getMenorUsoCpu();
        //componente1.getMenorUsoDisco();
      //  componente1.getPorcentagemUsoDisco();
        System.out.println("aaa" + componente1.getIdentificacaoDaMaquina());
        System.out.println("bbb" + data1.getDataDaLeitura());
        System.out.println("disk" + componente1.getDiscoEmUsoAtual());
      
      
    }
    
}
