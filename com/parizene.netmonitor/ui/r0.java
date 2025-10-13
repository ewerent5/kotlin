package com.parizene.netmonitor.ui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import ch.qos.logback.core.CoreConstants;

/* compiled from: EndlessRecyclerViewScrollListener.kt */
/* loaded from: classes3.dex */
public abstract class r0 extends RecyclerView.t {
    public static final a a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final int f14019b;

    /* renamed from: c, reason: collision with root package name */
    private int f14020c;

    /* renamed from: d, reason: collision with root package name */
    private int f14021d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14022e;

    /* renamed from: f, reason: collision with root package name */
    private final int f14023f;

    /* renamed from: g, reason: collision with root package name */
    private RecyclerView.o f14024g;

    /* compiled from: EndlessRecyclerViewScrollListener.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i.y.d.g gVar) {
            this();
        }
    }

    /* compiled from: EndlessRecyclerViewScrollListener.kt */
    private static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        private final int f14025e;

        /* renamed from: f, reason: collision with root package name */
        private final int f14026f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f14027g;

        /* compiled from: EndlessRecyclerViewScrollListener.kt */
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                i.y.d.l.d(parcel, "parcel");
                return new b(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i2) {
                return new b[i2];
            }
        }

        public b(int i2, int i3, boolean z) {
            this.f14025e = i2;
            this.f14026f = i3;
            this.f14027g = z;
        }

        public final int a() {
            return this.f14025e;
        }

        public final int b() {
            return this.f14026f;
        }

        public final boolean c() {
            return this.f14027g;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f14025e == bVar.f14025e && this.f14026f == bVar.f14026f && this.f14027g == bVar.f14027g;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int i2 = ((this.f14025e * 31) + this.f14026f) * 31;
            boolean z = this.f14027g;
            int i3 = z;
            if (z != 0) {
                i3 = 1;
            }
            return i2 + i3;
        }

        public String toString() {
            return "SavedState(currentPage=" + this.f14025e + ", previousTotalItemCount=" + this.f14026f + ", isLoading=" + this.f14027g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            i.y.d.l.d(parcel, "out");
            parcel.writeInt(this.f14025e);
            parcel.writeInt(this.f14026f);
            parcel.writeInt(this.f14027g ? 1 : 0);
        }
    }

    public r0(LinearLayoutManager linearLayoutManager) {
        i.y.d.l.d(linearLayoutManager, "layoutManager");
        this.f14022e = true;
        this.f14024g = linearLayoutManager;
        this.f14019b = 5;
    }

    private final int c(int[] iArr) {
        int length = iArr.length - 1;
        int i2 = 0;
        if (length < 0) {
            return 0;
        }
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            if (i2 == 0 || iArr[i2] > i3) {
                int i5 = iArr[i2];
                i3 = i5;
            }
            if (i4 > length) {
                return i3;
            }
            i2 = i4;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void b(RecyclerView recyclerView, int i2, int i3) {
        int iL2;
        i.y.d.l.d(recyclerView, "view");
        int iI0 = this.f14024g.i0();
        RecyclerView.o oVar = this.f14024g;
        if (oVar instanceof StaggeredGridLayoutManager) {
            int[] iArrQ2 = ((StaggeredGridLayoutManager) oVar).q2(null);
            i.y.d.l.c(iArrQ2, "lastVisibleItemPositions");
            iL2 = c(iArrQ2);
        } else {
            iL2 = oVar instanceof GridLayoutManager ? ((GridLayoutManager) oVar).l2() : oVar instanceof LinearLayoutManager ? ((LinearLayoutManager) oVar).l2() : 0;
        }
        if (iI0 < this.f14021d) {
            this.f14020c = this.f14023f;
            this.f14021d = iI0;
            if (iI0 == 0) {
                this.f14022e = true;
            }
        }
        if (this.f14022e && iI0 > this.f14021d) {
            this.f14022e = false;
            this.f14021d = iI0;
        }
        if (this.f14022e || iL2 + this.f14019b <= Math.max(iI0, 50)) {
            return;
        }
        int i4 = this.f14020c + 1;
        this.f14020c = i4;
        d(i4, iI0, recyclerView);
        this.f14022e = true;
    }

    public abstract void d(int i2, int i3, RecyclerView recyclerView);

    public final void e() {
        this.f14020c = this.f14023f;
        this.f14021d = 0;
        this.f14022e = true;
    }

    public final void f(Bundle bundle) {
        i.y.d.l.d(bundle, "inState");
        b bVar = (b) bundle.getParcelable("EndlessRecyclerViewScrollListener_saved_state");
        if (bVar == null) {
            return;
        }
        this.f14020c = bVar.a();
        this.f14021d = bVar.b();
        this.f14022e = bVar.c();
    }

    public final void g(Bundle bundle) {
        i.y.d.l.d(bundle, "outState");
        bundle.putParcelable("EndlessRecyclerViewScrollListener_saved_state", new b(this.f14020c, this.f14021d, this.f14022e));
    }
}