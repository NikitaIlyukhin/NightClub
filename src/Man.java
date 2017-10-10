public class Man implements Human {
    public static String musik;

    public static void move(Man man) {
        if (musik.equals(Music.RNB)) {

            if (skillDanceRNB == true) {
                System.out.println(Man.class.getSimpleName() + " танцует на танцполе");
            } else System.out.println(Man.class.getSimpleName() + " пьет на барной стойке");
        }
        if (musik.equals(Music.ELECTRO)) {
            if (skillDanceElectro == true) {
                System.out.println(Man.class.getSimpleName() + " танцует на танцполе");
            } else System.out.println(Man.class.getSimpleName() + " пьет на барной стойке");
        }
    }
}
