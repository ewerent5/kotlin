package com.google.android.datatransport.cct;

import e.c.b.a.i.f;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: CCTDestination.java */
/* loaded from: classes.dex */
public final class a implements f {
    static final String a;

    /* renamed from: b, reason: collision with root package name */
    static final String f4273b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f4274c;

    /* renamed from: d, reason: collision with root package name */
    private static final Set<e.c.b.a.b> f4275d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f4276e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f4277f;

    /* renamed from: g, reason: collision with root package name */
    private final String f4278g;

    /* renamed from: h, reason: collision with root package name */
    private final String f4279h;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        a = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f4273b = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f4274c = strA3;
        f4275d = Collections.unmodifiableSet(new HashSet(Arrays.asList(e.c.b.a.b.b("proto"), e.c.b.a.b.b("json"))));
        f4276e = new a(strA, null);
        f4277f = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f4278g = str;
        this.f4279h = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // e.c.b.a.i.f
    public Set<e.c.b.a.b> a() {
        return f4275d;
    }

    public byte[] b() {
        String str = this.f4279h;
        if (str == null && this.f4278g == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f4278g;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f4279h;
    }

    public String e() {
        return this.f4278g;
    }

    @Override // e.c.b.a.i.e
    public byte[] getExtras() {
        return b();
    }

    @Override // e.c.b.a.i.e
    public String getName() {
        return "cct";
    }
}