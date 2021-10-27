package com.example.study.service;

import com.example.study.ifs.CrudInterface;
import com.example.study.model.entitiy.User;
import com.example.study.model.network.Header;
import com.example.study.model.network.reponse.UserApiResponse;
import com.example.study.model.network.request.UserApiRequest;
import com.example.study.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserApiLogicService implements CrudInterface<UserApiRequest, UserApiResponse> {

    @Autowired
    private UserRepository userRepository;

    // 1. request data를 가져온다
    // 2. user 생성
    // 3. 생성된 데이터 -> UserApiResponse return
    @Override
    public Header<UserApiResponse> create(Header<UserApiRequest> request) {

        // 1. request data를 가져온다
        UserApiRequest userApiRequest = request.getData();

        // 2. user 생성
        User user = User.builder()
                .id(userApiRequest.getId())
                .account(userApiRequest.getAccount())
                .password(userApiRequest.getPassword())
                .status("REGISTERED")
                .phoneNumber(userApiRequest.getPhoneNumber())
                .email(userApiRequest.getEmail())
                .registeredAt(LocalDateTime.now())
                .build();
        User newUser = userRepository.save(user);

        // 3. 생성된 데이터 -> UserApiResponse return

        return response(user);
    }

    @Override
    public Header<UserApiResponse> read(Long id) {

        // id -> repository getOne, hetById
        Optional<User> optional = userRepository.findById(id);

        //use -> userApiResponse return
        return optional
             .map(user -> response(user)
             )
             .orElseGet(
                     ()-> Header.ERROR("데이터 없음")
             );
    }

    @Override
    public Header<UserApiResponse> update(Header<UserApiRequest> request) {
        // 1. data 가져오고
        UserApiRequest userApiRequest = request.getData();

        // 2. id -> user 찾고

        Optional<User> optional = userRepository.findById(userApiRequest.getId());

        optional.map(user -> {
                    // 3. update
                    user.setAccount(userApiRequest.getAccount())
                            .setPassword(userApiRequest.getPassword())
                            .setPhoneNumber(userApiRequest.getPhoneNumber())
                            .setEmail(userApiRequest.getEmail())
                            .setId(userApiRequest.getId())
                            .setRegisteredAt(userApiRequest.getRegisteredAt())
                            .setUnregisteredAt(userApiRequest.getUnregisteredAt());
                    return user;
                    // 4. userApiResponse

        })
                .map(user -> userRepository.save(user))  // 3. update -> updateuser
                .map(updateuser -> response(updateuser))     // 4. userApiResponse
                .orElseGet(() -> Header.ERROR("데이터 없음"));
        return null;
    }

    @Override
    public Header delete(Long id) {
        // 1. id -> repository -> user 를 찾고

        Optional<User> optional = userRepository.findById(id);

        // 2. repository -> delete
        return optional.map(user->{
            userRepository.delete(user);
            return Header.OK();
        })
                .orElseGet(()->Header.ERROR("데이터 없음"));
    }

    private Header<UserApiResponse> response(User user){
        // user -> userApiResponse
        UserApiResponse userApiResponse = UserApiResponse.builder()
                .id(user.getId())
                .account(user.getAccount())
                .password(user.getPassword())
                .status(user.getStatus())
                .phoneNumber(user.getPhoneNumber())
                .email(user.getEmail())
                .registeredAt(user.getRegisteredAt())
                .unregisteredAt(user.getUnregisteredAt())
                .build();
        // Header + data return

        return Header.OK(userApiResponse);
    }
}
