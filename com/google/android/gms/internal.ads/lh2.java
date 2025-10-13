package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.kh2;
import com.google.android.gms.internal.ads.lh2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class lh2<MessageType extends lh2<MessageType, BuilderType>, BuilderType extends kh2<MessageType, BuilderType>> implements lk2 {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    protected static <T> void j(Iterable<T> iterable, List<? super T> list) {
        oj2.a(iterable);
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size = list.size();
        for (T t : iterable) {
            if (t == null) {
                int size2 = list.size();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Element at index ");
                sb.append(size2 - size);
                sb.append(" is null.");
                String string = sb.toString();
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(string);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(t);
            }
        }
    }

    int c() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.lk2
    public final ci2 d() {
        try {
            int iF = f();
            ci2 ci2Var = ci2.f5319e;
            byte[] bArr = new byte[iF];
            li2 li2VarX = li2.x(bArr);
            a(li2VarX);
            li2VarX.c();
            return new zh2(bArr);
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    void h(int i2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.lk2
    public final byte[] i() {
        try {
            byte[] bArr = new byte[f()];
            li2 li2VarX = li2.x(bArr);
            a(li2VarX);
            li2VarX.c();
            return bArr;
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }
}