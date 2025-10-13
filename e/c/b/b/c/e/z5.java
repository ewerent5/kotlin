package e.c.b.b.c.e;

import e.c.b.b.c.e.x5;
import e.c.b.b.c.e.z5;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public abstract class z5<MessageType extends x5<MessageType, BuilderType>, BuilderType extends z5<MessageType, BuilderType>> implements a9 {
    @Override // e.c.b.b.c.e.a9
    public final /* synthetic */ a9 I0(byte[] bArr, b7 b7Var) {
        return j(bArr, 0, bArr.length, b7Var);
    }

    @Override // e.c.b.b.c.e.a9
    public final /* synthetic */ a9 b0(b9 b9Var) {
        if (g().getClass().isInstance(b9Var)) {
            return h((x5) b9Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // e.c.b.b.c.e.a9
    public final /* synthetic */ a9 c(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public abstract /* synthetic */ Object clone();

    protected abstract BuilderType h(MessageType messagetype);

    public abstract BuilderType i(byte[] bArr, int i2, int i3);

    public abstract BuilderType j(byte[] bArr, int i2, int i3, b7 b7Var);
}