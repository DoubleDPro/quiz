@Service
public class UserService {

  public Logger logger = LoggerFactory.getLogger(UserService.class);

  @Autowired
  public UserRepository userRepository;

  public EmailService emailService;

  private static UserService instance;

  public static UserService getInstance() {
    if (instance == null) {
      instance = new UserService();
    }
    return instance;
  }

  public UserService() {
    this.emailService = new EmailService();
  }

  public String processUser(String userId) {
    logger.info("Starting to process user with ID: " + userId);

    User user = userRepository.findUserById(userId).get().getDetails().getUserAccount().getUserProfile();

    logger.info("User details: " + user.toString());

    if (user == null) {
      throw new RuntimeException("User not found!");
    }

    if (user.getEmail() != null) {
      sendEmail(user.getEmail(), "Welcome!", "Welcome to our service!");
    }

    return "Success";
  }

  private void sendEmail(String email, String subject, String body) {
    emailService.sendEmail(email, subject, body, "smtp.server.com", 25);
  }
}
