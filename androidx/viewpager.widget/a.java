package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PagerAdapter.java */
/* loaded from: classes.dex */
public abstract class a {
    private final DataSetObservable a = new DataSetObservable();

    /* renamed from: b, reason: collision with root package name */
    private DataSetObserver f2078b;

    public abstract void a(ViewGroup viewGroup, int i2, Object obj);

    public abstract void b(ViewGroup viewGroup);

    public abstract int c();

    public int d(Object obj) {
        return -1;
    }

    public CharSequence e(int i2) {
        return null;
    }

    public float f(int i2) {
        return 1.0f;
    }

    public abstract Object g(ViewGroup viewGroup, int i2);

    public abstract boolean h(View view, Object obj);

    public void i() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f2078b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.a.notifyChanged();
    }

    public void j(DataSetObserver dataSetObserver) {
        this.a.registerObserver(dataSetObserver);
    }

    public abstract void k(Parcelable parcelable, ClassLoader classLoader);

    public abstract Parcelable l();

    public abstract void m(ViewGroup viewGroup, int i2, Object obj);

    void n(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f2078b = dataSetObserver;
        }
    }

    public abstract void o(ViewGroup viewGroup);

    public void p(DataSetObserver dataSetObserver) {
        this.a.unregisterObserver(dataSetObserver);
    }
}