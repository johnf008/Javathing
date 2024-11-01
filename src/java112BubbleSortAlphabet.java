//programmerJohn
//pgm desc: Demonstrate the algorithm of bubble sort to sort an array of names

public class java112BubbleSortAlphabet {
    static String[] Bsort(String[] names){
        int len = names.length;
        String temp;

        for(int x = 0; x < len; x++){
            for (int y = 0; y < ((len - x) - 1); y++){

                //compare the values lexicographically / alphabetically; if a positive number then swap
                if( names[y]. compareTo(names[y+1] ) > 0){   //compare teh values alphabetically
                    temp = names[y];
                    names[y]= names[y + 1];
                    names[y + 1] = temp;
                }
            }
        }
        return names;
    }
    public static void main(String[] args){
        String namesUnsorted[] = {"John", "Abigail", "Kim", "Allen", "George", "Bryan", "Albert", "Frank", "Bob"};
        String namesSorted[];

        System.out.println("Before sorting: ");

        for (String z : namesUnsorted){
            System.out.println(z);
        }

        namesSorted = Bsort(namesUnsorted);  //send original array t obe sorted via Bubble sort algortihm
        System.out.println("After sorting: ");

        for(String z: namesSorted){
            System.out.println(z);
        }
    }
}
