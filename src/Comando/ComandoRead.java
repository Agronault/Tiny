package Comando;

import java.io.*;
import java.util.*;
import Variavel.*;

import lp.*;

public class ComandoRead extends Comando {

    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    char variavel;

    public ComandoRead(int lin, String txt) {
        linha = lin;
        variavel = txt.charAt(0);
    }

    public int executa(Memoria local, Memoria global) {

        if (local.var[variavel - 97] != Double.NEGATIVE_INFINITY) {
            try {
                local.var[(int) variavel - 97] = Float.parseFloat(teclado.readLine());
            } catch (Exception e) {
                System.out.println("ERRO: " + e);
            }
        } else {
            try {
                global.var[(int) variavel - 97] = Float.parseFloat(teclado.readLine());
            } catch (Exception e) {
                System.out.println("ERRO: " + e);
            }
        }

        return linha + 1;
    }
}
