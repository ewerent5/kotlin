package e.c.a;

import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public enum a {
    INVALID_REQUEST("Invalid Ad request."),
    NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
    NETWORK_ERROR("A network error occurred."),
    INTERNAL_ERROR("There was an internal error.");


    /* renamed from: j, reason: collision with root package name */
    private final String f14212j;

    a(String str) {
        this.f14212j = str;
    }

    @Override // java.lang.Enum
    @RecentlyNonNull
    public String toString() {
        return this.f14212j;
    }
}