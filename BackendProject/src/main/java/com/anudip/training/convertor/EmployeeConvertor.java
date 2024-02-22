package com.anudip.training.convertor;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.anudip.training.dto.EmployeeDTO;
import com.anudip.training.entity.Employee;

@Component
public class EmployeeConvertor {

	// Converting User entity to UserDTO
    public EmployeeDTO convertToUserDTO(EmployeeDTO user) {
    	EmployeeDTO employeeDTO = new EmployeeDTO();
        if (user != null) {
            BeanUtils.copyProperties(user, userDTO);
        }
        return userDTO;
    }

    // Converting User DTO to entity
    public User convertToEntity(UserDTO userDTO) {
        User user = new User();
        if (userDTO != null) {
            BeanUtils.copyProperties(userDTO, user);
        }
        return user;
    }

    // Converting list of User entities to list of UserDTOs
    public List<UserDTO> convertToUserDTOList(List<User> users) {
        return users.stream()
                .map(this::convertToUserDTO)
                .collect(Collectors.toList());
    }
}
