package br.com.pedrofurtadoflores.springsecuritysessionapi.service;

import br.com.pedrofurtadoflores.springsecuritysessionapi.dto.request.UserRequestDTO;
import br.com.pedrofurtadoflores.springsecuritysessionapi.dto.response.UserResponseDTO;
import br.com.pedrofurtadoflores.springsecuritysessionapi.model.User;

import java.util.List;

public interface UserService {

    List<UserResponseDTO> getAll();

    UserResponseDTO getById(Long id);

    UserResponseDTO create(UserRequestDTO dto);

    UserResponseDTO update(Long id, UserRequestDTO dto);

    void delete(Long id);

    User findByEmail(String email);
}
