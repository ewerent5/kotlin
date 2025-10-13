package e.c.d.y;

import ch.qos.logback.core.net.SyslogConstants;
import e.c.d.v;
import e.c.d.w;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: Excluder.java */
/* loaded from: classes.dex */
public final class d implements w, Cloneable {

    /* renamed from: e, reason: collision with root package name */
    public static final d f15469e = new d();

    /* renamed from: i, reason: collision with root package name */
    private boolean f15473i;

    /* renamed from: f, reason: collision with root package name */
    private double f15470f = -1.0d;

    /* renamed from: g, reason: collision with root package name */
    private int f15471g = SyslogConstants.LOG_LOCAL1;

    /* renamed from: h, reason: collision with root package name */
    private boolean f15472h = true;

    /* renamed from: j, reason: collision with root package name */
    private List<e.c.d.b> f15474j = Collections.emptyList();

    /* renamed from: k, reason: collision with root package name */
    private List<e.c.d.b> f15475k = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Excluder.java */
    class a<T> extends v<T> {
        private v<T> a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f15476b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f15477c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e.c.d.f f15478d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e.c.d.z.a f15479e;

        a(boolean z, boolean z2, e.c.d.f fVar, e.c.d.z.a aVar) {
            this.f15476b = z;
            this.f15477c = z2;
            this.f15478d = fVar;
            this.f15479e = aVar;
        }

        private v<T> e() {
            v<T> vVar = this.a;
            if (vVar != null) {
                return vVar;
            }
            v<T> vVarN = this.f15478d.n(d.this, this.f15479e);
            this.a = vVarN;
            return vVarN;
        }

        @Override // e.c.d.v
        public T b(e.c.d.a0.a aVar) throws IOException {
            if (!this.f15476b) {
                return e().b(aVar);
            }
            aVar.O0();
            return null;
        }

        @Override // e.c.d.v
        public void d(e.c.d.a0.c cVar, T t) throws IOException {
            if (this.f15477c) {
                cVar.C();
            } else {
                e().d(cVar, t);
            }
        }
    }

    private boolean e(Class<?> cls) {
        if (this.f15470f == -1.0d || m((e.c.d.x.d) cls.getAnnotation(e.c.d.x.d.class), (e.c.d.x.e) cls.getAnnotation(e.c.d.x.e.class))) {
            return (!this.f15472h && i(cls)) || h(cls);
        }
        return true;
    }

    private boolean f(Class<?> cls, boolean z) {
        Iterator<e.c.d.b> it = (z ? this.f15474j : this.f15475k).iterator();
        while (it.hasNext()) {
            if (it.next().b(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean h(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private boolean i(Class<?> cls) {
        return cls.isMemberClass() && !j(cls);
    }

    private boolean j(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean k(e.c.d.x.d dVar) {
        return dVar == null || dVar.value() <= this.f15470f;
    }

    private boolean l(e.c.d.x.e eVar) {
        return eVar == null || eVar.value() > this.f15470f;
    }

    private boolean m(e.c.d.x.d dVar, e.c.d.x.e eVar) {
        return k(dVar) && l(eVar);
    }

    @Override // e.c.d.w
    public <T> v<T> a(e.c.d.f fVar, e.c.d.z.a<T> aVar) {
        Class<? super T> clsC = aVar.c();
        boolean zE = e(clsC);
        boolean z = zE || f(clsC, true);
        boolean z2 = zE || f(clsC, false);
        if (z || z2) {
            return new a(z2, z, fVar, aVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean d(Class<?> cls, boolean z) {
        return e(cls) || f(cls, z);
    }

    public boolean g(Field field, boolean z) {
        e.c.d.x.a aVar;
        if ((this.f15471g & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f15470f != -1.0d && !m((e.c.d.x.d) field.getAnnotation(e.c.d.x.d.class), (e.c.d.x.e) field.getAnnotation(e.c.d.x.e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f15473i && ((aVar = (e.c.d.x.a) field.getAnnotation(e.c.d.x.a.class)) == null || (!z ? aVar.deserialize() : aVar.serialize()))) {
            return true;
        }
        if ((!this.f15472h && i(field.getType())) || h(field.getType())) {
            return true;
        }
        List<e.c.d.b> list = z ? this.f15474j : this.f15475k;
        if (list.isEmpty()) {
            return false;
        }
        e.c.d.c cVar = new e.c.d.c(field);
        Iterator<e.c.d.b> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().a(cVar)) {
                return true;
            }
        }
        return false;
    }
}