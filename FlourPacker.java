public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal)
    {
        if(bigCount < 0 || smallCount < 0 || goal < 0)
        {
            return false;
        }
        boolean canPackFlour = true;
        if(goal > ((bigCount * 5) + smallCount))
        {
            canPackFlour = false;
        }
        if((goal % 5) > smallCount)
        {
            canPackFlour = false;
        }
        return canPackFlour;
    }
}
