package utils;

import models.Profile;

public class StringUtils {
    Profile profile = new Profile();
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
    public static String nickname(String name){
        // Profile profile = new Profile();
        // String str = profile.getFullName();
        String[] arr = name.split(" ");
        String arr2 = arr[1];
        // System.out.println(arr2);
        return arr2;
    }
}
