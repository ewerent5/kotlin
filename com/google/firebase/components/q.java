package com.google.firebase.components;

import java.util.Map;

/* compiled from: EventBus.java */
/* loaded from: classes.dex */
final /* synthetic */ class q implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final Map.Entry f12296e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.l.a f12297f;

    private q(Map.Entry entry, com.google.firebase.l.a aVar) {
        this.f12296e = entry;
        this.f12297f = aVar;
    }

    public static Runnable a(Map.Entry entry, com.google.firebase.l.a aVar) {
        return new q(entry, aVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        ((com.google.firebase.l.b) this.f12296e.getKey()).a(this.f12297f);
    }
}