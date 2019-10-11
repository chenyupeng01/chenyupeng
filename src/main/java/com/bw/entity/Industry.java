package com.bw.entity;

public class Industry {
	private Integer id;
	private String name;
	private Integer fid;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public Industry(Integer id, String name, Integer fid) {
		super();
		this.id = id;
		this.name = name;
		this.fid = fid;
	}
	public Industry() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Industry [id=" + id + ", name=" + name + ", fid=" + fid + "]";
	}
	
}
