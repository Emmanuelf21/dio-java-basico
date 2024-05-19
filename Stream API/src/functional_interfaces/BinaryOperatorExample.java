package functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
     public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
        BinaryOperator<Integer> somar = Integer::sum;//(num1,num2) -> num1 + num2

        // Usar o BinaryOperator para somar todos os números no Stream
        // int resultado = numeros.stream()
        //     .reduce(0, Integer::sum);

        int resultado = numeros.stream()
            .reduce(0, somar);//o primeiro elemento é a variável temporária
            //igual quando cria uma variável soma = 0
        // Imprimir o resultado da soma
        System.out.println("A soma dos números é: " + resultado);
    }
}
