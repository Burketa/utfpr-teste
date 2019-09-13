/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathops;

/**
 *
 * @author burca
 */
public class MathOps {

    public int fatorial(int n) {
        return n > 1 ? n * fatorial(n - 1) : 1;
    }

    public boolean ehPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
