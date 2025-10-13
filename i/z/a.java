package i.z;

import java.util.Random;

/* compiled from: PlatformRandom.kt */
/* loaded from: classes3.dex */
public abstract class a extends c {
    @Override // i.z.c
    public int b() {
        return c().nextInt();
    }

    public abstract Random c();
}