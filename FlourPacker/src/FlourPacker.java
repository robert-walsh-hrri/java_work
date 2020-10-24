public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // bigCount is count of big flour bags 5kg
        // small count is count of small flour bags 1kg
        // goal is kilos needed

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        while (goal >= 0) {
            if (goal == 0) {
                return true;
            }
            if (bigCount == 0 && smallCount == 0) {
                break;
            }

            if (bigCount > 0) {
                if (goal < 5) {
                    bigCount = 0;
                    continue;
                }
                goal -= 5;
                bigCount--;
                continue;
            }
            if (smallCount > 0) {
                goal -= 1;
                smallCount--;
                continue;
            }
        }
        return false;
    }
}
