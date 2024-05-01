public class Argumentos {
    public static void main(String[] args) throws Exception {
        //Os argumentos(args) estão sendo passados pelo arquivo launch.json
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura);
    }
}
