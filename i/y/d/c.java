package i.y.d;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* compiled from: CallableReference.java */
/* loaded from: classes3.dex */
public abstract class c implements i.b0.b, Serializable {
    public static final Object NO_RECEIVER = a.f15879e;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient i.b0.b reflected;
    private final String signature;

    /* compiled from: CallableReference.java */
    private static class a implements Serializable {

        /* renamed from: e, reason: collision with root package name */
        private static final a f15879e = new a();

        private a() {
        }
    }

    public c() {
        this(NO_RECEIVER);
    }

    @Override // i.b0.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // i.b0.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public i.b0.b compute() {
        i.b0.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        i.b0.b bVarComputeReflected = computeReflected();
        this.reflected = bVarComputeReflected;
        return bVarComputeReflected;
    }

    protected abstract i.b0.b computeReflected();

    @Override // i.b0.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public i.b0.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? v.c(cls) : v.b(cls);
    }

    @Override // i.b0.b
    public List<?> getParameters() {
        return getReflected().getParameters();
    }

    protected i.b0.b getReflected() {
        i.b0.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute;
        }
        throw new i.y.b();
    }

    @Override // i.b0.b
    public i.b0.j getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // i.b0.b
    public List<?> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // i.b0.b
    public i.b0.k getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // i.b0.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // i.b0.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // i.b0.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // i.b0.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    protected c(Object obj) {
        this(obj, null, null, null, false);
    }

    protected c(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}