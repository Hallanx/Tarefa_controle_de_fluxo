public class Main {
    public static void main(String[] args) {
        int nota1 = 10;
        int nota2 = 8;
        int nota3 = 3;
        int nota4 = 5;

        int somaNotas = nota1 + nota2 + nota3 + nota4;
        int media = somaNotas / 4;

        if (media >= 7) {
            System.out.println("Parabéns! Você foi aprovado.");
        } else if (media >= 5) {
            System.out.println("Você está em recuperação. Estude mais!");
        } else {
            System.out.println("Você está reprovado. É importante se esforçar mais.");
        }
    }
}
