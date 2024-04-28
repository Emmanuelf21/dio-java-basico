public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        /*tipos de dados basicos/primitivos: int, byte, short, long, float, double, boolean e char
         * ordem de valores inteiros: byte < short < int < long 
         * ordem de valores flutuantes: float < double 
        */
        //Variáveis
        byte idade = 100;
        short ano = 2024;
        int cep = 29338492;
        double salario_minimo = 2500;
        long cpf = 33928472923L; //precisa encerrar com L para definir como long
        float pi = 3.14F; //precisa encerrar com F para definir como float

        short numeroCurto = 1;
        int numeroCurto1 = numeroCurto;
        short numeroCurto2 = (short)numeroCurto1;//casting

        //CONSTANTES devem estar em caixa alta e ser "final"
        final int NUM = 20;
        //NUM = 22;
        System.out.println(NUM);
    }
}
