package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class f33 {
    public static void a(String[] strArr, int i2, int i3, PriorityQueue<e33> priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            b(i2, e(strArr, 0, length), c(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jE = e(strArr, 0, 6);
        b(i2, jE, c(strArr, 0, 6), 6, priorityQueue);
        long jD = d(16785407L, 5);
        int i4 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i4 >= length2 - 5) {
                return;
            }
            jE = ((((((jE + 1073807359) - ((((b33.a(strArr[i4 - 1]) + 2147483647L) % 1073807359) * jD) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((b33.a(strArr[i4 + 5]) + 2147483647L) % 1073807359)) % 1073807359;
            b(i2, jE, c(strArr, i4, 6), length2, priorityQueue);
            i4++;
        }
    }

    static void b(int i2, long j2, String str, int i3, PriorityQueue<e33> priorityQueue) {
        e33 e33Var = new e33(j2, str, i3);
        if ((priorityQueue.size() != i2 || (priorityQueue.peek().f5573c <= e33Var.f5573c && priorityQueue.peek().a <= e33Var.a)) && !priorityQueue.contains(e33Var)) {
            priorityQueue.add(e33Var);
            if (priorityQueue.size() > i2) {
                priorityQueue.poll();
            }
        }
    }

    static String c(String[] strArr, int i2, int i3) {
        int i4 = i3 + i2;
        if (strArr.length < i4) {
            er.zzf("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i5 = i4 - 1;
            if (i2 >= i5) {
                sb.append(strArr[i5]);
                return sb.toString();
            }
            sb.append(strArr[i2]);
            sb.append(' ');
            i2++;
        }
    }

    static long d(long j2, int i2) {
        if (i2 == 1) {
            return j2;
        }
        return ((i2 & 1) == 0 ? d((j2 * j2) % 1073807359, i2 >> 1) : j2 * (d((j2 * j2) % 1073807359, i2 >> 1) % 1073807359)) % 1073807359;
    }

    private static long e(String[] strArr, int i2, int i3) {
        long jA = (b33.a(strArr[0]) + 2147483647L) % 1073807359;
        for (int i4 = 1; i4 < i3; i4++) {
            jA = (((jA * 16785407) % 1073807359) + ((b33.a(strArr[i4]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return jA;
    }
}