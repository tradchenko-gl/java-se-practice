package buchalka.section5.exersises;

public class Ex24FlourPackProblem {

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        //bigCount is a number of bags 5 kg each
        //smallCount is a number of bags 1 kg each
        //goal = number of kg to assemble
        if ((bigCount >=0) && (smallCount >= 0) && (goal >= 0)) {

            for (int i = 0; i <= bigCount; i++) {
                for (int j = 0; j <= smallCount; j++) {
                    if (goal == (i*5) + j) {
                       return true;
                    }
                }
            }
        }
        return false;
    }
}
