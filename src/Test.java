/*В ночной клуб приходят мальчики и девочки. Некоторые из них любят, могут или умеют танцевать.
Каждый персонаж, пришедший в ночной клуб, может обладать разными навыками танцевать под разную музыку.
Когда играет Rnb на танцполе танцуют те, кто танцуют хип-хоп, рнб. Когда играет Electrohuse на танцполе танцуют те, кто танцуют Electrodance.
Когда играет Поп-музыка танцуют те, кто умеют танцевать под поп-музыку. Если человек не умеет танцевать под данную музыку, он идет в бар и пьет водку.
Необходимо эмулировать ночной клуб с произвольным количеством разных персонажей.
В то время, когда они слышат музыку, персонажи должны соответствующим образом себя вести: танцевать  или пить водку в баре.
Поведение персонажей следует выводить на экран текстом. Программу надо писать с консольным выводом.
Музыка меняется в клубе каждые 5 секунд автоматически.*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        NightClub nightClub = new NightClub();
        Thread night = new Thread(nightClub);
        night.start();
    }

    public static class NightClub implements Runnable {
        String music = Music.RNB;

        @Override
        public void run() {
            while (true) {
                try {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    System.out.print("Введите количество мальчиков в клубе: ");
                    int numberMen = Integer.parseInt(reader.readLine());
                    System.out.print("Введите количество девочек в клубе: ");
                    int numberWomen = Integer.parseInt(reader.readLine());
                    while (true) {
                        Thread.sleep(5000);
                        if (music.equals(Music.RNB)) {
                            this.music = Music.ELECTRO;
                        } else this.music = Music.RNB;
                        System.out.println("Играет музыка:" + music);
                        if (music.equals(Music.RNB) || music.equals(Music.ELECTRO)) {
                            for (int i = 0; i < numberMen; i++) {
                                Man man = new Man();
                                if (music.equals(Music.RNB)) {
                                    man.musik = Music.RNB;
                                } else man.musik = Music.ELECTRO;
                                Man.move(man);
                            }
                            for (int i = 0; i < numberWomen; i++) {
                                Woman woman = new Woman();
                                if (music.equals(Music.RNB)) {
                                    woman.musik = Music.RNB;
                                } else woman.musik = Music.ELECTRO;
                                Woman.move(woman);

                            }
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
