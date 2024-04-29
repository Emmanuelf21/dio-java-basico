package edu.teste.segundasemana;
public class MinhaClasse {
    public static void main(String[] args) {
        /* Classe Principal */
        /*final String BR = "Brasil";//final não permite alterar a variável, se a variável for em letra maiuscula também
        int ano = 2023;
        ano = 2024;
        double PI = 3.14;
        int ANO$2000 = 2000;
        
        System.out.println(BR);
        */
        int numero = soma(3,5);
        String nomeCompleto = nomeCompleto("Emmanuel", "Franco");

        System.out.println(nomeCompleto+ ", número: "+ numero);

        /*
         double SalarioMedio = 1500.23;
         String email = "teste@email.com"; singular
         String [] emails = {"teste@email.com","exemplo@gmail.com"}; plural
         String meuNome = "JOSEPH"; se o código  for em pt-br, segue o padrão
         */
    }

    public static int soma(int num1,int num2){
        return num1 + num2;
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}


