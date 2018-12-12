import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    private UserService userService;

    @Test
    public void UserServiceMocking(){
        //arrange
        User user=mock(User.class);
        UserDao userDao=mock(UserDao.class);
        SecurityService securityService=mock(SecurityService.class);
        userService=new UserService(userDao,securityService);
        






    }
}
