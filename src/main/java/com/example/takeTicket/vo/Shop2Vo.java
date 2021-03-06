package com.example.takeTicket.vo;

import java.util.Date;
import java.util.List;

import com.example.takeTicket.domain.SpecialDishes;

public class Shop2Vo {
	private String shopId;

    private String shopName;

    private String introImages;

    private String shopAddress;

    private String contactWay;

    private String features;

    private String shopIntro;

    private String openTime;

    private String heightTime;

    private String indoorDevice;

    private String signDish;

    private String shopActivity;

    private Long scanTimes;

    private String adminUserId;

    private String simpleIntro;

    private String articleUrl;

    private String classId;

    private String isHot;

    private Date createTime;

    private Date updataTime;

    private String warmPrompt;

    private String isDelete;

    private String flowTitle;

    private String flowContent;

    private String longitude;

    private String latitude;

    private String topImagePath;

    private String shareTitle;

    private String shareImagePath;
    
    private String shopArea;

    private String averageConsume;
    
    
    public String getShopArea() {
		return shopArea;
	}

	public void setShopArea(String shopArea) {
		this.shopArea = shopArea;
	}

	public String getAverageConsume() {
		return averageConsume;
	}

	public void setAverageConsume(String averageConsume) {
		this.averageConsume = averageConsume;
	}

	private List<SpecialDishes> specialDishes;

    public List<SpecialDishes> getSpecialDishes() {
		return specialDishes;
	}

	public void setSpecialDishes(List<SpecialDishes> specialDishes) {
		this.specialDishes = specialDishes;
	}

	public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getIntroImages() {
        return introImages;
    }

    public void setIntroImages(String introImages) {
        this.introImages = introImages == null ? null : introImages.trim();
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress == null ? null : shopAddress.trim();
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay(String contactWay) {
        this.contactWay = contactWay == null ? null : contactWay.trim();
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features == null ? null : features.trim();
    }

    public String getShopIntro() {
        return shopIntro;
    }

    public void setShopIntro(String shopIntro) {
        this.shopIntro = shopIntro == null ? null : shopIntro.trim();
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime == null ? null : openTime.trim();
    }

    public String getHeightTime() {
        return heightTime;
    }

    public void setHeightTime(String heightTime) {
        this.heightTime = heightTime == null ? null : heightTime.trim();
    }

    public String getIndoorDevice() {
        return indoorDevice;
    }

    public void setIndoorDevice(String indoorDevice) {
        this.indoorDevice = indoorDevice == null ? null : indoorDevice.trim();
    }

    public String getSignDish() {
        return signDish;
    }

    public void setSignDish(String signDish) {
        this.signDish = signDish == null ? null : signDish.trim();
    }

    public String getShopActivity() {
        return shopActivity;
    }

    public void setShopActivity(String shopActivity) {
        this.shopActivity = shopActivity == null ? null : shopActivity.trim();
    }

    public Long getScanTimes() {
        return scanTimes;
    }

    public void setScanTimes(Long scanTimes) {
        this.scanTimes = scanTimes;
    }

    public String getAdminUserId() {
        return adminUserId;
    }

    public void setAdminUserId(String adminUserId) {
        this.adminUserId = adminUserId == null ? null : adminUserId.trim();
    }

    public String getSimpleIntro() {
        return simpleIntro;
    }

    public void setSimpleIntro(String simpleIntro) {
        this.simpleIntro = simpleIntro == null ? null : simpleIntro.trim();
    }

    

    public String getArticleUrl() {
		return articleUrl;
	}

	public void setArticleUrl(String articleUrl) {
		this.articleUrl = articleUrl;
	}

	public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }

    public String getIsHot() {
        return isHot;
    }

    public void setIsHot(String isHot) {
        this.isHot = isHot == null ? null : isHot.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdataTime() {
        return updataTime;
    }

    public void setUpdataTime(Date updataTime) {
        this.updataTime = updataTime;
    }

    public String getWarmPrompt() {
        return warmPrompt;
    }

    public void setWarmPrompt(String warmPrompt) {
        this.warmPrompt = warmPrompt == null ? null : warmPrompt.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    public String getFlowTitle() {
        return flowTitle;
    }

    public void setFlowTitle(String flowTitle) {
        this.flowTitle = flowTitle == null ? null : flowTitle.trim();
    }

    public String getFlowContent() {
        return flowContent;
    }

    public void setFlowContent(String flowContent) {
        this.flowContent = flowContent == null ? null : flowContent.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

	public String getTopImagePath() {
		return topImagePath;
	}

	public void setTopImagePath(String topImagePath) {
		this.topImagePath = topImagePath;
	}

	public String getShareTitle() {
		return shareTitle;
	}

	public void setShareTitle(String shareTitle) {
		this.shareTitle = shareTitle;
	}

	public String getShareImagePath() {
		return shareImagePath;
	}

	public void setShareImagePath(String shareImagePath) {
		this.shareImagePath = shareImagePath;
	}
    
    
	 

}
