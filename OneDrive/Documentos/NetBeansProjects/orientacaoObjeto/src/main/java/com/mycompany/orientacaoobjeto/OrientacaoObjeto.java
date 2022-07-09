/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.orientacaoobjeto;

import javax.swing.JOptionPane;

/**
 *
 * @author marci
 */
public class OrientacaoObjeto {

    public static void main(String[] args) {
        primeiroNome Nome = new primeiroNome();
        Nome.setName("Márcio");
        JOptionPane.showMessageDialog(null,"Meu nome é :" + Nome.getName());
    }
}
