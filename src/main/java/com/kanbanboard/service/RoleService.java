package com.kanbanboard.service;

import com.kanbanboard.entity.Role;
import com.kanbanboard.repo.RoleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Role createNewRole(Role role) {
        return roleRepository.save(role);
    }
    
    public Role getRole(Role role) {
    	return roleRepository.getOne("");
    }
}