   package Comando;
 
 	import Variavel.*;
 
   public class ComandoEndfor extends Comando {
   
		int linhaFor;
		char variavel;
		String tipo;
		
       public ComandoEndfor(int lin, int linFor, char var, String tipo) {
         this.linha=lin;
         this.linhaFor=linFor;
         this.variavel=var;
         this.tipo=tipo;
      }
   
       public int executa() {

        if(tipo.equalsIgnoreCase("downto")){
          Variaveis.var[variavel-97]--;
        }else{
          Variaveis.var[variavel-97]++;
        }
        
        return linhaFor;

      }
   }