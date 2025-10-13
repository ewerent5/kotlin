package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: e, reason: collision with root package name */
    private static final Property<SwitchCompat, Float> f365e = new a(Float.class, "thumbPos");

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f366f = {R.attr.state_checked};
    private float A;
    private VelocityTracker B;
    private int C;
    float D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private final TextPaint L;
    private ColorStateList M;
    private Layout N;
    private Layout O;
    private TransformationMethod P;
    ObjectAnimator Q;
    private final y R;
    private final Rect S;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f367g;

    /* renamed from: h, reason: collision with root package name */
    private ColorStateList f368h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuff.Mode f369i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f370j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f371k;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f372l;

    /* renamed from: m, reason: collision with root package name */
    private ColorStateList f373m;
    private PorterDuff.Mode n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private CharSequence u;
    private CharSequence v;
    private boolean w;
    private int x;
    private int y;
    private float z;

    class a extends Property<SwitchCompat, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.D);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f2) {
            switchCompat.setThumbPosition(f2.floatValue());
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.a.K);
    }

    private void a(boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f365e, z ? 1.0f : 0.0f);
        this.Q = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        if (Build.VERSION.SDK_INT >= 18) {
            this.Q.setAutoCancel(true);
        }
        this.Q.start();
    }

    private void b() {
        Drawable drawable = this.f367g;
        if (drawable != null) {
            if (this.f370j || this.f371k) {
                Drawable drawableMutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
                this.f367g = drawableMutate;
                if (this.f370j) {
                    androidx.core.graphics.drawable.a.o(drawableMutate, this.f368h);
                }
                if (this.f371k) {
                    androidx.core.graphics.drawable.a.p(this.f367g, this.f369i);
                }
                if (this.f367g.isStateful()) {
                    this.f367g.setState(getDrawableState());
                }
            }
        }
    }

    private void c() {
        Drawable drawable = this.f372l;
        if (drawable != null) {
            if (this.o || this.p) {
                Drawable drawableMutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
                this.f372l = drawableMutate;
                if (this.o) {
                    androidx.core.graphics.drawable.a.o(drawableMutate, this.f373m);
                }
                if (this.p) {
                    androidx.core.graphics.drawable.a.p(this.f372l, this.n);
                }
                if (this.f372l.isStateful()) {
                    this.f372l.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.Q;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    private static float f(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
    }

    private boolean g(float f2, float f3) {
        if (this.f367g == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f367g.getPadding(this.S);
        int i2 = this.I;
        int i3 = this.y;
        int i4 = i2 - i3;
        int i5 = (this.H + thumbOffset) - i3;
        int i6 = this.G + i5;
        Rect rect = this.S;
        return f2 > ((float) i5) && f2 < ((float) (((i6 + rect.left) + rect.right) + i3)) && f3 > ((float) i4) && f3 < ((float) (this.K + i3));
    }

    private boolean getTargetCheckedState() {
        return this.D > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((c1.b(this) ? 1.0f - this.D : this.D) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f372l;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.S;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f367g;
        Rect rectD = drawable2 != null ? e0.d(drawable2) : e0.f441c;
        return ((((this.E - this.G) - rect.left) - rect.right) - rectD.left) - rectD.right;
    }

    private Layout h(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.P;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.L, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k(int i2, int i3) {
        j(i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i3);
    }

    private void l(MotionEvent motionEvent) {
        this.x = 0;
        boolean targetCheckedState = true;
        boolean z = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z) {
            this.B.computeCurrentVelocity(CoreConstants.MILLIS_IN_ONE_SECOND);
            float xVelocity = this.B.getXVelocity();
            if (Math.abs(xVelocity) <= this.C) {
                targetCheckedState = getTargetCheckedState();
            } else if (!c1.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        e(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i2;
        int i3;
        Rect rect = this.S;
        int i4 = this.H;
        int i5 = this.I;
        int i6 = this.J;
        int i7 = this.K;
        int thumbOffset = getThumbOffset() + i4;
        Drawable drawable = this.f367g;
        Rect rectD = drawable != null ? e0.d(drawable) : e0.f441c;
        Drawable drawable2 = this.f372l;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i8 = rect.left;
            thumbOffset += i8;
            if (rectD != null) {
                int i9 = rectD.left;
                if (i9 > i8) {
                    i4 += i9 - i8;
                }
                int i10 = rectD.top;
                int i11 = rect.top;
                i2 = i10 > i11 ? (i10 - i11) + i5 : i5;
                int i12 = rectD.right;
                int i13 = rect.right;
                if (i12 > i13) {
                    i6 -= i12 - i13;
                }
                int i14 = rectD.bottom;
                int i15 = rect.bottom;
                if (i14 > i15) {
                    i3 = i7 - (i14 - i15);
                }
                this.f372l.setBounds(i4, i2, i6, i3);
            } else {
                i2 = i5;
            }
            i3 = i7;
            this.f372l.setBounds(i4, i2, i6, i3);
        }
        Drawable drawable3 = this.f367g;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i16 = thumbOffset - rect.left;
            int i17 = thumbOffset + this.G + rect.right;
            this.f367g.setBounds(i16, i5, i17, i7);
            Drawable background = getBackground();
            if (background != null) {
                androidx.core.graphics.drawable.a.l(background, i16, i5, i17, i7);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f2, f3);
        }
        Drawable drawable = this.f367g;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f2, f3);
        }
        Drawable drawable2 = this.f372l;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.a.k(drawable2, f2, f3);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f367g;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f372l;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!c1.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.E;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.s : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (c1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.E;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.s : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.w;
    }

    public boolean getSplitTrack() {
        return this.t;
    }

    public int getSwitchMinWidth() {
        return this.r;
    }

    public int getSwitchPadding() {
        return this.s;
    }

    public CharSequence getTextOff() {
        return this.v;
    }

    public CharSequence getTextOn() {
        return this.u;
    }

    public Drawable getThumbDrawable() {
        return this.f367g;
    }

    public int getThumbTextPadding() {
        return this.q;
    }

    public ColorStateList getThumbTintList() {
        return this.f368h;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f369i;
    }

    public Drawable getTrackDrawable() {
        return this.f372l;
    }

    public ColorStateList getTrackTintList() {
        return this.f373m;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.n;
    }

    public void i(Context context, int i2) {
        w0 w0VarT = w0.t(context, i2, c.a.j.X2);
        ColorStateList colorStateListC = w0VarT.c(c.a.j.b3);
        if (colorStateListC != null) {
            this.M = colorStateListC;
        } else {
            this.M = getTextColors();
        }
        int iF = w0VarT.f(c.a.j.Y2, 0);
        if (iF != 0) {
            float f2 = iF;
            if (f2 != this.L.getTextSize()) {
                this.L.setTextSize(f2);
                requestLayout();
            }
        }
        k(w0VarT.k(c.a.j.Z2, -1), w0VarT.k(c.a.j.a3, -1));
        if (w0VarT.a(c.a.j.i3, false)) {
            this.P = new c.a.n.a(getContext());
        } else {
            this.P = null;
        }
        w0VarT.w();
    }

    public void j(Typeface typeface, int i2) {
        if (i2 <= 0) {
            this.L.setFakeBoldText(false);
            this.L.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typeface, i2);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i3 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i2;
            this.L.setFakeBoldText((i3 & 1) != 0);
            this.L.setTextSkewX((i3 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f367g;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f372l;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.Q;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.Q.end();
        this.Q = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(iArrOnCreateDrawableState, f366f);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int width;
        super.onDraw(canvas);
        Rect rect = this.S;
        Drawable drawable = this.f372l;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.I;
        int i3 = this.K;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f367g;
        if (drawable != null) {
            if (!this.t || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectD = e0.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectD.left;
                rect.right -= rectD.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.N : this.O;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.M;
            if (colorStateList != null) {
                this.L.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.L.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i4 + i5) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.u : this.v;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        CharSequence text = accessibilityNodeInfo.getText();
        if (TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.append(' ');
        sb.append(charSequence);
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int iMax;
        int width;
        int paddingLeft;
        int i6;
        int paddingTop;
        int height;
        super.onLayout(z, i2, i3, i4, i5);
        int iMax2 = 0;
        if (this.f367g != null) {
            Rect rect = this.S;
            Drawable drawable = this.f372l;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectD = e0.d(this.f367g);
            iMax = Math.max(0, rectD.left - rect.left);
            iMax2 = Math.max(0, rectD.right - rect.right);
        } else {
            iMax = 0;
        }
        if (c1.b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.E + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.E) + iMax + iMax2;
        }
        int gravity = getGravity() & SyslogConstants.LOG_ALERT;
        if (gravity == 16) {
            int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i6 = this.F;
            paddingTop = paddingTop2 - (i6 / 2);
        } else {
            if (gravity == 80) {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.F;
                this.H = paddingLeft;
                this.I = paddingTop;
                this.K = height;
                this.J = width;
            }
            paddingTop = getPaddingTop();
            i6 = this.F;
        }
        height = i6 + paddingTop;
        this.H = paddingLeft;
        this.I = paddingTop;
        this.K = height;
        this.J = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.w) {
            if (this.N == null) {
                this.N = h(this.u);
            }
            if (this.O == null) {
                this.O = h(this.v);
            }
        }
        Rect rect = this.S;
        Drawable drawable = this.f367g;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f367g.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f367g.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.G = Math.max(this.w ? Math.max(this.N.getWidth(), this.O.getWidth()) + (this.q * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f372l;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f372l.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f367g;
        if (drawable3 != null) {
            Rect rectD = e0.d(drawable3);
            iMax = Math.max(iMax, rectD.left);
            iMax2 = Math.max(iMax2, rectD.right);
        }
        int iMax3 = Math.max(this.r, (this.G * 2) + iMax + iMax2);
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.E = iMax3;
        this.F = iMax4;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.u : this.v;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.B
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9f
            r2 = 2
            if (r0 == r1) goto L8b
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L8b
            goto Lb9
        L16:
            int r0 = r6.x
            if (r0 == r1) goto L57
            if (r0 == r2) goto L1e
            goto Lb9
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.z
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3d
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L39
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L3d
        L39:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L3d:
            boolean r0 = androidx.appcompat.widget.c1.b(r6)
            if (r0 == 0) goto L44
            float r2 = -r2
        L44:
            float r0 = r6.D
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.D
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L56
            r6.z = r7
            r6.setThumbPosition(r0)
        L56:
            return r1
        L57:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.z
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.y
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7d
            float r4 = r6.A
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.y
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb9
        L7d:
            r6.x = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.z = r0
            r6.A = r3
            return r1
        L8b:
            int r0 = r6.x
            if (r0 != r2) goto L96
            r6.l(r7)
            super.onTouchEvent(r7)
            return r1
        L96:
            r0 = 0
            r6.x = r0
            android.view.VelocityTracker r0 = r6.B
            r0.clear()
            goto Lb9
        L9f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb9
            boolean r3 = r6.g(r0, r2)
            if (r3 == 0) goto Lb9
            r6.x = r1
            r6.z = r0
            r6.A = r2
        Lb9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (getWindowToken() != null && c.h.l.t.Q(this)) {
            a(zIsChecked);
        } else {
            d();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.s(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.w != z) {
            this.w = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.t = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.r = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.s = i2;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.L.getTypeface() == null || this.L.getTypeface().equals(typeface)) && (this.L.getTypeface() != null || typeface == null)) {
            return;
        }
        this.L.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.v = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.u = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f367g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f367g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f2) {
        this.D = f2;
        invalidate();
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(c.a.k.a.a.d(getContext(), i2));
    }

    public void setThumbTextPadding(int i2) {
        this.q = i2;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f368h = colorStateList;
        this.f370j = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f369i = mode;
        this.f371k = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f372l;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f372l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(c.a.k.a.a.d(getContext(), i2));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f373m = colorStateList;
        this.o = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.n = mode;
        this.p = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f367g || drawable == this.f372l;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f368h = null;
        this.f369i = null;
        this.f370j = false;
        this.f371k = false;
        this.f373m = null;
        this.n = null;
        this.o = false;
        this.p = false;
        this.B = VelocityTracker.obtain();
        this.S = new Rect();
        r0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.L = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = c.a.j.I2;
        w0 w0VarV = w0.v(context, attributeSet, iArr, i2, 0);
        c.h.l.t.i0(this, context, iArr, attributeSet, w0VarV.r(), i2, 0);
        Drawable drawableG = w0VarV.g(c.a.j.L2);
        this.f367g = drawableG;
        if (drawableG != null) {
            drawableG.setCallback(this);
        }
        Drawable drawableG2 = w0VarV.g(c.a.j.U2);
        this.f372l = drawableG2;
        if (drawableG2 != null) {
            drawableG2.setCallback(this);
        }
        this.u = w0VarV.p(c.a.j.J2);
        this.v = w0VarV.p(c.a.j.K2);
        this.w = w0VarV.a(c.a.j.M2, true);
        this.q = w0VarV.f(c.a.j.R2, 0);
        this.r = w0VarV.f(c.a.j.O2, 0);
        this.s = w0VarV.f(c.a.j.P2, 0);
        this.t = w0VarV.a(c.a.j.N2, false);
        ColorStateList colorStateListC = w0VarV.c(c.a.j.S2);
        if (colorStateListC != null) {
            this.f368h = colorStateListC;
            this.f370j = true;
        }
        PorterDuff.Mode modeE = e0.e(w0VarV.k(c.a.j.T2, -1), null);
        if (this.f369i != modeE) {
            this.f369i = modeE;
            this.f371k = true;
        }
        if (this.f370j || this.f371k) {
            b();
        }
        ColorStateList colorStateListC2 = w0VarV.c(c.a.j.V2);
        if (colorStateListC2 != null) {
            this.f373m = colorStateListC2;
            this.o = true;
        }
        PorterDuff.Mode modeE2 = e0.e(w0VarV.k(c.a.j.W2, -1), null);
        if (this.n != modeE2) {
            this.n = modeE2;
            this.p = true;
        }
        if (this.o || this.p) {
            c();
        }
        int iN = w0VarV.n(c.a.j.Q2, 0);
        if (iN != 0) {
            i(context, iN);
        }
        y yVar = new y(this);
        this.R = yVar;
        yVar.m(attributeSet, i2);
        w0VarV.w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.y = viewConfiguration.getScaledTouchSlop();
        this.C = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }
}