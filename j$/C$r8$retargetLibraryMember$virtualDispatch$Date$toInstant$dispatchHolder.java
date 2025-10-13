package j$;

import j$.time.Instant;
import java.util.Date;

/* renamed from: j$.$r8$retargetLibraryMember$virtualDispatch$Date$toInstant$dispatchHolder, reason: invalid class name */
/* loaded from: classes2.dex */
public /* synthetic */ class C$r8$retargetLibraryMember$virtualDispatch$Date$toInstant$dispatchHolder {
    /* JADX WARN: Multi-variable type inference failed */
    public static Instant toInstant(Date date) {
        return date instanceof InterfaceC0234a ? ((InterfaceC0234a) date).a() : Instant.y(date.getTime());
    }
}