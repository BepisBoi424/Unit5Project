public class Elf 
{
    public static int elfCount = 0;
    private String name;
    private double pay;
    private Job job;
    private double totalMoney;

    // Elf constructor
    public Elf(String name, double pay, Job job) 
    {
        this.name = name;
        this.pay = job.getPay();
        this.job = job;
        elfCount++;
        
    }

    /**
    Returns job
    Precondition: Elf object must be created and initialized
    Postcondition: job is returned
    @return - the job
    */
    public String getJob() {
        return job.title;
    }
 
    /**
     * pays the elf
     * Precondition: Elf object is created and initilized
     * Postcondition: Elf's totalMoney variable is updated with money
     */
    public void pay() {
        totalMoney += pay;
    }
    
    /**
     * Returns elf's money
     * Precondition: Static present variable is created and initalized
     * Postcondition: presents * pay is returned
     * @return - presents * pay
     */
    public double getMoney() {
        return Present.presents * pay;
    }
    
    /**
     * Returns name and money
     * Precondition: name and totalMoney variable are created and initialized 
     * Postcondition: Name + total money are returned 
     * @return - Name + totalMoney 
     */
    public String toString() {
        return name + " has made $" + Math.round(totalMoney);
    }
}
