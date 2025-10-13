package com.parizene.netmonitor.m0.b0;

/* compiled from: MyCellIdentity.java */
/* loaded from: classes.dex */
public abstract class d {
    public final String a;

    public d(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.a;
        String str2 = ((d) obj).a;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}