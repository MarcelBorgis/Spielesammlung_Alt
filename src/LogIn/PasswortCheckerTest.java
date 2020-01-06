package LogIn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswortCheckerTest {

    PasswortChecker PasswortChecker = new PasswortChecker();

    private String passwort = "^&b.`N[cv{nEx.qX?L?wp*w;GVDHfP-dG;pA;+<hhUhabd$h}kn%MQF6fv[\"LFtNC<N=-hB%=p9a)(94{VCFydwwa" +
            "@=8ucvPa!p,E[.!c72cLYkHn(j4waa$`(#_E}g=(WLjZZvPy]Du[_FW=Kc~FZwYY[5N<eP[P}_7Fm'[;fA?c?dwadwwsL" +
            "R@G_-`Y)q@B?:\"L^kBL[Y(/3c*%:4Ju~CLnw*-LLj@ZM,,]:Cm9;n5Q}2<~k.b%pGxK`8.=_PH}(PM-hWQ;nB!amFwwB" +
            "/C8smASNS!!JZF]SBP^)d%q$J-_@`V8>;dD~pWa*{L58tkEn${zm<_wDw}knaHG3FY%Mv(Z_`EESt'tZ6B.k)v#wdwdwy" +
            "xN2+9*>#F?k.MA!GNRU*@6Pgk_-\"9D[j5LWVsRdC,E){<-%)=`L\"qbtuQR--A$UM?[:LT[d<8Dwy*;)fbp<:-Pj_w*n" +
            "mT2Z~}GE{;Cb@?<d}c-V>Su*mk@h{&]za-Kpg!d\"w:muQ_=}a&jdzQ(2DeyV$b$:2MQVDG5[!p_Nk;<x,6__8%RwdwSj" +
            "DX~h3((pW<q}qufF)~~K=S}6BeeexJz4EEK3`kFq!7F/&JZs~N+Q!hrE/!/.qu/qn[3TgKftB,@BNYf46%byWSNTDdwRL" +
            "&z{[jNYYKzV$kN'@2sGNm,9BHmFDr%&_Dmy!/kSu{jAd6t)dv&#`7JAf~XrW}5)H-F`XY7%$Y\"[M])Y;jJ^dzdhKdKt5" +
            "$V,\",g;C}}g3t*9k?=r!#d=jx}KT.5ChwS]e/z>r`?Nw~Mcu~2xDB/J$hx=acyP+YC2m44zE^n}NVuuAqQX<%\";dwqn" +
            "RH\"`,_bh}B]@qs2>`}Pu}kn3&/d65WZc=EQW,S$u+@!,Z]#&5,MLv)}t=KqYc]f$wB5rfxEBYGZmF*jQTGRkQehBgAw*" +
            "T?64stYMR&Xz?-$,E>8mG})e&L='KE:uwJeq#ru?D*ZKz_d3bQ,bcz]Em&(p+Qg@WPF7jeVu'pPJKTVzKe4)-)d/jf<wd" +
            "`:;bcPXkVzmZ'd~J3+qdH:t#8WQ83Qp@aTpWVC*HQ)'<jbv\"aDWSquXrHV)*nXn@JU'2p}V;Cf<(:&HRNc.R7]wdwdd3" +
            "_@.;+EXzB~4/^Cs[!d_e9U<v-{-sGh-ht{%hRY7-[j~t`^t?8fS!/k=,M:ztmd)9~yMzzV`-pvwk['n!tRgAn^/9mPdw&" +
            "'knWF<Wf(N'Eg<\"ZFEg-$FagxwswzE9LkeEn5,%'\"DG7nU+jyRkb==YTFW>Kq_)'5,8uMhD}v}}dH,q$Y6?,td\"wsc" +
            "'u-?!?u/&S:23z%F>Hr'xk)huRh\"u5$jD~DR2EM,mVbV!Gy9F9@5%pe[!kYsstnp!Lr@XN#u\"u\"E%\"r:4jH$5Sdd/" +
            ".FZz,A]MF~:e8r=-gDDY&.d{-u;U57EW@gnf3PD!V5Q$}dP;WpEa]Q?jF,?*Gfs4?A-&4Sq`Hw[x++L-4K\",,pQ$wawV" +
            "[UcPG_/h73M@6)W3Y[*Bfc3??e-.n7Jw@dT<Z}h9=sq&X/$Q6^Xffd^m$GtQCgreGa}.*79S)h9PRnq<ySB[$hd+Huw2*" +
            "C4_WVj?mG>r(~$>Ms*&6YG/Qg{%97q4E-6;ZKW\"Q$sR6n%W>}-we{TGV>`U/BN~[\bd!e~?nX`:d;ufH<PM/s,Kwdwm:" +
            ">'-enj<c<<$xfn`{ta6<rk`/[R,z2j5.rH\"qTpz`(Tbs&kGJT\"#T2,t[7TME]C7<rfdyQqprfF/6KfDRS,mswds=RwY" +
            "P~^;kv<u/}cy8Yb#`>6E^dEk77KV:dGJ<&t/8%XE\"3vX5K68pKg#AZg<C=C@ZPK[kWt`-&CjPbGaXvm->S3mw.3&x%sV" +
            "&ny3rT(`U)?pWLN^7B5'Tcfb\"?y!aq;Dk2X)6KHp4y\"jF_f[[Y[sRPwr[#W4Pqnm#M8gLn*4Hs$&<gypasd,/G}(gCY" +
            "m}gejth/JvPEd}k6e$,T;8'PMbXK)raGZF&Ja9gMMEB#m+KRYGvh?)BU[*;Hbkt&mqPE=KL,:TB}rGGD;]+s(u^p2#>)&";


    @Test

    public void laengenTest() {
        assertTrue(PasswortChecker.laenge(passwort));
        assertTrue(PasswortChecker.laenge("12345678"));
        assertFalse(PasswortChecker.laenge("1234567"));
        assertFalse(PasswortChecker.laenge(""));
    }

    @Test
    public void grossbuchstabenTest() {
        assertTrue(PasswortChecker.großbuchstaben(passwort));
        assertTrue(PasswortChecker.großbuchstaben("MuhammeD"));
        assertFalse(PasswortChecker.großbuchstaben("Vincent-4132"));
        assertFalse(PasswortChecker.großbuchstaben("-+"));
    }

    @Test
    public void kleinbuchstabenTest() {
        assertTrue(PasswortChecker.kleinbuchstaben(passwort));
        assertTrue(PasswortChecker.kleinbuchstaben("Schmidt"));
        assertFalse(PasswortChecker.kleinbuchstaben("BORGIs.-1646"));
        assertFalse(PasswortChecker.kleinbuchstaben("*/"));
    }

    @Test
    public void sonderzeichenTest() {
        assertTrue(PasswortChecker.sonderzeichen(passwort));
        assertTrue(PasswortChecker.sonderzeichen("Yannick-123"));
        assertFalse(PasswortChecker.sonderzeichen("ufh16544"));
        assertFalse(PasswortChecker.sonderzeichen("7987"));
    }

}