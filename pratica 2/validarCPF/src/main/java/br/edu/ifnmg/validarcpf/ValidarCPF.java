/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.validarcpf;

import java.util.Scanner;

/**
 *
 * @author Caio Veloso  &lt;caio.veloso at ifnmg.edu.br&gt;
 */
public class ValidarCPF {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um CPF para validar: ");
        String cpf = scanner.nextLine();

        boolean Validacao = Util.validarCPF(cpf);
        if (Validacao) {
            System.out.println("CPF válido: " + cpf);
        } 
        else {
            System.out.println("CPF inválido: " + cpf);
        }
    }
}

