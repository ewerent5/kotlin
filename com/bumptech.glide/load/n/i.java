package com.bumptech.glide.load.n;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DecodePath.java */
/* loaded from: classes.dex */
public class i<DataType, ResourceType, Transcode> {
    private final Class<DataType> a;

    /* renamed from: b, reason: collision with root package name */
    private final List<? extends com.bumptech.glide.load.k<DataType, ResourceType>> f3772b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.p.i.e<ResourceType, Transcode> f3773c;

    /* renamed from: d, reason: collision with root package name */
    private final c.h.k.e<List<Throwable>> f3774d;

    /* renamed from: e, reason: collision with root package name */
    private final String f3775e;

    /* compiled from: DecodePath.java */
    interface a<ResourceType> {
        v<ResourceType> a(v<ResourceType> vVar);
    }

    public i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends com.bumptech.glide.load.k<DataType, ResourceType>> list, com.bumptech.glide.load.p.i.e<ResourceType, Transcode> eVar, c.h.k.e<List<Throwable>> eVar2) {
        this.a = cls;
        this.f3772b = list;
        this.f3773c = eVar;
        this.f3774d = eVar2;
        this.f3775e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i2, int i3, com.bumptech.glide.load.i iVar) {
        List<Throwable> list = (List) com.bumptech.glide.t.j.d(this.f3774d.b());
        try {
            return c(eVar, i2, i3, iVar, list);
        } finally {
            this.f3774d.a(list);
        }
    }

    private v<ResourceType> c(com.bumptech.glide.load.data.e<DataType> eVar, int i2, int i3, com.bumptech.glide.load.i iVar, List<Throwable> list) throws q {
        int size = this.f3772b.size();
        v<ResourceType> vVarB = null;
        for (int i4 = 0; i4 < size; i4++) {
            com.bumptech.glide.load.k<DataType, ResourceType> kVar = this.f3772b.get(i4);
            try {
                if (kVar.a(eVar.a(), iVar)) {
                    vVarB = kVar.b(eVar.a(), i2, i3, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e2) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + kVar, e2);
                }
                list.add(e2);
            }
            if (vVarB != null) {
                break;
            }
        }
        if (vVarB != null) {
            return vVarB;
        }
        throw new q(this.f3775e, new ArrayList(list));
    }

    public v<Transcode> a(com.bumptech.glide.load.data.e<DataType> eVar, int i2, int i3, com.bumptech.glide.load.i iVar, a<ResourceType> aVar) {
        return this.f3773c.a(aVar.a(b(eVar, i2, i3, iVar)), iVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.f3772b + ", transcoder=" + this.f3773c + CoreConstants.CURLY_RIGHT;
    }
}