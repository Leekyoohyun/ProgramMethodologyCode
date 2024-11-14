package week10.checkInheritance;

public class PersonFrom extends Person {
    private String city;

    public PersonFrom(String n, String city) {
        super(n);
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public boolean same(PersonFrom other){
        return sameName(other) && city.equals(other.getCity());
    }

    public static void main(String[] args) {
        Person p = new Person("마음");
        Person q = new PersonFrom("소리", "서울");
        System.out.println("----------");
        System.out.println(p.getName());
        System.out.println(p.sameName(p));
        System.out.println();
        System.out.println(p.getName());
        System.out.println(p.getName());

        System.out.println();

        System.out.println(q.sameName(p));
    }
}
