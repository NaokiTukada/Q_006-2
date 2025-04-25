package arugo62;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main62C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] Line = s.split("");
        int x = 0;
        int y = 0;
        Set<String> point = new HashSet<>();
        point.add("0,0");  

        for(int i = 0; i < n; i++){
            switch (Line[i]) {
                case "R": x += 1; break;
                case "L": x -= 1; break;
                case "U": y += 1; break;
                case "D": y -= 1; break;
            }

            String current = x + "," + y;
            if (point.contains(current)) {
                System.out.println("Yes");
                sc.close();
                return;
            }
            point.add(current);
        }

        System.out.println("No");
        sc.close();
    }
}



