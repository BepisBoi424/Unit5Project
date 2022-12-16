public class Main {
    public static void main(String[] args) 
    {
        //Create Jobs
        Job toyMaker = new Job("Toy Maker", 7.25);
        Job giftWrapper = new Job("Gift Wrapper", 22.13);
        Job sackPacker = new Job("Sack Packer", 18.19);
        Job manager = new Job("Manager", 55.28);

        // Create toy maker elves
        Elf scrumbo = new Elf("Scrumbo", 17.18, toyMaker);
        Elf scrimblo = new Elf("Scrimblo", 17.18, toyMaker);
        Elf dinglo = new Elf("Dinglo", 17.18, toyMaker);

        // Create gift wrapper elves
        Elf sogba = new Elf("Sogba", 15.16, giftWrapper);
        Elf rugba = new Elf("Rugba", 15.16, giftWrapper);
        Elf brubga = new Elf("Brubga", 15.16, giftWrapper);

        //Create sack paker elves
        Elf brick = new Elf("The Brick", 18.12, sackPacker);
        Elf thumb = new Elf("The Thumb", 18.12, sackPacker);
        Elf blunt = new Elf("The Blunt", 7.25, sackPacker);

        //Create manager elf
        Elf ahole = new Elf("Ahole", 56.30, manager);


        // Batch of presents with first set of elves
        for(int i = 0; i < 34; i++) {
            Present pres = new Present(scrumbo);
            pres.wrap(sogba);
            pres.pack(brick);
            pres.qualityControl(ahole);
        }

        // Batch of presents with second set of elves
        for(int i = 0; i < 33; i++) {
            Present pres = new Present(scrimblo);
            pres.wrap(rugba);
            pres.pack(thumb);
            pres.qualityControl(ahole);
        }

        // Batch of presents with third set of elves
        for(int i = 0; i < 33; i++) {
            Present pres = new Present(dinglo);
            pres.wrap(brubga);
            pres.pack(blunt);
            pres.qualityControl(ahole);
        }

        // Print hire numbers
        System.out.println("There are a total of " + Elf.elfCount + " hires.");
        System.out.println();

        // Print present numbers
        System.out.println("A total of " + Present.presents + " presents were created.");
        System.out.println();

        // Print elf pays
        System.out.println(scrumbo);
        System.out.println(scrimblo);
        System.out.println(dinglo);
        System.out.println(sogba);
        System.out.println(rugba);
        System.out.println(brubga);
        System.out.println(brick);
        System.out.println(thumb);
        System.out.println(blunt);
        System.out.println(ahole);
    }
}
