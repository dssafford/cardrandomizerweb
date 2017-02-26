package com.doug.bootstrap;

import com.doug.domain.*;
import com.doug.domain.security.Role;
import com.doug.repositories.AnswerRepository;
import com.doug.repositories.QuizRepository;
import com.doug.services.RoleService;
import com.doug.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by jt on 12/9/15.
 */
@Component
//@Profile("bootstrap")
public class SpringJPABootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private UserService userService;
    private RoleService roleService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }

    @Autowired
    AnswerRepository answerRepository;

    @Autowired
    QuizRepository quizRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//        loadAnswers();

        //        loadProducts();
//       loadUsersAndCustomers();
//////////        loadCarts();
//////////        loadOrderHistory();
//        loadRoles();
//
//        assignUsersToDefaultRole();
//        assignUsersToAdminRole();
//
//        loadCDMusicians();

    }

private void loadLocationQuiz() {
        Set<Location> locations;

        Set<Quiz> quizzes = new HashSet<>();

        Quiz quiz1 = new Quiz();
//        quiz1
//
//
//
//        q



}

private void loadAnswers(){
    Answer answerDoug = new Answer("doug", "testing","block");
    Answer answerBob = new Answer("bob", "jump","cliff");

    Quiz quizFirstComment = new Quiz("first quiz comment");
    Quiz quizSecondComment = new Quiz("second quiz comment");

    Set<Quiz> quizzes = new HashSet<Quiz>();
    quizzes.add(quizFirstComment);
    quizzes.add(quizSecondComment);

    answerDoug.setQuizzes(quizzes);
    answerBob.setQuizzes(quizzes);

    answerRepository.save(answerBob);
//    answerRepository.save(answerDoug);


    Set<Answer> answers = new HashSet<Answer>();
    answers.add(answerDoug);
    answers.add(answerBob);

    quizFirstComment.setAnswers(answers);
    quizSecondComment.setAnswers(answers);

		quizRepository.save(quizFirstComment);
		quizRepository.save(quizSecondComment);

		//Set <Quiz>

		List<Answer> answerList = answerRepository.findAll();
		List<Quiz> quizList = quizRepository.findAll();


		System.out.println("AnswerList Size" + answerList.size());
		System.out.println("QuizList size" + quizList.size());

		System.out.println("===================Answer info:==================");
		answerList.forEach(answer->System.out.println(answer.toString()));

		System.out.println("===================Answer info:==================");
		quizList.forEach(quiz->System.out.println(quiz.toString()));
}

    private void assignUsersToDefaultRole() {
        List<Role> roles = (List<Role>) roleService.listAll();
        List<User> users = (List<User>) userService.listAll();

        roles.forEach(role ->{
            if(role.getRole().equalsIgnoreCase("CUSTOMER")){
                users.forEach(user -> {
                    user.addRole(role);
                    userService.saveOrUpdate(user);
                });
            }
        });
    }

    private void assignUsersToAdminRole() {
        List<Role> roles = (List<Role>) roleService.listAll();
        List<User> users = (List<User>) userService.listAll();

        roles.forEach(role -> {
            if (role.getRole().equalsIgnoreCase("ADMIN")) {
                users.forEach(user -> {
                    if (user.getUsername().equals("fglenanne")) {
                        user.addRole(role);
                        userService.saveOrUpdate(user);
                    }
                    if (user.getUsername().equals("doug")) {
                        user.addRole(role);
                        userService.saveOrUpdate(user);
                    }
                });
            }
        });
    }


    private void loadRoles() {
        Role role = new Role();
        role.setRole("CUSTOMER");
        roleService.saveOrUpdate(role);

        Role adminRole = new Role();
        adminRole.setRole("ADMIN");
        roleService.saveOrUpdate(adminRole);
    }

