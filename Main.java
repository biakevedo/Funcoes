public class Main {
    // Método que dá bom dia!
    // função sem retorno é uma função - void
    public static void darBomDia(){
        System.out.println("Bom dia!");
    }


    public static void saudar(String nome){
        System.out.println("Bom dia" + nome);
    }







    // exercício 1 mensagem de boas vindas - aparece
    public static void mostrarMensagem(){
        System.out.println("Bem vindo ao programa!");
    }

    // exercício 3 retornar a divisão de dois números - não aparece

    public static int dividir(int num1, int num2) {
        int resultado = num1 / num2;
        return resultado;
    }


    // exercício 2 mostrar dobro - aparece
    public static void mostrarDobro(int numero){
        System.out.println("O dobro é " + (numero * 2));
    }

    // exercicio 4 verificar se o número é par - não aparece

    public static boolean ehPar(int numeroPar) {
        if (numeroPar % 2 == 0) {
            return true;
        } else return false;
    }







    public static void subtrair(int num1, int num2){
        System.out.println(num1 + num2);
    }
    // função com retorno

    public static int somar(int num1, int num2){
        int resultado = 7 + 3;
        return resultado;

    }


    // Função com parametro
    // (Recebe um nome)
    public static void main(String[] args) {
        darBomDia();

       saudar(" Bia");
       subtrair(8, 4);
       mostrarMensagem();
        mostrarDobro(5);
        int res = dividir(10, 2);
        boolean resultado = ehPar(8);




        // public static RETORNO NOME (parametros)
        // { código da função }













    }
}