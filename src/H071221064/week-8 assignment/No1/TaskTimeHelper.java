import java.util.Random;

class TaskTimeHelper {
    static int generateRandomTimeExecution() {
        Random random = new Random();
        int randomNumber = random.nextInt(6) + 1;
        return randomNumber;
    }
}