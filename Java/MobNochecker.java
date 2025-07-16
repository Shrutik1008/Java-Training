public class MobNochecker {
    public static void main(String[] args) {
        long mobNo = 9563951008L;

        if (mobNo < 1000000000L || mobNo > 9999999999L) {
            System.out.println("Mob No is Invalid (not a 10-digit number)");
        } else if (!(mobNo / 1000000000L == 6 || mobNo / 1000000000 == 9 || mobNo / 1000000000 == 8 || mobNo / 1000000000 == 7)) {
            System.out.println("Mob No is Invalid (should start with 9, 8, or 7)");
        } else {
            System.out.println("Mob No is Valid");
        }
    }
}
