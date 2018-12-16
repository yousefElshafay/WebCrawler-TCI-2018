public class UserService {
    private UserDao userDao;
    private  SecurityService securityService;

    public void assignPassword(User user) throws Exception {

        String passwordMd5 =
                securityService.MD5(user.getPassword());
        user.setPassword(passwordMd5);

        userDao.updateUser(user);

    }

    public UserService(UserDao userDao, SecurityService securityService) {
        this.securityService=securityService;
        this.userDao=userDao;

    }
}
