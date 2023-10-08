package com.springjwttoken.security.bootstrap;

import com.springjwttoken.security.model.AppUser;
import com.springjwttoken.security.repository.AppUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Bootstrap implements CommandLineRunner {

//    private final AppUser appUser;
    private final AppUserRepository userRepository;

    public void run(String... args) throws Exception {

        var user1 = AppUser.builder()
                .firstName("Bob")
                .lastName("Solinski")
                .email("a@b.com")
                .password("zxc")
                .build();

        userRepository.save(user1);
    }
}
