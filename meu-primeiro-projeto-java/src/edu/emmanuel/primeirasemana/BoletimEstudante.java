package edu.emmanuel.primeirasemana;

public class BoletimEstudante {
    public static void main(String[] args) {
        int mediaFinal = 6;
        
        if(mediaFinal<6)
            System.out.println("REPROVADO");
        else if (mediaFinal==6) 
            System.out.println("PROVA RECUPERAÇÃO!");
        else
            System.out.println("APROVADO!");
        
    }
}
