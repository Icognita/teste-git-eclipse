package loops;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/


import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        Scanner  sacan = new Scanner(System.in);

        String nome;
        int idade;
        while (true ){
            System.out.println("Nome:");
            nome= sacan.next();

            if (nome.equals("0"))break;
            System.out.println("Idade:");
            idade =sacan.nextInt();
        }
        System.out.println("continua aqui");

    }
}