//    private void loadOrderHistory() {
//        List<User> users = (List<User>) userService.listAll();
//        List<Product> products = (List<Product>) productService.listAll();
//
//        users.forEach(user ->{
//            Order order = new Order();
//            order.setCustomer(user.getCustomer());
//            order.setOrderStatus(OrderStatus.SHIPPED);
//
//            products.forEach(product -> {
//                OrderDetail orderDetail = new OrderDetail();
//                orderDetail.setProduct(product);
//                orderDetail.setQuantity(1);
//                order.addToOrderDetails(orderDetail);
//            });
//        });
//    }
//
//    private void loadCarts() {
//        List<User> users = (List<User>) userService.listAll();
//        List<Product> products = (List<Product>) productService.listAll();
//
//        users.forEach(user -> {
//            user.setCart(new Cart());
//            CartDetail cartDetail = new CartDetail();
//            cartDetail.setProduct(products.get(0));
//            cartDetail.setQuantity(2);
//            user.getCart().addCartDetail(cartDetail);
//            userService.saveOrUpdate(user);
//        });
//    }

    public void loadUsersAndCustomers() {
        User user1 = new User();
        user1.setUsername("mweston");
        user1.setPassword("password");

//        Customer customer1 = new Customer();
//        customer1.setFirstName("Micheal");
//        customer1.setLastName("Weston");
//        customer1.setBillingAddress(new Address());
//        customer1.getBillingAddress().setAddressLine1("1 Main St");
//        customer1.getBillingAddress().setCity("Miami");
//        customer1.getBillingAddress().setState("Florida");
//        customer1.getBillingAddress().setZipCode("33101");
//        customer1.setEmail("micheal@burnnotice.com");
//        customer1.setPhoneNumber("305.333.0101");
//        user1.setCustomer(customer1);
        userService.saveOrUpdate(user1);

        User user2 = new User();
        user2.setUsername("fglenanne");
        user2.setPassword("password");

//        Customer customer2 = new Customer();
//        customer2.setFirstName("Fiona");
//        customer2.setLastName("Glenanne");
//        customer2.setBillingAddress(new Address());
//        customer2.getBillingAddress().setAddressLine1("1 Key Biscane Ave");
//        customer2.getBillingAddress().setCity("Miami");
//        customer2.getBillingAddress().setState("Florida");
//        customer2.getBillingAddress().setZipCode("33101");
//        customer2.setEmail("fiona@burnnotice.com");
//        customer2.setPhoneNumber("305.323.0233");
//        user2.setCustomer(customer2);
        userService.saveOrUpdate(user2);

        User user3 = new User();
        user3.setUsername("saxe");
        user3.setPassword("password");
//        Customer customer3 = new Customer();
//        customer3.setFirstName("Sam");
//        customer3.setLastName("Axe");
//        customer3.setBillingAddress(new Address());
//        customer3.getBillingAddress().setAddressLine1("1 Little Cuba Road");
//        customer3.getBillingAddress().setCity("Miami");
//        customer3.getBillingAddress().setState("Florida");
//        customer3.getBillingAddress().setZipCode("33101");
//        customer3.setEmail("sam@burnnotice.com");
//        customer3.setPhoneNumber("305.426.9832");
//
//        user3.setCustomer(customer3);
        userService.saveOrUpdate(user3);

        User user4 = new User();
        user4.setUsername("doug");
        user4.setPassword("password");

//        Customer customer4 = new Customer();
//        customer4.setFirstName("Doug");
//        customer4.setLastName("Safford");
//        customer4.setBillingAddress(new Address());
//        customer4.getBillingAddress().setAddressLine1("39W703 Deer Run Drie");
//        customer4.getBillingAddress().setCity("St. Charles");
//        customer4.getBillingAddress().setState("Illinois");
//        customer4.getBillingAddress().setZipCode("60175");
//        customer4.setEmail("doug@yahoo.com");
//        customer4.setPhoneNumber("555.555.5555");
//        user4.setCustomer(customer4);
        userService.saveOrUpdate(user4);
    }

//    public void loadProducts(){
//
//        Product product1 = new Product();
//        product1.setDescription("Product 1");
//        product1.setPrice(new BigDecimal("12.99"));
//        product1.setImageUrl("http://example.com/product1");
//        productService.saveOrUpdate(product1);
//
//        Product product2 = new Product();
//        product2.setDescription("Product 2");
//        product2.setPrice(new BigDecimal("14.99"));
//        product2.setImageUrl("http://example.com/product2");
//        productService.saveOrUpdate(product2);
//
//        Product product3 = new Product();
//        product3.setDescription("Product 3");
//        product3.setPrice(new BigDecimal("34.99"));
//        product3.setImageUrl("http://example.com/product3");
//        productService.saveOrUpdate(product3);
//
//        Product product4 = new Product();
//        product4.setDescription("Product 4");
//        product4.setPrice(new BigDecimal("44.99"));
//        product4.setImageUrl("http://example.com/product4");
//        productService.saveOrUpdate(product4);
//
//        Product product5 = new Product();
//        product5.setDescription("Product 5");
//        product5.setPrice(new BigDecimal("25.99"));
//        product5.setImageUrl("http://example.com/product5");
//        productService.saveOrUpdate(product5);
//
//    }
}
