package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.w0;
import c.h.l.t;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: e, reason: collision with root package name */
    private i f172e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f173f;

    /* renamed from: g, reason: collision with root package name */
    private RadioButton f174g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f175h;

    /* renamed from: i, reason: collision with root package name */
    private CheckBox f176i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f177j;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f178k;

    /* renamed from: l, reason: collision with root package name */
    private ImageView f179l;

    /* renamed from: m, reason: collision with root package name */
    private LinearLayout f180m;
    private Drawable n;
    private int o;
    private Context p;
    private boolean q;
    private Drawable r;
    private boolean s;
    private LayoutInflater t;
    private boolean u;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.a.C);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i2) {
        LinearLayout linearLayout = this.f180m;
        if (linearLayout != null) {
            linearLayout.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(c.a.g.f2501h, (ViewGroup) this, false);
        this.f176i = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(c.a.g.f2502i, (ViewGroup) this, false);
        this.f173f = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(c.a.g.f2504k, (ViewGroup) this, false);
        this.f174g = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.t == null) {
            this.t = LayoutInflater.from(getContext());
        }
        return this.t;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f178k;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f179l;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f179l.getLayoutParams();
        rect.top += this.f179l.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void e(i iVar, int i2) {
        this.f172e = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.i(this));
        setCheckable(iVar.isCheckable());
        h(iVar.A(), iVar.g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.f172e;
    }

    public void h(boolean z, char c2) {
        int i2 = (z && this.f172e.A()) ? 0 : 8;
        if (i2 == 0) {
            this.f177j.setText(this.f172e.h());
        }
        if (this.f177j.getVisibility() != i2) {
            this.f177j.setVisibility(i2);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        t.n0(this, this.n);
        TextView textView = (TextView) findViewById(c.a.f.M);
        this.f175h = textView;
        int i2 = this.o;
        if (i2 != -1) {
            textView.setTextAppearance(this.p, i2);
        }
        this.f177j = (TextView) findViewById(c.a.f.F);
        ImageView imageView = (ImageView) findViewById(c.a.f.I);
        this.f178k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.r);
        }
        this.f179l = (ImageView) findViewById(c.a.f.r);
        this.f180m = (LinearLayout) findViewById(c.a.f.f2493l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f173f != null && this.q) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f173f.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f174g == null && this.f176i == null) {
            return;
        }
        if (this.f172e.m()) {
            if (this.f174g == null) {
                g();
            }
            compoundButton = this.f174g;
            compoundButton2 = this.f176i;
        } else {
            if (this.f176i == null) {
                c();
            }
            compoundButton = this.f176i;
            compoundButton2 = this.f174g;
        }
        if (z) {
            compoundButton.setChecked(this.f172e.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f176i;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f174g;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f172e.m()) {
            if (this.f174g == null) {
                g();
            }
            compoundButton = this.f174g;
        } else {
            if (this.f176i == null) {
                c();
            }
            compoundButton = this.f176i;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.u = z;
        this.q = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f179l;
        if (imageView != null) {
            imageView.setVisibility((this.s || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f172e.z() || this.u;
        if (z || this.q) {
            ImageView imageView = this.f173f;
            if (imageView == null && drawable == null && !this.q) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.q) {
                this.f173f.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f173f;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f173f.getVisibility() != 0) {
                this.f173f.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f175h.getVisibility() != 8) {
                this.f175h.setVisibility(8);
            }
        } else {
            this.f175h.setText(charSequence);
            if (this.f175h.getVisibility() != 0) {
                this.f175h.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        w0 w0VarV = w0.v(getContext(), attributeSet, c.a.j.W1, i2, 0);
        this.n = w0VarV.g(c.a.j.Y1);
        this.o = w0VarV.n(c.a.j.X1, -1);
        this.q = w0VarV.a(c.a.j.Z1, false);
        this.p = context;
        this.r = w0VarV.g(c.a.j.a2);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, c.a.a.z, 0);
        this.s = typedArrayObtainStyledAttributes.hasValue(0);
        w0VarV.w();
        typedArrayObtainStyledAttributes.recycle();
    }
}