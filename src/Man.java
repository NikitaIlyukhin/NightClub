public class Man implements Human {
    public static String music;

    public static void move(Man man) {
        if (music.equals(Music.RNB)) {

            if (skillDanceRNB == true) {
                System.out.println(Man.class.getSimpleName() + " танцует на танцполе");
            } else System.out.println(Man.class.getSimpleName() + " пьет на барной стойке");
        }
        if (music.equals(Music.ELECTRO)) {
            if (skillDanceElectro == true) {
                System.out.println(Man.class.getSimpleName() + " танцует на танцполе");
            } else System.out.println(Man.class.getSimpleName() + " пьет на барной стойке");
        }
    }
}
