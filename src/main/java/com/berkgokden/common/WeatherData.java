package com.berkgokden.common;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * WeatherDate is the Pojo class both used as Elasticsearch db object
 * and webservice json object
 */
@Document(indexName = "weather", type = "forecast", shards = 1, replicas = 0, refreshInterval = "-1")
public class WeatherData {
    @Id
    private String id;
    private String project;
    private String model;
    private String location;
    private String date;
    private String time;
    private String leadtime;
    private Long forecastdatetime;
    private Integer ttt;
    private Integer tx;
    private Integer tn;
    private Integer td;
    private Integer pppp;
    private Integer dd;
    private Integer ff;
    private Integer fx1;
    private Integer fx3;
    private Integer fx6;
    private Integer mn;
    private Integer sn;
    private Integer n;
    private Integer mneff;
    private Integer sneff;
    private Integer neff;
    private Integer mnlm;
    private Integer nlm;
    private Integer nh;
    private Integer nm;
    private Integer mnl;
    private Integer nl;
    private Integer n230;
    private Integer rh;
    private Integer vv;
    private Integer wwm;
    private Integer wwm3;
    private Integer wwm6;
    private Integer wwp;
    private Integer wwp3;
    private Integer wwp6;
    private Integer wwz;
    private Integer wwd;
    private Integer wwc;
    private Integer wwt;
    private Integer wwl;
    private Integer wws;
    private Integer wwf;
    private Integer wwz3;
    private Integer wwd3;
    private Integer wwc3;
    private Integer wwt3;
    private Integer wwl3;
    private Integer wwf3;
    private Integer wws3;
    private Integer wwz6;
    private Integer wwd6;
    private Integer wwc6;
    private Integer wwt6;
    private Integer wwl6;
    private Integer wwf6;
    private Integer wws6;
    private Integer wwzh;
    private Integer wwdh;
    private Integer wwch;
    private Integer wwth;
    private Integer wwlh;
    private Integer wwfh;
    private Integer wwsh;
    private Integer wwmh;
    private Integer wwph;
    private Integer drr1;
    private Integer rr1;
    private Integer rr6;
    private Integer rrd;
    private Integer sund1;
    private Integer jsun1;
    private Integer rsund;
    private Integer rn2sd;
    private Integer rad1h;
    private Integer rrad1;
    private Integer pvv10;
    private Integer rrh;
    private Integer d_t2m;
    private Integer d_xt;
    private Integer d_nt;
    private Integer d_td;
    private Integer dpppp;
    private Integer ddd10;
    private Integer dff10;
    private Integer d_n;
    private Integer d_ct3;
    private Integer d_ct6;
    private Integer ch;
    private Integer cm;
    private Integer cl;
    private Integer d_rh;
    private Integer sr3t;
    private Integer sr6t;
    private Integer tg;
    private Integer px125;
    private Integer px140;
    private Integer px155;

