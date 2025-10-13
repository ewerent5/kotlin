package com.bumptech.glide.load.n;

/* compiled from: CallbackException.java */
/* loaded from: classes.dex */
final class b extends RuntimeException {
    b(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}