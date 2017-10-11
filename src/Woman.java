public class Woman implements Human {

    public static String music;

    public static void move(Woman woman) {
        if (music.equals(Music.RNB)) {
            if (skillDanceRNB == true) System.out.println(Woman.class.getSimpleName() + " танцует на танцполе");
            else System.out.println(Woman.class.getSimpleName() + " танцует на танцполе");
        }
        if (music.equals(Music.ELECTRO)) {
            if (skillDanceElectro == true) System.out.println(Woman.class.getSimpleName() + " танцует на танцполе");
            else System.out.println(Woman.class.getSimpleName() + " пьет на барной стойке");
        }
    }

}
