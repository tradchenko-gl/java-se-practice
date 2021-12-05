package section4.exercises;

public class Ex2MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        long megaBytes;
        int remainingKiloBytes;
        int kbInMb = 1024;
        if (kiloBytes < 0)
            System.out.println("Invalid Value");
        else {
            megaBytes = Math.round(kiloBytes/kbInMb);
            remainingKiloBytes = kiloBytes%kbInMb;

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}
