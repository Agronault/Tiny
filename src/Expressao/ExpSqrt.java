package Expressao;

import Variavel.*;

public class ExpSqrt extends Expressao {

    String sqrt;

    public ExpSqrt(String sqrt) {
        this.sqrt = sqrt;
    }

    @Override
    public double avalia(Memoria local, Memoria global) {
        double valor;

        if (sqrt.charAt(0) >= 0 && sqrt.charAt(0) <= 9) {
            valor = Double.parseDouble(sqrt);
        } else {
            if(local.var[sqrt.charAt(0)-97] != Double.NEGATIVE_INFINITY){
             valor = local.var[sqrt.charAt(0)-97];
            }else{
             valor = global.var[sqrt.charAt(0)-97];
            }
        }

        return Math.sqrt(valor);
    }

}
