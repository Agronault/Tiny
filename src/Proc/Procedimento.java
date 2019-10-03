package Proc;

import Variavel.*;
import Comando.*;
import java.util.*;

public class Procedimento {

    String nome;            		  // nome do procedimento  
    Vector comandos;    		  // vetor de comandos 
    String[] parametros;		  // parametros formais 
    String[] variaveisLocal;		  // variaveis local
    static Memoria global = new Memoria();// variaveis globais

    public Procedimento(String n, String[] p) {
        nome = n;
        parametros = p;
    }

    public String getNome() {
        return nome;
    }

    public static void setVariaveisGlobal(String[] vG) {
        char var;
        for (int i = 0; vG[i] != null; i++) {
            global.var[vG[i].charAt(0) - 97] = 0;
        }
    }

    public void setVariaveisLocal(String[] vL) {
        this.variaveisLocal = vL;
    }

    public void setListaComandos(Vector c) {
        this.comandos = c;
    }

    public void executa(double[] argumentos) {
        Memoria local = new Memoria(); 	// variaveis local
        char var;

        // adiciona variaveis locais na memoria local
        if(this.variaveisLocal != null){
            for (int i = 0; this.variaveisLocal[i] != null; i++) {
                local.var[this.variaveisLocal[i].charAt(0) - 97] = 0;
            }
        }
        
        if(this.parametros != null){
            for (int i = 0; this.parametros[i] != null; i++) {
                local.var[parametros[i].charAt(0) - 97] = argumentos[i];
            }
        }
        
        
        // associa argumentos a seus respectivos parametros formais
        int pc = 0;
        do {
            pc = ((Comando) comandos.elementAt(pc)).executa(local, global);
        } while (pc < comandos.size());
    }

}
