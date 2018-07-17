package org.huangqsh.dubbo.service;

import org.huangqsh.dubbo.entity.UserEntity;

public interface UserService {
	void add(UserEntity userEntity);
	
	void deleteById(Integer id);
	
	void update(UserEntity userEntity);
	
	UserEntity getById(Integer id);
}
