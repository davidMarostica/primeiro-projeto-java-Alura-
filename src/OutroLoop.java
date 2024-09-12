import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0 ;
        double nota = 0;
        int totalDenota=0;

       while ( nota != -1){

            System.out.println( "Digite sua avaliação par o filme  ou -1 para encerrar");
            nota = leitura.nextDouble();

            if (nota != -1 ) {
                mediaAvaliacao += nota;
                totalDenota++;
            }
        }
        System.out.println( "média de avaliação " + mediaAvaliacao / totalDenota );


    }
}

