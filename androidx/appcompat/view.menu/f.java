package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* compiled from: MenuAdapter.java */
/* loaded from: classes.dex */
public class f extends BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    g f232e;

    /* renamed from: f, reason: collision with root package name */
    private int f233f = -1;

    /* renamed from: g, reason: collision with root package name */
    private boolean f234g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f235h;

    /* renamed from: i, reason: collision with root package name */
    private final LayoutInflater f236i;

    /* renamed from: j, reason: collision with root package name */
    private final int f237j;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i2) {
        this.f235h = z;
        this.f236i = layoutInflater;
        this.f232e = gVar;
        this.f237j = i2;
        a();
    }

    void a() {
        i iVarV = this.f232e.v();
        if (iVarV != null) {
            ArrayList<i> arrayListZ = this.f232e.z();
            int size = arrayListZ.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (arrayListZ.get(i2) == iVarV) {
                    this.f233f = i2;
                    return;
                }
            }
        }
        this.f233f = -1;
    }

    public g b() {
        return this.f232e;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public i getItem(int i2) {
        ArrayList<i> arrayListZ = this.f235h ? this.f232e.z() : this.f232e.E();
        int i3 = this.f233f;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return arrayListZ.get(i2);
    }

    public void d(boolean z) {
        this.f234g = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f233f < 0 ? (this.f235h ? this.f232e.z() : this.f232e.E()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f236i.inflate(this.f237j, viewGroup, false);
        }
        int groupId = getItem(i2).getGroupId();
        int i3 = i2 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f232e.F() && groupId != (i3 >= 0 ? getItem(i3).getGroupId() : groupId));
        n.a aVar = (n.a) view;
        if (this.f234g) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i2), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}