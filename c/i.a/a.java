package c.i.a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import c.i.a.b;

/* compiled from: CursorAdapter.java */
/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: e, reason: collision with root package name */
    protected boolean f3180e;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f3181f;

    /* renamed from: g, reason: collision with root package name */
    protected Cursor f3182g;

    /* renamed from: h, reason: collision with root package name */
    protected Context f3183h;

    /* renamed from: i, reason: collision with root package name */
    protected int f3184i;

    /* renamed from: j, reason: collision with root package name */
    protected C0060a f3185j;

    /* renamed from: k, reason: collision with root package name */
    protected DataSetObserver f3186k;

    /* renamed from: l, reason: collision with root package name */
    protected c.i.a.b f3187l;

    /* compiled from: CursorAdapter.java */
    /* renamed from: c.i.a.a$a, reason: collision with other inner class name */
    private class C0060a extends ContentObserver {
        C0060a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            a.this.j();
        }
    }

    /* compiled from: CursorAdapter.java */
    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f3180e = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f3180e = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
        g(context, cursor, z ? 1 : 2);
    }

    public void b(Cursor cursor) {
        Cursor cursorK = k(cursor);
        if (cursorK != null) {
            cursorK.close();
        }
    }

    @Override // c.i.a.b.a
    public Cursor c() {
        return this.f3182g;
    }

    public abstract CharSequence d(Cursor cursor);

    public abstract void f(View view, Context context, Cursor cursor);

    void g(Context context, Cursor cursor, int i2) {
        if ((i2 & 1) == 1) {
            i2 |= 2;
            this.f3181f = true;
        } else {
            this.f3181f = false;
        }
        boolean z = cursor != null;
        this.f3182g = cursor;
        this.f3180e = z;
        this.f3183h = context;
        this.f3184i = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i2 & 2) == 2) {
            this.f3185j = new C0060a();
            this.f3186k = new b();
        } else {
            this.f3185j = null;
            this.f3186k = null;
        }
        if (z) {
            C0060a c0060a = this.f3185j;
            if (c0060a != null) {
                cursor.registerContentObserver(c0060a);
            }
            DataSetObserver dataSetObserver = this.f3186k;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f3180e || (cursor = this.f3182g) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f3180e) {
            return null;
        }
        this.f3182g.moveToPosition(i2);
        if (view == null) {
            view = h(this.f3183h, this.f3182g, viewGroup);
        }
        f(view, this.f3183h, this.f3182g);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f3187l == null) {
            this.f3187l = new c.i.a.b(this);
        }
        return this.f3187l;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.f3180e || (cursor = this.f3182g) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f3182g;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        Cursor cursor;
        if (this.f3180e && (cursor = this.f3182g) != null && cursor.moveToPosition(i2)) {
            return this.f3182g.getLong(this.f3184i);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f3180e) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f3182g.moveToPosition(i2)) {
            if (view == null) {
                view = i(this.f3183h, this.f3182g, viewGroup);
            }
            f(view, this.f3183h, this.f3182g);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i2);
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View i(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void j() {
        Cursor cursor;
        if (!this.f3181f || (cursor = this.f3182g) == null || cursor.isClosed()) {
            return;
        }
        this.f3180e = this.f3182g.requery();
    }

    public Cursor k(Cursor cursor) {
        Cursor cursor2 = this.f3182g;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0060a c0060a = this.f3185j;
            if (c0060a != null) {
                cursor2.unregisterContentObserver(c0060a);
            }
            DataSetObserver dataSetObserver = this.f3186k;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f3182g = cursor;
        if (cursor != null) {
            C0060a c0060a2 = this.f3185j;
            if (c0060a2 != null) {
                cursor.registerContentObserver(c0060a2);
            }
            DataSetObserver dataSetObserver2 = this.f3186k;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f3184i = cursor.getColumnIndexOrThrow("_id");
            this.f3180e = true;
            notifyDataSetChanged();
        } else {
            this.f3184i = -1;
            this.f3180e = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}