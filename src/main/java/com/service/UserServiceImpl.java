package com.service;

import com.dto.*;
import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Locale;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    public void main() {
        userRepository.getUserList()
                .add(User.builder()
                        .id(1)
                        .name("Заболотский Александр Николаевич")
                        .age(19)
                        .email("Zab1@mail.ru")
                        .login("zab1")
                        .password("123")
                    .build());
        userRepository.getUserList()
                .add(User.builder()
                        .id(2)
                        .name("Заболотская Светлана Егоровна")
                        .age(50)
                        .email("Zab2@mail.ru")
                        .login("zab2")
                        .password("123")
                        .build());userRepository.getUserList()
                .add(User.builder()
                        .id(3)
                        .name("Заболотский Николай Иванович")
                        .age(55)
                        .email("Zab3@mail.ru")
                        .login("zab3")
                        .password("123")
                        .build());
    }

    @Override
    public GetUserByIdRsDto getById(int id) {
        for (Integer ur=0; ur<userRepository.getUserList().size(); ur++){
            if (id == ur+1){
                return GetUserByIdRsDto.builder().user(userRepository.getUserList().get(ur)).build();
                //break;
            }
        }
        return null;
    }

    @Override
    public List<User> getList() {
        return userRepository.getUserList();
    }

    @Override
    public LoginRsDto Verification(LoginRqDto loginRqDto) {
        boolean ver = false;
        String rqLogin = loginRqDto.getLogin();
        String rqPassword = loginRqDto.getPassword();

        for (User ur : userRepository.getUserList())
        {
            String userLogin =  ur.getLogin();
            String userPassword =  ur.getPassword();

            if (rqLogin.equals(userLogin)){
                if (rqPassword.equals(userPassword) ){
                    ver = true;
                }
            }
        }
        return LoginRsDto.builder().verification(ver).build();
    }

    @Override
    public RegistrationRsDto Registration(RegistrationRqDto registrationRqDto) {
        boolean ver = true;
        String rqLogin = registrationRqDto.getLogin().toLowerCase(Locale.ROOT);
        String rqEmail = registrationRqDto.getEmail().toLowerCase(Locale.ROOT);

        for (User ur : userRepository.getUserList())
        {
            String userLogin =  ur.getLogin().toLowerCase(Locale.ROOT);
            String userEmail =  ur.getEmail().toLowerCase(Locale.ROOT);

            if (rqLogin.equals(userLogin) || rqEmail.equals(userEmail)) {
                ver = false;
            }
        }
        return RegistrationRsDto.builder().verification(ver).build();
    }
}
