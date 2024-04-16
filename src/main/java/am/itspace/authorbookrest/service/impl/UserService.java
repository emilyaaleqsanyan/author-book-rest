package am.itspace.authorbookrest.service.impl;

import am.itspace.authorbookrest.dto.CreateUserRequestDto;
import am.itspace.authorbookrest.dto.UserDto;
import am.itspace.authorbookrest.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface UserService {


    UserDto create(CreateUserRequestDto createUserRequestDto);

    User findByEmail(String email);

    User findById(int id);


    void uploadImage(User byId, MultipartFile multipartFile) throws IOException;
}
