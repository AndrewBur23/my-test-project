public class Students {
    String name;
    int age;
    int height;

    public Students(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void introduceSelf() {
        System.out.println("Привет, меня зовут " + name + ", мне " + age + " лет, " + "мой рост - " + height + " см.");
    }

    public int getAge() {
        return age;
    }

    public int getHeight () {
        return height;
    }


    public static void main(String[] args) {
        Students andrew = new Students("Андрей", 14, 170);
        andrew.introduceSelf();

        Students nicolay = new Students("Николай", 23, 185);
        nicolay.introduceSelf();

        Students elizaveta = new Students("Елизавета", 12, 160);
        elizaveta.introduceSelf();

        System.out.println("Список студентов:");
        System.out.println(andrew);
        System.out.println(nicolay);
        System.out.println(elizaveta);

    }
    @Override
    public String toString() {
        return "Студент: " + name + "; возраст: " + age + "; рост: " + height;
    }

}
