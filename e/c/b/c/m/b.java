package e.c.b.c.m;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.List;

/* compiled from: AnimatorSetCompat.java */
/* loaded from: classes.dex */
public class b {
    public static void a(AnimatorSet animatorSet, List<Animator> list) {
        int size = list.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = list.get(i2);
            jMax = Math.max(jMax, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        list.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(list);
    }
}