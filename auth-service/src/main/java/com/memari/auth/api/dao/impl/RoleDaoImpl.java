package com.memari.auth.api.dao.impl;

import com.memari.auth.api.dao.RoleDao;
import org.springframework.stereotype.Repository;

import com.memari.auth.api.model.Role;
import com.quebic.common.dao.impl.GenericDaoImpl;

@Repository
public class RoleDaoImpl extends GenericDaoImpl<Role> implements RoleDao {

	public RoleDaoImpl() {
		super(Role.class);
	}
	
}
