import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // minmax - 1
        // int n = sc.nextInt();
        // double a = sc.nextDouble();
        // double b = sc.nextDouble();
        // double max, min, c;
        // if (a > b) {
        //     max = a;
        //     min = b;
        // } else {
        //     max = b;
        //     min = a;
        // };
        // for (int i = 3; i <= n; i++) {
        //     c = sc.nextDouble();
        //     if (c > max) max = c;
        //     if (c < min) min = c;
        // }
        // System.out.println(max + " " + min);

        // minmax - 2
        // int n = sc.nextInt();
        // double a0 = sc.nextDouble();
        // double b0 = sc.nextDouble();
        // double s = a0 * b0;
        // for (int i = 2; i <= n; i++) {
        //     double a = sc.nextDouble();
        //     double b = sc.nextDouble();
        //     if (a * b < s) s = a * b;
        // }
        // System.out.println(s);

        // minmax - 3
        // int n = sc.nextInt();
        // double p = 0;
        // for (int i = 1; i <= n; i++) {
        //     double a = sc.nextDouble();
        //     double b = sc.nextDouble();
        //     if (2 * (a + b) > p) p = 2 * (a + b);
        // }
        // System.out.println(p);

        // minmax - 4
        // int n = sc.nextInt();
        // double a = sc.nextDouble();
        // byte imin = 1;
        // for (byte i = 2; i <= n; i++) {
        //     double b = sc.nextDouble();
        //     if (b < a) {
        //         a = b;
        //         imin = i;
        //     }
        // }
        // System.out.println(imin);

        // minmax - 5
        // int n = sc.nextInt();
        // double max = 0;
        // for (int i = 1; i <= n; i++) {
        //     double m = sc.nextDouble();
        //     double v = sc.nextDouble();
        //     if (m / v > max) max = m / v;
        // }
        // System.out.println(max);

        // minmax - 6
        // int n = sc.nextInt();
        // int a = sc.nextInt();
        // int max = a;
        // int min = a;
        // byte imin = 1;
        // byte imax = 1;
        // for (byte i = 2; i <= n; i++) {
        //     a = sc.nextInt();
        //     if (a >= max) {
        //         max = a;
        //         imax = i;
        //     }
        //     if (a < min) {
        //         min = a;
        //         imin = i;
        //     }
        // }
        // System.out.println(imin + " " + imax);

        // minmax - 7
        // int n = sc.nextInt();
        // int a = sc.nextInt();
        // int max = a;
        // int min = a;
        // byte imin = 1;
        // byte imax = 1;
        // for (byte i = 2; i <= n; i++) {
        //     a = sc.nextInt();
        //     if (a > max) {
        //         max = a;
        //         imax = i;
        //     }
        //     if (a <= min) {
        //         min = a;
        //         imin = i;
        //     }
        // }
        // System.out.println(imax + " " + imin);

        // minmax - 8
        // int n = sc.nextInt();
        // int a = sc.nextInt();
        // int min = a;
        // byte fmin = 1;
        // byte lmin = 1;
        // for (byte i = 2; i <= n; i++) {
        //     a = sc.nextInt();
        //     if (a < min) {
        //         min = a;
        //         fmin = i;
        //     }
        //     if (a == min) lmin = i;
        // }
        // System.out.println(fmin + " " + lmin);

        // minmax - 9
        // int n = sc.nextInt();
        // int a = sc.nextInt();
        // int max = a;
        // byte fmax = 1;
        // byte lmax = 1;
        // for (byte i = 2; i <= n; i++) {
        //     a = sc.nextInt();
        //     if (a > max) {
        //         max = a;
        //         fmax = i;
        //     }
        //     if (a == max) lmax = i;
        // }
        // System.out.println(fmax + " " + lmax);

        // minmax - 10
        // int n = sc.nextInt();
        // int a = sc.nextInt();
        // int min = a;
        // int max = a;
        // byte imax = 1;
        // byte imin = 1;
        // for (byte i = 2; i <= n; i++) {
        //     a = sc.nextInt();
        //     if (a > max) {
        //         max = a;
        //         imax = i;
        //     }
        //     if (a < min) {
        //         min = a;
        //         imin = i;
        //     }
        // }
        // if (imax > imin) System.out.println(imin);
        // else System.out.println(imax);

        // minmax - 11
        // int n = sc.nextInt();
        // int a = sc.nextInt();
        // int min = a;
        // int max = a;
        // byte imax = 1;
        // byte imin = 1;
        // for (byte i = 2; i <= n; i++) {
        //     a = sc.nextInt();
        //     if (a >= max) {
        //         max = a;
        //         imax = i;
        //     }
        //     if (a <= min) {
        //         min = a;
        //         imin = i;
        //     }
        // }
        // if (imax < imin) System.out.println(imin);
        // else System.out.println(imax);

        // minmax - 12
        // int n = sc.nextInt();
        // int musbat = 0;
        // for (byte i = 1; i <= n; i++) {
        //     int a = sc.nextInt();
        //     if ((a > 0) && (a > musbat)) musbat = a;
        // }
        // System.out.println(musbat);

        // minmax - 13
        // int n = sc.nextInt();
        // int toq = 0;
        // byte imax = 0;
        // for (byte i = 1; i <= n; i++) {
        //     int a = sc.nextInt();
        //     if ((a % 2 != 0) && (a > toq)) {
        //         toq = a;
        //         imax = i;
        //     }
        // }
        // System.out.println(imax);

        // minmax - 14
        // int b = sc.nextInt();
        // byte imin = 0;
        // int min = b;
        // for (byte i = 1; i <= 10; i++) {
        //     int a = sc.nextInt();
        //     if (a <= min) {
        //         min = a;
        //         imin = i;
        //     }
        // }
        // if (imin == 0) System.out.println(imin + " " + imin);
        // else System.out.println(imin);

        // minmax - 15
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // byte imax = 0;
        // int max = b;
        // for (byte i = 1; i <= 10; i++) {
        //     int a = sc.nextInt();
        //     if ((a > max) && (a < c)) {
        //         max = a;
        //         imax = i;
        //     }
        // }
        // if (imax == 0) System.out.println(imax + " " + imax);
        // else System.out.println(imax);

        // minmax - 16
        // int n = sc.nextInt();
        // int a = sc.nextInt();
        // int min = a;
        // byte k = 1, soni = 0;
        // for (byte i = 2; i <= n; i++) {
        //     a = sc.nextInt();
        //     if (a < min) {
        //         soni = k;
        //         min = a;
        //     }
        //     k++;
        // }
        // System.out.println(soni);

        // minmax - 17
        // byte n = sc.nextByte();
        // int a = sc.nextInt();
        // int max = a;
        // int k = n - 2, soni = n - 1;
        // for (byte i = 2; i <= n; i++) {
        //     a = sc.nextInt();
        //     if (a >= max) {
        //         soni = k;
        //         max = a;
        //     }
        //     k--;
        // }
        // System.out.println(soni);

        // minmax - 18
        // int n = sc.nextInt();
        // int a = sc.nextInt();
        // int max = a;
        // int fmax = 1;
        // int lmax = 1;
        // for (byte i = 2; i <= n; i++) {
        //     a = sc.nextInt();
        //     if (a > max) {
        //         max = a;
        //         fmax = i;
        //     }
        //     if (a == max) lmax = i;
        // }
        // System.out.println(lmax - fmax - 1);

        // minmax - 19
        // int n = sc.nextInt();
        // int a = sc.nextInt();
        // int min = a;
        // byte k = 1;
        // for (byte i = 2; i <= n; i++) {
        //     a = sc.nextInt();
        //     if (a < min) {
        //         min = a;
        //         k = 1;
        //     }
        //     if (a == min) k++;
        // }
        // System.out.println(k);

        // minmax - 20
        // int n = sc.nextInt();
        // int a = sc.nextInt();
        // int min = a;
        // int max = a;
        // byte nmin = 0;
        // byte nmax = 1;
        // for (byte i = 2; i <= n; i++) {
        //     a = sc.nextInt();
        //     if (a < min) {
        //         min = a;
        //         nmin = 1;
        //     }
        //     if (a > max) {
        //         max = a;
        //         nmax = 1;
        //     }
        //     if (a == min) nmin++;
        //     if (a == max) nmax++;
        // }
        // System.out.println(nmin + nmax);

        // minmax - 21
        // int n = sc.nextInt();
        // double s = 0;
        // for (byte i = 1; i <= n; i++) {
        //     int a = sc.nextInt();
        //     s += a;
        // }
        // System.out.println(s / n);

        // minmax - 22
        // byte n = sc.nextByte();
        // int min1 = Integer.MAX_VALUE, min2 = min1;
        // for (byte i = 1; i <= n; i++) {
        //     int a = sc.nextInt();
        //     if (a < min2)
        //         if (a <= min1) {
        //             min2 = min1;
        //             min1 = a;
        //         }
        //     else min2 = a;
        // }
        // System.out.println(min2 + " " + min1);

        // minmax - 23
        // byte n = sc.nextByte();
        // int min1 = Integer.MAX_VALUE, min2 = min1, min3 = min1;
        // for (byte i = 1; i <= n; i++) {
        //     int a = sc.nextInt();
        //     if (a < min3)
        //         if (a < min2)
        //             if (a < min1) {
        //                 min3 = min2;
        //                 min2 = min1;
        //                 min1 = a;
        //             }
        //     else {
        //         min3 = min2;
        //         min2 = a;
        //     } else min3 = a;
        // }
        // System.out.println(min3 + " " + min2 + " " + min1);

        // minmax - 24
        // int n = sc.nextInt();
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int max = a + b;
        // for (byte i = 3; i <= n; i++) {
        //     a = sc.nextInt();
        //     if (b + a > max) max = b + a;
        //     b = a;
        // }
        // System.out.println(max);

        // minmax - 25
        // int n = sc.nextByte();
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int min = a + b;
        // int i1 = 1, i2 = 2;
        // for (int i = 2; i <= n - 1; i++) {
        //     a = sc.nextInt();
        //     if (b + a < min) {
        //         min = b + a;
        //         i1 = i;
        //         i2 = i + 1;
        //     }
        //     b = a;
        // }
        // System.out.println(i1 + " " + i2);

        // minmax - 26
        // byte n = sc.nextByte();
        // byte soni = 0;
        // byte maxsoni = 0;
        // for (int i = 1; i <= n; i++) {
        //     int a = sc.nextInt();
        //     if (a % 2 == 0) soni++;
        //     else soni = 0;
        //     if (soni > maxsoni) maxsoni = soni;
        // }
        // System.out.println(maxsoni);

        // minmax - 27
        // byte n = sc.nextByte();
        // int a = sc.nextInt();
        // int b = a;
        // int ibir = 1, imax = 1, soni = 1, maxsoni = 1;
        // for (int i = 2; i <= n; i++) {
        //     a = sc.nextInt();
        //     if (a == b) soni++;
        //     else soni = 1;
        //     if (soni == 2) ibir = i - 1;
        //     b = a;
        //     if (soni > maxsoni) {
        //         maxsoni = soni;
        //         imax = ibir;
        //     }
        // }
        // System.out.println(imax + " " + maxsoni);

        // minmax - 28
        // byte n = sc.nextByte();
        // int ibir = 1, imax = 1, soni = 0, maxsoni = 0;
        // for (int i = 1; i <= n; i++) {
        //     int a = sc.nextInt();
        //     if (a == 1) soni++;
        //     else soni = 0;
        //     if (soni == 1) ibir = i;
        //     if (soni > maxsoni) {
        //         maxsoni = soni;
        //         imax = ibir;
        //     }
        // }
        // if (maxsoni == 0) System.out.println(0);
        // else System.out.println(imax + " " + maxsoni);

        // minmax - 29
        // int n = sc.nextInt();
        // int a = sc.nextInt();
        // int min = a;
        // int b = a, soni = 1, maxsoni = 1;
        // for (int i = 2; i <= n; i++) {
        //     a = sc.nextInt();
        //     if (a < min) min = a;
        //     if (a == b) soni++;
        //     else soni = 1;
        //     if (soni > maxsoni) maxsoni = soni;
        //     b = a;
        // }
        // System.out.println(maxsoni);

        // minmax - 30
        // int n = sc.nextInt();
        // int max = Integer.MIN_VALUE;
        // int b = max, soni = 1, minsoni = Integer.MAX_VALUE, kksoni = 1;
        // for (int i = 1; i <= n; i++) {
        //     int a = sc.nextInt();
        //     if (a > max) {
        //         max = a;
        //         soni = 1;
        //         kksoni = 1;
        //     }
        //     if (a == b) soni++;
        //     else soni = 1;
        //     if (soni > kksoni) kksoni = soni;
        //     if (kksoni < minsoni) minsoni = kksoni;
        //     b = a;
        // }
        // System.out.println(kksoni);
        
        // byte n = sc.nextByte();
        // int max = Integer.MAX_VALUE;
        // byte soni = 1, minsoni = n;
        // for (byte i = 1; i <= n; i++) {
        //     int a = sc.nextInt();
        //     if ((i == 1) || (a > max)) {
        //         max = a;
        //         soni = 1;
        //         minsoni = n;
        //         break;
        //     }
        //     if (a == max) soni++;
        //     else {
        //         if (soni < minsoni) minsoni = soni;
        //         soni = 1;
        //     }

        //     if ((a == max) && (soni < minsoni)) minsoni = soni;
        // }
        // System.out.println(minsoni);




        sc.close();
    }

}