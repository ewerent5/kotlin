package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class kw2 {
    private static final int a = v03.l("nam");

    /* renamed from: b, reason: collision with root package name */
    private static final int f7108b = v03.l("trk");

    /* renamed from: c, reason: collision with root package name */
    private static final int f7109c = v03.l("cmt");

    /* renamed from: d, reason: collision with root package name */
    private static final int f7110d = v03.l("day");

    /* renamed from: e, reason: collision with root package name */
    private static final int f7111e = v03.l("ART");

    /* renamed from: f, reason: collision with root package name */
    private static final int f7112f = v03.l("too");

    /* renamed from: g, reason: collision with root package name */
    private static final int f7113g = v03.l("alb");

    /* renamed from: h, reason: collision with root package name */
    private static final int f7114h = v03.l("com");

    /* renamed from: i, reason: collision with root package name */
    private static final int f7115i = v03.l("wrt");

    /* renamed from: j, reason: collision with root package name */
    private static final int f7116j = v03.l("lyr");

    /* renamed from: k, reason: collision with root package name */
    private static final int f7117k = v03.l("gen");

    /* renamed from: l, reason: collision with root package name */
    private static final int f7118l = v03.l("covr");

    /* renamed from: m, reason: collision with root package name */
    private static final int f7119m = v03.l("gnre");
    private static final int n = v03.l("grp");
    private static final int o = v03.l("disk");
    private static final int p = v03.l("trkn");
    private static final int q = v03.l("tmpo");
    private static final int r = v03.l("cpil");
    private static final int s = v03.l("aART");
    private static final int t = v03.l("sonm");
    private static final int u = v03.l("soal");
    private static final int v = v03.l("soar");
    private static final int w = v03.l("soaa");
    private static final int x = v03.l("soco");
    private static final int y = v03.l("rtng");
    private static final int z = v03.l("pgap");
    private static final int A = v03.l("sosn");
    private static final int B = v03.l("tvsh");
    private static final int C = v03.l("----");
    private static final String[] D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.gx2 a(com.google.android.gms.internal.ads.o03 r13) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kw2.a(com.google.android.gms.internal.ads.o03):com.google.android.gms.internal.ads.gx2");
    }

    private static qx2 b(int i2, String str, o03 o03Var) {
        int iR = o03Var.r();
        if (o03Var.r() == wv2.E0) {
            o03Var.j(8);
            return new qx2(str, null, o03Var.w(iR - 16));
        }
        String strValueOf = String.valueOf(wv2.c(i2));
        Log.w("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse text attribute: ".concat(strValueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    private static ox2 c(int i2, String str, o03 o03Var, boolean z2, boolean z3) {
        int iE = e(o03Var);
        if (z3) {
            iE = Math.min(1, iE);
        }
        if (iE >= 0) {
            return z2 ? new qx2(str, null, Integer.toString(iE)) : new mx2("und", str, Integer.toString(iE));
        }
        String strValueOf = String.valueOf(wv2.c(i2));
        Log.w("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(strValueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    private static qx2 d(int i2, String str, o03 o03Var) {
        int iR = o03Var.r();
        if (o03Var.r() == wv2.E0 && iR >= 22) {
            o03Var.j(10);
            int iM = o03Var.m();
            if (iM > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(iM);
                String string = sb.toString();
                int iM2 = o03Var.m();
                if (iM2 > 0) {
                    String strValueOf = String.valueOf(string);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 12);
                    sb2.append(strValueOf);
                    sb2.append("/");
                    sb2.append(iM2);
                    string = sb2.toString();
                }
                return new qx2(str, null, string);
            }
        }
        String strValueOf2 = String.valueOf(wv2.c(i2));
        Log.w("MetadataUtil", strValueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(strValueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    private static int e(o03 o03Var) {
        o03Var.j(4);
        if (o03Var.r() == wv2.E0) {
            o03Var.j(8);
            return o03Var.l();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}