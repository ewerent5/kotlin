package i.y.d;

/* compiled from: FunctionReference.java */
/* loaded from: classes3.dex */
public class i extends c implements h, i.b0.e {

    /* renamed from: e, reason: collision with root package name */
    private final int f15887e;

    /* renamed from: f, reason: collision with root package name */
    private final int f15888f;

    public i(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f15887e = i2;
        this.f15888f = i3 >> 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i.y.d.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public i.b0.e getReflected() {
        return (i.b0.e) super.getReflected();
    }

    @Override // i.y.d.c
    protected i.b0.b computeReflected() {
        return v.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return l.a(getOwner(), iVar.getOwner()) && getName().equals(iVar.getName()) && getSignature().equals(iVar.getSignature()) && this.f15888f == iVar.f15888f && this.f15887e == iVar.f15887e && l.a(getBoundReceiver(), iVar.getBoundReceiver());
        }
        if (obj instanceof i.b0.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // i.y.d.h
    public int getArity() {
        return this.f15887e;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // i.y.d.c, i.b0.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        i.b0.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}