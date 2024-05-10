public class Main {
    public static void main(String[] args){
        Person[] persons = new Person[5];
        persons[0] = new Person(1, "Nguyen Van A", "vana@gmail.com", "Da Nang", 2);
        persons[1] = new Person(2, "Tran Thi B", "tranb@gmail.com", "Ha Noi", 3);
        persons[2] = new Person(3, "Dang Van C", "dangvanc@gmail.com", "Quang Nam", 2);
        persons[3] = new Person(4, "Nguyen Dang D", "dnguyen@gmail.com", "Da Nang", 1);
        persons[4] = new Person(5, "Le Van E", "levane@gmail.com", "HCM", 2);
        System.out.println("Person has role = 2: ");
        for (Person person : persons){
            if (person.getRole() == 2){
                System.out.println("ID: " + person.getID() + ", Name: " + person.getName() + ", Email: " + person.getEmail() + ", Address: " + person.getAddress() + ", Role: " + person.getRole());
            }
        }
    }
}