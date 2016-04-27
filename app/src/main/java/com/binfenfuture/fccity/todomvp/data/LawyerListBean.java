package com.binfenfuture.fccity.todomvp.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fccity on 16/4/26.
 */
public class LawyerListBean {

    /**
     * lawyer_id : 90000002
     * lawyer_name : tyui
     * recommend_star : 4
     * lawyer_province : 广东省
     * lawyer_city : 东莞市
     * head_id : 00000000000000000034
     * lawyer_professional_life : 45
     * lawyer_completed_order_number : 0
     * lawyer_star : 0
     * lawyer_online_state : 0
     * skill_1 : 劳动人事
     * lawyer_credential : 555
     * out_url : http://182.254.231.237/data/files/img/lhead/h_900000021447750303031.jpg
     */

    @SerializedName("lawyer_id")
    private String lawyerId;
    @SerializedName("lawyer_name")
    private String lawyerName;
    @SerializedName("recommend_star")
    private String recommendStar;
    @SerializedName("lawyer_province")
    private String lawyerProvince;
    @SerializedName("lawyer_city")
    private String lawyerCity;
    @SerializedName("head_id")
    private String headId;
    @SerializedName("lawyer_professional_life")
    private String lawyerProfessionalLife;
    @SerializedName("lawyer_completed_order_number")
    private String lawyerCompletedOrderNumber;
    @SerializedName("lawyer_star")
    private String lawyerStar;
    @SerializedName("lawyer_online_state")
    private String lawyerOnlineState;
    @SerializedName("skill_1")
    private String skill1;
    @SerializedName("lawyer_credential")
    private String lawyerCredential;
    @SerializedName("out_url")
    private String outUrl;

    public LawyerListBean() {
    }

    public LawyerListBean(String lawyerId, String lawyerName, String recommendStar, String lawyerProvince, String lawyerCity, String headId, String lawyerProfessionalLife, String lawyerCompletedOrderNumber, String lawyerStar, String lawyerOnlineState, String skill1, String lawyerCredential, String outUrl) {
        this.lawyerId = lawyerId;
        this.lawyerName = lawyerName;
        this.recommendStar = recommendStar;
        this.lawyerProvince = lawyerProvince;
        this.lawyerCity = lawyerCity;
        this.headId = headId;
        this.lawyerProfessionalLife = lawyerProfessionalLife;
        this.lawyerCompletedOrderNumber = lawyerCompletedOrderNumber;
        this.lawyerStar = lawyerStar;
        this.lawyerOnlineState = lawyerOnlineState;
        this.skill1 = skill1;
        this.lawyerCredential = lawyerCredential;
        this.outUrl = outUrl;
    }

    public String getLawyerId() {
        return lawyerId;
    }

    public void setLawyerId(String lawyerId) {
        this.lawyerId = lawyerId;
    }

    public String getLawyerName() {
        return lawyerName;
    }

    public void setLawyerName(String lawyerName) {
        this.lawyerName = lawyerName;
    }

    public String getRecommendStar() {
        return recommendStar;
    }

    public void setRecommendStar(String recommendStar) {
        this.recommendStar = recommendStar;
    }

    public String getLawyerProvince() {
        return lawyerProvince;
    }

    public void setLawyerProvince(String lawyerProvince) {
        this.lawyerProvince = lawyerProvince;
    }

    public String getLawyerCity() {
        return lawyerCity;
    }

    public void setLawyerCity(String lawyerCity) {
        this.lawyerCity = lawyerCity;
    }

    public String getHeadId() {
        return headId;
    }

    public void setHeadId(String headId) {
        this.headId = headId;
    }

    public String getLawyerProfessionalLife() {
        return lawyerProfessionalLife;
    }

    public void setLawyerProfessionalLife(String lawyerProfessionalLife) {
        this.lawyerProfessionalLife = lawyerProfessionalLife;
    }

    public String getLawyerCompletedOrderNumber() {
        return lawyerCompletedOrderNumber;
    }

    public void setLawyerCompletedOrderNumber(String lawyerCompletedOrderNumber) {
        this.lawyerCompletedOrderNumber = lawyerCompletedOrderNumber;
    }

    public String getLawyerStar() {
        return lawyerStar;
    }

    public void setLawyerStar(String lawyerStar) {
        this.lawyerStar = lawyerStar;
    }

    public String getLawyerOnlineState() {
        return lawyerOnlineState;
    }

    public void setLawyerOnlineState(String lawyerOnlineState) {
        this.lawyerOnlineState = lawyerOnlineState;
    }

    public String getSkill1() {
        return skill1;
    }

    public void setSkill1(String skill1) {
        this.skill1 = skill1;
    }

    public String getLawyerCredential() {
        return lawyerCredential;
    }

    public void setLawyerCredential(String lawyerCredential) {
        this.lawyerCredential = lawyerCredential;
    }

    public String getOutUrl() {
        return outUrl;
    }

    public void setOutUrl(String outUrl) {
        this.outUrl = outUrl;
    }
}
