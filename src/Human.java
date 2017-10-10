import java.util.Random;

public interface Human {
    Random random = new Random();
    boolean skillDanceRNB = random.nextBoolean();
    boolean skillDanceElectro = random.nextBoolean();
}
