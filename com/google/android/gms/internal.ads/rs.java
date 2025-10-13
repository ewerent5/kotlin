package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(14)
/* loaded from: classes.dex */
public final class rs extends ts implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: g, reason: collision with root package name */
    private static final Map<Integer, String> f8713g;

    /* renamed from: h, reason: collision with root package name */
    private final lt f8714h;

    /* renamed from: i, reason: collision with root package name */
    private final mt f8715i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f8716j;

    /* renamed from: k, reason: collision with root package name */
    private int f8717k;

    /* renamed from: l, reason: collision with root package name */
    private int f8718l;

    /* renamed from: m, reason: collision with root package name */
    private MediaPlayer f8719m;
    private Uri n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private jt t;
    private final boolean u;
    private int v;
    private ss w;
    private Integer x;

    static {
        HashMap map = new HashMap();
        f8713g = map;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17) {
            map.put(-1004, "MEDIA_ERROR_IO");
            map.put(-1007, "MEDIA_ERROR_MALFORMED");
            map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            map.put(-110, "MEDIA_ERROR_TIMED_OUT");
            map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(701, "MEDIA_INFO_BUFFERING_START");
        map.put(702, "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (i2 >= 19) {
            map.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            map.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public rs(Context context, lt ltVar, boolean z, boolean z2, kt ktVar, mt mtVar) {
        super(context);
        this.f8717k = 0;
        this.f8718l = 0;
        this.x = null;
        setSurfaceTextureListener(this);
        this.f8714h = ltVar;
        this.f8715i = mtVar;
        this.u = z;
        this.f8716j = z2;
        mtVar.a(this);
    }

    private final void B() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.n == null || surfaceTexture == null) {
            return;
        }
        D(false);
        try {
            zzs.zzs();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f8719m = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f8719m.setOnCompletionListener(this);
            this.f8719m.setOnErrorListener(this);
            this.f8719m.setOnInfoListener(this);
            this.f8719m.setOnPreparedListener(this);
            this.f8719m.setOnVideoSizeChangedListener(this);
            this.q = 0;
            if (this.u) {
                jt jtVar = new jt(getContext());
                this.t = jtVar;
                jtVar.a(surfaceTexture, getWidth(), getHeight());
                this.t.start();
                SurfaceTexture surfaceTextureD = this.t.d();
                if (surfaceTextureD != null) {
                    surfaceTexture = surfaceTextureD;
                } else {
                    this.t.c();
                    this.t = null;
                }
            }
            this.f8719m.setDataSource(getContext(), this.n);
            zzs.zzt();
            this.f8719m.setSurface(new Surface(surfaceTexture));
            this.f8719m.setAudioStreamType(3);
            this.f8719m.setScreenOnWhilePlaying(true);
            this.f8719m.prepareAsync();
            G(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e2) {
            String strValueOf = String.valueOf(this.n);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 36);
            sb.append("Failed to initialize MediaPlayer at ");
            sb.append(strValueOf);
            er.zzj(sb.toString(), e2);
            onError(this.f8719m, 1, 0);
        }
    }

    private final void C() throws IllegalStateException {
        if (this.f8716j && E() && this.f8719m.getCurrentPosition() > 0 && this.f8718l != 3) {
            zze.zza("AdMediaPlayerView nudging MediaPlayer");
            F(0.0f);
            this.f8719m.start();
            int currentPosition = this.f8719m.getCurrentPosition();
            long jA = zzs.zzj().a();
            while (E() && this.f8719m.getCurrentPosition() == currentPosition && zzs.zzj().a() - jA <= 250) {
            }
            this.f8719m.pause();
            zzq();
        }
    }

    private final void D(boolean z) {
        zze.zza("AdMediaPlayerView release");
        jt jtVar = this.t;
        if (jtVar != null) {
            jtVar.c();
            this.t = null;
        }
        MediaPlayer mediaPlayer = this.f8719m;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f8719m.release();
            this.f8719m = null;
            G(0);
            if (z) {
                this.f8718l = 0;
            }
        }
    }

    private final boolean E() {
        int i2;
        return (this.f8719m == null || (i2 = this.f8717k) == -1 || i2 == 0 || i2 == 1) ? false : true;
    }

    private final void F(float f2) {
        MediaPlayer mediaPlayer = this.f8719m;
        if (mediaPlayer == null) {
            er.zzi("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f2, f2);
            } catch (IllegalStateException unused) {
            }
        }
    }

    private final void G(int i2) {
        if (i2 == 3) {
            this.f8715i.e();
            this.f9239f.d();
        } else if (this.f8717k == 3) {
            this.f8715i.f();
            this.f9239f.e();
        }
        this.f8717k = i2;
    }

    static /* synthetic */ void I(rs rsVar, MediaPlayer mediaPlayer) {
        MediaPlayer.TrackInfo[] trackInfo;
        MediaFormat format;
        if (!((Boolean) c.c().b(w3.j1)).booleanValue() || rsVar.f8714h == null || mediaPlayer == null || Build.VERSION.SDK_INT < 19 || (trackInfo = mediaPlayer.getTrackInfo()) == null) {
            return;
        }
        HashMap map = new HashMap();
        for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
            if (trackInfo2 != null) {
                int trackType = trackInfo2.getTrackType();
                if (trackType == 1) {
                    MediaFormat format2 = trackInfo2.getFormat();
                    if (format2 != null) {
                        if (format2.containsKey("frame-rate")) {
                            try {
                                map.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                            } catch (ClassCastException unused) {
                                map.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                            }
                        }
                        if (format2.containsKey("bitrate")) {
                            Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                            rsVar.x = numValueOf;
                            map.put("bitRate", String.valueOf(numValueOf));
                        }
                        if (format2.containsKey("width") && format2.containsKey("height")) {
                            int integer = format2.getInteger("width");
                            int integer2 = format2.getInteger("height");
                            StringBuilder sb = new StringBuilder(23);
                            sb.append(integer);
                            sb.append("x");
                            sb.append(integer2);
                            map.put("resolution", sb.toString());
                        }
                        if (format2.containsKey("mime")) {
                            map.put("videoMime", format2.getString("mime"));
                        }
                        if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                            map.put("videoCodec", format2.getString("codecs-string"));
                        }
                    }
                } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                    if (format.containsKey("mime")) {
                        map.put("audioMime", format.getString("mime"));
                    }
                    if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                        map.put("audioCodec", format.getString("codecs-string"));
                    }
                }
            }
        }
        if (map.isEmpty()) {
            return;
        }
        rsVar.f8714h.e0("onMetadataEvent", map);
    }

    final /* synthetic */ void H(int i2) {
        ss ssVar = this.w;
        if (ssVar != null) {
            ssVar.onWindowVisibilityChanged(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final String a() {
        String str = true != this.u ? "" : " spherical";
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final void g(ss ssVar) {
        this.w = ssVar;
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final void h(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        Uri uri = Uri.parse(str);
        h43 h43VarC = h43.c(uri);
        if (h43VarC == null || h43VarC.f6286e != null) {
            if (h43VarC != null) {
                uri = Uri.parse(h43VarC.f6286e);
            }
            this.n = uri;
            this.v = 0;
            B();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final void i() throws IllegalStateException {
        zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f8719m;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f8719m.release();
            this.f8719m = null;
            G(0);
            this.f8718l = 0;
        }
        this.f8715i.c();
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final void j() throws IllegalStateException {
        zze.zza("AdMediaPlayerView play");
        if (E()) {
            this.f8719m.start();
            G(3);
            this.f9238e.a();
            zzr.zza.post(new ps(this));
        }
        this.f8718l = 3;
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final void k() throws IllegalStateException {
        zze.zza("AdMediaPlayerView pause");
        if (E() && this.f8719m.isPlaying()) {
            this.f8719m.pause();
            G(4);
            zzr.zza.post(new qs(this));
        }
        this.f8718l = 4;
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final int l() {
        if (E()) {
            return this.f8719m.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final int m() {
        if (E()) {
            return this.f8719m.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final void n(int i2) throws IllegalStateException {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i2);
        zze.zza(sb.toString());
        if (!E()) {
            this.v = i2;
        } else {
            this.f8719m.seekTo(i2);
            this.v = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final void o(float f2, float f3) {
        jt jtVar = this.t;
        if (jtVar != null) {
            jtVar.e(f2, f3);
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
        this.q = i2;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        zze.zza("AdMediaPlayerView completion");
        G(5);
        this.f8718l = 5;
        zzr.zza.post(new ks(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        Map<Integer, String> map = f8713g;
        String str = map.get(Integer.valueOf(i2));
        String str2 = map.get(Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        er.zzi(sb.toString());
        G(-1);
        this.f8718l = -1;
        zzr.zza.post(new ls(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        Map<Integer, String> map = f8713g;
        String str = map.get(Integer.valueOf(i2));
        String str2 = map.get(Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zze.zza(sb.toString());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r6, int r7) throws java.lang.IllegalStateException {
        /*
            r5 = this;
            int r0 = r5.o
            int r0 = android.view.TextureView.getDefaultSize(r0, r6)
            int r1 = r5.p
            int r1 = android.view.TextureView.getDefaultSize(r1, r7)
            int r2 = r5.o
            if (r2 <= 0) goto L7e
            int r2 = r5.p
            if (r2 <= 0) goto L7e
            com.google.android.gms.internal.ads.jt r2 = r5.t
            if (r2 != 0) goto L7e
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L43
            if (r1 != r2) goto L41
            int r0 = r5.o
            int r1 = r0 * r7
            int r2 = r5.p
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7e
        L3c:
            if (r1 <= r3) goto L63
            int r1 = r3 / r0
            goto L54
        L41:
            r0 = 1073741824(0x40000000, float:2.0)
        L43:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L56
            int r0 = r5.p
            int r0 = r0 * r6
            int r2 = r5.o
            int r0 = r0 / r2
            if (r1 != r3) goto L53
            if (r0 <= r7) goto L53
            goto L63
        L53:
            r1 = r0
        L54:
            r0 = r6
            goto L7e
        L56:
            if (r1 != r2) goto L67
            int r1 = r5.o
            int r1 = r1 * r7
            int r2 = r5.p
            int r1 = r1 / r2
            if (r0 != r3) goto L65
            if (r1 <= r6) goto L65
        L63:
            r0 = r6
            goto L3a
        L65:
            r0 = r1
            goto L3a
        L67:
            int r2 = r5.o
            int r4 = r5.p
            if (r1 != r3) goto L73
            if (r4 <= r7) goto L73
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L75
        L73:
            r1 = r2
            r7 = r4
        L75:
            if (r0 != r3) goto L65
            if (r1 <= r6) goto L65
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L54
        L7e:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.jt r6 = r5.t
            if (r6 == 0) goto L88
            r6.b(r0, r1)
        L88:
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 16
            if (r6 != r7) goto La1
            int r6 = r5.r
            if (r6 <= 0) goto L94
            if (r6 != r0) goto L9a
        L94:
            int r6 = r5.s
            if (r6 <= 0) goto L9d
            if (r6 == r1) goto L9d
        L9a:
            r5.C()
        L9d:
            r5.r = r0
            r5.s = r1
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rs.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        zze.zza("AdMediaPlayerView prepared");
        G(2);
        this.f8715i.b();
        zzr.zza.post(new js(this, mediaPlayer));
        this.o = mediaPlayer.getVideoWidth();
        this.p = mediaPlayer.getVideoHeight();
        int i2 = this.v;
        if (i2 != 0) {
            n(i2);
        }
        C();
        int i3 = this.o;
        int i4 = this.p;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i3);
        sb.append(" x ");
        sb.append(i4);
        er.zzh(sb.toString());
        if (this.f8718l == 3) {
            j();
        }
        zzq();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        zze.zza("AdMediaPlayerView surface created");
        B();
        zzr.zza.post(new ms(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f8719m;
        if (mediaPlayer != null && this.v == 0) {
            this.v = mediaPlayer.getCurrentPosition();
        }
        jt jtVar = this.t;
        if (jtVar != null) {
            jtVar.c();
        }
        zzr.zza.post(new os(this));
        D(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) throws IllegalStateException {
        zze.zza("AdMediaPlayerView surface changed");
        int i4 = this.f8718l;
        boolean z = false;
        if (this.o == i2 && this.p == i3) {
            z = true;
        }
        if (this.f8719m != null && i4 == 3 && z) {
            int i5 = this.v;
            if (i5 != 0) {
                n(i5);
            }
            j();
        }
        jt jtVar = this.t;
        if (jtVar != null) {
            jtVar.b(i2, i3);
        }
        zzr.zza.post(new ns(this, i2, i3));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f8715i.d(this);
        this.f9238e.b(surfaceTexture, this.w);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        zze.zza(sb.toString());
        this.o = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.p = videoHeight;
        if (this.o == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i2) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i2);
        zze.zza(sb.toString());
        zzr.zza.post(new Runnable(this, i2) { // from class: com.google.android.gms.internal.ads.is

            /* renamed from: e, reason: collision with root package name */
            private final rs f6583e;

            /* renamed from: f, reason: collision with root package name */
            private final int f6584f;

            {
                this.f6583e = this;
                this.f6584f = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f6583e.H(this.f6584f);
            }
        });
        super.onWindowVisibilityChanged(i2);
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final int p() {
        MediaPlayer mediaPlayer = this.f8719m;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final int q() {
        MediaPlayer mediaPlayer = this.f8719m;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final long r() {
        if (this.x != null) {
            return (t() * this.q) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final long s() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final long t() {
        if (this.x != null) {
            return l() * this.x.intValue();
        }
        return -1L;
    }

    @Override // android.view.View
    public final String toString() {
        String name = rs.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final int u() {
        if (Build.VERSION.SDK_INT < 26 || !E()) {
            return -1;
        }
        return this.f8719m.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.ts, com.google.android.gms.internal.ads.ot
    public final void zzq() {
        F(this.f9239f.c());
    }
}