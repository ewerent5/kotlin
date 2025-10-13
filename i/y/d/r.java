package i.y.d;

/* compiled from: PropertyReference.java */
/* loaded from: classes3.dex */
public abstract class r extends c implements i.b0.h {
    public r() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return getOwner().equals(rVar.getOwner()) && getName().equals(rVar.getName()) && getSignature().equals(rVar.getSignature()) && l.a(getBoundReceiver(), rVar.getBoundReceiver());
        }
        if (obj instanceof i.b0.h) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // i.b0.h
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // i.b0.h
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        i.b0.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public r(Object obj) {
        super(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i.y.d.c
    public i.b0.h getReflected() {
        return (i.b0.h) super.getReflected();
    }

    public r(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
    }
}