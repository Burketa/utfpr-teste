/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8;

/**
 *
 * @author Aluno
 */
public class Desconto {

    public int checkDesconto(boolean novo, boolean fidelidade, boolean cupom) {
        int desconto = 0;

        if (novo && fidelidade) {
            return -1;
        } else {
            if(novo)
                desconto += 15;
            else if(fidelidade)
                desconto += 10;
            if(cupom)
                desconto += 20;
        }
        return desconto;
    }
}
