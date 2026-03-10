public class UC6 {

    // Static method to generate O pattern
    static String[] getO() {
        return new String[]{
                "#####",
                "#   #",
                "#   #",
                "#   #",
                "#####"
        };
    }

    // Static method to generate P pattern
    static String[] getP() {
        return new String[]{
                "#####",
                "#   #",
                "#####",
                "#    ",
                "#    "
        };
    }

    // Static method to generate S pattern
    static String[] getS() {
        return new String[]{
                "#####",
                "#    ",
                "#####",
                "    #",
                "#####"
        };
    }

    public static void main(String[] args) {

        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        // Loop to print the banner
        for (int i = 0; i < o.length; i++) {
            System.out.println(
                    String.join("   ", o[i], o[i], p[i], s[i])
            );
        }
    }
}