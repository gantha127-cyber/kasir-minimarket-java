import utils.PasswordHash;

public class TestHash {

    public static void main(String[] args) {

        String hasil =
                PasswordHash.hash("admin123");

        System.out.println(hasil);

    }

}