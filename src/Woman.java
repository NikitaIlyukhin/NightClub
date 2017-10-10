public class Woman implements Human {

    public static String musik;

    public static void move(Woman woman) {
        if (musik.equals(Music.RNB)) {
            if (skillDanceRNB == true) System.out.println(Woman.class.getSimpleName() + " танцует на танцполе");
            else System.out.println(Woman.class.getSimpleName() + " танцует на танцполе");
        }
        if (musik.equals(Music.ELECTRO)) {
            if (skillDanceElectro == true) System.out.println(Woman.class.getSimpleName() + " танцует на танцполе");
            else System.out.println(Woman.class.getSimpleName() + " пьет на барной стойке");
        }
    }

}
