package com.entity;
/**
 * 	机构表实体类
 * @author hp
 *
 */
public class Chaldea {
	private Integer chaldeaId;//机构id
	private String chaldeaName;//机构名称
	public Integer getChaldeaId() {
		return chaldeaId;
	}
	public void setChaldeaId(Integer chaldeaId) {
		this.chaldeaId = chaldeaId;
	}
	public String getChaldeaName() {
		return chaldeaName;
	}
	public void setChaldeaName(String chaldeaName) {
		this.chaldeaName = chaldeaName;
	}
	@Override
	public String toString() {
		return "Chaldea [chaldeaId=" + chaldeaId + ", chaldeaName=" + chaldeaName + "]";
	}
	

}
