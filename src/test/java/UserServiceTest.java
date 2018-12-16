import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    private UserService userService;
    private String Password="fassfa2";

    @Test
    public void UserServiceMocking() throws Exception {
        //arrange
        User user=mock(User.class);
        UserDao userDao=mock(UserDao.class);
        SecurityService securityService=mock(SecurityService.class);
        userService=new UserService(userDao,securityService);
        when(user.getPassword()).thenReturn(Password);
        userService.assignPassword(user);
        //verify(user).getPassword();
      //  verify(userDao).updateUser(user);


    }
}
