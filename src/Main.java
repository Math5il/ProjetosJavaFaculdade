import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Scanner console = new Scanner(System.in);
        Random console = new Random();

        int idadeMaiorDezoito = 0;
        float[] mediaIdadeTime = new float[5];
        float mediaAlturaTotal = 0.0f;
        float porcentagem = 0.0f;


        Jogadores[] time1 = new Jogadores[11];
        Jogadores[] time2 = new Jogadores[11];
        Jogadores[] time3 = new Jogadores[11];
        Jogadores[] time4 = new Jogadores[11];
        Jogadores[] time5 = new Jogadores[11];

        for(int i = 0; i < time1.length; i ++){
            time1[i] = new Jogadores();

            System.out.println("Digite a idade do jogador:");
            time1[i].setIdade(console.nextInt(0,100));

            System.out.println("Digite o peso do jogador:");
            time1[i].setPeso(console.nextFloat(0,200));

            System.out.println("Digite a altura do jogador:");
            time1[i].setAltura(console.nextFloat(0,2));

            if(time1[i].getIdade() >= 18){
                idadeMaiorDezoito++;
            }
            if(time1[i].getPeso() > 80){
                porcentagem += 1;
            }
            mediaIdadeTime[0] += time1[i].getIdade();
            mediaAlturaTotal += time1[i].getAltura();

        }

        for(int i = 0; i < time2.length; i ++){
            time2[i] = new Jogadores();

            System.out.println("Digite a idade do jogador:");
            time2[i].setIdade(console.nextInt(0, 100));

            System.out.println("Digite o peso do jogador:");
            time2[i].setPeso(console.nextFloat(0, 200));

            System.out.println("Digite a altura do jogador:");
            time2[i].setAltura(console.nextFloat(0, 2));

            if(time2[i].getIdade() >= 18){
                idadeMaiorDezoito++;
            }
            if(time2[i].getPeso() > 80){
                porcentagem += 1;
            }
            mediaIdadeTime[1] += time2[i].getIdade();
            mediaAlturaTotal += time2[i].getAltura();
        }

        for(int i = 0; i < time3.length; i ++){
            time3[i] = new Jogadores();

            System.out.println("Digite a idade do jogador:");
            time3[i].setIdade(console.nextInt(0, 100));

            System.out.println("Digite o peso do jogador:");
            time3[i].setPeso(console.nextFloat(0, 200));

            System.out.println("Digite a altura do jogador:");
            time3[i].setAltura(console.nextFloat(0, 2));

            if(time3[i].getIdade() >= 18){
                idadeMaiorDezoito++;
            }
            if(time3[i].getPeso() > 80){
                porcentagem += 1;
            }
            mediaIdadeTime[2] += time3[i].getIdade();
            mediaAlturaTotal += time3[i].getAltura();
        }

        for(int i = 0; i < time4.length; i ++){
            time4[i] = new Jogadores();

            System.out.println("Digite a idade do jogador:");
            time4[i].setIdade(console.nextInt(0, 100));

            System.out.println("Digite o peso do jogador:");
            time4[i].setPeso(console.nextFloat(0 , 200));

            System.out.println("Digite a altura do jogador:");
            time4[i].setAltura(console.nextFloat(0, 2));

            if(time4[i].getIdade() >= 18){
                idadeMaiorDezoito++;
            }
            if(time4[i].getPeso() > 80){
                porcentagem += 1;
            }
            mediaIdadeTime[3] += time4[i].getIdade();
            mediaAlturaTotal += time4[i].getAltura();
        }

        for(int i = 0; i < time5.length; i ++){
            time5[i] = new Jogadores();

            System.out.println("Digite a idade do jogador:");
            time5[i].setIdade(console.nextInt(0, 100));

            System.out.println("Digite o peso do jogador:");
            time5[i].setPeso(console.nextFloat(0, 200));

            System.out.println("Digite a altura do jogador:");
            time5[i].setAltura(console.nextFloat(0, 2));

            if(time5[i].getIdade() >= 18){
                idadeMaiorDezoito++;
            }
            if(time5[i].getPeso() > 80){
                porcentagem += 1;
            }
            mediaIdadeTime[4] += time5[i].getIdade();
            mediaAlturaTotal += time5[i].getAltura();
        }

        mediaAlturaTotal = mediaAlturaTotal / (time1.length + time2.length + time3.length + time4.length + time5.length);
        porcentagem = (porcentagem / (time1.length + time2.length + time3.length + time4.length + time5.length)) * 100;

        System.out.println("Resultados: ");
        System.out.println("A quantidade de jogadores maiores de 18 é: " + idadeMaiorDezoito);
        System.out.println("A média de altura total é de: " + String.format("%.2f", mediaAlturaTotal));
        System.out.println("A porcentagem que representa os jogadores com mais de 80Kg é: " + String.format("%.2f", porcentagem));
        for(int i = 0; i < mediaIdadeTime.length; i++){
            mediaIdadeTime[i] = (mediaIdadeTime[i] / time1.length);
            System.out.println("A média da idade do time " + (i + 1) + " é de: " + String.format("%.2f", mediaIdadeTime[i]));
        }

    }//Fim Main
}// Fim Classe Main