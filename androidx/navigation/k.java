package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.j;
import j$.lang.Iterable;
import j$.util.Iterator;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.v;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: NavGraph.java */
/* loaded from: classes.dex */
public class k extends j implements Iterable<j>, Iterable {
    final c.e.h<j> n;
    private int o;
    private String p;

    /* compiled from: NavGraph.java */
    class a implements Iterator<j>, j$.util.Iterator {

        /* renamed from: e, reason: collision with root package name */
        private int f1333e = -1;

        /* renamed from: f, reason: collision with root package name */
        private boolean f1334f = false;

        a() {
        }

        @Override // java.util.Iterator, j$.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f1334f = true;
            c.e.h<j> hVar = k.this.n;
            int i2 = this.f1333e + 1;
            this.f1333e = i2;
            return hVar.o(i2);
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.f1333e + 1 < k.this.n.n();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            if (!this.f1334f) {
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
            k.this.n.o(this.f1333e).y(null);
            k.this.n.m(this.f1333e);
            this.f1333e--;
            this.f1334f = false;
        }
    }

    public k(r<? extends k> rVar) {
        super(rVar);
        this.n = new c.e.h<>();
    }

    public final void E(j jVar) {
        int iN = jVar.n();
        if (iN == 0) {
            throw new IllegalArgumentException("Destinations must have an id. Call setId() or include an android:id in your navigation XML.");
        }
        if (iN == n()) {
            throw new IllegalArgumentException("Destination " + jVar + " cannot have the same id as graph " + this);
        }
        j jVarF = this.n.f(iN);
        if (jVarF == jVar) {
            return;
        }
        if (jVar.p() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (jVarF != null) {
            jVarF.y(null);
        }
        jVar.y(this);
        this.n.k(jVar.n(), jVar);
    }

    public final j F(int i2) {
        return G(i2, true);
    }

    final j G(int i2, boolean z) {
        j jVarF = this.n.f(i2);
        if (jVarF != null) {
            return jVarF;
        }
        if (!z || p() == null) {
            return null;
        }
        return p().F(i2);
    }

    String H() {
        if (this.p == null) {
            this.p = Integer.toString(this.o);
        }
        return this.p;
    }

    public final int I() {
        return this.o;
    }

    public final void J(int i2) {
        if (i2 != n()) {
            this.o = i2;
            this.p = null;
            return;
        }
        throw new IllegalArgumentException("Start destination " + i2 + " cannot use the same id as the graph " + this);
    }

    @Override // j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public final java.util.Iterator<j> iterator() {
        return new a();
    }

    @Override // androidx.navigation.j
    public String l() {
        return n() != 0 ? super.l() : "the root navigation";
    }

    @Override // androidx.navigation.j
    j.a r(i iVar) {
        j.a aVarR = super.r(iVar);
        java.util.Iterator<j> it = iterator();
        while (it.hasNext()) {
            j.a aVarR2 = it.next().r(iVar);
            if (aVarR2 != null && (aVarR == null || aVarR2.compareTo(aVarR) > 0)) {
                aVarR = aVarR2;
            }
        }
        return aVarR;
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return v.o(iterator(), 0);
    }

    @Override // androidx.navigation.j
    public void t(Context context, AttributeSet attributeSet) {
        super.t(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, androidx.navigation.v.a.y);
        J(typedArrayObtainAttributes.getResourceId(androidx.navigation.v.a.z, 0));
        this.p = j.m(context, this.o);
        typedArrayObtainAttributes.recycle();
    }

    @Override // androidx.navigation.j
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" startDestination=");
        j jVarF = F(I());
        if (jVarF == null) {
            String str = this.p;
            if (str == null) {
                sb.append("0x");
                sb.append(Integer.toHexString(this.o));
            } else {
                sb.append(str);
            }
        } else {
            sb.append("{");
            sb.append(jVarF.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}