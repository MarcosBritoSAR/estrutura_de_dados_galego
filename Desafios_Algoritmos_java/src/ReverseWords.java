public class ReverseWords {


    public static void main(String[] args) {
        System.out.println(reverseWords("Marcos Brito da silva"));
    }

    public static String reverseWords(String s) {

        char[] args = s.toCharArray();
        int e = 0,d = 0, savePoint;
        char temp;

        while(d != args.length - 1){

            d ++;

            if(args[d] == ' ' || d == args.length - 1){

                savePoint = d;

                if(args[d] == ' '){d--;}

                while(e < d){

                    temp = args[e];
                    args[e] = args[d];
                    args[d] = temp;

                    e++;
                    d--;

                }

                e = savePoint + 1;
                d = savePoint;

            }

        }

        return new String(args);

    }

}