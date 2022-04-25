//import static org.junit.jupiter.api.Assertions.*;
//
//import java.sql.SQLException;
//import java.util.List;
//import java.util.Random;
//
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//
//import dev.ibraheem.SPMSdata.DAOFactory;
//import dev.ibraheem.SPMSdata.PitchTableDAO;
//import dev.ibraheem.project1.PitchTable;
//
//import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
//
// 
//@TestMethodOrder(OrderAnnotation.class)
//
//public class PitchTableDaoTest {
//		private static PitchTableDAO pitchTableDao = DAOFactory.PitchTableDAO();
//		private static PitchTable testPitchTable = new PitchTable();
//		private static PitchTable testNewPitchTable = new PitchTable();
//		
//		@BeforeAll
//		public static void setUp() {
//			// this is the base test pet used for most tests
//			testPitchTable.setName("test");
//			
//			// this is the pet to test create and delete
//			Random rand = new Random();
//			testNewPitchTable.setName("test_" + rand.nextInt());
//			
//			// TODO create pet in DB with name "test"
//			// and set the pet's ID to the returned value
//			testPitchTable.setUser_id(pitchTableDao.create(testPitchTable));
//		}
//		
//		@AfterAll
//		public static void cleanUp() throws SQLException {
//			// TODO remove pets in DB with name containing "test"
//			pitchTableDao.delete(testPitchTable);
//		}
//		
//		@Test
//		@Disabled
//		public void getByOwnerExists() {
//			// TODO
//		}
//		
//		@Test
//		@Disabled
//		public void getByOwnerDoesNotExist() {
//			// TODO
//		}
//		
//		@Test
//		public void getByStatus() {
//			String testStatus = "Pending Editor Approval";
//			List<PitchTable> pets = pitchTableDao.getByStatus_name(testStatus);
//			
//			boolean onlyCorrectStatus = true;
//			for (PitchTable pitchTable : pitchTable) {
//				if (!(pitchTable.getStatus_name().equals(testStatus))) {
//					onlyCorrectStatus = false;
//					break;
//				}
//			}
//			assertTrue(onlyCorrectStatus);
//		}
//		
//		@Test
//		@Order(1)
//		public void createPetSuccessfully() {
//			int id = pitchTableDao.create(testNewPitchTable);
//			Pitch_table.setUser_id(id);
//			
//			assertNotEquals(0, id);
//		}
//		
//		@Test
//		public void getByIdExists() {
//			int id = testPitchTable.getUser_id();
//			
//			Pitch_table pitchTable = pitchTableDao.getById(id);
//			
//			assertEquals(testPitchTable, pitchTable);
//		}
//		
//		@Test
//		public void getByIdDoesNotExist() {
//			Pitch_table pet = pitchTableDao.getById(0);
//			assertNull(pet);
//		}
//		
//		@Test
//		public void getAll() {
//			assertNotNull(pitchTableDao.getAll());
//		}
//		
//		@Test
//		public void updatePetExists() {
//			assertDoesNotThrow(() -> {
//				pitchTableDao.update(testPet);
//			});
//		}
//		
//		@Test
//		public void updatePetDoesNotExist() {
//			assertThrows(SQLException.class, () -> {
//				pitchTableDao.update(new Pitch_table());
//			});
//		}
//		
//		@Test
//		@Order(2)
//		public void deletePetExists() {
//			assertDoesNotThrow(() -> {
//				pitchTableDao.delete(testNewPitchTable);
//			});
//		}
//		
//		@Test
//		public void deletePetDoesNotExist() {
//			assertThrows(SQLException.class, () -> {
//				pitchTableDao.delete(new PitchTable());
//			});
//		}
//	}
//
//}
