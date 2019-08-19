package com.it10086.university.model;

import javax.persistence.*;

@Table(name = "tb_university_big_data_un_day")
public class UniversityBigDataUnDay {
    @Id
    @Column(name = "statis_day")
    private Long statisDay;

    @Column(name = "area_code")
    private String areaCode;

    @Column(name = "area_name")
    private String areaName;

    @Column(name = "university_code")
    private String universityCode;

    @Column(name = "university_name")
    private String universityName;

    @Column(name = "yd_count")
    private Long ydCount;

    @Column(name = "dx_count")
    private Long dxCount;

    @Column(name = "lt_count")
    private Long ltCount;

    @Column(name = "yd_rate")
    private Double ydRate;

    @Column(name = "dx_rate")
    private Double dxRate;

    @Column(name = "lt_rate")
    private Double ltRate;

    @Column(name = "dou_shipin")
    private String douShipin;

    @Column(name = "dou_duanshipin")
    private String douDuanshipin;

    @Column(name = "dou_shejiao")
    private String douShejiao;

    @Column(name = "dou_xinwen")
    private String douXinwen;

    @Column(name = "dou_yinyue")
    private String douYinyue;

    @Column(name = "dou_youxi")
    private String douYouxi;

    @Column(name = "cnt_shipin")
    private String cntShipin;

    @Column(name = "cnt_duanshipin")
    private String cntDuanshipin;

    @Column(name = "cnt_shejiao")
    private String cntShejiao;

    @Column(name = "cnt_xinwen")
    private String cntXinwen;

    @Column(name = "cnt_yinyue")
    private String cntYinyue;

    @Column(name = "cnt_youxi")
    private String cntYouxi;

    @Column(name = "key_man_count")
    private Long keyManCount;

    @Column(name = "self_key_man_count")
    private Long selfKeyManCount;

    @Column(name = "penetration_rate")
    private Double penetrationRate;

    @Column(name = "add_count")
    private Long addCount;

    @Column(name = "renewal_count")
    private Long renewalCount;

    @Column(name = "open_count")
    private Long openCount;

    @Column(name = "exceed_3days_count")
    private Long exceed3daysCount;

    @Column(name = "long_period_count")
    private Long longPeriodCount;

    /**
     * @return statis_day
     */
    public Long getStatisDay() {
        return statisDay;
    }

    /**
     * @param statisDay
     */
    public void setStatisDay(Long statisDay) {
        this.statisDay = statisDay;
    }

    /**
     * @return area_code
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * @param areaCode
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * @return area_name
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * @param areaName
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    /**
     * @return university_code
     */
    public String getUniversityCode() {
        return universityCode;
    }

    /**
     * @param universityCode
     */
    public void setUniversityCode(String universityCode) {
        this.universityCode = universityCode;
    }

    /**
     * @return university_name
     */
    public String getUniversityName() {
        return universityName;
    }

    /**
     * @param universityName
     */
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    /**
     * @return yd_count
     */
    public Long getYdCount() {
        return ydCount;
    }

    /**
     * @param ydCount
     */
    public void setYdCount(Long ydCount) {
        this.ydCount = ydCount;
    }

    /**
     * @return dx_count
     */
    public Long getDxCount() {
        return dxCount;
    }

    /**
     * @param dxCount
     */
    public void setDxCount(Long dxCount) {
        this.dxCount = dxCount;
    }

    /**
     * @return lt_count
     */
    public Long getLtCount() {
        return ltCount;
    }

    /**
     * @param ltCount
     */
    public void setLtCount(Long ltCount) {
        this.ltCount = ltCount;
    }

    /**
     * @return yd_rate
     */
    public Double getYdRate() {
        return ydRate;
    }

    /**
     * @param ydRate
     */
    public void setYdRate(Double ydRate) {
        this.ydRate = ydRate;
    }

    /**
     * @return dx_rate
     */
    public Double getDxRate() {
        return dxRate;
    }

    /**
     * @param dxRate
     */
    public void setDxRate(Double dxRate) {
        this.dxRate = dxRate;
    }

    /**
     * @return lt_rate
     */
    public Double getLtRate() {
        return ltRate;
    }

    /**
     * @param ltRate
     */
    public void setLtRate(Double ltRate) {
        this.ltRate = ltRate;
    }

    /**
     * @return dou_shipin
     */
    public String getDouShipin() {
        return douShipin;
    }

    /**
     * @param douShipin
     */
    public void setDouShipin(String douShipin) {
        this.douShipin = douShipin;
    }

    /**
     * @return dou_duanshipin
     */
    public String getDouDuanshipin() {
        return douDuanshipin;
    }

    /**
     * @param douDuanshipin
     */
    public void setDouDuanshipin(String douDuanshipin) {
        this.douDuanshipin = douDuanshipin;
    }

