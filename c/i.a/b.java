package c.i.a;

import android.database.Cursor;
import android.widget.Filter;

/* compiled from: CursorFilter.java */
/* loaded from: classes.dex */
class b extends Filter {
    a a;

    /* compiled from: CursorFilter.java */
    interface a {
        void b(Cursor cursor);

        Cursor c();

        CharSequence d(Cursor cursor);

        Cursor e(CharSequence charSequence);
    }

    b(a aVar) {
        this.a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.a.d((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorE = this.a.e(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorE != null) {
            filterResults.count = cursorE.getCount();
            filterResults.values = cursorE;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursorC = this.a.c();
        Object obj = filterResults.values;
        if (obj == null || obj == cursorC) {
            return;
        }
        this.a.b((Cursor) obj);
    }
}