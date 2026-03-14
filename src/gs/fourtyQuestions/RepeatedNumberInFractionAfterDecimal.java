package gs.fourtyQuestions;

public class RepeatedNumberInFractionAfterDecimal {
    public static void main(String args[]) {
        // float f=6/11f;
        // System.out.println(f);
        System.out.println(fractionRepresentation(1, 2) + " " + fractionRepresentation(1, 3) + " "
                + fractionRepresentation(6, 11));

        if (fractionRepresentation(1, 2).equals("0.5") && fractionRepresentation(6, 11).equals("0.(54)")
                && fractionRepresentation(1, 3).equals("0.(3)")) {
            System.out.println("All passed");
        } else {
            System.out.println("Failed");
        }

    }

    private static String fractionRepresentation(int num, int div) {
        float d = (float)num/(float) div;
        String stNum = String.valueOf(d);
        String res = stNum.substring(0,stNum.indexOf('.')+1);
        String fracSubSt = stNum.substring(stNum.indexOf('.')+1,stNum.length());
        int i = 0;
        String intermSub = "";
        boolean repeat = false;
        while (i<fracSubSt.length()){
            if(intermSub.length()>0 && (i+intermSub.length()<fracSubSt.length())
                    && fracSubSt.substring(i, i+intermSub.length()).equals(intermSub) ){
                repeat = true;
                break;
            }else {
                intermSub = intermSub+fracSubSt.charAt(i++);
            }
        }
        return repeat?res+"("+intermSub+")":res+fracSubSt;
    }
}
