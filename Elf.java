public class Elf 
{
    public static int elfCount = 0;
    private String name;
    private double pay;
    private Job job;
    private double totalMoney;


    public Elf(String name, double pay, Job job) 
    {
        this.name = name;
        this.pay = pay;
        this.job = job;
        elfCount++;
        
    }

    public String getJob() {
        return job.title;
    }

    public int Pay() {
        totalMoney += pay;
    }
    
    public double getMoney() {
        return Present.presents * pay;
    }
}
