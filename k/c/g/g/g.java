package k.c.g.g;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.KeyEvent;
import android.view.MotionEvent;
import java.util.List;

/* compiled from: OverlayManager.java */
/* loaded from: classes3.dex */
public interface g extends List<e>, j$.util.List {
    boolean B(MotionEvent motionEvent, k.c.g.d dVar);

    void C(MotionEvent motionEvent, k.c.g.d dVar);

    boolean H0(MotionEvent motionEvent, k.c.g.d dVar);

    void N(h hVar);

    boolean O0(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3, k.c.g.d dVar);

    boolean T(MotionEvent motionEvent, k.c.g.d dVar);

    boolean a0(MotionEvent motionEvent, k.c.g.d dVar);

    boolean d(int i2, int i3, Point point, k.c.a.c cVar);

    boolean h0(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3, k.c.g.d dVar);

    boolean j0(MotionEvent motionEvent, k.c.g.d dVar);

    boolean k0(MotionEvent motionEvent, k.c.g.d dVar);

    boolean l0(MotionEvent motionEvent, k.c.g.d dVar);

    void q(k.c.g.d dVar);

    boolean q0(int i2, KeyEvent keyEvent, k.c.g.d dVar);

    boolean r0(int i2, KeyEvent keyEvent, k.c.g.d dVar);

    List<e> s();

    boolean v0(MotionEvent motionEvent, k.c.g.d dVar);

    void y0(Canvas canvas, k.c.g.d dVar);
}