package Reto2_Web;

import Reto2_Web.interfaces.InterfaceClothe;
import Reto2_Web.interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto2WebApplication implements CommandLineRunner {

	@Autowired
	private InterfaceUser interfaceUser;
	@Autowired
	private InterfaceClothe interfaceClothe;
	public static void main(String[] args) {
		SpringApplication.run(Reto2WebApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		interfaceClothe.deleteAll();
		interfaceUser.deleteAll();
	}
}
