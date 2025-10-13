package okhttp3.internal.cache;

import i.s;
import i.y.c.l;
import i.y.d.m;
import java.io.IOException;
import okhttp3.internal.cache.DiskLruCache;

/* compiled from: DiskLruCache.kt */
/* loaded from: classes3.dex */
final class DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1 extends m implements l<IOException, s> {
    final /* synthetic */ int $index$inlined;
    final /* synthetic */ DiskLruCache.Editor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1(DiskLruCache.Editor editor, int i2) {
        super(1);
        this.this$0 = editor;
        this.$index$inlined = i2;
    }

    @Override // i.y.c.l
    public /* bridge */ /* synthetic */ s invoke(IOException iOException) {
        invoke2(iOException);
        return s.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(IOException iOException) {
        i.y.d.l.d(iOException, "it");
        synchronized (this.this$0.this$0) {
            this.this$0.detach$okhttp();
            s sVar = s.a;
        }
    }
}