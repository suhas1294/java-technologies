package com.example.springrelations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import com.example.springrelations.model.Gender;
import com.example.springrelations.model.User;
import com.example.springrelations.model.UserProfile;
import com.example.springrelations.repository.UserProfileRepository;
import com.example.springrelations.repository.UserRepository;

@EnableJpaAuditing
@SpringBootApplication

public class SpringRelationshipsApplication {
	// For one to one relationship
	//public class SpringRelationshipsApplication implements CommandLineRunner{	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringRelationshipsApplication.class, args);
	}
	
	// uncomment below code for one to one and many to many mapping
	
	/*@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserProfileRepository userProfileRepository;
	
	@Autowired
	TagRepository tagRepository;
	
	@Override
	public void run(String... args) throws Exception {
		userProfileRepository.deleteAllInBatch();
		userRepository.deleteAllInBatch();
		
		User user = new User("John", "foo@bar.com", "qwertyuiop");
		UserProfile userProfile = new UserProfile("Bangalore", "India", Gender.MALE);
		
		user.setUserProfile(userProfile);
		userProfile.setUser(user);
		
		User user2 = userRepository.save(user);
		System.out.println(user2.toString());
		
		// =======================================
		
		postRepository.deleteAllInBatch();
        tagRepository.deleteAllInBatch();

        Post post = new Post("Hibernate Many to Many Example with Spring Boot",
                "Learn how to map a many to many relationship using hibernate",
                "Entire Post content with Sample code");

        Tag tag1 = new Tag("Spring Boot");
        Tag tag2 = new Tag("Hibernate");

        post.getTags().add(tag1);
        post.getTags().add(tag2);

        tag1.getPosts().add(post);
        tag2.getPosts().add(post);

        postRepository.save(post);
        
	}*/

}
