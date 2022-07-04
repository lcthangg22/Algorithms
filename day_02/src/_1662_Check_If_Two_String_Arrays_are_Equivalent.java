public class _1662_Check_If_Two_String_Arrays_are_Equivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//        String rs1 = "";
//        String rs2 = "";
//
//        for (String s: word1) {
//            rs1 += s;
//        }
//
//        for (String s: word2) {
//            rs2 +=s;
//        }
//        return rs1.equals(rs2);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String s: word1) {
            sb1.append(s);
        }

        for (String s: word2) {
            sb2.append(s);
        }
        return sb1.toString().equals(sb2.toString());
    }

    public static void main(String[] args) {
        String[] word1 = {"ab","c"};
        String[] word2 = {"a","bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
}
