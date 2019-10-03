package Comando;

import Variavel.*;
import java.io.*;  
import java.util.*;

import lp.*; 
import tiny.ConsoleColors;

class ComandoWriteColor extends Comando {
   
   String texto;
   String cor;
      
   ComandoWriteColor(int lin, String txt, String color) {
      linha = lin;
      texto = txt;
      cor=color;
   }
   
   public int executa(Memoria local, Memoria global) {
       
       
       if(cor.equals("default") || cor.equals("d")){
           switch(Variaveis.colorset){
           case "red":
           case "r":
               System.out.printf(ConsoleColors.RED+ texto);
               break;
           case "green":
           case "g":
               System.out.printf(ConsoleColors.GREEN+ texto);
               break;
           case "blue":
           case "b":
               System.out.printf(ConsoleColors.BLUE+ texto);
               break;
            case "black":
            case "k":
               System.out.printf(ConsoleColors.BLACK+ texto);
               break;
            case "yellow":
            case "y":
               System.out.printf(ConsoleColors.YELLOW+ texto);
               break;
            case "purple":
            case "p":
               System.out.printf(ConsoleColors.PURPLE+ texto);
               break;
            case "white":
            case "w":
               System.out.printf(ConsoleColors.WHITE+ texto);
               break;
            case "cyan":
            case "c":
                System.out.printf(ConsoleColors.CYAN+ texto);
                break;
           default:
               System.out.printf(ConsoleColors.BLACK+ texto);
       }
       }else
       switch(cor){
           case "red":
           case "r":
               System.out.printf(ConsoleColors.RED+ texto);
               break;
           case "green":
           case "g":
               System.out.printf(ConsoleColors.GREEN+ texto);
               break;
           case "blue":
           case "b":
               System.out.printf(ConsoleColors.BLUE+ texto);
               break;
            case "black":
            case "k":
               System.out.printf(ConsoleColors.BLACK+ texto);
               break;
            case "yellow":
            case "y":
               System.out.printf(ConsoleColors.YELLOW+ texto);
               break;
            case "purple":
            case "p":
               System.out.printf(ConsoleColors.PURPLE+ texto);
               break;
            case "white":
            case "w":
               System.out.printf(ConsoleColors.WHITE+ texto);
               break;
            case "cyan":
            case "c":
                System.out.printf(ConsoleColors.CYAN+ texto);
                break;
           default:
               System.out.printf(ConsoleColors.BLACK+ texto);
       }
      return linha+1;
   }
}