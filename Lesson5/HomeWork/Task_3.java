package Lesson5.HomeWork;

import java.util.ArrayList;

public class Task_3 {
    public static void main(String[] args) {
        int[][] chess_table = new int[8][8];
        for (int i = 0; i < chess_table.length; i++) {
            for (int j = 0; j < chess_table.length; j++) {
                chess_table[i][j] = 0;
            }
        }

        ArrayList ys = new ArrayList() {
        };
        ArrayList xs = new ArrayList(16) {
        };
        ArrayList<int[]> ds = new ArrayList<>() {
        };
        Boolean result = false;
        int[][] figures = new int[8][2];
        System.out.println("123");
        for (int i = 0; i < 8; i++) {
            Boolean s = true;
            int y = (int) (Math.random() * 8);
            while (ys.contains(y)) {
                y = (int) (Math.random() * 8);
            }
            ys.add(y);
            int x = (int) (Math.random() * 8);
            while (xs.contains(x)) {
                x = (int) (Math.random() * 8);
            }
            ArrayList awe = new ArrayList<>();

            xs.add(x);
            int[] a = {x, y};
            int aasd = x;
            int basd = y;


            for (int j = x + 1; j < 8; j++) {
                int[] g = new int[]{2, 1};

                g[0] = j;
                g[1] = basd + 1;
                ds.add(g);
                basd++;
            }
            basd = y;
            aasd = x;
            for (int j = y + 1; j < 8; j++) {
                int[] g = new int[]{2, 1};

                g[0] = aasd+1;
                g[1] = j;
                ds.add(g);
                aasd++;
            }
            basd = y;
            aasd = x;
            for (int j = y - 1; j > -1; j--) {
                int[] g = new int[]{2, 1};

                g[0] = aasd - 1;
                g[1] = j;
                ds.add(g);
                aasd--;

            }

            aasd = x;
            basd = y;
            for (int j = y + 1; j < 8; j++) {
                int[] g = new int[]{2, 1};

                g[0] = aasd - 1;
                g[1] = j;
                ds.add(g);
                aasd--;
            }
            aasd = x;
            basd = y;
            for (int j = x + 1; j < -1; j--) {
                int[] g = new int[]{2, 1};

                g[0] = j;
                g[1] = basd - 1;
                ds.add(g);
                basd--;

            }


            for (int l = ds.size() - 1; l > -1; l--) {

                if (ds.get(l)[0] == a[0] && ds.get(l)[1] == a[1]) {
                    i--;
                    s = false;
                    break;
                }

            }
            if (s) {
                figures[i] = a;
            } else {
                i--;
                continue;
            }


            for (int k = 0; k < figures.length; k++) {
                System.out.printf("(%s ,%s),", figures[i][0], figures[i][1]);
            }
        }

    }
}



