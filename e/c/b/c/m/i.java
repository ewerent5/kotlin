package e.c.b.c.m;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import ch.qos.logback.core.CoreConstants;

/* compiled from: MotionTiming.java */
/* loaded from: classes.dex */
public class i {
    private long a;

    /* renamed from: b, reason: collision with root package name */
    private long f15272b;

    /* renamed from: c, reason: collision with root package name */
    private TimeInterpolator f15273c;

    /* renamed from: d, reason: collision with root package name */
    private int f15274d;

    /* renamed from: e, reason: collision with root package name */
    private int f15275e;

    public i(long j2, long j3) {
        this.a = 0L;
        this.f15272b = 300L;
        this.f15273c = null;
        this.f15274d = 0;
        this.f15275e = 1;
        this.a = j2;
        this.f15272b = j3;
    }

    static i b(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        iVar.f15274d = valueAnimator.getRepeatCount();
        iVar.f15275e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.f15264b : interpolator instanceof AccelerateInterpolator ? a.f15265c : interpolator instanceof DecelerateInterpolator ? a.f15266d : interpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.a;
    }

    public long d() {
        return this.f15272b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f15273c;
        return timeInterpolator != null ? timeInterpolator : a.f15264b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (c() == iVar.c() && d() == iVar.d() && g() == iVar.g() && h() == iVar.h()) {
            return e().getClass().equals(iVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f15274d;
    }

    public int h() {
        return this.f15275e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return '\n' + i.class.getName() + CoreConstants.CURLY_LEFT + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public i(long j2, long j3, TimeInterpolator timeInterpolator) {
        this.a = 0L;
        this.f15272b = 300L;
        this.f15273c = null;
        this.f15274d = 0;
        this.f15275e = 1;
        this.a = j2;
        this.f15272b = j3;
        this.f15273c = timeInterpolator;
    }
}