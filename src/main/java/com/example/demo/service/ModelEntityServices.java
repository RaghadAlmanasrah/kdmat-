package com.example.demo.service;


import org.springframework.stereotype.Service;

import com.example.demo.entity.ModelEntity;
import com.example.demo.util.ResponseObject;



@Service
public interface ModelEntityServices {
	
	
	public ResponseObject getAllModelEntity() ; 
	
	public ResponseObject getModelEntityById(long modelEntityId);
	
	public ResponseObject createModelEntity(ModelEntity modelEntity);
	
	public ResponseObject updateModelEntity(long id , ModelEntity modelEntity);
	
	public ResponseObject deleteModelEntity(long id);
	
	public ResponseObject loginModelEntity(String userName , String password);
	
	public ResponseObject logOutModelEntity(long id);
	

}
