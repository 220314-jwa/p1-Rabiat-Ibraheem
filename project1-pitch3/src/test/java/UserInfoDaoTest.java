import java.sql.SQLException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.ClassOrderer.Random;
import org.junit.jupiter.api.Test;
import dev.ibraheem.SPMSExceptions.UserNotFound;
import dev.ibraheem.SPMSdata.DAOFactory;
import dev.ibraheem.SPMSdata.UserInfoDAO;
import dev.ibraheem.project1.UserInfo;

//import java.util.Random;
//
import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//
//import dev.ibraheem.SPMSdata.DAOFactory;
//import dev.ibraheem.SPMSdata.PersonDAO;
//import dev.ibraheem.project1.Person;
//

public class UserInfoDaoTest {
	
		private static UserInfoDAO userInfoDao = DAOFactory.getUserInfoDAO();
		private static UserInfo testUserInfo = new UserInfo();
		private static UserInfo testNewUserInfo = new UserInfo();
		
		@BeforeAll
		public static void setUp() {
			
			testUserInfo.setUsername("test");
			
			Random rand = new Random();
			testNewUserInfo.setUsername("test_" + rand.toString());
			
			//testUserInfo.setUser_id(userInfoDao.create(testUserInfo));
		}
		
		@AfterAll
		public static void cleanUp() {
			try {
				userInfoDao.delete(testUserInfo);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void getByUsername() {
			UserInfo userInfo = userInfoDao.findByUsername("test");
			assertEquals(testUserInfo, userInfo);
		}
		
		@Test
		public void getByUsernameDoesNotExist() {
			UserInfo userInfo = userInfoDao.findByUsername("qwertyuiop");
			assertNull(userInfo);
		}
		
		@Test
		//@Order(1)
		public void createUserSuccessfully() {
			int id = userInfoDao.create(testNewUserInfo);
			testNewUserInfo.setUser_id(id);
			assertNotEquals(0, id);
		}
		
		@Test 
	//	@Disabled 
		public void createUserDuplicateUsername() {
			int user_id = userInfoDao.create(testUserInfo);
			
			assertEquals(0, user_id);
		}
		
		@Test
		public void getByIdExists() throws UserNotFound {
			int user_id = testUserInfo.getUser_id();
			
			UserInfo userInfo = userInfoDao.findByUserId(user_id);
			
			assertEquals(testUserInfo, userInfo);
		}
		
		@Test
		public void getByIdDoesNotExist() throws UserNotFound {
			UserInfo userInfo = userInfoDao.findByUserId(0);
			assertNull(userInfo);
		}
		
		@Test
		public void getAll() {
			assertNotNull(userInfoDao.showAllUsers());
		}
		
		@Test
		public void updateUserDoesNotExist() {
			assertThrows(SQLException.class, () -> {
				userInfoDao.update(new UserInfo());
			});
		}
		
		@Test
		public void deleteUserExists() {
			assertDoesNotThrow(() -> {
				userInfoDao.delete(testNewUserInfo);
			});
		}
		
		@Test
		public void deleteUserDoesNotExist() {
			assertThrows(SQLException.class, () -> {
				userInfoDao.delete(new UserInfo());
			});
		}
}
//
//
//	
//
//
