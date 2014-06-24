package com.duoduo.system.model;
/**
 * 角色资源
 * @author Luxh
 */
public class RoleResource {
	private Integer id;
	/**角色id*/
	private Integer roleId;
	/**资源id*/
	private Integer resourceId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public Integer getResourceId() {
		return resourceId;
	}

	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
}
