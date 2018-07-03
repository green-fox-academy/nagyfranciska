package com.database.db;

import com.database.db.models.Todo;
import com.database.db.repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbApplication implements CommandLineRunner {

	TodoRepo todoRepo;

		@Autowired
		public DbApplication(TodoRepo todoRepo) {
			this.todoRepo = todoRepo;
		}


	public static void main(String[] args) {
		SpringApplication.run(DbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			todoRepo.save(new Todo("buy milk"));
			todoRepo.save(new Todo("walk dog"));
	}
}
