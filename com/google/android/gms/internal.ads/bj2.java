package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bj2;
import com.google.android.gms.internal.ads.ej2;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public class bj2<MessageType extends ej2<MessageType, BuilderType>, BuilderType extends bj2<MessageType, BuilderType>> extends kh2<MessageType, BuilderType> {

    /* renamed from: e, reason: collision with root package name */
    private final MessageType f5119e;

    /* renamed from: f, reason: collision with root package name */
    protected MessageType f5120f;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f5121g = false;

    protected bj2(MessageType messagetype) {
        this.f5119e = messagetype;
        this.f5120f = (MessageType) messagetype.C(4, null, null);
    }

    private static final void j(MessageType messagetype, MessageType messagetype2) {
        tk2.a().b(messagetype.getClass()).g(messagetype, messagetype2);
    }

    @Override // com.google.android.gms.internal.ads.mk2
    public final /* bridge */ /* synthetic */ lk2 g() {
        return this.f5119e;
    }

    @Override // com.google.android.gms.internal.ads.kh2
    protected final /* bridge */ /* synthetic */ kh2 h(lh2 lh2Var) {
        o((ej2) lh2Var);
        return this;
    }

    protected void k() {
        MessageType messagetype = (MessageType) this.f5120f.C(4, null, null);
        j(messagetype, this.f5120f);
        this.f5120f = messagetype;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final BuilderType clone() {
        BuilderType buildertype = (BuilderType) this.f5119e.C(5, null, null);
        buildertype.o(G0());
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.kk2
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public MessageType G0() {
        if (this.f5121g) {
            return this.f5120f;
        }
        MessageType messagetype = this.f5120f;
        tk2.a().b(messagetype.getClass()).j(messagetype);
        this.f5121g = true;
        return this.f5120f;
    }

    public final MessageType n() {
        MessageType messagetype = (MessageType) G0();
        if (messagetype.x()) {
            return messagetype;
        }
        throw new ql2(messagetype);
    }

    public final BuilderType o(MessageType messagetype) {
        if (this.f5121g) {
            k();
            this.f5121g = false;
        }
        j(this.f5120f, messagetype);
        return this;
    }

    public final BuilderType p(byte[] bArr, int i2, int i3, qi2 qi2Var) throws qj2 {
        if (this.f5121g) {
            k();
            this.f5121g = false;
        }
        try {
            tk2.a().b(this.f5120f.getClass()).k(this.f5120f, bArr, 0, i3, new oh2(qi2Var));
            return this;
        } catch (qj2 e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
        } catch (IndexOutOfBoundsException unused) {
            throw qj2.b();
        }
    }
}