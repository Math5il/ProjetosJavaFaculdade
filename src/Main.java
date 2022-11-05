import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Scanner console = new Scanner(System.in);
        Random console = new Random();

        int[] idadeMaiorDezoito = new int[1];
        float[] mediaIdadeTime = new float[5];
        float[] mediaAlturaTotal = new float[1];
        float[] porcentagem = new float[1];


        Jogadores[] time1 = new Jogadores[11];
        Jogadores[] time2 = new Jogadores[11];
        Jogadores[] time3 = new Jogadores[11];
        Jogadores[] time4 = new Jogadores[11];
        Jogadores[] time5 = new Jogadores[11];


        adicionarJogadores(time1, console, idadeMaiorDezoito, porcentagem,  mediaIdadeTime, mediaAlturaTotal, 0);
        adicionarJogadores(time2, console, idadeMaiorDezoito, porcentagem,  mediaIdadeTime, mediaAlturaTotal, 1);
        adicionarJogadores(time3, console, idadeMaiorDezoito, porcentagem,  mediaIdadeTime, mediaAlturaTotal, 2);
        adicionarJogadores(time4, console, idadeMaiorDezoito, porcentagem,  mediaIdadeTime, mediaAlturaTotal, 3);
        adicionarJogadores(time5, console, idadeMaiorDezoito, porcentagem,  mediaIdadeTime, mediaAlturaTotal, 4);




        mediaAlturaTotal[0] = mediaAlturaTotal[0] / (time1.length + time2.length + time3.length + time4.length + time5.length);
        porcentagem[0] = (porcentagem[0] / (time1.length + time2.length + time3.length + time4.length + time5.length)) * 100;

        System.out.println("Resultados: \n" +
        "A quantidade de jogadores maiores de 18 é: " + idadeMaiorDezoito[0] + "\n" +
        "A média de altura total é de: " + String.format("%.2f", mediaAlturaTotal[0]) + " metros \n" +
        "A porcentagem que representa os jogadores com mais de 80Kg é: %" + String.format("%.2f", porcentagem[0]) + "\n");
        for(int i = 0; i < mediaIdadeTime.length; i++){
            mediaIdadeTime[i] = (mediaIdadeTime[i] / time1.length);
            System.out.println("A média da idade do time " + (i + 1) + " é de: " + String.format("%.2f", mediaIdadeTime[i]) + " anos.");
        }

    }//Fim Main

    public static void adicionarJogadores(Jogadores[] time, Random console, int[] idadeMaiorDezoito,
                                          float[] porcentagem, float[] mediaIdadeTime, float[] mediaAlturaTotal, int n){

        for(int i = 0; i < time.length; i ++){
            time[i] = new Jogadores();

            time[i].setIdade(console.nextInt(0,100));
            time[i].setPeso(console.nextFloat(0,200));
            time[i].setAltura(console.nextFloat(0,2));

            if(time[i].getIdade() >= 18){
                idadeMaiorDezoito[0]++;
            }
            if(time[i].getPeso() > 80){
                porcentagem[0] += 1;
            }
            mediaIdadeTime[n] += time[i].getIdade();
            mediaAlturaTotal[0] += time[i].getAltura();
        }

    }

}// Fim Classe Main