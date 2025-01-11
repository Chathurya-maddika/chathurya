public class day_9_oops {
    public static void main(String[] args) {
        int[] arr = new int[5];
        student std1 = new student();
        std1.name = "Lasya";
        std1.id = 61;
        std1.classNo = "G2";
        std1.dept = "cse";
        System.out.println(std1);

        student std2 = new student();
        std2.name = "Lasya";
        std2.id = 61;
        std2.classNo = "G2";
        std2.dept = "cse";
        System.out.println(std1==std2);

        student std3 = new student();
        std3.name="Chathurya";
        System.out.println(std1.name);
        System.out.println(std2.name);
        System.out.println(std3.name);


    }
    
}
