package kotlinx.coroutines.internal;

import i.m;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import kotlinx.coroutines.m0;

/* compiled from: StackTraceRecovery.kt */
/* loaded from: classes3.dex */
public final class w {
    private static final String a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f17002b;

    static {
        Object objA;
        Object objA2;
        try {
            m.a aVar = i.m.f15825e;
            objA = i.m.a(Class.forName("i.v.j.a.a").getCanonicalName());
        } catch (Throwable th) {
            m.a aVar2 = i.m.f15825e;
            objA = i.m.a(i.n.a(th));
        }
        if (i.m.b(objA) != null) {
            objA = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        a = (String) objA;
        try {
            m.a aVar3 = i.m.f15825e;
            objA2 = i.m.a(Class.forName("kotlinx.coroutines.internal.w").getCanonicalName());
        } catch (Throwable th2) {
            m.a aVar4 = i.m.f15825e;
            objA2 = i.m.a(i.n.a(th2));
        }
        if (i.m.b(objA2) != null) {
            objA2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f17002b = (String) objA2;
    }

    public static final StackTraceElement b(String str) {
        return new StackTraceElement("\b\b\b(" + str, "\b", "\b", -1);
    }

    private static final <E extends Throwable> i.l<E, StackTraceElement[]> c(E e2) {
        boolean z;
        Throwable cause = e2.getCause();
        if (cause == null || !i.y.d.l.a(cause.getClass(), e2.getClass())) {
            return i.p.a(e2, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int length = stackTrace.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            }
            if (h(stackTrace[i2])) {
                z = true;
                break;
            }
            i2++;
        }
        return z ? i.p.a(cause, stackTrace) : i.p.a(e2, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E d(E e2, E e3, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(b("Coroutine boundary"));
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int iG = g(stackTrace, a);
        int i2 = 0;
        if (iG == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            e3.setStackTrace((StackTraceElement[]) array);
            return e3;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + iG];
        for (int i3 = 0; i3 < iG; i3++) {
            stackTraceElementArr[i3] = stackTrace[i3];
        }
        Iterator<T> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[iG + i2] = (StackTraceElement) it.next();
            i2++;
        }
        e3.setStackTrace(stackTraceElementArr);
        return e3;
    }

    private static final ArrayDeque<StackTraceElement> e(i.v.j.a.e eVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElementH = eVar.h();
        if (stackTraceElementH != null) {
            arrayDeque.add(stackTraceElementH);
        }
        while (eVar != null) {
            eVar = eVar.c();
            if (eVar == null) {
                break;
            }
            StackTraceElement stackTraceElementH2 = eVar.h();
            if (stackTraceElementH2 != null) {
                arrayDeque.add(stackTraceElementH2);
            }
        }
        return arrayDeque;
    }

    private static final boolean f(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && i.y.d.l.a(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && i.y.d.l.a(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && i.y.d.l.a(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int g(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i.y.d.l.a(str, stackTraceElementArr[i2].getClassName())) {
                return i2;
            }
        }
        return -1;
    }

    public static final boolean h(StackTraceElement stackTraceElement) {
        return i.d0.p.B(stackTraceElement.getClassName(), "\b\b\b", false, 2, null);
    }

    private static final void i(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (h(stackTraceElementArr[i2])) {
                break;
            } else {
                i2++;
            }
        }
        int i3 = i2 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (length2 < i3) {
            return;
        }
        while (true) {
            if (f(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i3) {
                return;
            } else {
                length2--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> E j(E e2, i.v.j.a.e eVar) {
        i.l lVarC = c(e2);
        Throwable th = (Throwable) lVarC.a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) lVarC.b();
        Throwable thE = g.e(th);
        if (thE == null || (!i.y.d.l.a(thE.getMessage(), th.getMessage()))) {
            return e2;
        }
        ArrayDeque<StackTraceElement> arrayDequeE = e(eVar);
        if (arrayDequeE.isEmpty()) {
            return e2;
        }
        if (th != e2) {
            i(stackTraceElementArr, arrayDequeE);
        }
        return (E) d(th, thE, arrayDequeE);
    }

    public static final <E extends Throwable> E k(E e2) {
        Throwable thE;
        return (m0.d() && (thE = g.e(e2)) != null) ? (E) l(thE) : e2;
    }

    private static final <E extends Throwable> E l(E e2) {
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int length = stackTrace.length;
        int iG = g(stackTrace, f17002b);
        int i2 = iG + 1;
        int iG2 = g(stackTrace, a);
        int i3 = 0;
        int i4 = (length - iG) - (iG2 == -1 ? 0 : length - iG2);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i4];
        while (i3 < i4) {
            stackTraceElementArr[i3] = i3 == 0 ? b("Coroutine boundary") : stackTrace[(i2 + i3) - 1];
            i3++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    public static final <E extends Throwable> E m(E e2) {
        E e3 = (E) e2.getCause();
        if (e3 != null) {
            boolean z = true;
            if (!(!i.y.d.l.a(e3.getClass(), e2.getClass()))) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                int length = stackTrace.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    if (h(stackTrace[i2])) {
                        break;
                    }
                    i2++;
                }
                if (z) {
                    return e3;
                }
            }
        }
        return e2;
    }
}