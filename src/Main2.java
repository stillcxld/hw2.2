public class Main2 {
    public static void main(String[] args) {
        int sum = 1817;
        int limit = 1000;  //константа, если клиент платит выше этой суммы, то получается баллы
        int bonus = 0;
        if (sum < limit) {
            System.out.println("Бонус:" + (bonus));
        } else {
            bonus = (sum / 100);
            System.out.println("Бонус:" + (bonus));
        }
    }
}
