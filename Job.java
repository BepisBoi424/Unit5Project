public class Job { 
    public String title;
    private double pay;

    public Job(String title, double pay)
    {
        this.title = title;
        this.pay = pay;
    }
    
    public double getPay() {
        return pay;
    }
}