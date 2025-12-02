package servide;

public class service {
    private Icourse icourse;

    public void setIcourse(Icourse icourse) {
        this.icourse = icourse;
    }
    public Boolean buycourse(double amount){
        return icourse.getcousre(amount);
    }
}
