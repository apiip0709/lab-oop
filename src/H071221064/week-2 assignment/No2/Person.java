public class Person {
    String name;
    int age;
    boolean isMale;

    public void setName(String setName) {
        name = setName;
    }
    
    public void getName() {
        System.out.println("Nama : " + name);
    }

    public void setAge(int setAge) {
        age = setAge;
    }

    public void getAge() {
        System.out.println("Umur : " + age + " tahun");
    }

    public void setGender(boolean setGender) {
        isMale = setGender;
    }

    public void getGender() {
        if (isMale == true) {
            System.out.println("Berjenis kelamin laki-laki");
        } else {
            System.out.println("Berjenis kelamin perempuan");
        }
    }
}
