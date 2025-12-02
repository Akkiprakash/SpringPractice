package servide;

public class java implements Icourse{
    @Override
    public Boolean getcousre(Double amount) {
        System.out.println("java course is pirchased " + amount);
        return true;
    }
}
