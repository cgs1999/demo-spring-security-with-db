package com.duoduo.system.model;

/**
 * 资源
 * @author Luxh
 */
public class Resource {
	
	private Integer id;
	/**资源名称*/
	private String name;
	/**访问地址*/
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

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
}
