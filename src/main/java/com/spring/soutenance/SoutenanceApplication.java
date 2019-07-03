package com.spring.soutenance;

import com.spring.soutenance.DAO.RoleRepository;
import com.spring.soutenance.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication (exclude = { SecurityAutoConfiguration.class})
public class SoutenanceApplication implements CommandLineRunner {

@Autowired
UserService userService;
	@Autowired
	private RoleRepository roleRepository;
	public static void main(String[] args) {
		SpringApplication.run(SoutenanceApplication.class, args);


	}


	@Override
	public void run(String... args) throws Exception {
		//UserApp user=new UserApp();
		//Etudiant e = new Etudiant();
		//e.setFirstName("achref");
		//userService.saveUser(e);
		//user.setUserId(5);
		//userService.saveUser(user);
		//userService.deleteById(2);
		//userService.deleteByUser(e);






	}

}


