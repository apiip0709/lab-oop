package Semester2.Praktikum.Pertemuan2;
import java.util.Scanner;
public class Person {
    String name;
    int age;
    boolean isMale;

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }
    public String getGender (){
        if (isMale == true){
            return "Male";
        } return "Female";
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Orang {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner input = new Scanner(System.in);
        System.out.print("Nama: ");
        person.name = input.nextLine();
        System.out.print("Are you Male? true or false: ");
        person.isMale = input.nextBoolean();     
        System.out.print("Umur: ");
        person.age = input.nextInt();
        input.close();
        System.out.println("Nama: " + person.getName() );
        System.out.println("Gender: " + person.getGender());
        System.out.println("Umur: " + person.getAge());
    }
}


