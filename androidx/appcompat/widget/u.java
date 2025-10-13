package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import java.lang.reflect.InvocationTargetException;

/* compiled from: AppCompatSeekBar.java */
/* loaded from: classes.dex */
public class u extends SeekBar {

    /* renamed from: e, reason: collision with root package name */
    private final v f579e;

    public u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.a.I);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f579e.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f579e.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f579e.g(canvas);
    }

    public u(Context context, AttributeSet attributeSet, int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super(context, attributeSet, i2);
        r0.a(this, getContext());
        v vVar = new v(this);
        this.f579e = vVar;
        vVar.c(attributeSet, i2);
    }
}