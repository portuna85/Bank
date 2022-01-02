package review;

public class UserEx {
    public static void main(String[] args) {
        User user = new User("suwon", "Hyrul-ro", "1245215");
        User user1 = new User("suwon", "Chunchun-ro", "1245215");
        User user2 = new User("Daegu", "dongdaegu-ro", "05346");
        User user3 = new User("Cheon-an", "gangnam-ro", "04231");
        System.out.println(user.getName() + " " + user.getRoadName());
        System.out.println();

        user.setName("jsbae");

        user3.setAge(47);

        System.out.println(user.getName() + " " + user.getRoadName());

        String city = user.getCity();
        String city1 = user1.getCity();
        String city2 = user2.getCity();

        String name = user.getName();
        String name1 = user1.getName();
        String name2 = user2.getName();


        if(city.equals(city1)) {
            System.out.println("Same");
        } else {
            System.out.println("different");
        }

        if(city.equals(city2)) {
            System.out.println("Same");
        } else {
            System.out.println("different");
        }

        if(name.equals(name1)) {
            System.out.println("Same");
        } else {
            System.out.println("different");
        }

        try {
            if (name1 == name2) {

                System.out.println("Same");
            } else {
                System.out.println("different");
            }
        } catch (Exception e) {}
    }
}