package inflearn.section_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 좌표정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Coordinate> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(new Coordinate(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(list);
        for(Coordinate c : list){
            System.out.print(c.x + " " + c.y);
            System.out.println();
        }
    }

}

class Coordinate implements Comparable<Coordinate> {
    int x;
    int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Coordinate o) {
        if(this.x == o.x)
            return this.y-o.y;
        else
            return this.x-o.x;
    }

}
