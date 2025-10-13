package com.parizene.netmonitor.s0.d;

import android.location.Location;
import com.parizene.netmonitor.s0.b;

/* compiled from: lambda */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements b.a {
    public final /* synthetic */ Location a;

    public /* synthetic */ a(Location location) {
        location = location;
    }

    @Override // com.parizene.netmonitor.s0.b.a
    public final void a(Object obj) {
        ((d) obj).onLocationChanged(location);
    }
}