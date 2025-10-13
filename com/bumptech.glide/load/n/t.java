package com.bumptech.glide.load.n;

import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.load.n.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: LoadPath.java */
/* loaded from: classes.dex */
public class t<Data, ResourceType, Transcode> {
    private final Class<Data> a;

    /* renamed from: b, reason: collision with root package name */
    private final c.h.k.e<List<Throwable>> f3840b;

    /* renamed from: c, reason: collision with root package name */
    private final List<? extends i<Data, ResourceType, Transcode>> f3841c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3842d;

    public t(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<i<Data, ResourceType, Transcode>> list, c.h.k.e<List<Throwable>> eVar) {
        this.a = cls;
        this.f3840b = eVar;
        this.f3841c = (List) com.bumptech.glide.t.j.c(list);
        this.f3842d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v<Transcode> b(com.bumptech.glide.load.data.e<Data> eVar, com.bumptech.glide.load.i iVar, int i2, int i3, i.a<ResourceType> aVar, List<Throwable> list) throws q {
        int size = this.f3841c.size();
        v<Transcode> vVarA = null;
        for (int i4 = 0; i4 < size; i4++) {
            try {
                vVarA = this.f3841c.get(i4).a(eVar, i2, i3, iVar, aVar);
            } catch (q e2) {
                list.add(e2);
            }
            if (vVarA != null) {
                break;
            }
        }
        if (vVarA != null) {
            return vVarA;
        }
        throw new q(this.f3842d, new ArrayList(list));
    }

    public v<Transcode> a(com.bumptech.glide.load.data.e<Data> eVar, com.bumptech.glide.load.i iVar, int i2, int i3, i.a<ResourceType> aVar) {
        List<Throwable> list = (List) com.bumptech.glide.t.j.d(this.f3840b.b());
        try {
            return b(eVar, iVar, i2, i3, aVar, list);
        } finally {
            this.f3840b.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f3841c.toArray()) + CoreConstants.CURLY_RIGHT;
    }
}