package com.coderhouse.apis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.coderhouse.interfaces.UserRestInterface;
import com.coderhouse.models.User;

@Component
public class UserRestApi implements UserRestInterface {
	
	private final String BASE_URL = "https://6785a744f80b78923aa41f0b.mockapi.io/users";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<User> getAllUsers() {
		try {
			@SuppressWarnings("unchecked")
			List<User> users = restTemplate
					.exchange(BASE_URL, HttpMethod.GET, null, List.class).getBody();
			return users;
		} catch (Exception e) {
			throw new RuntimeException("Error al obtener los Usuarios"+ e.getMessage(), e);
		}
		
	}

	@Override
	public User gerUserById(String id) {
		try {
			String url = BASE_URL + "/" + id;
			return restTemplate.getForObject(url, User.class);
			
		} catch (Exception e) {
			throw new RuntimeException("Error al obtener el Usuarios"+ e.getMessage(), e);
		}
		
	}

	@Override
	public User addUser(User user) {
		try {
			return restTemplate.postForObject(BASE_URL, user, User.class);
		} catch (Exception e) {
			throw new RuntimeException("Error al crear el Usuarios"+ e.getMessage(), e);
		}
		
	}
	
	@Override
	public User updatesUser(User user) {
		try {
			String url = BASE_URL + "/" + user.getId();
			restTemplate.put(url, user);
			return user;
		} catch (Exception e) {
			throw new RuntimeException("Error al actualizar el Usuarios"+ e.getMessage(), e);
		}
	}
	

	@Override
	public void deleteUser(String id) {
		try {
			String url = BASE_URL + "/" + id;
			restTemplate.delete(url);
			
		} catch (Exception e) {
			throw new RuntimeException("Error al eliminar el Usuarios"+ e.getMessage(), e);
		}
	}

	
}
