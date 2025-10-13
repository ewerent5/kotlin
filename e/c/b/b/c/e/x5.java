package e.c.b.b.c.e;

import e.c.b.b.c.e.x5;
import e.c.b.b.c.e.z5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public abstract class x5<MessageType extends x5<MessageType, BuilderType>, BuilderType extends z5<MessageType, BuilderType>> implements b9 {
    protected int zza = 0;

    protected static <T> void h(Iterable<T> iterable, List<? super T> list) {
        r7.d(iterable);
        if (iterable instanceof h8) {
            List<?> listZzb = ((h8) iterable).zzb();
            h8 h8Var = (h8) list;
            int size = list.size();
            for (Object obj : listZzb) {
                if (obj == null) {
                    int size2 = h8Var.size() - size;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String string = sb.toString();
                    for (int size3 = h8Var.size() - 1; size3 >= size; size3--) {
                        h8Var.remove(size3);
                    }
                    throw new NullPointerException(string);
                }
                if (obj instanceof g6) {
                    h8Var.D((g6) obj);
                } else {
                    h8Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof m9) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size4 = list.size();
        for (T t : iterable) {
            if (t == null) {
                int size5 = list.size() - size4;
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Element at index ");
                sb2.append(size5);
                sb2.append(" is null.");
                String string2 = sb2.toString();
                for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                    list.remove(size6);
                }
                throw new NullPointerException(string2);
            }
            list.add(t);
        }
    }

    @Override // e.c.b.b.c.e.b9
    public final g6 a() {
        try {
            o6 o6VarU = g6.u(b());
            e(o6VarU.b());
            return o6VarU.a();
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    public final byte[] i() {
        try {
            byte[] bArr = new byte[b()];
            y6 y6VarF = y6.f(bArr);
            e(y6VarF);
            y6VarF.N();
            return bArr;
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    int j() {
        throw new UnsupportedOperationException();
    }

    void k(int i2) {
        throw new UnsupportedOperationException();
    }
}