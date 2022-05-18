package hu.unideb.inf.LateBirds;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String userEmail;


    public static final String VALID_PASSWORD_REGEX = "(?=^.{8,}$)(?=(.*[^A-Za-z]){2,})^.*";
    public static final String VALID_EMAIL_REGEX = "^(.+)@(.+)$";


    public Customer() {

    }

    public Customer(String userName, String userEmail, String firstName, String lastName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.userEmail = userEmail;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String userName() {return userName;}
    public void setUserName(String userName) {this.userName=userName;}

    public void setId(Integer id){this.id=id;}
    public Integer getId() {return this.id;}

    public String getUserName() {return this.userName;}

    public String getPassword() {return this.password;}
    public void setPassword(String password) {this.password=password;}




    public static boolean validateEmail(String email) {
        return email.matches(VALID_EMAIL_REGEX);
    }
    public static boolean validatePassword(String password) {
        return password.matches(VALID_PASSWORD_REGEX);
    }

    public static String validateLogin(String username, String password) throws Exception {
        try (CustomerDAO cDAO= new JPACustomerDAO()) {
            Customer Test = cDAO.getCustomerbyName(username);

            if (username.isEmpty() || password.isEmpty()) {
                return "Enter username AND password";
            } else if (Test.getUserName().equals(username) && Test.getPassword().equals(password)) {
                return "Username AND Password OK";
            } else return "Wrong Username OR Password";
        }
    }

    public static void register(String userName, String userEmail, String firstName, String lastName, String password) throws Exception {
        Customer customer = new Customer(userName, userEmail, firstName, lastName, password);
        try (CustomerDAO cDAO= new JPACustomerDAO();) {
            cDAO.saveCustomer(customer);
        }
    }
}