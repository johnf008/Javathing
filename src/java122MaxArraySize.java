//name:programmerJohn
//determine the max array size on current system
public class java122MaxArraySize {

    public static void main(String[] args) {
        //int maxSize = Integer.Max_Value - 2;
        int maxSize = 10_000_000;

        while (true) {
            try{
                int[] iray = new int[maxSize];
                System.out.println("Maximum array size: " + maxSize);
                maxSize += 10_000_000;
            } catch(OutOfMemoryError e){
                maxSize = maxSize / 2;
                System.out.println("Out of memory " + maxSize);
                break;
            }
        }
    }
}
