
public class ERSTests {

	UserDAO ud = new UserDAO();
	EmployeeDAO ed = new EmployeeDAO();
	RoleDAO rd = new RoleDAO();
	
	@Test
	public void testSuccessfulLogin() {
		
		assertTrue(ud.login("user", "password"));
		
	}
	
	@Test 
	public void testFailedLogin() {
		
		assertFalse(ud.login("ayy", "lmao"));
	
	}
	
	@Test
	public void testDataIsReturnedOnValidRoleSearch() {
		
		assertNotNull(ed.getEmployeesByRole("Fry Cook"));
		
	}
	
	
	@Test
	public void testNullIsReturnedOnInvalidRoleSearch() {
		
		assertEquals(rd.getRoleById(-5000), null);
		
	}
	
	
	@Test
	public void testRecordUniqueness() {
		assertNotSame(rd.getRoleById(1), rd.getRoleById(2));
		assertNotSame(rd.getRoleById(3), rd.getRoleById(4));
	}
	
	
}
