public class SampleGrader6 {
    public static void main(String[] args) {
        RecursiveMethods prog = new RecursiveMethods();
        
        int partI = prog.byLeapsAndBounds(3);
        System.out.println("Part I answer: " + partI); //should print Part I answer: 3

        int partII = prog.subCount("aaaa","a");
        System.out.println("Part II answer: " + partII); //should print Part II answer: 4

        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;
        int partIII = prog.binarySearch(arr, 7, 1, 10);
        System.out.println("Part III answer: " + partIII);

     }
}