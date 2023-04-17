package models;

public class Profile {
    private String fullName, hobby;
    private int age;
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getHobby() {
        return hobby;
    }
    public String getFullName() {
        return fullName;
    }
    public int getAge() {
        return age;
    }
    public Profile(){
    }
    
    /*
     * TODO:
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */
}
