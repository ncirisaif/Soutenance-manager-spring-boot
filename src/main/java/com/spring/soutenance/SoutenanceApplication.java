package com.spring.soutenance;

<<<<<<< HEAD
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.soutenance.DAO.RoleRepository;
import com.spring.soutenance.DAO.UserRepository;
import com.spring.soutenance.domain.Role;
import com.spring.soutenance.springsocial.config.AppProperties;
=======
import com.spring.soutenance.DAO.RoleRepository;
import com.spring.soutenance.Service.UserService;
>>>>>>> 91b3dc92a671722fccd3876725f715f68b06e8bb
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;


@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class SoutenanceApplication implements CommandLineRunner {

@Autowired
UserRepository userService;
@Autowired
UserRepository userRepository;
@Autowired
	 BCryptPasswordEncoder bCryptPasswordEncoder;
@Autowired
RoleRepository roleRepository;



	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}




	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}





=======
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication (exclude = { SecurityAutoConfiguration.class})
public class SoutenanceApplication implements CommandLineRunner {

@Autowired
UserService userService;
	@Autowired
	private RoleRepository roleRepository;
>>>>>>> 91b3dc92a671722fccd3876725f715f68b06e8bb
	public static void main(String[] args) {
		SpringApplication.run(SoutenanceApplication.class, args);


	}


	@Override
	public void run(String... args) throws Exception {
<<<<<<< HEAD
/*

	Role r1 = new Role();
		r1.setRole("ADMIN");
		roleRepository.save(r1);
		Role r2 = new Role();
		r2.setRole("ETUDIANT");
		roleRepository.save(r2);

		Role r3 = new Role();
		r3.setRole("ENSEIGNANT");
		roleRepository.save(r3);
*/


/*
		Etudiant e = new Etudiant();
		//e.setUserId(1);
		e.setUsername("ncirisaif");
		e.setPassword(bCryptPasswordEncoder.encode("1234"));
		e.getUserRoles().add(roleRepository.findByRole("ETUDIANT").get());
		userService.save(e);
*/

		/*Admin a = new Admin();
		a.setUserId(2);
		a.setActive(1);
		a.setUserName("sayf");
		a.setPassword("admin");
		a.setFirstName("Saifeddine");
		a.getUserRoles().add(roleService.findByName("ADMIN").get());
		userService.saveUser(a);*/
=======
		//UserApp user=new UserApp();
		//Etudiant e = new Etudiant();
>>>>>>> 91b3dc92a671722fccd3876725f715f68b06e8bb
		//e.setFirstName("achref");
		//userService.saveUser(e);
		//user.setUserId(5);
		//userService.saveUser(user);
		//userService.deleteById(2);
		//userService.deleteByUser(e);




<<<<<<< HEAD
		//System.err.println(userRepository.findByUserName("sayf").get().getUserRoles());





=======
>>>>>>> 91b3dc92a671722fccd3876725f715f68b06e8bb


	}

}


