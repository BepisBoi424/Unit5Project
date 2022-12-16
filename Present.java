public class Present {
    private boolean isWrapped;
    private boolean isPacked;
    public static int presents;

    // Constructor with elf for paying maker
    public Present(Elf elf) {
        if(elf.getJob().equals("Toy Maker")) 
        {
            isWrapped = false;
            isPacked = false;
            presents++;
            elf.pay();
        }
        else 
        {
            System.out.println("This elf does not know how to make toys!");
        }
    }


    /**
    Wraps the present
    Precondition: Elf object must be created and initialized
    Postcondition: isWrapped variable is set to true
    @param elf - the elf that wraps the present to check it's job
    */
    public void wrap(Elf elf) 
    {
        if(elf.getJob().equals("Gift Wrapper")) 
        {
            isWrapped = true;
            elf.pay();
        }
        else 
        {
            System.out.println("Your elf is not a wrapper!");
        }
    }


    public void pack(Elf elf) 
    {

        if(elf.getJob().equals("Sack Packer")) 
        {
            isPacked = true;
            elf.pay();
        }
        else 
        {
            System.out.println("Your elf is not a sack packer!");
        }
    }

    public void qualityControl(Elf elf) {
        if(elf.getJob().equals("Manager")) 
        {
            elf.pay();
        }
        else 
        {
            System.out.println("Your elf is not a manager!");
        }
    }
}
