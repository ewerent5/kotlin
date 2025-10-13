package c.i.a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ResourceCursorAdapter.java */
/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: m, reason: collision with root package name */
    private int f3188m;
    private int n;
    private LayoutInflater o;

    @Deprecated
    public c(Context context, int i2, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.n = i2;
        this.f3188m = i2;
        this.o = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // c.i.a.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.o.inflate(this.n, viewGroup, false);
    }

    @Override // c.i.a.a
    public View i(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.o.inflate(this.f3188m, viewGroup, false);
    }
}