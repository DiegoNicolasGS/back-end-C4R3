package com.reto3.reto3;

import com.reto3.reto3.Crud.AccessoryCrud;
import com.reto3.reto3.Crud.OrderCrud;
import com.reto3.reto3.Crud.UserCrud;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto3Application implements CommandLineRunner{
    
    @Autowired
    private AccessoryCrud crudRepository;
    @Autowired
    private UserCrud userCrudRepository;
    @Autowired
    private OrderCrud orderCrudRepository;


	public static void main(String[] args) {
		SpringApplication.run(Reto3Application.class, args);
	}
        
        @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        crudRepository.deleteAll();
        userCrudRepository.deleteAll();
        orderCrudRepository.deleteAll();
    }
}
