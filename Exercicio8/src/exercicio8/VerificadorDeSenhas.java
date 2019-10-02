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
public class VerificadorDeSenhas {

    Dicionario dic;

    public VerificadorDeSenhas(Dicionario dic) {
        this.dic = dic;
    }

    private boolean range(char verificacao, char inicio, char fim) {
        if (verificacao >= inicio && verificacao <= fim) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarNovaSenha(String senhaFornecida) {
        //Verificar se é palavra reservada
        if (dic.getListaDeSenhasInvalidas().contains(senhaFornecida)) {
            return false;
        }

        //Verificando tamanho
        if (senhaFornecida.length() > 4 && senhaFornecida.length() < 11) {
            //Verificando primeiro caracter
            if (range(senhaFornecida.charAt(0), 'A', 'z') || senhaFornecida.charAt(0) == '_') //Verificando os demais
            {
                for (int roda = 1; roda < senhaFornecida.length(); roda++) {
                    if (!range(senhaFornecida.charAt(roda), '0', '9') && !range(senhaFornecida.charAt(roda), 'A', 'z') && senhaFornecida.charAt(roda) != '_') {
                        return false;
                    }
                }
            }

        } else {
            return false;
        }
        
        return true;
    }
}
