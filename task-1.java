import java.util.*;
    public class Code1  {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int random,n;
            random = (int) (1 + (Math.random() * 100));

            for (int i = 0; i < 3; i++) {
                System.out.print("Enter the Number:");
                n=s.nextInt();
                int diff=n-random;
                if (diff<0){
                    diff*=(-1);
                }

                if (n == random) {
                    System.out.println("Correct");
                } else if (diff < 10) {
                    System.out.println("Too Low");
                } else if(diff > 10) {
                    System.out.println("Too High");
                }

            }
            System.out.println(random);

        }
    }

