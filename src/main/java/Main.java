public class Main {

    public static void main(String[] args) {
        Person p1 = new Person(24, 1.76);

        System.out.println(p1.getAlder() + " år " + p1.getHøjde() + " m ");
        p1.setAlder(25);
        p1.setHøjde(1.78);
        System.out.println(p1.getAlder() + " år " + p1.getHøjde() + " m ");

    }
}
