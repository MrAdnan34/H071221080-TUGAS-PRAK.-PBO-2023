package login_app.utils;

public class StringUtils {
    /*
    TODO
     * Buatlah sebuah method static yang akan
     * mengembalikan nickName berdasarkan fullName yang diberikan
     * aturan pembuatan nickName adalah :
     * 1. Jika fullName hanya 1 kata maka nickName = fullName
     * (ex: FullName = Agus, maka NickName = Agus)
     * 2. Jika fullName lebih dari 1 kata maka nickName adalah kata kedua dari
     * fullName
     * (ex: FullName = Eurico Devon, maka NickName = Devon)
     */
    public static String setNickName(String fullName) {
        String[] arrayFullName = fullName.split(" ");
        String nickName = "";
        if (arrayFullName.length == 1) {
            nickName = arrayFullName[0];
        } else {
            nickName = arrayFullName[arrayFullName.length - 1];
        }
        return nickName;
    }
}
