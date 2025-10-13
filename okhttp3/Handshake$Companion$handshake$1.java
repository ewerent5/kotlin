package okhttp3;

import i.y.d.m;
import java.security.cert.Certificate;
import java.util.List;

/* compiled from: Handshake.kt */
/* loaded from: classes3.dex */
final class Handshake$Companion$handshake$1 extends m implements i.y.c.a<List<? extends Certificate>> {
    final /* synthetic */ List $peerCertificatesCopy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Handshake$Companion$handshake$1(List list) {
        super(0);
        this.$peerCertificatesCopy = list;
    }

    @Override // i.y.c.a
    public final List<? extends Certificate> invoke() {
        return this.$peerCertificatesCopy;
    }
}