    public WeatherData() {}
    public WeatherData(String id) {
        this.id = id;
    }
    public WeatherData(String id, String location, Long forecastdatetime) {
        this.id = id;
        this.location = location;
        this.forecastdatetime = forecastdatetime;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLeadtime() {
        return leadtime;
    }

    public void setLeadtime(String leadtime) {
        this.leadtime = leadtime;
    }

    public Integer getTtt() {
        return ttt;
    }

    public void setTtt(Integer ttt) {
        this.ttt = ttt;
    }

    public Integer getTx() {
        return tx;
    }

    public void setTx(Integer tx) {
        this.tx = tx;
    }

    public Integer getTn() {
        return tn;
    }

    public void setTn(Integer tn) {
        this.tn = tn;
    }

    public Integer getTd() {
        return td;
    }

    public void setTd(Integer td) {
        this.td = td;
    }

    public Integer getPppp() {
        return pppp;
    }

    public void setPppp(Integer pppp) {
        this.pppp = pppp;
    }

    public Integer getDd() {
        return dd;
    }

    public void setDd(Integer dd) {
        this.dd = dd;
    }

    public Integer getFf() {
        return ff;
    }

    public void setFf(Integer ff) {
        this.ff = ff;
    }

    public Integer getFx1() {
        return fx1;
    }

    public void setFx1(Integer fx1) {
        this.fx1 = fx1;
    }

    public Integer getFx3() {
        return fx3;
    }

    public void setFx3(Integer fx3) {
        this.fx3 = fx3;
    }

    public Integer getFx6() {
        return fx6;
    }

    public void setFx6(Integer fx6) {
        this.fx6 = fx6;
    }

    public Integer getMn() {
        return mn;
    }

    public void setMn(Integer mn) {
        this.mn = mn;
    }

    public Integer getSn() {
        return sn;
    }

    public void setSn(Integer sn) {
        this.sn = sn;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public Integer getMneff() {
        return mneff;
    }

    public void setMneff(Integer mneff) {
        this.mneff = mneff;
    }

    public Integer getSneff() {
        return sneff;
    }

    public void setSneff(Integer sneff) {
        this.sneff = sneff;
    }

    public Integer getNeff() {
        return neff;
    }

    public void setNeff(Integer neff) {
        this.neff = neff;
    }

    public Integer getMnlm() {
        return mnlm;
    }

    public void setMnlm(Integer mnlm) {
        this.mnlm = mnlm;
    }

    public Integer getNlm() {
        return nlm;
    }

    public void setNlm(Integer nlm) {
        this.nlm = nlm;
    }

    public Integer getNh() {
        return nh;
    }

    public void setNh(Integer nh) {
        this.nh = nh;
    }

    public Integer getNm() {
        return nm;
    }

    public void setNm(Integer nm) {
        this.nm = nm;
    }

    public Integer getMnl() {
        return mnl;
    }

    public void setMnl(Integer mnl) {
        this.mnl = mnl;
    }

    public Integer getNl() {
        return nl;
    }

    public void setNl(Integer nl) {
        this.nl = nl;
    }

    public Integer getN230() {
        return n230;
    }

    public void setN230(Integer n230) {
        this.n230 = n230;
    }

    public Integer getRh() {
        return rh;
    }

    public void setRh(Integer rh) {
        this.rh = rh;
    }

    public Integer getVv() {
        return vv;
    }

    public void setVv(Integer vv) {
        this.vv = vv;
    }

    public Integer getWwm() {
        return wwm;
    }

    public void setWwm(Integer wwm) {
        this.wwm = wwm;
    }

    public Integer getWwm3() {
        return wwm3;
    }

    public void setWwm3(Integer wwm3) {
        this.wwm3 = wwm3;
    }

    public Integer getWwm6() {
        return wwm6;
    }

    public void setWwm6(Integer wwm6) {
        this.wwm6 = wwm6;
    }

    public Integer getWwp() {
        return wwp;
    }

    public void setWwp(Integer wwp) {
        this.wwp = wwp;
    }

    public Integer getWwp3() {
        return wwp3;
    }

    public void setWwp3(Integer wwp3) {
        this.wwp3 = wwp3;
    }

    public Integer getWwp6() {
        return wwp6;
    }

    public void setWwp6(Integer wwp6) {
        this.wwp6 = wwp6;
    }

    public Integer getWwz() {
        return wwz;
    }

    public void setWwz(Integer wwz) {
        this.wwz = wwz;
    }

    public Integer getWwd() {
        return wwd;
    }

    public void setWwd(Integer wwd) {
        this.wwd = wwd;
    }

    public Integer getWwc() {
        return wwc;
    }

    public void setWwc(Integer wwc) {
        this.wwc = wwc;
    }

    public Integer getWwt() {
        return wwt;
    }

    public void setWwt(Integer wwt) {
        this.wwt = wwt;
    }

    public Integer getWwl() {
        return wwl;
    }

    public void setWwl(Integer wwl) {
        this.wwl = wwl;
    }

    public Integer getWws() {
        return wws;
    }

    public void setWws(Integer wws) {
        this.wws = wws;
    }

    public Integer getWwf() {
        return wwf;
    }

    public void setWwf(Integer wwf) {
        this.wwf = wwf;
    }

    public Integer getWwz3() {
        return wwz3;
    }

    public void setWwz3(Integer wwz3) {
        this.wwz3 = wwz3;
    }

    public Integer getWwd3() {
        return wwd3;
    }

    public void setWwd3(Integer wwd3) {
        this.wwd3 = wwd3;
    }

    public Integer getWwc3() {
        return wwc3;
    }

    public void setWwc3(Integer wwc3) {
        this.wwc3 = wwc3;
    }

    public Integer getWwt3() {
        return wwt3;
    }

    public void setWwt3(Integer wwt3) {
        this.wwt3 = wwt3;
    }

    public Integer getWwl3() {
        return wwl3;
    }

    public void setWwl3(Integer wwl3) {
        this.wwl3 = wwl3;
    }

    public Integer getWwf3() {
        return wwf3;
    }

    public void setWwf3(Integer wwf3) {
        this.wwf3 = wwf3;
    }

    public Integer getWws3() {
        return wws3;
    }

    public void setWws3(Integer wws3) {
        this.wws3 = wws3;
    }

    public Integer getWwz6() {
        return wwz6;
    }

    public void setWwz6(Integer wwz6) {
        this.wwz6 = wwz6;
    }

    public Integer getWwd6() {
        return wwd6;
    }

    public void setWwd6(Integer wwd6) {
        this.wwd6 = wwd6;
    }

    public Integer getWwc6() {
        return wwc6;
    }

    public void setWwc6(Integer wwc6) {
        this.wwc6 = wwc6;
    }

    public Integer getWwt6() {
        return wwt6;
    }

    public void setWwt6(Integer wwt6) {
        this.wwt6 = wwt6;
    }

    public Integer getWwl6() {
        return wwl6;
    }

    public void setWwl6(Integer wwl6) {
        this.wwl6 = wwl6;
    }

    public Integer getWwf6() {
        return wwf6;
    }

    public void setWwf6(Integer wwf6) {
        this.wwf6 = wwf6;
    }

    public Integer getWws6() {
        return wws6;
    }

    public void setWws6(Integer wws6) {
        this.wws6 = wws6;
    }

    public Integer getWwzh() {
        return wwzh;
    }

    public void setWwzh(Integer wwzh) {
        this.wwzh = wwzh;
    }

    public Integer getWwdh() {
        return wwdh;
    }

    public void setWwdh(Integer wwdh) {
        this.wwdh = wwdh;
    }

    public Integer getWwch() {
        return wwch;
    }

    public void setWwch(Integer wwch) {
        this.wwch = wwch;
    }

    public Integer getWwth() {
        return wwth;
    }

    public void setWwth(Integer wwth) {
        this.wwth = wwth;
    }

    public Integer getWwlh() {
        return wwlh;
    }

    public void setWwlh(Integer wwlh) {
        this.wwlh = wwlh;
    }

    public Integer getWwfh() {
        return wwfh;
    }

    public void setWwfh(Integer wwfh) {
        this.wwfh = wwfh;
    }

    public Integer getWwsh() {
        return wwsh;
    }

    public void setWwsh(Integer wwsh) {
        this.wwsh = wwsh;
    }

    public Integer getWwmh() {
        return wwmh;
    }

    public void setWwmh(Integer wwmh) {
        this.wwmh = wwmh;
    }

    public Integer getWwph() {
        return wwph;
    }

    public void setWwph(Integer wwph) {
        this.wwph = wwph;
    }

    public Integer getDrr1() {
        return drr1;
    }

    public void setDrr1(Integer drr1) {
        this.drr1 = drr1;
    }

    public Integer getRr1() {
        return rr1;
    }

    public void setRr1(Integer rr1) {
        this.rr1 = rr1;
    }

    public Integer getRr6() {
        return rr6;
    }

    public void setRr6(Integer rr6) {
        this.rr6 = rr6;
    }

    public Integer getRrd() {
        return rrd;
    }

    public void setRrd(Integer rrd) {
        this.rrd = rrd;
    }

    public Integer getSund1() {
        return sund1;
    }

    public void setSund1(Integer sund1) {
        this.sund1 = sund1;
    }

    public Integer getJsun1() {
        return jsun1;
    }

    public void setJsun1(Integer jsun1) {
        this.jsun1 = jsun1;
    }

    public Integer getRsund() {
        return rsund;
    }

    public void setRsund(Integer rsund) {
        this.rsund = rsund;
    }

    public Integer getRn2sd() {
        return rn2sd;
    }

    public void setRn2sd(Integer rn2sd) {
        this.rn2sd = rn2sd;
    }

    public Integer getRad1h() {
        return rad1h;
    }

    public void setRad1h(Integer rad1h) {
        this.rad1h = rad1h;
    }

    public Integer getRrad1() {
        return rrad1;
    }

    public void setRrad1(Integer rrad1) {
        this.rrad1 = rrad1;
    }

    public Integer getPvv10() {
        return pvv10;
    }

    public void setPvv10(Integer pvv10) {
        this.pvv10 = pvv10;
    }

    public Integer getRrh() {
        return rrh;
    }

    public void setRrh(Integer rrh) {
        this.rrh = rrh;
    }

    public Integer getD_t2m() {
        return d_t2m;
    }

    public void setD_t2m(Integer d_t2m) {
        this.d_t2m = d_t2m;
    }

    public Integer getD_xt() {
        return d_xt;
    }

    public void setD_xt(Integer d_xt) {
        this.d_xt = d_xt;
    }

    public Integer getD_nt() {
        return d_nt;
    }

    public void setD_nt(Integer d_nt) {
        this.d_nt = d_nt;
    }

    public Integer getD_td() {
        return d_td;
    }

    public void setD_td(Integer d_td) {
        this.d_td = d_td;
    }

    public Integer getDpppp() {
        return dpppp;
    }

    public void setDpppp(Integer dpppp) {
        this.dpppp = dpppp;
    }

    public Integer getDdd10() {
        return ddd10;
    }

    public void setDdd10(Integer ddd10) {
        this.ddd10 = ddd10;
    }

    public Integer getDff10() {
        return dff10;
    }

    public void setDff10(Integer dff10) {
        this.dff10 = dff10;
    }

    public Integer getD_n() {
        return d_n;
    }

    public void setD_n(Integer d_n) {
        this.d_n = d_n;
    }

    public Integer getD_ct3() {
        return d_ct3;
    }

    public void setD_ct3(Integer d_ct3) {
        this.d_ct3 = d_ct3;
    }

    public Integer getD_ct6() {
        return d_ct6;
    }

    public void setD_ct6(Integer d_ct6) {
        this.d_ct6 = d_ct6;
    }

    public Integer getCh() {
        return ch;
    }

    public void setCh(Integer ch) {
        this.ch = ch;
    }

    public Integer getCm() {
        return cm;
    }

    public void setCm(Integer cm) {
        this.cm = cm;
    }

    public Integer getCl() {
        return cl;
    }

    public void setCl(Integer cl) {
        this.cl = cl;
    }

    public Integer getD_rh() {
        return d_rh;
    }

    public void setD_rh(Integer d_rh) {
        this.d_rh = d_rh;
    }

    public Integer getSr3t() {
        return sr3t;
    }

    public void setSr3t(Integer sr3t) {
        this.sr3t = sr3t;
    }

    public Integer getSr6t() {
        return sr6t;
    }

    public void setSr6t(Integer sr6t) {
        this.sr6t = sr6t;
    }

    public Integer getTg() {
        return tg;
    }

    public void setTg(Integer tg) {
        this.tg = tg;
    }

    public Integer getPx125() {
        return px125;
    }

    public void setPx125(Integer px125) {
        this.px125 = px125;
    }

    public Integer getPx140() {
        return px140;
    }

    public void setPx140(Integer px140) {
        this.px140 = px140;
    }

    public Integer getPx155() {
        return px155;
    }

    public void setPx155(Integer px155) {
        this.px155 = px155;
    }

    public Long getForecastdatetime() {
        return forecastdatetime;
    }

    public void setForecastdatetime(Long forecastdatetime) {
        this.forecastdatetime = forecastdatetime;
    }
}
