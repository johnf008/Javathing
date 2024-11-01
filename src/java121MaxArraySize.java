//programmerJohn
//pgm desc: determine the maximum array size on current system by increasing creating smaller arrays until it succeeds
public class java121MaxArraySize {
    public static void main(String[] args){

        //start with maximum positive integer value....(2^31 - 1)
        int maxSize = Integer.MAX_VALUE - 2;

        while(true){
            try{
                int[] Iray = new int[maxSize];
                System.out.println("Maximum array size: " + maxSize);
                break;
            }
            catch(OutOfMemoryError e){
                //divide initial size by half until max array size is found
                maxSize = maxSize / 2;
                System.out.println("Out of memory " + maxSize);
            }
        }
    }
}
