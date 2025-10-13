package c.t.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import c.h.d.c;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import okhttp3.internal.ws.WebSocketProtocol;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VectorDrawableCompat.java */
/* loaded from: classes.dex */
public class i extends c.t.a.a.h {

    /* renamed from: f, reason: collision with root package name */
    static final PorterDuff.Mode f3454f = PorterDuff.Mode.SRC_IN;

    /* renamed from: g, reason: collision with root package name */
    private h f3455g;

    /* renamed from: h, reason: collision with root package name */
    private PorterDuffColorFilter f3456h;

    /* renamed from: i, reason: collision with root package name */
    private ColorFilter f3457i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f3458j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f3459k;

    /* renamed from: l, reason: collision with root package name */
    private Drawable.ConstantState f3460l;

    /* renamed from: m, reason: collision with root package name */
    private final float[] f3461m;
    private final Matrix n;
    private final Rect o;

    /* compiled from: VectorDrawableCompat.java */
    private static class b extends f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3483b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.a = c.h.d.c.d(string2);
            }
            this.f3484c = androidx.core.content.c.g.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // c.t.a.a.i.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (androidx.core.content.c.g.r(xmlPullParser, "pathData")) {
                TypedArray typedArrayS = androidx.core.content.c.g.s(resources, theme, attributeSet, c.t.a.a.a.f3432d);
                f(typedArrayS, xmlPullParser);
                typedArrayS.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    private static class h extends Drawable.ConstantState {
        int a;

        /* renamed from: b, reason: collision with root package name */
        g f3498b;

        /* renamed from: c, reason: collision with root package name */
        ColorStateList f3499c;

        /* renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f3500d;

        /* renamed from: e, reason: collision with root package name */
        boolean f3501e;

        /* renamed from: f, reason: collision with root package name */
        Bitmap f3502f;

        /* renamed from: g, reason: collision with root package name */
        ColorStateList f3503g;

        /* renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f3504h;

        /* renamed from: i, reason: collision with root package name */
        int f3505i;

        /* renamed from: j, reason: collision with root package name */
        boolean f3506j;

        /* renamed from: k, reason: collision with root package name */
        boolean f3507k;

        /* renamed from: l, reason: collision with root package name */
        Paint f3508l;

        public h(h hVar) {
            this.f3499c = null;
            this.f3500d = i.f3454f;
            if (hVar != null) {
                this.a = hVar.a;
                g gVar = new g(hVar.f3498b);
                this.f3498b = gVar;
                if (hVar.f3498b.f3490f != null) {
                    gVar.f3490f = new Paint(hVar.f3498b.f3490f);
                }
                if (hVar.f3498b.f3489e != null) {
                    this.f3498b.f3489e = new Paint(hVar.f3498b.f3489e);
                }
                this.f3499c = hVar.f3499c;
                this.f3500d = hVar.f3500d;
                this.f3501e = hVar.f3501e;
            }
        }

        public boolean a(int i2, int i3) {
            return i2 == this.f3502f.getWidth() && i3 == this.f3502f.getHeight();
        }

        public boolean b() {
            return !this.f3507k && this.f3503g == this.f3499c && this.f3504h == this.f3500d && this.f3506j == this.f3501e && this.f3505i == this.f3498b.getRootAlpha();
        }

        public void c(int i2, int i3) {
            if (this.f3502f == null || !a(i2, i3)) {
                this.f3502f = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                this.f3507k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f3502f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f3508l == null) {
                Paint paint = new Paint();
                this.f3508l = paint;
                paint.setFilterBitmap(true);
            }
            this.f3508l.setAlpha(this.f3498b.getRootAlpha());
            this.f3508l.setColorFilter(colorFilter);
            return this.f3508l;
        }

        public boolean f() {
            return this.f3498b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f3498b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f3498b.g(iArr);
            this.f3507k |= zG;
            return zG;
        }

        public void i() {
            this.f3503g = this.f3499c;
            this.f3504h = this.f3500d;
            this.f3505i = this.f3498b.getRootAlpha();
            this.f3506j = this.f3501e;
            this.f3507k = false;
        }

        public void j(int i2, int i3) {
            this.f3502f.eraseColor(0);
            this.f3498b.b(new Canvas(this.f3502f), i2, i3, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new i(this);
        }

        public h() {
            this.f3499c = null;
            this.f3500d = i.f3454f;
            this.f3498b = new g();
        }
    }

    i() {
        this.f3459k = true;
        this.f3461m = new float[9];
        this.n = new Matrix();
        this.o = new Rect();
        this.f3455g = new h();
    }

    static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (Color.alpha(i2) * f2)) << 24);
    }

    public static i b(Resources resources, int i2, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            i iVar = new i();
            iVar.f3453e = androidx.core.content.c.f.a(resources, i2, theme);
            iVar.f3460l = new C0076i(iVar.f3453e.getConstantState());
            return iVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i2);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return c(resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        } catch (XmlPullParserException e3) {
            Log.e("VectorDrawableCompat", "parser error", e3);
            return null;
        }
    }

    public static i c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        i iVar = new i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f3455g;
        g gVar = hVar.f3498b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f3493i);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f3471b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.q.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    hVar.a = cVar.f3485d | hVar.a;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f3471b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.q.put(bVar.getPathName(), bVar);
                    }
                    hVar.a = bVar.f3485d | hVar.a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f3471b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.q.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.a = dVar2.f3480k | hVar.a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1;
    }

    private static PorterDuff.Mode g(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f3455g;
        g gVar = hVar.f3498b;
        hVar.f3500d = g(androidx.core.content.c.g.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListG = androidx.core.content.c.g.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListG != null) {
            hVar.f3499c = colorStateListG;
        }
        hVar.f3501e = androidx.core.content.c.g.e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f3501e);
        gVar.f3496l = androidx.core.content.c.g.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f3496l);
        float fJ = androidx.core.content.c.g.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f3497m);
        gVar.f3497m = fJ;
        if (gVar.f3496l <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fJ <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f3494j = typedArray.getDimension(3, gVar.f3494j);
        float dimension = typedArray.getDimension(2, gVar.f3495k);
        gVar.f3495k = dimension;
        if (gVar.f3494j <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(androidx.core.content.c.g.j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.o = string;
            gVar.q.put(string, gVar);
        }
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f3453e;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    Object d(String str) {
        return this.f3455g.f3498b.q.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.o);
        if (this.o.width() <= 0 || this.o.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f3457i;
        if (colorFilter == null) {
            colorFilter = this.f3456h;
        }
        canvas.getMatrix(this.n);
        this.n.getValues(this.f3461m);
        float fAbs = Math.abs(this.f3461m[0]);
        float fAbs2 = Math.abs(this.f3461m[4]);
        float fAbs3 = Math.abs(this.f3461m[1]);
        float fAbs4 = Math.abs(this.f3461m[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (this.o.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (this.o.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.o;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.o.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.o.offsetTo(0, 0);
        this.f3455g.c(iMin, iMin2);
        if (!this.f3459k) {
            this.f3455g.j(iMin, iMin2);
        } else if (!this.f3455g.b()) {
            this.f3455g.j(iMin, iMin2);
            this.f3455g.i();
        }
        this.f3455g.d(canvas, colorFilter, this.o);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f3453e;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f3455g.f3498b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f3453e;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3455g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3453e;
        return drawable != null ? androidx.core.graphics.drawable.a.e(drawable) : this.f3457i;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f3453e != null && Build.VERSION.SDK_INT >= 24) {
            return new C0076i(this.f3453e.getConstantState());
        }
        this.f3455g.a = getChangingConfigurations();
        return this.f3455g;
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f3453e;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3455g.f3498b.f3495k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f3453e;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3455g.f3498b.f3494j;
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    void h(boolean z) {
        this.f3459k = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f3453e;
        return drawable != null ? androidx.core.graphics.drawable.a.h(drawable) : this.f3455g.f3501e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f3453e;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f3455g) != null && (hVar.g() || ((colorStateList = this.f3455g.f3499c) != null && colorStateList.isStateful())));
    }

    PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3458j && super.mutate() == this) {
            this.f3455g = new h(this.f3455g);
            this.f3458j = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        h hVar = this.f3455g;
        ColorStateList colorStateList = hVar.f3499c;
        if (colorStateList != null && (mode = hVar.f3500d) != null) {
            this.f3456h = j(this.f3456h, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f3455g.f3498b.getRootAlpha() != i2) {
            this.f3455g.f3498b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z);
        } else {
            this.f3455g.f3501e = z;
        }
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i2, PorterDuff.Mode mode) {
        super.setColorFilter(i2, mode);
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i2) {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f3455g;
        if (hVar.f3499c != colorStateList) {
            hVar.f3499c = colorStateList;
            this.f3456h = j(this.f3456h, colorStateList, hVar.f3500d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
            return;
        }
        h hVar = this.f3455g;
        if (hVar.f3500d != mode) {
            hVar.f3500d = mode;
            this.f3456h = j(this.f3456h, hVar.f3499c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f3453e;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: c.t.a.a.i$i, reason: collision with other inner class name */
    private static class C0076i extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public C0076i(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            i iVar = new i();
            iVar.f3453e = (VectorDrawable) this.a.newDrawable();
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f3453e = (VectorDrawable) this.a.newDrawable(resources);
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f3453e = (VectorDrawable) this.a.newDrawable(resources, theme);
            return iVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3457i = colorFilter;
            invalidateSelf();
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    private static abstract class f extends e {
        protected c.b[] a;

        /* renamed from: b, reason: collision with root package name */
        String f3483b;

        /* renamed from: c, reason: collision with root package name */
        int f3484c;

        /* renamed from: d, reason: collision with root package name */
        int f3485d;

        public f() {
            super();
            this.a = null;
            this.f3484c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            c.b[] bVarArr = this.a;
            if (bVarArr != null) {
                c.b.e(bVarArr, path);
            }
        }

        public c.b[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.f3483b;
        }

        public void setPathData(c.b[] bVarArr) {
            if (c.h.d.c.b(this.a, bVarArr)) {
                c.h.d.c.j(this.a, bVarArr);
            } else {
                this.a = c.h.d.c.f(bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.a = null;
            this.f3484c = 0;
            this.f3483b = fVar.f3483b;
            this.f3485d = fVar.f3485d;
            this.a = c.h.d.c.f(fVar.a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f3455g;
        hVar.f3498b = new g();
        TypedArray typedArrayS = androidx.core.content.c.g.s(resources, theme, attributeSet, c.t.a.a.a.a);
        i(typedArrayS, xmlPullParser, theme);
        typedArrayS.recycle();
        hVar.a = getChangingConfigurations();
        hVar.f3507k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f3456h = j(this.f3456h, hVar.f3499c, hVar.f3500d);
    }

    i(h hVar) {
        this.f3459k = true;
        this.f3461m = new float[9];
        this.n = new Matrix();
        this.o = new Rect();
        this.f3455g = hVar;
        this.f3456h = j(this.f3456h, hVar.f3499c, hVar.f3500d);
    }

    /* compiled from: VectorDrawableCompat.java */
    private static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        private int[] f3462e;

        /* renamed from: f, reason: collision with root package name */
        androidx.core.content.c.b f3463f;

        /* renamed from: g, reason: collision with root package name */
        float f3464g;

        /* renamed from: h, reason: collision with root package name */
        androidx.core.content.c.b f3465h;

        /* renamed from: i, reason: collision with root package name */
        float f3466i;

        /* renamed from: j, reason: collision with root package name */
        float f3467j;

        /* renamed from: k, reason: collision with root package name */
        float f3468k;

        /* renamed from: l, reason: collision with root package name */
        float f3469l;

        /* renamed from: m, reason: collision with root package name */
        float f3470m;
        Paint.Cap n;
        Paint.Join o;
        float p;

        c() {
            this.f3464g = 0.0f;
            this.f3466i = 1.0f;
            this.f3467j = 1.0f;
            this.f3468k = 0.0f;
            this.f3469l = 1.0f;
            this.f3470m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
        }

        private Paint.Cap e(int i2, Paint.Cap cap) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i2, Paint.Join join) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f3462e = null;
            if (androidx.core.content.c.g.r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f3483b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.a = c.h.d.c.d(string2);
                }
                this.f3465h = androidx.core.content.c.g.i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f3467j = androidx.core.content.c.g.j(typedArray, xmlPullParser, "fillAlpha", 12, this.f3467j);
                this.n = e(androidx.core.content.c.g.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.n);
                this.o = f(androidx.core.content.c.g.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.o);
                this.p = androidx.core.content.c.g.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.p);
                this.f3463f = androidx.core.content.c.g.i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f3466i = androidx.core.content.c.g.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f3466i);
                this.f3464g = androidx.core.content.c.g.j(typedArray, xmlPullParser, "strokeWidth", 4, this.f3464g);
                this.f3469l = androidx.core.content.c.g.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f3469l);
                this.f3470m = androidx.core.content.c.g.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f3470m);
                this.f3468k = androidx.core.content.c.g.j(typedArray, xmlPullParser, "trimPathStart", 5, this.f3468k);
                this.f3484c = androidx.core.content.c.g.k(typedArray, xmlPullParser, "fillType", 13, this.f3484c);
            }
        }

        @Override // c.t.a.a.i.e
        public boolean a() {
            return this.f3465h.i() || this.f3463f.i();
        }

        @Override // c.t.a.a.i.e
        public boolean b(int[] iArr) {
            return this.f3463f.j(iArr) | this.f3465h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayS = androidx.core.content.c.g.s(resources, theme, attributeSet, c.t.a.a.a.f3431c);
            h(typedArrayS, xmlPullParser, theme);
            typedArrayS.recycle();
        }

        float getFillAlpha() {
            return this.f3467j;
        }

        int getFillColor() {
            return this.f3465h.e();
        }

        float getStrokeAlpha() {
            return this.f3466i;
        }

        int getStrokeColor() {
            return this.f3463f.e();
        }

        float getStrokeWidth() {
            return this.f3464g;
        }

        float getTrimPathEnd() {
            return this.f3469l;
        }

        float getTrimPathOffset() {
            return this.f3470m;
        }

        float getTrimPathStart() {
            return this.f3468k;
        }

        void setFillAlpha(float f2) {
            this.f3467j = f2;
        }

        void setFillColor(int i2) {
            this.f3465h.k(i2);
        }

        void setStrokeAlpha(float f2) {
            this.f3466i = f2;
        }

        void setStrokeColor(int i2) {
            this.f3463f.k(i2);
        }

        void setStrokeWidth(float f2) {
            this.f3464g = f2;
        }

        void setTrimPathEnd(float f2) {
            this.f3469l = f2;
        }

        void setTrimPathOffset(float f2) {
            this.f3470m = f2;
        }

        void setTrimPathStart(float f2) {
            this.f3468k = f2;
        }

        c(c cVar) {
            super(cVar);
            this.f3464g = 0.0f;
            this.f3466i = 1.0f;
            this.f3467j = 1.0f;
            this.f3468k = 0.0f;
            this.f3469l = 1.0f;
            this.f3470m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
            this.f3462e = cVar.f3462e;
            this.f3463f = cVar.f3463f;
            this.f3464g = cVar.f3464g;
            this.f3466i = cVar.f3466i;
            this.f3465h = cVar.f3465h;
            this.f3484c = cVar.f3484c;
            this.f3467j = cVar.f3467j;
            this.f3468k = cVar.f3468k;
            this.f3469l = cVar.f3469l;
            this.f3470m = cVar.f3470m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    private static class g {
        private static final Matrix a = new Matrix();

        /* renamed from: b, reason: collision with root package name */
        private final Path f3486b;

        /* renamed from: c, reason: collision with root package name */
        private final Path f3487c;

        /* renamed from: d, reason: collision with root package name */
        private final Matrix f3488d;

        /* renamed from: e, reason: collision with root package name */
        Paint f3489e;

        /* renamed from: f, reason: collision with root package name */
        Paint f3490f;

        /* renamed from: g, reason: collision with root package name */
        private PathMeasure f3491g;

        /* renamed from: h, reason: collision with root package name */
        private int f3492h;

        /* renamed from: i, reason: collision with root package name */
        final d f3493i;

        /* renamed from: j, reason: collision with root package name */
        float f3494j;

        /* renamed from: k, reason: collision with root package name */
        float f3495k;

        /* renamed from: l, reason: collision with root package name */
        float f3496l;

        /* renamed from: m, reason: collision with root package name */
        float f3497m;
        int n;
        String o;
        Boolean p;
        final c.e.a<String, Object> q;

        public g() {
            this.f3488d = new Matrix();
            this.f3494j = 0.0f;
            this.f3495k = 0.0f;
            this.f3496l = 0.0f;
            this.f3497m = 0.0f;
            this.n = 255;
            this.o = null;
            this.p = null;
            this.q = new c.e.a<>();
            this.f3493i = new d();
            this.f3486b = new Path();
            this.f3487c = new Path();
        }

        private static float a(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            dVar.a.set(matrix);
            dVar.a.preConcat(dVar.f3479j);
            canvas.save();
            for (int i4 = 0; i4 < dVar.f3471b.size(); i4++) {
                e eVar = dVar.f3471b.get(i4);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.a, canvas, i2, i3, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i2, i3, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            float f2 = i2 / this.f3496l;
            float f3 = i3 / this.f3497m;
            float fMin = Math.min(f2, f3);
            Matrix matrix = dVar.a;
            this.f3488d.set(matrix);
            this.f3488d.postScale(f2, f3);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            fVar.d(this.f3486b);
            Path path = this.f3486b;
            this.f3487c.reset();
            if (fVar.c()) {
                this.f3487c.setFillType(fVar.f3484c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f3487c.addPath(path, this.f3488d);
                canvas.clipPath(this.f3487c);
                return;
            }
            c cVar = (c) fVar;
            float f4 = cVar.f3468k;
            if (f4 != 0.0f || cVar.f3469l != 1.0f) {
                float f5 = cVar.f3470m;
                float f6 = (f4 + f5) % 1.0f;
                float f7 = (cVar.f3469l + f5) % 1.0f;
                if (this.f3491g == null) {
                    this.f3491g = new PathMeasure();
                }
                this.f3491g.setPath(this.f3486b, false);
                float length = this.f3491g.getLength();
                float f8 = f6 * length;
                float f9 = f7 * length;
                path.reset();
                if (f8 > f9) {
                    this.f3491g.getSegment(f8, length, path, true);
                    this.f3491g.getSegment(0.0f, f9, path, true);
                } else {
                    this.f3491g.getSegment(f8, f9, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f3487c.addPath(path, this.f3488d);
            if (cVar.f3465h.l()) {
                androidx.core.content.c.b bVar = cVar.f3465h;
                if (this.f3490f == null) {
                    Paint paint = new Paint(1);
                    this.f3490f = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f3490f;
                if (bVar.h()) {
                    Shader shaderF = bVar.f();
                    shaderF.setLocalMatrix(this.f3488d);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f3467j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(i.a(bVar.e(), cVar.f3467j));
                }
                paint2.setColorFilter(colorFilter);
                this.f3487c.setFillType(cVar.f3484c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f3487c, paint2);
            }
            if (cVar.f3463f.l()) {
                androidx.core.content.c.b bVar2 = cVar.f3463f;
                if (this.f3489e == null) {
                    Paint paint3 = new Paint(1);
                    this.f3489e = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f3489e;
                Paint.Join join = cVar.o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.p);
                if (bVar2.h()) {
                    Shader shaderF2 = bVar2.f();
                    shaderF2.setLocalMatrix(this.f3488d);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f3466i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(i.a(bVar2.e(), cVar.f3466i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f3464g * fMin * fE);
                canvas.drawPath(this.f3487c, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            c(this.f3493i, a, canvas, i2, i3, colorFilter);
        }

        public boolean f() {
            if (this.p == null) {
                this.p = Boolean.valueOf(this.f3493i.a());
            }
            return this.p.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f3493i.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.n;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.n = i2;
        }

        public g(g gVar) {
            this.f3488d = new Matrix();
            this.f3494j = 0.0f;
            this.f3495k = 0.0f;
            this.f3496l = 0.0f;
            this.f3497m = 0.0f;
            this.n = 255;
            this.o = null;
            this.p = null;
            c.e.a<String, Object> aVar = new c.e.a<>();
            this.q = aVar;
            this.f3493i = new d(gVar.f3493i, aVar);
            this.f3486b = new Path(gVar.f3486b);
            this.f3487c = new Path(gVar.f3487c);
            this.f3494j = gVar.f3494j;
            this.f3495k = gVar.f3495k;
            this.f3496l = gVar.f3496l;
            this.f3497m = gVar.f3497m;
            this.f3492h = gVar.f3492h;
            this.n = gVar.n;
            this.o = gVar.o;
            String str = gVar.o;
            if (str != null) {
                aVar.put(str, this);
            }
            this.p = gVar.p;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    private static class d extends e {
        final Matrix a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<e> f3471b;

        /* renamed from: c, reason: collision with root package name */
        float f3472c;

        /* renamed from: d, reason: collision with root package name */
        private float f3473d;

        /* renamed from: e, reason: collision with root package name */
        private float f3474e;

        /* renamed from: f, reason: collision with root package name */
        private float f3475f;

        /* renamed from: g, reason: collision with root package name */
        private float f3476g;

        /* renamed from: h, reason: collision with root package name */
        private float f3477h;

        /* renamed from: i, reason: collision with root package name */
        private float f3478i;

        /* renamed from: j, reason: collision with root package name */
        final Matrix f3479j;

        /* renamed from: k, reason: collision with root package name */
        int f3480k;

        /* renamed from: l, reason: collision with root package name */
        private int[] f3481l;

        /* renamed from: m, reason: collision with root package name */
        private String f3482m;

        public d(d dVar, c.e.a<String, Object> aVar) {
            f bVar;
            super();
            this.a = new Matrix();
            this.f3471b = new ArrayList<>();
            this.f3472c = 0.0f;
            this.f3473d = 0.0f;
            this.f3474e = 0.0f;
            this.f3475f = 1.0f;
            this.f3476g = 1.0f;
            this.f3477h = 0.0f;
            this.f3478i = 0.0f;
            Matrix matrix = new Matrix();
            this.f3479j = matrix;
            this.f3482m = null;
            this.f3472c = dVar.f3472c;
            this.f3473d = dVar.f3473d;
            this.f3474e = dVar.f3474e;
            this.f3475f = dVar.f3475f;
            this.f3476g = dVar.f3476g;
            this.f3477h = dVar.f3477h;
            this.f3478i = dVar.f3478i;
            this.f3481l = dVar.f3481l;
            String str = dVar.f3482m;
            this.f3482m = str;
            this.f3480k = dVar.f3480k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f3479j);
            ArrayList<e> arrayList = dVar.f3471b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                e eVar = arrayList.get(i2);
                if (eVar instanceof d) {
                    this.f3471b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f3471b.add(bVar);
                    String str2 = bVar.f3483b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f3479j.reset();
            this.f3479j.postTranslate(-this.f3473d, -this.f3474e);
            this.f3479j.postScale(this.f3475f, this.f3476g);
            this.f3479j.postRotate(this.f3472c, 0.0f, 0.0f);
            this.f3479j.postTranslate(this.f3477h + this.f3473d, this.f3478i + this.f3474e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f3481l = null;
            this.f3472c = androidx.core.content.c.g.j(typedArray, xmlPullParser, "rotation", 5, this.f3472c);
            this.f3473d = typedArray.getFloat(1, this.f3473d);
            this.f3474e = typedArray.getFloat(2, this.f3474e);
            this.f3475f = androidx.core.content.c.g.j(typedArray, xmlPullParser, "scaleX", 3, this.f3475f);
            this.f3476g = androidx.core.content.c.g.j(typedArray, xmlPullParser, "scaleY", 4, this.f3476g);
            this.f3477h = androidx.core.content.c.g.j(typedArray, xmlPullParser, "translateX", 6, this.f3477h);
            this.f3478i = androidx.core.content.c.g.j(typedArray, xmlPullParser, "translateY", 7, this.f3478i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3482m = string;
            }
            d();
        }

        @Override // c.t.a.a.i.e
        public boolean a() {
            for (int i2 = 0; i2 < this.f3471b.size(); i2++) {
                if (this.f3471b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // c.t.a.a.i.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i2 = 0; i2 < this.f3471b.size(); i2++) {
                zB |= this.f3471b.get(i2).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayS = androidx.core.content.c.g.s(resources, theme, attributeSet, c.t.a.a.a.f3430b);
            e(typedArrayS, xmlPullParser);
            typedArrayS.recycle();
        }

        public String getGroupName() {
            return this.f3482m;
        }

        public Matrix getLocalMatrix() {
            return this.f3479j;
        }

        public float getPivotX() {
            return this.f3473d;
        }

        public float getPivotY() {
            return this.f3474e;
        }

        public float getRotation() {
            return this.f3472c;
        }

        public float getScaleX() {
            return this.f3475f;
        }

        public float getScaleY() {
            return this.f3476g;
        }

        public float getTranslateX() {
            return this.f3477h;
        }

        public float getTranslateY() {
            return this.f3478i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f3473d) {
                this.f3473d = f2;
                d();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.f3474e) {
                this.f3474e = f2;
                d();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.f3472c) {
                this.f3472c = f2;
                d();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f3475f) {
                this.f3475f = f2;
                d();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.f3476g) {
                this.f3476g = f2;
                d();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f3477h) {
                this.f3477h = f2;
                d();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.f3478i) {
                this.f3478i = f2;
                d();
            }
        }

        public d() {
            super();
            this.a = new Matrix();
            this.f3471b = new ArrayList<>();
            this.f3472c = 0.0f;
            this.f3473d = 0.0f;
            this.f3474e = 0.0f;
            this.f3475f = 1.0f;
            this.f3476g = 1.0f;
            this.f3477h = 0.0f;
            this.f3478i = 0.0f;
            this.f3479j = new Matrix();
            this.f3482m = null;
        }
    }
}