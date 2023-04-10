package ro.itschool.springboot.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ro.itschool.springboot.models.dtos.UserDTO;

import java.util.ArrayList;
import java.util.List;
@Slf4j
@Service
public class UserServiceImpl implements UserService{

    List<UserDTO> userDTOList = new ArrayList<>();
    public UserDTO createUser(UserDTO userDTO) {
        userDTOList.add(userDTO);
        log.info("User created: " + userDTO.getName());
        return userDTO;
    }

    public List<UserDTO> getUsers() {
        return userDTOList;
    }

    @Override
    public UserDTO deleteUserByName(String name) {
        for (UserDTO user : userDTOList) {
            if (user.getName().equalsIgnoreCase(name)) {
                userDTOList.remove(user);
                log.info("User removed: " + user.getName());
                return user;
            }
        }
        return null;
    }
}
