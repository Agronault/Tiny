package Expressao;

import Variavel.*;

public class ExpSqrt extends Expressao {

    String sqrt;

    public ExpSqrt(String sqrt) {
        this.sqrt = sqrt;
    }

    @Override
    public double avalia() {
        double valor;

        if (sqrt.charAt(0) >= 0 && sqrt.charAt(0) <= 9) {
            valor = Double.parseDouble(sqrt);
        } else {
            valor = Variaveis.var[sqrt.charAt(0) - 97];
        }

        return Math.sqrt(valor);
    }

}
