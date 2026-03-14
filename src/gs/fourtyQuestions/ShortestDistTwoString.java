package gs.fourtyQuestions;

public class ShortestDistTwoString {
    public static double shortestDistance(String document, String word1, String word2) {
        document=document.toLowerCase();
        word1=word1.toLowerCase();
        word2 = word2.toLowerCase();
        double shortest = document.length();
        double mid1 = -1;
        double mid2 = -1;
        for (int i = 0; i < document.length(); i++) {
            if(document.startsWith(word1,i)){
                mid1=i+(word1.length()-1)/2.0;
                if (mid2!=-1){
                   shortest=Math.min(shortest,Math.abs(mid1-mid2));
                }
            }
            if(document.startsWith(word2,i)){
                mid2=i+(word2.length()-1)/2.0;
                if (mid1!=-1){
                    shortest=Math.min(shortest,Math.abs(mid1-mid2));
                }
            }
        }
        return shortest;
    }
    public static boolean pass() {
        return  shortestDistance(document, "and", "graphic") == 6d &&
                shortestDistance(document, "transfer", "it") == 14d &&
                shortestDistance(document, "Design", "filler" ) == 25d ;
    }

    public static void main(String[] args) {
        if (pass()) {
            System.out.println("Pass");
        } else {
            System.out.println("Some Fail");
        }
    }

    private static final String document;
    static{
        StringBuffer sb = new StringBuffer();
        sb.append("In publishing and graphic design, lorem ipsum is a filler text commonly used to demonstrate the graphic elements");
        sb.append(" lorem ipsum text has been used in typesetting since the 1960s or earlier, when it was popularized by advertisements");
        sb.append(" for Letraset transfer sheets. It was introduced to the Information Age in the mid-1980s by Aldus Corporation, which");

        document = sb.toString();
    }
}
