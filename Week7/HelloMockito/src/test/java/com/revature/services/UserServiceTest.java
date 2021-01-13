package com.revature.services;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.revature.models.User;
import com.revature.repositories.IUserDAO;

//@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

	@Mock
	private IUserDAO mockedDao;
	
	private UserService testInstance  = new UserService(mockedDao);
	private User u = new User(1, "kewlUsername", "password");
	
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		testInstance = new UserService(mockedDao);
		
	//	u = new User(1, "kewlUsername", "password");
		
		when(mockedDao.findByUsername("kewlUsername")).thenReturn(u);
		when(mockedDao.findById(1)).thenReturn(u);
		//when(mockedDao.findByUsername(anyString())).thenReturn(null);
		//when(mockedDao.findById(anyInt())).thenReturn(null);	
	}
	
	@Test
	public void testLoginByNameSuccess() {
		 
		assertTrue(testInstance.loginWithName("kewlUsername", "password"));
		//verify(mockedDao, times(1)).findByUsername("kewlUsername");
	}
	
	@Test
	public void testLoginByNameFail() {
		assertFalse(testInstance.loginWithName("coolUsername", "password"));
	}
	
	@Test
	public void testLoginByIdSuccess() {
		assertTrue(testInstance.loginWithId(1, "password"));
	}
	
	@Test
	public void testLoginByIdFail() {
		assertFalse(testInstance.loginWithId(1, "sassword"));
	}
	
}
