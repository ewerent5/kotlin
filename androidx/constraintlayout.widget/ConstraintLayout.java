package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import c.f.b.k.e;
import c.f.b.k.k;
import c.f.b.k.m.b;
import ch.qos.logback.core.net.SyslogConstants;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.ws.WebSocketProtocol;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private int A;

    /* renamed from: e, reason: collision with root package name */
    SparseArray<View> f663e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<androidx.constraintlayout.widget.b> f664f;

    /* renamed from: g, reason: collision with root package name */
    protected c.f.b.k.f f665g;

    /* renamed from: h, reason: collision with root package name */
    private int f666h;

    /* renamed from: i, reason: collision with root package name */
    private int f667i;

    /* renamed from: j, reason: collision with root package name */
    private int f668j;

    /* renamed from: k, reason: collision with root package name */
    private int f669k;

    /* renamed from: l, reason: collision with root package name */
    protected boolean f670l;

    /* renamed from: m, reason: collision with root package name */
    private int f671m;
    private d n;
    protected androidx.constraintlayout.widget.c o;
    private int p;
    private HashMap<String, Integer> q;
    private int r;
    private int s;
    int t;
    int u;
    int v;
    int w;
    private SparseArray<c.f.b.k.e> x;
    c y;
    private int z;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.b.values().length];
            a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class c implements b.InterfaceC0049b {
        ConstraintLayout a;

        /* renamed from: b, reason: collision with root package name */
        int f684b;

        /* renamed from: c, reason: collision with root package name */
        int f685c;

        /* renamed from: d, reason: collision with root package name */
        int f686d;

        /* renamed from: e, reason: collision with root package name */
        int f687e;

        /* renamed from: f, reason: collision with root package name */
        int f688f;

        /* renamed from: g, reason: collision with root package name */
        int f689g;

        public c(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
        }

        private boolean d(int i2, int i3, int i4) {
            if (i2 == i3) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i4 == size;
            }
            return false;
        }

        @Override // c.f.b.k.m.b.InterfaceC0049b
        public final void a() {
            int childCount = this.a.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.a.getChildAt(i2);
                if (childAt instanceof g) {
                    ((g) childAt).a(this.a);
                }
            }
            int size = this.a.f664f.size();
            if (size > 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    ((androidx.constraintlayout.widget.b) this.a.f664f.get(i3)).k(this.a);
                }
            }
        }

        @Override // c.f.b.k.m.b.InterfaceC0049b
        @SuppressLint({"WrongCall"})
        public final void b(c.f.b.k.e eVar, b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int i2;
            int measuredHeight;
            int i3;
            if (eVar == null) {
                return;
            }
            if (eVar.Q() == 8 && !eVar.a0()) {
                aVar.f2884h = 0;
                aVar.f2885i = 0;
                aVar.f2886j = 0;
                return;
            }
            if (eVar.I() == null) {
                return;
            }
            e.b bVar = aVar.f2880d;
            e.b bVar2 = aVar.f2881e;
            int i4 = aVar.f2882f;
            int i5 = aVar.f2883g;
            int i6 = this.f684b + this.f685c;
            int i7 = this.f686d;
            View view = (View) eVar.q();
            int[] iArr = a.a;
            int i8 = iArr[bVar.ordinal()];
            if (i8 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            } else if (i8 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f688f, i7, -2);
            } else if (i8 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f688f, i7 + eVar.z(), -1);
            } else if (i8 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f688f, i7, -2);
                boolean z = eVar.q == 1;
                int i9 = aVar.f2889m;
                if (i9 == b.a.f2878b || i9 == b.a.f2879c) {
                    if (aVar.f2889m == b.a.f2879c || !z || (z && (view.getMeasuredHeight() == eVar.v())) || (view instanceof g) || eVar.e0()) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.R(), 1073741824);
                    }
                }
            }
            int i10 = iArr[bVar2.ordinal()];
            if (i10 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            } else if (i10 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f689g, i6, -2);
            } else if (i10 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f689g, i6 + eVar.P(), -1);
            } else if (i10 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f689g, i6, -2);
                boolean z2 = eVar.r == 1;
                int i11 = aVar.f2889m;
                if (i11 == b.a.f2878b || i11 == b.a.f2879c) {
                    if (aVar.f2889m == b.a.f2879c || !z2 || (z2 && (view.getMeasuredWidth() == eVar.R())) || (view instanceof g) || eVar.f0()) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.v(), 1073741824);
                    }
                }
            }
            c.f.b.k.f fVar = (c.f.b.k.f) eVar.I();
            if (fVar != null && c.f.b.k.j.b(ConstraintLayout.this.f671m, 256) && view.getMeasuredWidth() == eVar.R() && view.getMeasuredWidth() < fVar.R() && view.getMeasuredHeight() == eVar.v() && view.getMeasuredHeight() < fVar.v() && view.getBaseline() == eVar.n() && !eVar.d0()) {
                if (d(eVar.A(), iMakeMeasureSpec, eVar.R()) && d(eVar.B(), iMakeMeasureSpec2, eVar.v())) {
                    aVar.f2884h = eVar.R();
                    aVar.f2885i = eVar.v();
                    aVar.f2886j = eVar.n();
                    return;
                }
            }
            e.b bVar3 = e.b.MATCH_CONSTRAINT;
            boolean z3 = bVar == bVar3;
            boolean z4 = bVar2 == bVar3;
            e.b bVar4 = e.b.MATCH_PARENT;
            boolean z5 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
            boolean z6 = bVar == bVar4 || bVar == e.b.FIXED;
            boolean z7 = z3 && eVar.X > 0.0f;
            boolean z8 = z4 && eVar.X > 0.0f;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i12 = aVar.f2889m;
            if (i12 != b.a.f2878b && i12 != b.a.f2879c && z3 && eVar.q == 0 && z4 && eVar.r == 0) {
                i3 = -1;
                measuredHeight = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof j) && (eVar instanceof k)) {
                    ((j) view).o((k) eVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                eVar.F0(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i13 = eVar.t;
                iMax = i13 > 0 ? Math.max(i13, measuredWidth) : measuredWidth;
                int i14 = eVar.u;
                if (i14 > 0) {
                    iMax = Math.min(i14, iMax);
                }
                int i15 = eVar.w;
                if (i15 > 0) {
                    measuredHeight = Math.max(i15, measuredHeight2);
                    i2 = iMakeMeasureSpec;
                } else {
                    i2 = iMakeMeasureSpec;
                    measuredHeight = measuredHeight2;
                }
                int i16 = eVar.x;
                if (i16 > 0) {
                    measuredHeight = Math.min(i16, measuredHeight);
                }
                if (!c.f.b.k.j.b(ConstraintLayout.this.f671m, 1)) {
                    if (z7 && z5) {
                        iMax = (int) ((measuredHeight * eVar.X) + 0.5f);
                    } else if (z8 && z6) {
                        measuredHeight = (int) ((iMax / eVar.X) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight2 != measuredHeight) {
                    int iMakeMeasureSpec3 = measuredWidth != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i2;
                    if (measuredHeight2 != measuredHeight) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    eVar.F0(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i3 = -1;
            }
            boolean z9 = baseline != i3;
            aVar.f2888l = (iMax == aVar.f2882f && measuredHeight == aVar.f2883g) ? false : true;
            if (bVar5.Y) {
                z9 = true;
            }
            if (z9 && baseline != -1 && eVar.n() != baseline) {
                aVar.f2888l = true;
            }
            aVar.f2884h = iMax;
            aVar.f2885i = measuredHeight;
            aVar.f2887k = z9;
            aVar.f2886j = baseline;
        }

        public void c(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f684b = i4;
            this.f685c = i5;
            this.f686d = i6;
            this.f687e = i7;
            this.f688f = i2;
            this.f689g = i3;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        super(context, attributeSet);
        this.f663e = new SparseArray<>();
        this.f664f = new ArrayList<>(4);
        this.f665g = new c.f.b.k.f();
        this.f666h = 0;
        this.f667i = 0;
        this.f668j = Integer.MAX_VALUE;
        this.f669k = Integer.MAX_VALUE;
        this.f670l = true;
        this.f671m = 257;
        this.n = null;
        this.o = null;
        this.p = -1;
        this.q = new HashMap<>();
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = 0;
        this.w = 0;
        this.x = new SparseArray<>();
        this.y = new c(this);
        this.z = 0;
        this.A = 0;
        k(attributeSet, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Build.VERSION.SDK_INT >= 17 ? Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart()) : 0;
        return iMax2 > 0 ? iMax2 : iMax;
    }

    private final c.f.b.k.e h(int i2) {
        if (i2 == 0) {
            return this.f665g;
        }
        View viewFindViewById = this.f663e.get(i2);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i2)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f665g;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).n0;
    }

    private void k(AttributeSet attributeSet, int i2, int i3) throws XmlPullParserException, IOException {
        this.f665g.l0(this);
        this.f665g.D1(this.y);
        this.f663e.put(getId(), this);
        this.n = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.a1, i2, i3);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == i.f1) {
                    this.f666h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f666h);
                } else if (index == i.g1) {
                    this.f667i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f667i);
                } else if (index == i.d1) {
                    this.f668j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f668j);
                } else if (index == i.e1) {
                    this.f669k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f669k);
                } else if (index == i.n2) {
                    this.f671m = typedArrayObtainStyledAttributes.getInt(index, this.f671m);
                } else if (index == i.o1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            n(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.o = null;
                        }
                    }
                } else if (index == i.l1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.n = dVar;
                        dVar.m(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.n = null;
                    }
                    this.p = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f665g.E1(this.f671m);
    }

    private void m() {
        this.f670l = true;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = 0;
        this.w = 0;
    }

    private void q() throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            c.f.b.k.e eVarJ = j(getChildAt(i2));
            if (eVarJ != null) {
                eVarJ.h0();
            }
        }
        if (zIsInEditMode) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    r(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    h(childAt.getId()).m0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.p != -1) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt2 = getChildAt(i4);
                if (childAt2.getId() == this.p && (childAt2 instanceof e)) {
                    this.n = ((e) childAt2).getConstraintSet();
                }
            }
        }
        d dVar = this.n;
        if (dVar != null) {
            dVar.d(this, true);
        }
        this.f665g.d1();
        int size = this.f664f.size();
        if (size > 0) {
            for (int i5 = 0; i5 < size; i5++) {
                this.f664f.get(i5).m(this);
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt3 = getChildAt(i6);
            if (childAt3 instanceof g) {
                ((g) childAt3).b(this);
            }
        }
        this.x.clear();
        this.x.put(0, this.f665g);
        this.x.put(getId(), this.f665g);
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt4 = getChildAt(i7);
            this.x.put(childAt4.getId(), j(childAt4));
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt5 = getChildAt(i8);
            c.f.b.k.e eVarJ2 = j(childAt5);
            if (eVarJ2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f665g.a(eVarJ2);
                d(zIsInEditMode, childAt5, eVarJ2, bVar, this.x);
            }
        }
    }

    private boolean t() throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int childCount = getChildCount();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            if (getChildAt(i2).isLayoutRequested()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            q();
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void d(boolean r20, android.view.View r21, c.f.b.k.e r22, androidx.constraintlayout.widget.ConstraintLayout.b r23, android.util.SparseArray<c.f.b.k.e> r24) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.d(boolean, android.view.View, c.f.b.k.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.f664f;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.f664f.get(i2).l(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i4 = Integer.parseInt(strArrSplit[0]);
                        int i5 = Integer.parseInt(strArrSplit[1]);
                        int i6 = Integer.parseInt(strArrSplit[2]);
                        int i7 = (int) ((i4 / 1080.0f) * width);
                        int i8 = (int) ((i5 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i7;
                        float f3 = i8;
                        float f4 = i7 + ((int) ((i6 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float f5 = i8 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, f5, paint);
                        canvas.drawLine(f4, f5, f2, f5, paint);
                        canvas.drawLine(f2, f5, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, f5, paint);
                        canvas.drawLine(f2, f5, f4, f3, paint);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void forceLayout() {
        m();
        super.forceLayout();
    }

    public Object g(int i2, Object obj) {
        if (i2 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.q;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.q.get(str);
    }

    public int getMaxHeight() {
        return this.f669k;
    }

    public int getMaxWidth() {
        return this.f668j;
    }

    public int getMinHeight() {
        return this.f667i;
    }

    public int getMinWidth() {
        return this.f666h;
    }

    public int getOptimizationLevel() {
        return this.f665g.s1();
    }

    public View i(int i2) {
        return this.f663e.get(i2);
    }

    public final c.f.b.k.e j(View view) {
        if (view == this) {
            return this.f665g;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).n0;
    }

    protected boolean l() {
        if (Build.VERSION.SDK_INT >= 17) {
            return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
        }
        return false;
    }

    protected void n(int i2) {
        this.o = new androidx.constraintlayout.widget.c(getContext(), this, i2);
    }

    protected void o(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        c cVar = this.y;
        int i6 = cVar.f687e;
        int i7 = i4 + cVar.f686d;
        int i8 = i5 + i6;
        if (Build.VERSION.SDK_INT < 11) {
            setMeasuredDimension(i7, i8);
            this.r = i7;
            this.s = i8;
            return;
        }
        int iResolveSizeAndState = ViewGroup.resolveSizeAndState(i7, i2, 0);
        int iResolveSizeAndState2 = ViewGroup.resolveSizeAndState(i8, i3, 0) & 16777215;
        int iMin = Math.min(this.f668j, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f669k, iResolveSizeAndState2);
        if (z) {
            iMin |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z2) {
            iMin2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        setMeasuredDimension(iMin, iMin2);
        this.r = iMin;
        this.s = iMin2;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            b bVar = (b) childAt.getLayoutParams();
            c.f.b.k.e eVar = bVar.n0;
            if ((childAt.getVisibility() != 8 || bVar.Z || bVar.a0 || bVar.c0 || zIsInEditMode) && !bVar.b0) {
                int iS = eVar.S();
                int iT = eVar.T();
                int iR = eVar.R() + iS;
                int iV = eVar.v() + iT;
                childAt.layout(iS, iT, iR, iV);
                if ((childAt instanceof g) && (content = ((g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iS, iT, iR, iV);
                }
            }
        }
        int size = this.f664f.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.f664f.get(i7).j(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (!this.f670l) {
            int childCount = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                if (getChildAt(i4).isLayoutRequested()) {
                    this.f670l = true;
                    break;
                }
                i4++;
            }
        }
        if (!this.f670l) {
            int i5 = this.z;
            if (i5 == i2 && this.A == i3) {
                o(i2, i3, this.f665g.R(), this.f665g.v(), this.f665g.y1(), this.f665g.w1());
                return;
            }
            if (i5 == i2 && View.MeasureSpec.getMode(i2) == 1073741824 && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.A) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i3) >= this.f665g.v()) {
                this.z = i2;
                this.A = i3;
                o(i2, i3, this.f665g.R(), this.f665g.v(), this.f665g.y1(), this.f665g.w1());
                return;
            }
        }
        this.z = i2;
        this.A = i3;
        this.f665g.F1(l());
        if (this.f670l) {
            this.f670l = false;
            if (t()) {
                this.f665g.H1();
            }
        }
        p(this.f665g, this.f671m, i2, i3);
        o(i2, i3, this.f665g.R(), this.f665g.v(), this.f665g.y1(), this.f665g.w1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        c.f.b.k.e eVarJ = j(view);
        if ((view instanceof Guideline) && !(eVarJ instanceof c.f.b.k.g)) {
            b bVar = (b) view.getLayoutParams();
            c.f.b.k.g gVar = new c.f.b.k.g();
            bVar.n0 = gVar;
            bVar.Z = true;
            gVar.j1(bVar.S);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.n();
            ((b) view.getLayoutParams()).a0 = true;
            if (!this.f664f.contains(bVar2)) {
                this.f664f.add(bVar2);
            }
        }
        this.f663e.put(view.getId(), view);
        this.f670l = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f663e.remove(view.getId());
        this.f665g.c1(j(view));
        this.f664f.remove(view);
        this.f670l = true;
    }

    protected void p(c.f.b.k.f fVar, int i2, int i3, int i4) {
        int iMax;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        int iMax2 = Math.max(0, getPaddingTop());
        int iMax3 = Math.max(0, getPaddingBottom());
        int i5 = iMax2 + iMax3;
        int paddingWidth = getPaddingWidth();
        this.y.c(i3, i4, iMax2, iMax3, paddingWidth, i5);
        if (Build.VERSION.SDK_INT >= 17) {
            int iMax4 = Math.max(0, getPaddingStart());
            int iMax5 = Math.max(0, getPaddingEnd());
            if (iMax4 <= 0 && iMax5 <= 0) {
                iMax4 = Math.max(0, getPaddingLeft());
            } else if (l()) {
                iMax4 = iMax5;
            }
            iMax = iMax4;
        } else {
            iMax = Math.max(0, getPaddingLeft());
        }
        int i6 = size - paddingWidth;
        int i7 = size2 - i5;
        s(fVar, mode, i6, mode2, i7);
        fVar.z1(i2, mode, i6, mode2, i7, this.r, this.s, iMax, iMax2);
    }

    public void r(int i2, Object obj, Object obj2) {
        if (i2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.q == null) {
                this.q = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.q.put(strSubstring, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        m();
        super.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r2
  0x003e: PHI (r2v4 c.f.b.k.e$b) = (r2v3 c.f.b.k.e$b), (r2v0 c.f.b.k.e$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void s(c.f.b.k.f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.y
            int r1 = r0.f687e
            int r0 = r0.f686d
            c.f.b.k.e$b r2 = c.f.b.k.e.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L2e
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = 0
            goto L38
        L1a:
            int r9 = r7.f668j
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L38
        L23:
            c.f.b.k.e$b r9 = c.f.b.k.e.b.WRAP_CONTENT
            if (r3 != 0) goto L18
            int r10 = r7.f666h
            int r10 = java.lang.Math.max(r6, r10)
            goto L38
        L2e:
            c.f.b.k.e$b r9 = c.f.b.k.e.b.WRAP_CONTENT
            if (r3 != 0) goto L38
            int r10 = r7.f666h
            int r10 = java.lang.Math.max(r6, r10)
        L38:
            if (r11 == r5) goto L53
            if (r11 == 0) goto L48
            if (r11 == r4) goto L40
        L3e:
            r12 = 0
            goto L5d
        L40:
            int r11 = r7.f669k
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L5d
        L48:
            c.f.b.k.e$b r2 = c.f.b.k.e.b.WRAP_CONTENT
            if (r3 != 0) goto L3e
            int r11 = r7.f667i
            int r12 = java.lang.Math.max(r6, r11)
            goto L5d
        L53:
            c.f.b.k.e$b r2 = c.f.b.k.e.b.WRAP_CONTENT
            if (r3 != 0) goto L5d
            int r11 = r7.f667i
            int r12 = java.lang.Math.max(r6, r11)
        L5d:
            int r11 = r8.R()
            if (r10 != r11) goto L69
            int r11 = r8.v()
            if (r12 == r11) goto L6c
        L69:
            r8.v1()
        L6c:
            r8.V0(r6)
            r8.W0(r6)
            int r11 = r7.f668j
            int r11 = r11 - r0
            r8.H0(r11)
            int r11 = r7.f669k
            int r11 = r11 - r1
            r8.G0(r11)
            r8.K0(r6)
            r8.J0(r6)
            r8.z0(r9)
            r8.U0(r10)
            r8.Q0(r2)
            r8.v0(r12)
            int r9 = r7.f666h
            int r9 = r9 - r0
            r8.K0(r9)
            int r9 = r7.f667i
            int r9 = r9 - r1
            r8.J0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.s(c.f.b.k.f, int, int, int, int):void");
    }

    public void setConstraintSet(d dVar) {
        this.n = dVar;
    }

    @Override // android.view.View
    public void setId(int i2) {
        this.f663e.remove(getId());
        super.setId(i2);
        this.f663e.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 == this.f669k) {
            return;
        }
        this.f669k = i2;
        requestLayout();
    }

    public void setMaxWidth(int i2) {
        if (i2 == this.f668j) {
            return;
        }
        this.f668j = i2;
        requestLayout();
    }

    public void setMinHeight(int i2) {
        if (i2 == this.f667i) {
            return;
        }
        this.f667i = i2;
        requestLayout();
    }

    public void setMinWidth(int i2) {
        if (i2 == this.f666h) {
            return;
        }
        this.f666h = i2;
        requestLayout();
    }

    public void setOnConstraintsChanged(f fVar) {
        androidx.constraintlayout.widget.c cVar = this.o;
        if (cVar != null) {
            cVar.c(fVar);
        }
    }

    public void setOptimizationLevel(int i2) {
        this.f671m = i2;
        this.f665g.E1(i2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) throws XmlPullParserException, IOException {
        super(context, attributeSet, i2);
        this.f663e = new SparseArray<>();
        this.f664f = new ArrayList<>(4);
        this.f665g = new c.f.b.k.f();
        this.f666h = 0;
        this.f667i = 0;
        this.f668j = Integer.MAX_VALUE;
        this.f669k = Integer.MAX_VALUE;
        this.f670l = true;
        this.f671m = 257;
        this.n = null;
        this.o = null;
        this.p = -1;
        this.q = new HashMap<>();
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = 0;
        this.w = 0;
        this.x = new SparseArray<>();
        this.y = new c(this);
        this.z = 0;
        this.A = 0;
        k(attributeSet, i2, 0);
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public float A;
        public String B;
        float C;
        int D;
        public float E;
        public float F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public float O;
        public float P;
        public int Q;
        public int R;
        public int S;
        public boolean T;
        public boolean U;
        public String V;
        boolean W;
        boolean X;
        boolean Y;
        boolean Z;
        public int a;
        boolean a0;

        /* renamed from: b, reason: collision with root package name */
        public int f672b;
        boolean b0;

        /* renamed from: c, reason: collision with root package name */
        public float f673c;
        boolean c0;

        /* renamed from: d, reason: collision with root package name */
        public int f674d;
        int d0;

        /* renamed from: e, reason: collision with root package name */
        public int f675e;
        int e0;

        /* renamed from: f, reason: collision with root package name */
        public int f676f;
        int f0;

        /* renamed from: g, reason: collision with root package name */
        public int f677g;
        int g0;

        /* renamed from: h, reason: collision with root package name */
        public int f678h;
        int h0;

        /* renamed from: i, reason: collision with root package name */
        public int f679i;
        int i0;

        /* renamed from: j, reason: collision with root package name */
        public int f680j;
        float j0;

        /* renamed from: k, reason: collision with root package name */
        public int f681k;
        int k0;

        /* renamed from: l, reason: collision with root package name */
        public int f682l;
        int l0;

        /* renamed from: m, reason: collision with root package name */
        public int f683m;
        float m0;
        public int n;
        c.f.b.k.e n0;
        public float o;
        public boolean o0;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public int x;
        public int y;
        public float z;

        private static class a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(i.N1, 8);
                sparseIntArray.append(i.O1, 9);
                sparseIntArray.append(i.Q1, 10);
                sparseIntArray.append(i.R1, 11);
                sparseIntArray.append(i.X1, 12);
                sparseIntArray.append(i.W1, 13);
                sparseIntArray.append(i.v1, 14);
                sparseIntArray.append(i.u1, 15);
                sparseIntArray.append(i.s1, 16);
                sparseIntArray.append(i.w1, 2);
                sparseIntArray.append(i.y1, 3);
                sparseIntArray.append(i.x1, 4);
                sparseIntArray.append(i.f2, 49);
                sparseIntArray.append(i.g2, 50);
                sparseIntArray.append(i.C1, 5);
                sparseIntArray.append(i.D1, 6);
                sparseIntArray.append(i.E1, 7);
                sparseIntArray.append(i.b1, 1);
                sparseIntArray.append(i.S1, 17);
                sparseIntArray.append(i.T1, 18);
                sparseIntArray.append(i.B1, 19);
                sparseIntArray.append(i.A1, 20);
                sparseIntArray.append(i.j2, 21);
                sparseIntArray.append(i.m2, 22);
                sparseIntArray.append(i.k2, 23);
                sparseIntArray.append(i.h2, 24);
                sparseIntArray.append(i.l2, 25);
                sparseIntArray.append(i.i2, 26);
                sparseIntArray.append(i.J1, 29);
                sparseIntArray.append(i.Y1, 30);
                sparseIntArray.append(i.z1, 44);
                sparseIntArray.append(i.L1, 45);
                sparseIntArray.append(i.a2, 46);
                sparseIntArray.append(i.K1, 47);
                sparseIntArray.append(i.Z1, 48);
                sparseIntArray.append(i.q1, 27);
                sparseIntArray.append(i.p1, 28);
                sparseIntArray.append(i.b2, 31);
                sparseIntArray.append(i.F1, 32);
                sparseIntArray.append(i.d2, 33);
                sparseIntArray.append(i.c2, 34);
                sparseIntArray.append(i.e2, 35);
                sparseIntArray.append(i.H1, 36);
                sparseIntArray.append(i.G1, 37);
                sparseIntArray.append(i.I1, 38);
                sparseIntArray.append(i.M1, 39);
                sparseIntArray.append(i.V1, 40);
                sparseIntArray.append(i.P1, 41);
                sparseIntArray.append(i.t1, 42);
                sparseIntArray.append(i.r1, 43);
                a.append(i.U1, 51);
            }
        }

        public b(Context context, AttributeSet attributeSet) throws NumberFormatException {
            int i2;
            super(context, attributeSet);
            this.a = -1;
            this.f672b = -1;
            this.f673c = -1.0f;
            this.f674d = -1;
            this.f675e = -1;
            this.f676f = -1;
            this.f677g = -1;
            this.f678h = -1;
            this.f679i = -1;
            this.f680j = -1;
            this.f681k = -1;
            this.f682l = -1;
            this.f683m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = false;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = 0.5f;
            this.n0 = new c.f.b.k.e();
            this.o0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = a.a.get(index);
                switch (i4) {
                    case 1:
                        this.S = typedArrayObtainStyledAttributes.getInt(index, this.S);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f683m);
                        this.f683m = resourceId;
                        if (resourceId == -1) {
                            this.f683m = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.n);
                        break;
                    case 4:
                        float f2 = typedArrayObtainStyledAttributes.getFloat(index, this.o) % 360.0f;
                        this.o = f2;
                        if (f2 < 0.0f) {
                            this.o = (360.0f - f2) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.f672b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f672b);
                        break;
                    case 7:
                        this.f673c = typedArrayObtainStyledAttributes.getFloat(index, this.f673c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f674d);
                        this.f674d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f674d = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f675e);
                        this.f675e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f675e = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f676f);
                        this.f676f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f676f = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f677g);
                        this.f677g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f677g = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f678h);
                        this.f678h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f678h = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f679i);
                        this.f679i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f679i = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f680j);
                        this.f680j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f680j = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f681k);
                        this.f681k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f681k = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f682l);
                        this.f682l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f682l = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId11;
                        if (resourceId11 == -1) {
                            this.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.q);
                        this.q = resourceId12;
                        if (resourceId12 == -1) {
                            this.q = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.r);
                        this.r = resourceId13;
                        if (resourceId13 == -1) {
                            this.r = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId14;
                        if (resourceId14 == -1) {
                            this.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.t);
                        break;
                    case 22:
                        this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.u);
                        break;
                    case 23:
                        this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        break;
                    case SyslogConstants.LOG_DAEMON /* 24 */:
                        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 25:
                        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 26:
                        this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 27:
                        this.T = typedArrayObtainStyledAttributes.getBoolean(index, this.T);
                        break;
                    case 28:
                        this.U = typedArrayObtainStyledAttributes.getBoolean(index, this.U);
                        break;
                    case 29:
                        this.z = typedArrayObtainStyledAttributes.getFloat(index, this.z);
                        break;
                    case 30:
                        this.A = typedArrayObtainStyledAttributes.getFloat(index, this.A);
                        break;
                    case 31:
                        int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.I = i5;
                        if (i5 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i6 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.J = i6;
                        if (i6 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.O));
                        this.I = 2;
                        break;
                    case 36:
                        try {
                            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.P = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.P));
                        this.J = 2;
                        break;
                    default:
                        switch (i4) {
                            case 44:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = Float.NaN;
                                this.D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.B.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i2 = 0;
                                    } else {
                                        String strSubstring = this.B.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.D = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.D = 1;
                                        }
                                        i2 = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.B.indexOf(58);
                                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                        String strSubstring2 = this.B.substring(i2);
                                        if (strSubstring2.length() > 0) {
                                            this.C = Float.parseFloat(strSubstring2);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        String strSubstring3 = this.B.substring(i2, iIndexOf2);
                                        String strSubstring4 = this.B.substring(iIndexOf2 + 1);
                                        if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                            break;
                                        } else {
                                            try {
                                                float f3 = Float.parseFloat(strSubstring3);
                                                float f4 = Float.parseFloat(strSubstring4);
                                                if (f3 <= 0.0f || f4 <= 0.0f) {
                                                    break;
                                                } else if (this.D == 1) {
                                                    this.C = Math.abs(f4 / f3);
                                                    break;
                                                } else {
                                                    this.C = Math.abs(f3 / f4);
                                                    break;
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    break;
                                }
                                break;
                            case 45:
                                this.E = typedArrayObtainStyledAttributes.getFloat(index, this.E);
                                break;
                            case 46:
                                this.F = typedArrayObtainStyledAttributes.getFloat(index, this.F);
                                break;
                            case 47:
                                this.G = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case SyslogConstants.LOG_LPR /* 48 */:
                                this.H = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                break;
                            case 50:
                                this.R = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.R);
                                break;
                            case 51:
                                this.V = typedArrayObtainStyledAttributes.getString(index);
                                break;
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.Z = false;
            this.W = true;
            this.X = true;
            int i2 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i2 == -2 && this.T) {
                this.W = false;
                if (this.I == 0) {
                    this.I = 1;
                }
            }
            int i3 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i3 == -2 && this.U) {
                this.X = false;
                if (this.J == 0) {
                    this.J = 1;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.W = false;
                if (i2 == 0 && this.I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.T = true;
                }
            }
            if (i3 == 0 || i3 == -1) {
                this.X = false;
                if (i3 == 0 && this.J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.U = true;
                }
            }
            if (this.f673c == -1.0f && this.a == -1 && this.f672b == -1) {
                return;
            }
            this.Z = true;
            this.W = true;
            this.X = true;
            if (!(this.n0 instanceof c.f.b.k.g)) {
                this.n0 = new c.f.b.k.g();
            }
            ((c.f.b.k.g) this.n0).j1(this.S);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instructions count: 263
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i2, int i3) {
            super(i2, i3);
            this.a = -1;
            this.f672b = -1;
            this.f673c = -1.0f;
            this.f674d = -1;
            this.f675e = -1;
            this.f676f = -1;
            this.f677g = -1;
            this.f678h = -1;
            this.f679i = -1;
            this.f680j = -1;
            this.f681k = -1;
            this.f682l = -1;
            this.f683m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = false;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = 0.5f;
            this.n0 = new c.f.b.k.e();
            this.o0 = false;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = -1;
            this.f672b = -1;
            this.f673c = -1.0f;
            this.f674d = -1;
            this.f675e = -1;
            this.f676f = -1;
            this.f677g = -1;
            this.f678h = -1;
            this.f679i = -1;
            this.f680j = -1;
            this.f681k = -1;
            this.f682l = -1;
            this.f683m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = false;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = 0.5f;
            this.n0 = new c.f.b.k.e();
            this.o0 = false;
        }
    }
}