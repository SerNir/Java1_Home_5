public class Employee {
    private String name;
    private String firstName;
    private String patronymic;
    private String post;
    private String email;
    private int phoneNumber;
    private double salary;
    private int age;

    public Employee(String name, String firstName, String patronymic, String post, String email, int phoneNumber,
                    double salary, int age){
        this.name = name;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public static void employeeInfo(Employee e){
        System.out.println("Сотрудник: " + e.name + " "+ e.patronymic + " " + e.firstName + "\n должность: "
                +e.post +"\n возраст: "+ e.age + "\n электронная почта: " + e.email
                + "\n номер телефона: " + e.phoneNumber + "\n зарплата: " + e.salary +"$." );

    }

    public static void main(String[] args) {
        Employee[]employees = new Employee[5];
        employees[0] = new Employee("Дмитрий", "Аниськин", "Павлович", "директор",
                "director@email.emp",12345678, 1500, 56);
        employees[1] = new Employee("Тамара", "Иванова", "Игоревна", "секретарь",
                "clerk@email.emp",23456778, 1000, 36);
        employees[2] = new Employee("Константин", "Тружко", "Игоревич", "завсклада",
                "storageManager@email.emp",46583456, 650, 40);
        employees[3] = new Employee("Ольга", "Перова", "Павловна", "менеджер",
                "manager@email.emp",8745079, 800, 26);
        employees[4] = new Employee("Леонид", "Брежнев", "Ильич", "сторож",
                "security@email.emp",6436789, 500, 87);

        for (int i = 0; i < employees.length; i++) {
            if(employees[i].age > 40){
                employeeInfo(employees[i]);
            }

        }
    }
}
