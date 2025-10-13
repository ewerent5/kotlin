package androidx.core.app;

import android.app.RemoteInput;

/* compiled from: RemoteInput.java */
/* loaded from: classes.dex */
public final class m {
    static RemoteInput a(m mVar) {
        throw null;
    }

    static RemoteInput[] b(m[] mVarArr) {
        if (mVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[mVarArr.length];
        for (int i2 = 0; i2 < mVarArr.length; i2++) {
            remoteInputArr[i2] = a(mVarArr[i2]);
        }
        return remoteInputArr;
    }
}