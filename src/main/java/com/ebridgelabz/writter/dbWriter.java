package com.ebridgelabz.writter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ebridgelabz.repository.*;
import com.ebridgelabz.model.*;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

@Component
public class dbWriter implements ItemWriter<User> {
	@Autowired
	private UserRepo UserRepository;

	@Override
	public void write(List<? extends User> users) throws Exception {
		 System.out.println("Data Saved for Users: " + users);
	        for (User user : users) {
				System.out.println(user);
				UserRepository.save(user);
			}
	}


}
