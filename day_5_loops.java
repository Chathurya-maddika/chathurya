public class day_5_loops {
    public static void main(String[] args) {
        String c = "classroom";
        System.out.println(c.length());

        System.out.println(c.charAt(0));
        // 'h'

        // substring
        System.out.println(c.substring(2,3));
        System.out.println("hello".equals("Hello"));
        System.out.println(c.substring(6,8));
        // classroom 8,9
        // room 8,9
        System.out.println(c.substring(c.length()-1));
        System.out.println(c.substring(c.length()-3));
        System.out.println("a" + "b");
        String result = 1+ "b";
        System.out.println("hello" + (2 + 2));



        // for loop
        for(int count=1;count<=10;count++){
            System.out.println("Chathurya");
        }
    }
    
}


