import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("whereami.in"));
        PrintWriter pw = new PrintWriter("whereami.out");

        int N = sc.nextInt();
        Set<String> boxes = new HashSet<>();
        String total = sc.next();
        String[] temp = total.split("");
        for(int i = 0; i < N; i++) {
            boxes.clear();
            for(int k = 0; k < N-i; k++) {
                String str="";
                for(int j = k; j < k+i+1; j++) {
                    str += temp[j];
                }
                boxes.add(str);
            }
            if(boxes.size() == N-i) {
                pw.print(i+1);
                i=N;
            }
        }
        pw.close();
    }
}
