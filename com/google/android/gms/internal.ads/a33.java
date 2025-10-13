package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class a33 {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final x23 f4837b = new c33();

    public a33(int i2) {
        this.a = i2;
    }

    public final String a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(arrayList.get(i2).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] strArrSplit = sb.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        z23 z23Var = new z23();
        PriorityQueue priorityQueue = new PriorityQueue(this.a, new y23(this));
        for (String str : strArrSplit) {
            String[] strArrB = b33.b(str, false);
            if (strArrB.length != 0) {
                f33.a(strArrB, this.a, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                z23Var.f10536b.write(this.f4837b.a(((e33) it.next()).f5572b));
            } catch (IOException e2) {
                er.zzg("Error while writing hash to byteStream", e2);
            }
        }
        return z23Var.toString();
    }
}