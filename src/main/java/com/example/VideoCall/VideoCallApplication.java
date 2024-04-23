package com.example.VideoCall;

import com.example.VideoCall.service.UserService;
import com.example.VideoCall.user.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideoCallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoCallApplication.class, args);
	}
@Bean
	public CommandLineRunner commandLineRunner(UserService userService){
		return args -> {
			userService.register(User.builder()
					.username("ziwlle")
					.email("letrunghieu28042003@gmail.com")
					.password("aaa")
					.build());
			userService.register(User.builder()
					.username("ziwlle1")
					.email("letrunghieu@gmail.com")
					.password("aaa")
					.build());
			userService.register(User.builder()
					.username("ziwlle2")
					.email("letrunghieu2003@gmail.com")
					.password("aaa")
					.build());
		};
}
}
