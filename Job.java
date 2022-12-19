public class Job { 
    public String title;
    private double pay;

    public Job(String title, double pay)
    {
        this.title = title;
        this.pay = pay;
    }
    
    /**
    Returns the pay
    Precondition: pay variable must be created and initialized 
    Postcondition: pay is returned
    @return pay - pay variable
    */
    public double getPay() {
        return pay;
    }
}