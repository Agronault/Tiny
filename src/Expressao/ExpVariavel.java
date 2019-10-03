   package Expressao;

   import Variavel.*;

    public class ExpVariavel extends Expressao{
   
      char variavel;
   	
       public ExpVariavel(char nomevar) {
         variavel= nomevar;
      }
   
      @Override
       public double avalia(Memoria local, Memoria global) {
           
         if(local.var[variavel-97] != Double.NEGATIVE_INFINITY){
             return local.var[variavel-97];
         }else{
             return global.var[variavel-97];
         }
      }
      
   }