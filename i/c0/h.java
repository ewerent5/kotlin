package i.c0;

import i.y.d.l;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sequences.kt */
/* loaded from: classes3.dex */
public class h extends g {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    public static final class a<T> implements d<T> {
        final /* synthetic */ Iterator a;

        public a(Iterator it) {
            this.a = it;
        }

        @Override // i.c0.d
        public Iterator<T> iterator() {
            return this.a;
        }
    }

    public static <T> d<T> a(Iterator<? extends T> it) {
        l.d(it, "$this$asSequence");
        return b(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> d<T> b(d<? extends T> dVar) {
        l.d(dVar, "$this$constrainOnce");
        return dVar instanceof i.c0.a ? dVar : new i.c0.a(dVar);
    }
}