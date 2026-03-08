public class UC3 {
    public static void main(String[] args) {
        String row1 = String.join(" ",
                "#####", " ", "#####", " ", "#####", " ", "#####");

        String row2 = String.join(" ",
                "#   #", " ", "#   #", " ", "#   #", " ", "#");

        String row3 = String.join(" ",
                "#   #", " ", "#   #", " ", "#####", " ", "#####");

        String row4 = String.join(" ",
                "#   #", " ", "#   #", " ", "#", " ", "    #");

        String row5 = String.join(" ",
                "#####", " ", "#####", " ", "#", " ", "#####");

        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
        System.out.println(row4);
        System.out.println(row5);
    }
    
}
