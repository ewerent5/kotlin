package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.w0;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements g.b, n, AdapterView.OnItemClickListener {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f169e = {R.attr.background, R.attr.divider};

    /* renamed from: f, reason: collision with root package name */
    private g f170f;

    /* renamed from: g, reason: collision with root package name */
    private int f171g;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.g.b
    public boolean a(i iVar) {
        return this.f170f.L(iVar, 0);
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(g gVar) {
        this.f170f = gVar;
    }

    public int getWindowAnimations() {
        return this.f171g;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        a((i) getAdapter().getItem(i2));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        w0 w0VarV = w0.v(context, attributeSet, f169e, i2, 0);
        if (w0VarV.s(0)) {
            setBackgroundDrawable(w0VarV.g(0));
        }
        if (w0VarV.s(1)) {
            setDivider(w0VarV.g(1));
        }
        w0VarV.w();
    }
}