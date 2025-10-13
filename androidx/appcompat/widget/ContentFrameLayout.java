package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f335e;

    /* renamed from: f, reason: collision with root package name */
    private TypedValue f336f;

    /* renamed from: g, reason: collision with root package name */
    private TypedValue f337g;

    /* renamed from: h, reason: collision with root package name */
    private TypedValue f338h;

    /* renamed from: i, reason: collision with root package name */
    private TypedValue f339i;

    /* renamed from: j, reason: collision with root package name */
    private TypedValue f340j;

    /* renamed from: k, reason: collision with root package name */
    private final Rect f341k;

    /* renamed from: l, reason: collision with root package name */
    private a f342l;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public void b(int i2, int i3, int i4, int i5) {
        this.f341k.set(i2, i3, i4, i5);
        if (c.h.l.t.Q(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f339i == null) {
            this.f339i = new TypedValue();
        }
        return this.f339i;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f340j == null) {
            this.f340j = new TypedValue();
        }
        return this.f340j;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f337g == null) {
            this.f337g = new TypedValue();
        }
        return this.f337g;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f338h == null) {
            this.f338h = new TypedValue();
        }
        return this.f338h;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f335e == null) {
            this.f335e = new TypedValue();
        }
        return this.f335e;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f336f == null) {
            this.f336f = new TypedValue();
        }
        return this.f336f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f342l;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f342l;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f342l = aVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f341k = new Rect();
    }
}