package com.fourBit;

import java.util.Random;

public class Main {

    public static int[][] rastgele() {
        Random rnd = new Random();
        int sayı, c, f;

        int[][] matris = new int[16][16];
        String[] dizi = new String[8];
        String[] dizi2 = new String[8];
        String[] dizi3 = new String[8];

        String karsılastır1 = "";
        String karsılastır2 = "";
        String karsılastır3 = "";

        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {

                sayı = rnd.nextInt(256);

                karsılastır1 = Integer.toBinaryString(sayı);

                if (karsılastır1.length() != 8) {

                    while (karsılastır1.length() != 8)
                        karsılastır1 = "0" + karsılastır1;
                }

                if (i == 0 && j == 0)
                    matris[i][j] = sayı;
                else if (i == 0 && j > 0) {
                    karsılastır2 = Integer.toBinaryString(matris[i][j - 1]);

                    if (karsılastır2.length() != 8) {

                        while (karsılastır2.length() != 8)
                            karsılastır2 = "0" + karsılastır2;
                    }

                    c = 0;

                    for (int d = 0; d < 8; d++) {
                        dizi[d] = karsılastır1.substring(d, d + 1);
                        dizi2[d] = karsılastır2.substring(d, d + 1);
                        if (dizi[d].equals(dizi2[d]))
                            c = c + 1;
                    }

                    if (c != 4) {
                        while (c != 4) {
                            sayı = rnd.nextInt(256);

                            karsılastır1 = Integer.toBinaryString(sayı);

                            if (karsılastır1.length() != 8) {

                                while (karsılastır1.length() != 8)
                                    karsılastır1 = "0" + karsılastır1;
                            }

                            c = 0;
                            for (int d = 0; d < 8; d++) {
                                dizi[d] = karsılastır1.substring(d, d + 1);
                                if (dizi[d].equals(dizi2[d]))
                                    c = c + 1;
                            }
                        }
                    }
                    matris[i][j] = sayı;
                }
                else if (i > 0 && j == 0) {
                    karsılastır2 = Integer.toBinaryString(matris[i - 1][j]);

                    if (karsılastır2.length() != 8) {

                        while (karsılastır2.length() != 8)
                            karsılastır2 = "0" + karsılastır2;
                    }

                    c = 0;
                    for (int d = 0; d < 8; d++) {
                        dizi[d] = karsılastır1.substring(d, d + 1);
                        dizi2[d] = karsılastır2.substring(d, d + 1);
                        if (dizi[d].equals(dizi2[d]))
                            c = c + 1;
                    }

                    if (c != 4) {
                        while (c != 4) {
                            sayı = rnd.nextInt(256);

                            karsılastır1 = Integer.toBinaryString(sayı);

                            if (karsılastır1.length() != 8) {

                                while (karsılastır1.length() != 8)
                                    karsılastır1 = "0" + karsılastır1;
                            }
                            c = 0;
                            for (int d = 0; d < 8; d++) {
                                dizi[d] = karsılastır1.substring(d, d + 1);
                                if (dizi[d].equals(dizi2[d]))
                                    c = c + 1;
                            }
                        }
                    }
                    matris[i][j] = sayı;
                }
                else if (i > 0 && j > 0) {
                    karsılastır2 = Integer.toBinaryString(matris[i][j - 1]);
                    karsılastır3 = Integer.toBinaryString(matris[i - 1][j]);

                    if (karsılastır2.length() != 8) {
                        while (karsılastır2.length() != 8)
                            karsılastır2 = "0" + karsılastır2;
                    }

                    if (karsılastır3.length() != 8) {
                        while (karsılastır3.length() != 8)
                            karsılastır3 = "0" + karsılastır3;
                    }

                    c = 0;
                    f = 0;
                    for (int d = 0; d < 8; d++) {
                        dizi[d] = karsılastır1.substring(d, d + 1);
                        dizi2[d] = karsılastır2.substring(d, d + 1);
                        dizi3[d] = karsılastır3.substring(d, d + 1);

                        if (dizi[d].equals(dizi2[d]))
                            c = c + 1;
                        if (dizi[d].equals(dizi3[d]))
                            f = f + 1;
                    }
                    boolean kontrol = true;
                    if (c != 4 || f != 4) {
                        while (kontrol) {

                            sayı = rnd.nextInt(256);

                            karsılastır1 = Integer.toBinaryString(sayı);

                            if (karsılastır1.length() != 8) {
                                while (karsılastır1.length() != 8)
                                    karsılastır1 = "0" + karsılastır1;
                            }

                            c = 0;
                            f = 0;

                            for (int d = 0; d < 8; d++) {
                                dizi[d] = karsılastır1.substring(d, d + 1);
                                if (dizi[d].equals(dizi2[d]))
                                    c = c + 1;
                                if (dizi[d].equals(dizi3[d]))
                                    f = f + 1;
                            }
                            if (c == 4 && f == 4)
                                kontrol = false;
                        }
                    }
                    matris[i][j] = sayı;
                }
            }
        }
        return matris;

    }

    public static void main(String[] args) {
        int[][] mtrs = rastgele();

        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++)
                System.out.print(mtrs[i][j] + "\t");
            System.out.println();
        }
    }
}