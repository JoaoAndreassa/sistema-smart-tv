import java.util.Scanner;

public class usuario {
    public static void main(String[] args) throws Exception {

        final SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada? \n" + smartTv.ligada);
        System.out.println("Canal atual: \n" + smartTv.canal);
        System.out.println("volume atual: \n" + smartTv.volume);

        // abertura do bloco para saber se usuario gostaria de ligar a
        // TV=====================================
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja ligar a TV?\n1 = Liga\n2= Desliga");
        int sim = sc.nextInt();

        if (sim == 1) {
            smartTv.ligar();
            System.out.println("NOVO STATUS -> TV ligada?" + smartTv.ligada + "\n");

            // abertura de bloco para saber o volume desejado do
            // usuario======================================
            System.out.println("Qual o volume desejado?\n");

            int volumeDesejado = sc.nextInt();
            if (volumeDesejado < smartTv.volume) {
                for (int i = smartTv.volume; i > volumeDesejado; i--) {
                    smartTv.diminui();
                    System.out.println("NOVO STATUS -> volume atual: " + smartTv.volume + "\n");
                }
            } else {
                for (int i = smartTv.volume; i < volumeDesejado; i++) {
                    smartTv.aumentar();
                    System.out.println("NOVO STATUS -> volume atual: " + smartTv.volume + "\n");
                }
            }
            // final do bloco de ajuste de volume=======================================

            // inicio bloco do canal=================================================

            System.out.println("Passar canal de 1 em 1, ou pular?\n1 = Passar\n2 = Pular");
            int escolha = sc.nextInt();

            if (escolha == 1) {
                System.out.println("Ok, mas para passar os canais preciso saber qual canal vai querer?\n");
                int CanalDesejado = sc.nextInt();
                if (CanalDesejado < smartTv.canal) {
                    for (int i = smartTv.canal; i > CanalDesejado; i--) {
                        smartTv.canalMenos();
                        System.out.println("NOVO STATUS -> canal atual: " + smartTv.canal + "\n");
                    }
                } else {
                    for (int i = smartTv.canal; i < CanalDesejado; i++) {
                        smartTv.canalMais();
                        System.out.println("NOVO STATUS -> canal atual: " + smartTv.canal + "\n");
                    }
                }
            } else {
                System.out.println("Ok, mas para passar os canais preciso saber qual canal vai querer?\n");
                int CanalDesejado = sc.nextInt();
                System.out.println("NOVO STATUS -> canal atual: " + CanalDesejado + "\n");
            }

            // final do bloco do
            // canal================================================================================

        } else {
            System.out.println("A TV ja esta Desligada\n");

        }

        // Fim do bloco

        sc.close();
    }

}
