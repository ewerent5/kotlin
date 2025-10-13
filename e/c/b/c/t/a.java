package e.c.b.c.t;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: InsetDialogOnTouchListener.java */
/* loaded from: classes.dex */
public class a implements View.OnTouchListener {

    /* renamed from: e, reason: collision with root package name */
    private final Dialog f15308e;

    /* renamed from: f, reason: collision with root package name */
    private final int f15309f;

    /* renamed from: g, reason: collision with root package name */
    private final int f15310g;

    /* renamed from: h, reason: collision with root package name */
    private final int f15311h;

    public a(Dialog dialog, Rect rect) {
        this.f15308e = dialog;
        this.f15309f = rect.left;
        this.f15310g = rect.top;
        this.f15311h = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f15309f + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.f15310g + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i2 = this.f15311h;
            motionEventObtain.setLocation((-i2) - 1, (-i2) - 1);
        }
        view.performClick();
        return this.f15308e.onTouchEvent(motionEventObtain);
    }
}