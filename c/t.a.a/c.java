package c.t.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatedVectorDrawableCompat.java */
/* loaded from: classes.dex */
public class c extends h implements Animatable {

    /* renamed from: f, reason: collision with root package name */
    private b f3441f;

    /* renamed from: g, reason: collision with root package name */
    private Context f3442g;

    /* renamed from: h, reason: collision with root package name */
    private ArgbEvaluator f3443h;

    /* renamed from: i, reason: collision with root package name */
    private Animator.AnimatorListener f3444i;

    /* renamed from: j, reason: collision with root package name */
    ArrayList<c.t.a.a.b> f3445j;

    /* renamed from: k, reason: collision with root package name */
    final Drawable.Callback f3446k;

    /* compiled from: AnimatedVectorDrawableCompat.java */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            c.this.scheduleSelf(runnable, j2);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    private static class b extends Drawable.ConstantState {
        int a;

        /* renamed from: b, reason: collision with root package name */
        i f3448b;

        /* renamed from: c, reason: collision with root package name */
        AnimatorSet f3449c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<Animator> f3450d;

        /* renamed from: e, reason: collision with root package name */
        c.e.a<Animator, String> f3451e;

        public b(Context context, b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.a = bVar.a;
                i iVar = bVar.f3448b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    if (resources != null) {
                        this.f3448b = (i) constantState.newDrawable(resources);
                    } else {
                        this.f3448b = (i) constantState.newDrawable();
                    }
                    i iVar2 = (i) this.f3448b.mutate();
                    this.f3448b = iVar2;
                    iVar2.setCallback(callback);
                    this.f3448b.setBounds(bVar.f3448b.getBounds());
                    this.f3448b.h(false);
                }
                ArrayList<Animator> arrayList = bVar.f3450d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f3450d = new ArrayList<>(size);
                    this.f3451e = new c.e.a<>(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        Animator animator = bVar.f3450d.get(i2);
                        Animator animatorClone = animator.clone();
                        String str = bVar.f3451e.get(animator);
                        animatorClone.setTarget(this.f3448b.d(str));
                        this.f3450d.add(animatorClone);
                        this.f3451e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f3449c == null) {
                this.f3449c = new AnimatorSet();
            }
            this.f3449c.playTogether(this.f3450d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    c() {
        this(null, null, null);
    }

    public static c a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        c cVar = new c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    private void b(String str, Animator animator) {
        animator.setTarget(this.f3441f.f3448b.d(str));
        if (Build.VERSION.SDK_INT < 21) {
            c(animator);
        }
        b bVar = this.f3441f;
        if (bVar.f3450d == null) {
            bVar.f3450d = new ArrayList<>();
            this.f3441f.f3451e = new c.e.a<>();
        }
        this.f3441f.f3450d.add(animator);
        this.f3441f.f3451e.put(animator, str);
    }

    private void c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                c(childAnimations.get(i2));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f3443h == null) {
                    this.f3443h = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f3443h);
            }
        }
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f3441f.f3448b.draw(canvas);
        if (this.f3441f.f3449c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f3453e;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f3441f.f3448b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f3453e;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3441f.a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3453e;
        return drawable != null ? androidx.core.graphics.drawable.a.e(drawable) : this.f3441f.f3448b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f3453e == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0075c(this.f3453e.getConstantState());
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f3453e;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3441f.f3448b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f3453e;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3441f.f3448b.getIntrinsicWidth();
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
        return drawable != null ? drawable.getOpacity() : this.f3441f.f3448b.getOpacity();
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

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayS = androidx.core.content.c.g.s(resources, theme, attributeSet, c.t.a.a.a.f3433e);
                    int resourceId = typedArrayS.getResourceId(0, 0);
                    if (resourceId != 0) {
                        i iVarB = i.b(resources, resourceId, theme);
                        iVarB.h(false);
                        iVarB.setCallback(this.f3446k);
                        i iVar = this.f3441f.f3448b;
                        if (iVar != null) {
                            iVar.setCallback(null);
                        }
                        this.f3441f.f3448b = iVarB;
                    }
                    typedArrayS.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, c.t.a.a.a.f3434f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3442g;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        b(string, e.i(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f3441f.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f3453e;
        return drawable != null ? androidx.core.graphics.drawable.a.h(drawable) : this.f3441f.f3448b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f3453e;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3441f.f3449c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f3453e;
        return drawable != null ? drawable.isStateful() : this.f3441f.f3448b.isStateful();
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
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3441f.f3448b.setBounds(rect);
        }
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        Drawable drawable = this.f3453e;
        return drawable != null ? drawable.setLevel(i2) : this.f3441f.f3448b.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3453e;
        return drawable != null ? drawable.setState(iArr) : this.f3441f.f3448b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f3441f.f3448b.setAlpha(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z);
        } else {
            this.f3441f.f3448b.setAutoMirrored(z);
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
            this.f3441f.f3448b.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        } else {
            this.f3441f.f3448b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
        } else {
            this.f3441f.f3448b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f3441f.f3448b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f3441f.f3449c.isStarted()) {
                return;
            }
            this.f3441f.f3449c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3441f.f3449c.end();
        }
    }

    private c(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3453e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3441f.f3448b.setColorFilter(colorFilter);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* renamed from: c.t.a.a.c$c, reason: collision with other inner class name */
    private static class C0075c extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public C0075c(Drawable.ConstantState constantState) {
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
            c cVar = new c();
            Drawable drawableNewDrawable = this.a.newDrawable();
            cVar.f3453e = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f3446k);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.a.newDrawable(resources);
            cVar.f3453e = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f3446k);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.a.newDrawable(resources, theme);
            cVar.f3453e = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f3446k);
            return cVar;
        }
    }

    private c(Context context, b bVar, Resources resources) {
        this.f3443h = null;
        this.f3444i = null;
        this.f3445j = null;
        a aVar = new a();
        this.f3446k = aVar;
        this.f3442g = context;
        if (bVar != null) {
            this.f3441f = bVar;
        } else {
            this.f3441f = new b(context, bVar, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}