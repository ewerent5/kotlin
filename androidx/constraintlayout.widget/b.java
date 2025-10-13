package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: ConstraintHelper.java */
/* loaded from: classes.dex */
public abstract class b extends View {

    /* renamed from: e, reason: collision with root package name */
    protected int[] f705e;

    /* renamed from: f, reason: collision with root package name */
    protected int f706f;

    /* renamed from: g, reason: collision with root package name */
    protected Context f707g;

    /* renamed from: h, reason: collision with root package name */
    protected c.f.b.k.h f708h;

    /* renamed from: i, reason: collision with root package name */
    protected boolean f709i;

    /* renamed from: j, reason: collision with root package name */
    protected String f710j;

    /* renamed from: k, reason: collision with root package name */
    protected String f711k;

    /* renamed from: l, reason: collision with root package name */
    private View[] f712l;

    /* renamed from: m, reason: collision with root package name */
    private HashMap<Integer, String> f713m;

    public b(Context context) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context);
        this.f705e = new int[32];
        this.f709i = false;
        this.f712l = null;
        this.f713m = new HashMap<>();
        this.f707g = context;
        h(null);
    }

    private void a(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (str == null || str.length() == 0 || this.f707g == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iG = g(strTrim);
        if (iG != 0) {
            this.f713m.put(Integer.valueOf(iG), strTrim);
            b(iG);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private void b(int i2) {
        if (i2 == getId()) {
            return;
        }
        int i3 = this.f706f + 1;
        int[] iArr = this.f705e;
        if (i3 > iArr.length) {
            this.f705e = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f705e;
        int i4 = this.f706f;
        iArr2[i4] = i2;
        this.f706f = i4 + 1;
    }

    private void c(String str) {
        if (str == null || str.length() == 0 || this.f707g == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && strTrim.equals(((ConstraintLayout.b) layoutParams).V)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    private int f(ConstraintLayout constraintLayout, String str) throws Resources.NotFoundException {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f707g.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            if (childAt.getId() != -1) {
                String resourceEntryName = null;
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int g(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iF = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objG = constraintLayout.g(0, str);
            if (objG instanceof Integer) {
                iF = ((Integer) objG).intValue();
            }
        }
        if (iF == 0 && constraintLayout != null) {
            iF = f(constraintLayout, str);
        }
        if (iF == 0) {
            try {
                iF = h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iF == 0 ? this.f707g.getResources().getIdentifier(str, "id", this.f707g.getPackageName()) : iF;
    }

    protected void d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        e((ConstraintLayout) parent);
    }

    protected void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i2 = 0; i2 < this.f706f; i2++) {
            View viewI = constraintLayout.i(this.f705e[i2]);
            if (viewI != null) {
                viewI.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    viewI.setTranslationZ(viewI.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f705e, this.f706f);
    }

    protected void h(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == i.m1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f710j = string;
                    setIds(string);
                } else if (index == i.n1) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f711k = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void i(c.f.b.k.e eVar, boolean z) {
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l(ConstraintLayout constraintLayout) {
    }

    public void m(ConstraintLayout constraintLayout) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        String str;
        int iF;
        if (isInEditMode()) {
            setIds(this.f710j);
        }
        c.f.b.k.h hVar = this.f708h;
        if (hVar == null) {
            return;
        }
        hVar.b();
        for (int i2 = 0; i2 < this.f706f; i2++) {
            int i3 = this.f705e[i2];
            View viewI = constraintLayout.i(i3);
            if (viewI == null && (iF = f(constraintLayout, (str = this.f713m.get(Integer.valueOf(i3))))) != 0) {
                this.f705e[i2] = iF;
                this.f713m.put(Integer.valueOf(iF), str);
                viewI = constraintLayout.i(iF);
            }
            if (viewI != null) {
                this.f708h.a(constraintLayout.j(viewI));
            }
        }
        this.f708h.c(constraintLayout.f665g);
    }

    public void n() {
        if (this.f708h == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).n0 = (c.f.b.k.e) this.f708h;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        String str = this.f710j;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f711k;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f709i) {
            super.onMeasure(i2, i3);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        this.f710j = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f706f = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i2);
            if (iIndexOf == -1) {
                a(str.substring(i2));
                return;
            } else {
                a(str.substring(i2, iIndexOf));
                i2 = iIndexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f711k = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f706f = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i2);
            if (iIndexOf == -1) {
                c(str.substring(i2));
                return;
            } else {
                c(str.substring(i2, iIndexOf));
                i2 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f710j = null;
        this.f706f = 0;
        for (int i2 : iArr) {
            b(i2);
        }
    }

    @Override // android.view.View
    public void setTag(int i2, Object obj) {
        super.setTag(i2, obj);
        if (obj == null && this.f710j == null) {
            b(i2);
        }
    }

    public b(Context context, AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context, attributeSet);
        this.f705e = new int[32];
        this.f709i = false;
        this.f712l = null;
        this.f713m = new HashMap<>();
        this.f707g = context;
        h(attributeSet);
    }
}