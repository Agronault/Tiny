package Comando;

import Variavel.Memoria;
import javax.swing.JOptionPane;

public class ComandoPopup extends Comando {
    private char destino;
    private String msg;

    public ComandoPopup(int linha, String msg, char destino){
        this.linha = linha;
        this.msg = msg;
        this.destino = destino;
    }

    public int executa(Memoria local, Memoria global){
        if(global.var[destino - 97]!=Double.NEGATIVE_INFINITY)
            global.var[destino - 97]= Double.parseDouble(JOptionPane.showInputDialog(this.msg));
        else
            local.var[destino - 97]= Double.parseDouble(JOptionPane.showInputDialog(this.msg));

    return linha+1;
    }
}
