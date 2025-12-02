package servide;

public class sprinboot implements Icourse{
    @Override
    public Boolean getcousre(Double amount) {
        System.out.println("springboot course is purchased " + amount);
        return true;
    }
}
