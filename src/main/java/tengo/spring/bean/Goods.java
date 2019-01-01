package tengo.spring.bean;

import java.math.BigDecimal;
import java.util.Date;

/*商品实体*/
public class Goods {
	private int id;
	private String name;
	private String nameEn;
	private BigDecimal price;
	// 图片地址
	private String imgUrl;
	// 透明图片的地址
	private String imgUrlCrystal;
	private String content;
	private String mContent;
	/* 图集集合 */
	private String albums;

	private int stock;
	private int sort;
	/*
	 * 销售状态 ：1.显示，可购买 2.不显示，可购买 3.显示，不可购买 4.不显示，不可购买，404错误
	 */
	private int saleStatus;
	private Date saleBeginDate;
	private Date saleEndDate;
	// 用户每单限购数
	private int limitQPO;
	// 限购开始时间
	private Date limitQpoBeginTime;
	// 限购结束时间
	private Date limitQpoEndTime;

	// 用户历史总限购数
	private int limitQPU;
	// 限购开始时间
	private Date limitQPUBeginTime;
	// 限购结束时间
	private Date limitQPUEndTime;

	// 商品关键词
	private String Keywords;
	// 商品描述
	private String Description;

	private Date addTime;
	private Date updateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getImgUrlCrystal() {
		return imgUrlCrystal;
	}

	public void setImgUrlCrystal(String imgUrlCrystal) {
		this.imgUrlCrystal = imgUrlCrystal;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getmContent() {
		return mContent;
	}

	public void setmContent(String mContent) {
		this.mContent = mContent;
	}

	public String getAlbums() {
		return albums;
	}

	public void setAlbums(String albums) {
		this.albums = albums;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public int getSaleStatus() {
		return saleStatus;
	}

	public void setSaleStatus(int saleStatus) {
		this.saleStatus = saleStatus;
	}

	public Date getSaleBeginDate() {
		return saleBeginDate;
	}

	public void setSaleBeginDate(Date saleBeginDate) {
		this.saleBeginDate = saleBeginDate;
	}

	public Date getSaleEndDate() {
		return saleEndDate;
	}

	public void setSaleEndDate(Date saleEndDate) {
		this.saleEndDate = saleEndDate;
	}

	public int getLimitQPO() {
		return limitQPO;
	}

	public void setLimitQPO(int limitQPO) {
		this.limitQPO = limitQPO;
	}

	public Date getLimitQpoBeginTime() {
		return limitQpoBeginTime;
	}

	public void setLimitQpoBeginTime(Date limitQpoBeginTime) {
		this.limitQpoBeginTime = limitQpoBeginTime;
	}

	public Date getLimitQpoEndTime() {
		return limitQpoEndTime;
	}

	public void setLimitQpoEndTime(Date limitQpoEndTime) {
		this.limitQpoEndTime = limitQpoEndTime;
	}

	public int getLimitQPU() {
		return limitQPU;
	}

	public void setLimitQPU(int limitQPU) {
		this.limitQPU = limitQPU;
	}

	public Date getLimitQPUBeginTime() {
		return limitQPUBeginTime;
	}

	public void setLimitQPUBeginTime(Date limitQPUBeginTime) {
		this.limitQPUBeginTime = limitQPUBeginTime;
	}

	public Date getLimitQPUEndTime() {
		return limitQPUEndTime;
	}

	public void setLimitQPUEndTime(Date limitQPUEndTime) {
		this.limitQPUEndTime = limitQPUEndTime;
	}

	public String getKeywords() {
		return Keywords;
	}

	public void setKeywords(String keywords) {
		Keywords = keywords;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
