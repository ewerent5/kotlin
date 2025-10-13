package e.a.b;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.ads.AdRequest;
import java.security.DigestException;
import java.security.MessageDigest;

/* compiled from: MD5.java */
/* loaded from: classes.dex */
public final class a extends MessageDigest implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    private long f14198e;

    /* renamed from: f, reason: collision with root package name */
    private int f14199f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f14200g;

    /* renamed from: h, reason: collision with root package name */
    private int f14201h;

    /* renamed from: i, reason: collision with root package name */
    private int f14202i;

    /* renamed from: j, reason: collision with root package name */
    private int f14203j;

    /* renamed from: k, reason: collision with root package name */
    private int f14204k;

    public a() {
        super("MD5");
        this.f14200g = new byte[64];
        b();
    }

    private final void a(byte[] bArr, int i2) {
        int i3 = this.f14202i;
        int i4 = this.f14203j;
        int i5 = this.f14204k;
        int i6 = (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | (bArr[i2 + 3] << 24);
        int i7 = this.f14201h;
        int i8 = (((((i4 ^ i5) & i3) ^ i5) + i6) - 680876936) + i7;
        int i9 = ((i8 >>> 25) | (i8 << 7)) + i3;
        int i10 = i2 + 10;
        int i11 = (bArr[i2 + 4] & 255) | ((bArr[i2 + 5] & 255) << 8) | ((bArr[i10 - 4] & 255) << 16) | (bArr[i10 - 3] << 24);
        int i12 = (((((i3 ^ i4) & i9) ^ i4) + i11) - 389564586) + i5;
        int i13 = ((i12 >>> 20) | (i12 << 12)) + i9;
        int i14 = (bArr[i10 - 2] & 255) | ((bArr[i10 - 1] & 255) << 8) | ((bArr[i10] & 255) << 16) | (bArr[i10 + 1] << 24);
        int i15 = (((i9 ^ i3) & i13) ^ i3) + i14 + 606105819 + i4;
        int i16 = ((i15 >>> 15) | (i15 << 17)) + i13;
        int i17 = (bArr[i10 + 2] & 255) | ((bArr[i10 + 3] & 255) << 8) | ((bArr[i10 + 4] & 255) << 16) | (bArr[i10 + 5] << 24);
        int i18 = (((((i13 ^ i9) & i16) ^ i9) + i17) - 1044525330) + i3;
        int i19 = ((i18 >>> 10) | (i18 << 22)) + i16;
        int i20 = i10 + 10;
        int i21 = ((bArr[i20 - 3] & 255) << 8) | (bArr[i20 - 4] & 255) | ((bArr[i20 - 2] & 255) << 16) | (bArr[i20 - 1] << 24);
        int i22 = (((((i16 ^ i13) & i19) ^ i13) + i21) - 176418897) + i9;
        int i23 = ((i22 << 7) | (i22 >>> 25)) + i19;
        int i24 = (((i19 ^ i16) & i23) ^ i16) + (((bArr[i20 + 1] & 255) << 8) | (bArr[i20] & 255) | ((bArr[i20 + 2] & 255) << 16) | (bArr[i20 + 3] << 24)) + 1200080426 + i13;
        int i25 = ((i24 << 12) | (i24 >>> 20)) + i23;
        int i26 = ((bArr[i20 + 5] & 255) << 8) | (bArr[i20 + 4] & 255);
        int i27 = i20 + 10;
        int i28 = i26 | ((bArr[i27 - 4] & 255) << 16) | (bArr[i27 - 3] << 24);
        int i29 = (((((i23 ^ i19) & i25) ^ i19) + i28) - 1473231341) + i16;
        int i30 = ((i29 << 17) | (i29 >>> 15)) + i25;
        int i31 = ((bArr[i27 - 1] & 255) << 8) | (bArr[i27 - 2] & 255) | ((bArr[i27] & 255) << 16) | (bArr[i27 + 1] << 24);
        int i32 = (((((i25 ^ i23) & i30) ^ i23) + i31) - 45705983) + i19;
        int i33 = ((i32 << 22) | (i32 >>> 10)) + i30;
        int i34 = ((bArr[i27 + 3] & 255) << 8) | (bArr[i27 + 2] & 255) | ((bArr[i27 + 4] & 255) << 16) | (bArr[i27 + 5] << 24);
        int i35 = (((i30 ^ i25) & i33) ^ i25) + i34 + 1770035416 + i23;
        int i36 = ((i35 << 7) | (i35 >>> 25)) + i33;
        int i37 = i27 + 10;
        int i38 = ((bArr[i37 - 3] & 255) << 8) | (bArr[i37 - 4] & 255) | ((bArr[i37 - 2] & 255) << 16) | (bArr[i37 - 1] << 24);
        int i39 = (((((i33 ^ i30) & i36) ^ i30) + i38) - 1958414417) + i25;
        int i40 = ((i39 << 12) | (i39 >>> 20)) + i36;
        int i41 = ((bArr[i37 + 1] & 255) << 8) | (bArr[i37] & 255) | ((bArr[i37 + 2] & 255) << 16) | (bArr[i37 + 3] << 24);
        int i42 = (((((i36 ^ i33) & i40) ^ i33) + i41) - 42063) + i30;
        int i43 = ((i42 << 17) | (i42 >>> 15)) + i40;
        int i44 = ((bArr[i37 + 5] & 255) << 8) | (bArr[i37 + 4] & 255);
        int i45 = i37 + 10;
        int i46 = i44 | ((bArr[i45 - 4] & 255) << 16) | (bArr[i45 - 3] << 24);
        int i47 = (((((i40 ^ i36) & i43) ^ i36) + i46) - 1990404162) + i33;
        int i48 = ((i47 << 22) | (i47 >>> 10)) + i43;
        int i49 = ((bArr[i45 - 1] & 255) << 8) | (bArr[i45 - 2] & 255) | ((bArr[i45] & 255) << 16) | (bArr[i45 + 1] << 24);
        int i50 = (((i43 ^ i40) & i48) ^ i40) + i49 + 1804603682 + i36;
        int i51 = ((i50 << 7) | (i50 >>> 25)) + i48;
        int i52 = ((bArr[i45 + 3] & 255) << 8) | (bArr[i45 + 2] & 255) | ((bArr[i45 + 4] & 255) << 16) | (bArr[i45 + 5] << 24);
        int i53 = (((((i48 ^ i43) & i51) ^ i43) + i52) - 40341101) + i40;
        int i54 = ((i53 << 12) | (i53 >>> 20)) + i51;
        int i55 = i45 + 10;
        int i56 = ((bArr[i55 - 3] & 255) << 8) | (bArr[i55 - 4] & 255) | ((bArr[i55 - 2] & 255) << 16) | (bArr[i55 - 1] << 24);
        int i57 = (((((i51 ^ i48) & i54) ^ i48) + i56) - 1502002290) + i43;
        int i58 = ((i57 << 17) | (i57 >>> 15)) + i54;
        int i59 = (bArr[i55 + 3] << 24) | ((bArr[i55 + 1] & 255) << 8) | (bArr[i55] & 255) | ((bArr[i55 + 2] & 255) << 16);
        int i60 = (((i54 ^ i51) & i58) ^ i51) + i59 + 1236535329 + i48;
        int i61 = ((i60 << 22) | (i60 >>> 10)) + i58;
        int i62 = (((((i58 ^ i61) & i54) ^ i58) + i11) - 165796510) + i51;
        int i63 = ((i62 << 5) | (i62 >>> 27)) + i61;
        int i64 = (((((i61 ^ i63) & i58) ^ i61) + i28) - 1069501632) + i54;
        int i65 = ((i64 << 9) | (i64 >>> 23)) + i63;
        int i66 = (((i63 ^ i65) & i61) ^ i63) + i46 + 643717713 + i58;
        int i67 = ((i66 << 14) | (i66 >>> 18)) + i65;
        int i68 = (((((i65 ^ i67) & i63) ^ i65) + i6) - 373897302) + i61;
        int i69 = ((i68 << 20) | (i68 >>> 12)) + i67;
        int i70 = (((((i67 ^ i69) & i65) ^ i67) + r3) - 701558691) + i63;
        int i71 = ((i70 << 5) | (i70 >>> 27)) + i69;
        int i72 = (((i69 ^ i71) & i67) ^ i69) + i41 + 38016083 + i65;
        int i73 = ((i72 << 9) | (i72 >>> 23)) + i71;
        int i74 = (((((i71 ^ i73) & i69) ^ i71) + i59) - 660478335) + i67;
        int i75 = ((i74 << 14) | (i74 >>> 18)) + i73;
        int i76 = (((((i73 ^ i75) & i71) ^ i73) + i21) - 405537848) + i69;
        int i77 = ((i76 << 20) | (i76 >>> 12)) + i75;
        int i78 = (((i75 ^ i77) & i73) ^ i75) + i38 + 568446438 + i71;
        int i79 = ((i78 << 5) | (i78 >>> 27)) + i77;
        int i80 = (((((i77 ^ i79) & i75) ^ i77) + i56) - 1019803690) + i73;
        int i81 = ((i80 << 9) | (i80 >>> 23)) + i79;
        int i82 = (((((i79 ^ i81) & i77) ^ i79) + i17) - 187363961) + i75;
        int i83 = ((i82 << 14) | (i82 >>> 18)) + i81;
        int i84 = (((i81 ^ i83) & i79) ^ i81) + i34 + 1163531501 + i77;
        int i85 = ((i84 << 20) | (i84 >>> 12)) + i83;
        int i86 = (((((i83 ^ i85) & i81) ^ i83) + i52) - 1444681467) + i79;
        int i87 = ((i86 << 5) | (i86 >>> 27)) + i85;
        int i88 = (((((i85 ^ i87) & i83) ^ i85) + i14) - 51403784) + i81;
        int i89 = ((i88 << 9) | (i88 >>> 23)) + i87;
        int i90 = (((i87 ^ i89) & i85) ^ i87) + i31 + 1735328473 + i83;
        int i91 = ((i90 << 14) | (i90 >>> 18)) + i89;
        int i92 = (((((i89 ^ i91) & i87) ^ i89) + i49) - 1926607734) + i85;
        int i93 = ((i92 << 20) | (i92 >>> 12)) + i91;
        int i94 = ((((i91 ^ i93) ^ i89) + r3) - 378558) + i87;
        int i95 = ((i94 << 4) | (i94 >>> 28)) + i93;
        int i96 = ((((i93 ^ i95) ^ i91) + i34) - 2022574463) + i89;
        int i97 = ((i96 << 11) | (i96 >>> 21)) + i95;
        int i98 = ((i95 ^ i97) ^ i93) + i46 + 1839030562 + i91;
        int i99 = ((i98 << 16) | (i98 >>> 16)) + i97;
        int i100 = ((((i97 ^ i99) ^ i95) + i56) - 35309556) + i93;
        int i101 = ((i100 << 23) | (i100 >>> 9)) + i99;
        int i102 = ((((i99 ^ i101) ^ i97) + i11) - 1530992060) + i95;
        int i103 = ((i102 << 4) | (i102 >>> 28)) + i101;
        int i104 = ((i101 ^ i103) ^ i99) + i21 + 1272893353 + i97;
        int i105 = ((i104 << 11) | (i104 >>> 21)) + i103;
        int i106 = ((((i103 ^ i105) ^ i101) + i31) - 155497632) + i99;
        int i107 = ((i106 << 16) | (i106 >>> 16)) + i105;
        int i108 = ((((i105 ^ i107) ^ i103) + i41) - 1094730640) + i101;
        int i109 = ((i108 << 23) | (i108 >>> 9)) + i107;
        int i110 = ((i107 ^ i109) ^ i105) + i52 + 681279174 + i103;
        int i111 = ((i110 << 4) | (i110 >>> 28)) + i109;
        int i112 = ((((i109 ^ i111) ^ i107) + i6) - 358537222) + i105;
        int i113 = ((i112 << 11) | (i112 >>> 21)) + i111;
        int i114 = ((((i111 ^ i113) ^ i109) + i17) - 722521979) + i107;
        int i115 = ((i114 << 16) | (i114 >>> 16)) + i113;
        int i116 = ((i113 ^ i115) ^ i111) + i28 + 76029189 + i109;
        int i117 = ((i116 << 23) | (i116 >>> 9)) + i115;
        int i118 = ((((i115 ^ i117) ^ i113) + i38) - 640364487) + i111;
        int i119 = ((i118 << 4) | (i118 >>> 28)) + i117;
        int i120 = ((((i117 ^ i119) ^ i115) + i49) - 421815835) + i113;
        int i121 = ((i120 << 11) | (i120 >>> 21)) + i119;
        int i122 = ((i119 ^ i121) ^ i117) + i59 + 530742520 + i115;
        int i123 = ((i122 << 16) | (i122 >>> 16)) + i121;
        int i124 = ((((i121 ^ i123) ^ i119) + i14) - 995338651) + i117;
        int i125 = ((i124 << 23) | (i124 >>> 9)) + i123;
        int i126 = (((((~i121) | i125) ^ i123) + i6) - 198630844) + i119;
        int i127 = ((i126 << 6) | (i126 >>> 26)) + i125;
        int i128 = (((~i123) | i127) ^ i125) + i31 + 1126891415 + i121;
        int i129 = ((i128 >>> 22) | (i128 << 10)) + i127;
        int i130 = (((((~i125) | i129) ^ i127) + i56) - 1416354905) + i123;
        int i131 = ((i130 >>> 17) | (i130 << 15)) + i129;
        int i132 = (((((~i127) | i131) ^ i129) + r3) - 57434055) + i125;
        int i133 = ((i132 << 21) | (i132 >>> 11)) + i131;
        int i134 = (((~i129) | i133) ^ i131) + i49 + 1700485571 + i127;
        int i135 = ((i134 << 6) | (i134 >>> 26)) + i133;
        int i136 = (((((~i131) | i135) ^ i133) + i17) - 1894986606) + i129;
        int i137 = ((i136 << 10) | (i136 >>> 22)) + i135;
        int i138 = (((((~i133) | i137) ^ i135) + i41) - 1051523) + i131;
        int i139 = ((i138 << 15) | (i138 >>> 17)) + i137;
        int i140 = (((((~i135) | i139) ^ i137) + i11) - 2054922799) + i133;
        int i141 = ((i140 << 21) | (i140 >>> 11)) + i139;
        int i142 = (((~i137) | i141) ^ i139) + i34 + 1873313359 + i135;
        int i143 = ((i142 << 6) | (i142 >>> 26)) + i141;
        int i144 = (((((~i139) | i143) ^ i141) + i59) - 30611744) + i137;
        int i145 = ((i144 << 10) | (i144 >>> 22)) + i143;
        int i146 = (((((~i141) | i145) ^ i143) + i28) - 1560198380) + i139;
        int i147 = ((i146 << 15) | (i146 >>> 17)) + i145;
        int i148 = (((~i143) | i147) ^ i145) + i52 + 1309151649 + i141;
        int i149 = ((i148 << 21) | (i148 >>> 11)) + i147;
        int i150 = (((((~i145) | i149) ^ i147) + i21) - 145523070) + i143;
        int i151 = ((i150 << 6) | (i150 >>> 26)) + i149;
        int i152 = (((((~i147) | i151) ^ i149) + i46) - 1120210379) + i145;
        int i153 = ((i152 << 10) | (i152 >>> 22)) + i151;
        int i154 = (((~i149) | i153) ^ i151) + i14 + 718787259 + i147;
        int i155 = ((i154 << 15) | (i154 >>> 17)) + i153;
        int i156 = (((((~i151) | i155) ^ i153) + i38) - 343485551) + i149;
        this.f14202i = i3 + i155 + ((i156 << 21) | (i156 >>> 11));
        this.f14203j = i4 + i155;
        this.f14204k = i5 + i153;
        this.f14201h = i7 + i151;
    }

    protected void b() {
        this.f14201h = 1732584193;
        this.f14202i = -271733879;
        this.f14203j = -1732584194;
        this.f14204k = 271733878;
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        a aVar = (a) super.clone();
        aVar.f14200g = (byte[]) this.f14200g.clone();
        return aVar;
    }

    @Override // java.security.MessageDigestSpi
    public byte[] engineDigest() {
        try {
            byte[] bArr = new byte[16];
            engineDigest(bArr, 0, 16);
            return bArr;
        } catch (DigestException unused) {
            return null;
        }
    }

    @Override // java.security.MessageDigestSpi
    public int engineGetDigestLength() {
        return 16;
    }

    @Override // java.security.MessageDigestSpi
    public void engineReset() {
        this.f14199f = 0;
        this.f14198e = 0L;
        byte[] bArr = this.f14200g;
        int i2 = 60;
        do {
            bArr[i2 - 4] = 0;
            bArr[i2 - 3] = 0;
            bArr[i2 - 2] = 0;
            bArr[i2 - 1] = 0;
            bArr[i2] = 0;
            bArr[i2 + 1] = 0;
            bArr[i2 + 2] = 0;
            bArr[i2 + 3] = 0;
            i2 -= 8;
        } while (i2 >= 0);
        b();
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte b2) {
        this.f14198e++;
        int i2 = this.f14199f;
        if (i2 < 63) {
            byte[] bArr = this.f14200g;
            this.f14199f = i2 + 1;
            bArr[i2] = b2;
        } else {
            byte[] bArr2 = this.f14200g;
            bArr2[63] = b2;
            a(bArr2, i2);
            this.f14199f = 0;
        }
    }

    @Override // java.security.MessageDigestSpi
    public int engineDigest(byte[] bArr, int i2, int i3) throws DigestException {
        if (i3 < 16) {
            throw new DigestException("partial digests not returned");
        }
        if (bArr.length - i2 < 16) {
            throw new DigestException("insufficient space in output buffer to store the digest");
        }
        byte[] bArr2 = this.f14200g;
        int i4 = this.f14199f;
        bArr2[i4] = -128;
        switch (i4) {
            case SyslogConstants.LOG_NEWS /* 56 */:
                bArr2[57] = 0;
            case 57:
                bArr2[58] = 0;
            case 58:
                bArr2[59] = 0;
            case 59:
                bArr2[60] = 0;
            case 60:
                bArr2[61] = 0;
            case 61:
                bArr2[62] = 0;
            case 62:
                bArr2[63] = 0;
            case 63:
                a(bArr2, 0);
                i4 = -1;
                break;
        }
        switch (i4 & 7) {
            case 0:
                i4 += 4;
                bArr2[i4 - 3] = 0;
                bArr2[i4 - 2] = 0;
                bArr2[i4 - 1] = 0;
                bArr2[i4] = 0;
                bArr2[i4 + 1] = 0;
                bArr2[i4 + 2] = 0;
                bArr2[i4 + 3] = 0;
                break;
            case 1:
                i4 += 3;
                bArr2[i4 - 2] = 0;
                bArr2[i4 - 1] = 0;
                bArr2[i4] = 0;
                bArr2[i4 + 1] = 0;
                bArr2[i4 + 2] = 0;
                bArr2[i4 + 3] = 0;
                break;
            case 2:
                i4 += 2;
                bArr2[i4 - 1] = 0;
                bArr2[i4] = 0;
                bArr2[i4 + 1] = 0;
                bArr2[i4 + 2] = 0;
                bArr2[i4 + 3] = 0;
                break;
            case 3:
                i4++;
                bArr2[i4] = 0;
                bArr2[i4 + 1] = 0;
                bArr2[i4 + 2] = 0;
                bArr2[i4 + 3] = 0;
                break;
            case 4:
                bArr2[i4 + 1] = 0;
                bArr2[i4 + 2] = 0;
                bArr2[i4 + 3] = 0;
                break;
            case 5:
                i4--;
                bArr2[i4 + 2] = 0;
                bArr2[i4 + 3] = 0;
                break;
            case 6:
                i4 -= 2;
                bArr2[i4 + 3] = 0;
                break;
            case 7:
                i4 -= 3;
                break;
        }
        while (true) {
            i4 += 8;
            if (i4 > 52) {
                long j2 = this.f14198e;
                int i5 = ((int) j2) << 3;
                bArr2[56] = (byte) i5;
                bArr2[57] = (byte) (i5 >>> 8);
                bArr2[58] = (byte) (i5 >>> 16);
                bArr2[59] = (byte) (i5 >>> 24);
                int i6 = (int) (j2 >>> 29);
                bArr2[60] = (byte) i6;
                bArr2[61] = (byte) (i6 >>> 8);
                bArr2[62] = (byte) (i6 >>> 16);
                bArr2[63] = (byte) (i6 >>> 24);
                a(bArr2, 0);
                int i7 = this.f14201h;
                bArr[i2] = (byte) i7;
                bArr[i2 + 1] = (byte) (i7 >>> 8);
                bArr[i2 + 2] = (byte) (i7 >>> 16);
                bArr[i2 + 3] = (byte) (i7 >>> 24);
                int i8 = this.f14202i;
                bArr[i2 + 4] = (byte) i8;
                bArr[i2 + 5] = (byte) (i8 >>> 8);
                int i9 = i2 + 10;
                bArr[i9 - 4] = (byte) (i8 >>> 16);
                bArr[i9 - 3] = (byte) (i8 >>> 24);
                int i10 = this.f14203j;
                bArr[i9 - 2] = (byte) i10;
                bArr[i9 - 1] = (byte) (i10 >>> 8);
                bArr[i9] = (byte) (i10 >>> 16);
                bArr[i9 + 1] = (byte) (i10 >>> 24);
                int i11 = this.f14204k;
                bArr[i9 + 2] = (byte) i11;
                bArr[i9 + 3] = (byte) (i11 >>> 8);
                bArr[i9 + 4] = (byte) (i11 >>> 16);
                bArr[i9 + 5] = (byte) (i11 >>> 24);
                engineReset();
                return 16;
            }
            bArr2[i4 - 4] = 0;
            bArr2[i4 - 3] = 0;
            bArr2[i4 - 2] = 0;
            bArr2[i4 - 1] = 0;
            bArr2[i4] = 0;
            bArr2[i4 + 1] = 0;
            bArr2[i4 + 2] = 0;
            bArr2[i4 + 3] = 0;
        }
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte[] bArr, int i2, int i3) {
        if (i2 >= 0 && i3 >= 0 && i2 + i3 <= bArr.length) {
            this.f14198e += i3;
            int i4 = this.f14199f;
            if (i4 > 0 && i4 + i3 >= 64) {
                int i5 = 64 - i4;
                System.arraycopy(bArr, i2, this.f14200g, i4, i5);
                byte[] bArr2 = this.f14200g;
                this.f14199f = 0;
                a(bArr2, 0);
                i2 += i5;
                i3 -= i5;
            }
            while (i3 >= 512) {
                a(bArr, i2);
                a(bArr, i2 + 64);
                a(bArr, i2 + 128);
                a(bArr, i2 + 192);
                a(bArr, i2 + 256);
                a(bArr, i2 + 320);
                a(bArr, i2 + 384);
                a(bArr, i2 + 448);
                i2 += AdRequest.MAX_CONTENT_URL_LENGTH;
                i3 -= 512;
            }
            while (i3 >= 64) {
                a(bArr, i2);
                i2 += 64;
                i3 -= 64;
            }
            if (i3 > 0) {
                System.arraycopy(bArr, i2, this.f14200g, this.f14199f, i3);
                this.f14199f += i3;
                return;
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException(i2);
    }
}