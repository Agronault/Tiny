package Comando;

public class ComandoEndw extends Comando {

    int linhaW;

    public ComandoEndw(int lin, int linW) {
        linha = lin;
        linhaW = linW;
    }

    @Override
    public int executa() {
        return linhaW;
    }
}
