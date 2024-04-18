public class Task11 {
    public static void main(String[] args) {
        System.out.println("Задание 11");
        long startSecods = 2_432_45L;
        long days = startSecods / 86400;
        long hours = (days) / 3600;
        long minuts = hours / 60;
        long seconds = minuts % 60;
        System.out.println(days
                + " "
                + hours + " "
                +
                minuts + " "
                + seconds);
    }
}