    /**
     * @return dou_shejiao
     */
    public String getDouShejiao() {
        return douShejiao;
    }

    /**
     * @param douShejiao
     */
    public void setDouShejiao(String douShejiao) {
        this.douShejiao = douShejiao;
    }

    /**
     * @return dou_xinwen
     */
    public String getDouXinwen() {
        return douXinwen;
    }

    /**
     * @param douXinwen
     */
    public void setDouXinwen(String douXinwen) {
        this.douXinwen = douXinwen;
    }

    /**
     * @return dou_yinyue
     */
    public String getDouYinyue() {
        return douYinyue;
    }

    /**
     * @param douYinyue
     */
    public void setDouYinyue(String douYinyue) {
        this.douYinyue = douYinyue;
    }

    /**
     * @return dou_youxi
     */
    public String getDouYouxi() {
        return douYouxi;
    }

    /**
     * @param douYouxi
     */
    public void setDouYouxi(String douYouxi) {
        this.douYouxi = douYouxi;
    }

    /**
     * @return cnt_shipin
     */
    public String getCntShipin() {
        return cntShipin;
    }

    /**
     * @param cntShipin
     */
    public void setCntShipin(String cntShipin) {
        this.cntShipin = cntShipin;
    }

    /**
     * @return cnt_duanshipin
     */
    public String getCntDuanshipin() {
        return cntDuanshipin;
    }

    /**
     * @param cntDuanshipin
     */
    public void setCntDuanshipin(String cntDuanshipin) {
        this.cntDuanshipin = cntDuanshipin;
    }

    /**
     * @return cnt_shejiao
     */
    public String getCntShejiao() {
        return cntShejiao;
    }

    /**
     * @param cntShejiao
     */
    public void setCntShejiao(String cntShejiao) {
        this.cntShejiao = cntShejiao;
    }

    /**
     * @return cnt_xinwen
     */
    public String getCntXinwen() {
        return cntXinwen;
    }

    /**
     * @param cntXinwen
     */
    public void setCntXinwen(String cntXinwen) {
        this.cntXinwen = cntXinwen;
    }

    /**
     * @return cnt_yinyue
     */
    public String getCntYinyue() {
        return cntYinyue;
    }

    /**
     * @param cntYinyue
     */
    public void setCntYinyue(String cntYinyue) {
        this.cntYinyue = cntYinyue;
    }

    /**
     * @return cnt_youxi
     */
    public String getCntYouxi() {
        return cntYouxi;
    }

    /**
     * @param cntYouxi
     */
    public void setCntYouxi(String cntYouxi) {
        this.cntYouxi = cntYouxi;
    }

    /**
     * @return key_man_count
     */
    public Long getKeyManCount() {
        return keyManCount;
    }

    /**
     * @param keyManCount
     */
    public void setKeyManCount(Long keyManCount) {
        this.keyManCount = keyManCount;
    }

    /**
     * @return self_key_man_count
     */
    public Long getSelfKeyManCount() {
        return selfKeyManCount;
    }

    /**
     * @param selfKeyManCount
     */
    public void setSelfKeyManCount(Long selfKeyManCount) {
        this.selfKeyManCount = selfKeyManCount;
    }

    /**
     * @return penetration_rate
     */
    public Double getPenetrationRate() {
        return penetrationRate;
    }

    /**
     * @param penetrationRate
     */
    public void setPenetrationRate(Double penetrationRate) {
        this.penetrationRate = penetrationRate;
    }

    /**
     * @return add_count
     */
    public Long getAddCount() {
        return addCount;
    }

    /**
     * @param addCount
     */
    public void setAddCount(Long addCount) {
        this.addCount = addCount;
    }

    /**
     * @return renewal_count
     */
    public Long getRenewalCount() {
        return renewalCount;
    }

    /**
     * @param renewalCount
     */
    public void setRenewalCount(Long renewalCount) {
        this.renewalCount = renewalCount;
    }

    /**
     * @return open_count
     */
    public Long getOpenCount() {
        return openCount;
    }

    /**
     * @param openCount
     */
    public void setOpenCount(Long openCount) {
        this.openCount = openCount;
    }

    /**
     * @return exceed_3days_count
     */
    public Long getExceed3daysCount() {
        return exceed3daysCount;
    }

    /**
     * @param exceed3daysCount
     */
    public void setExceed3daysCount(Long exceed3daysCount) {
        this.exceed3daysCount = exceed3daysCount;
    }

    /**
     * @return long_period_count
     */
    public Long getLongPeriodCount() {
        return longPeriodCount;
    }

    /**
     * @param longPeriodCount
     */
    public void setLongPeriodCount(Long longPeriodCount) {
        this.longPeriodCount = longPeriodCount;
    }
}