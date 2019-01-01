package tengo.spring.bean;

import java.math.BigDecimal;
import java.util.Date;

/*��Ʒʵ��*/
public class Goods {
	private int id;
	private String name;
	private String nameEn;
	private BigDecimal price;
	// ͼƬ��ַ
	private String imgUrl;
	// ͸��ͼƬ�ĵ�ַ
	private String imgUrlCrystal;
	private String content;
	private String mContent;
	/* ͼ������ */
	private String albums;

	private int stock;
	private int sort;
	/*
	 * ����״̬ ��1.��ʾ���ɹ��� 2.����ʾ���ɹ��� 3.��ʾ�����ɹ��� 4.����ʾ�����ɹ���404����
	 */
	private int saleStatus;
	private Date saleBeginDate;
	private Date saleEndDate;
	// �û�ÿ���޹���
	private int limitQPO;
	// �޹���ʼʱ��
	private Date limitQpoBeginTime;
	// �޹�����ʱ��
	private Date limitQpoEndTime;

	// �û���ʷ���޹���
	private int limitQPU;
	// �޹���ʼʱ��
	private Date limitQPUBeginTime;
	// �޹�����ʱ��
	private Date limitQPUEndTime;

	// ��Ʒ�ؼ���
	private String Keywords;
	// ��Ʒ����
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
