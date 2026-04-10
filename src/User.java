public class User {
    public static int totalUserCount = 0;
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        User.totalUserCount = 100;
        System.out.println("Всего пользователей: " + totalUserCount);
        User myUser =  new User();
        myUser.setName("Андрей");
        System.out.println("Имя пользователя: " + myUser.getName());
    }
}
