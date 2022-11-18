package inheritance;

public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Carl Cracker", 8000, 1987, 12, 15);
        boss.setBonus(500);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("jamison", 5000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Xing", 4000, 2020,11, 22);

        for(Employee e : staff) {
            System.out.println("name " + e.getName() + ",salary " + e.getSalary());
        }

    }
}
