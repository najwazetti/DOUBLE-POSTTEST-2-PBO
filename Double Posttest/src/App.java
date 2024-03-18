import java.util.ArrayList;
import java.util.Scanner;

class UserData {
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String dateOfBirth;

    public UserData(String username, String password, String email, String phoneNumber, String dateOfBirth) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
}

interface Authentication {
    boolean register(String username, String password, String email, String phoneNumber, String dateOfBirth);
    boolean login(String username, String password);
    void displayHomePage();
    void displayMenuOptions();
    void displayUserData();
}

class Facebook implements Authentication {
    private ArrayList<UserData> userDataList = new ArrayList<>();
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String dateOfBirth;

    @Override
    public boolean register(String username, String password, String email, String phoneNumber, String dateOfBirth) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        userDataList.add(new UserData(username, password, email, phoneNumber, dateOfBirth));
        System.out.println("Registration successful for Facebook");
        return true;
    }

    @Override
    public boolean login(String username, String password) {
        if (this.username != null && this.password != null &&
                this.username.equals(username) && this.password.equals(password)) {
            System.out.println("\nLogin successful to Facebook");
            return true;
        } else {
            System.out.println("Login failed");
            return false;
        }
    }

    public void displayHomePage() {
        if (username != null && password != null) {
            System.out.println("=================================");
            System.out.println("Welcome to the Facebook Home Page");
            System.out.println("Username: " + username);
        } else {
            System.out.println("You are not logged in.");
        }
    }

    public void displayMenuOptions() {
        if (username != null && password != null) {
            System.out.println("1. Go back to Home Page");
            System.out.println("2. Login/Register again");
            System.out.println("3. View user data");
            System.out.println("4. Exit");
        }
    }

    public void displayUserData() {
        if (!userDataList.isEmpty()) {
            System.out.println("\nAll Registrations:");
            System.out.println("=================:");
            for (int i = 0; i < userDataList.size(); i++) {
                UserData userData = userDataList.get(i);
                System.out.println("DATA NO : " + i);
                System.out.println("\nUsername: " + userData.getUsername());
                System.out.println("Email: " + userData.getEmail());
                System.out.println("Phone Number: " + userData.getPhoneNumber());
                System.out.println("Date of Birth: " + userData.getDateOfBirth());
                System.out.println();
            }
        } else {
            System.out.println("No registrations found.");
        }
    }
}

class GenshinImpact implements Authentication {
    private ArrayList<UserData> userDataList = new ArrayList<>();
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String dateOfBirth;

    @Override
    public boolean register(String username, String password, String email, String phoneNumber, String dateOfBirth) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        userDataList.add(new UserData(username, password, email, phoneNumber, dateOfBirth));
        System.out.println("\nRegistration successful for Genshin Impact");
        return true;
    }

    @Override
    public boolean login(String username, String password) {
        if (this.username != null && this.password != null &&
                this.username.equals(username) && this.password.equals(password)) {
            System.out.println("\nLogin successful to Genshin Impact");
            return true;
        } else {
            System.out.println("Login failed");
            return false;
        }
    }

    public void displayHomePage() {
        if (username != null && password != null) {
            System.out.println("=======================================");
            System.out.println("Welcome to the Genshin Impact Home Page");
            System.out.println("Username: " + username);
        } else {
            System.out.println("You are not logged in.");
        }
    }

    public void displayMenuOptions() {
        if (username != null && password != null) {
            System.out.println("1. Go back to Home Page");
            System.out.println("2. Login/Register again");
            System.out.println("3. View user data");
            System.out.println("4. Exit");
        }
    }

    public void displayUserData() {
        if (!userDataList.isEmpty()) {
            System.out.println("\nAll Registrations:");
            System.out.println("=================:");
            for (int i = 0; i < userDataList.size(); i++) {
                UserData userData = userDataList.get(i);
                System.out.println("DATA NO : " + i);
                System.out.println("\nUsername: " + userData.getUsername());
                System.out.println("Email: " + userData.getEmail());
                System.out.println("Phone Number: " + userData.getPhoneNumber());
                System.out.println("Date of Birth: " + userData.getDateOfBirth());
                System.out.println();
            }
        } else {
            System.out.println("No registrations found.");
        }
    }
}

class MobileBanking implements Authentication {
    private ArrayList<UserData> userDataList = new ArrayList<>();
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String dateOfBirth;

    @Override
    public boolean register(String username, String password, String email, String phoneNumber, String dateOfBirth) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        userDataList.add(new UserData(username, password, email, phoneNumber, dateOfBirth));
        System.out.println("Registration successful for Mobile Banking");
        return true;
    }

    @Override
    public boolean login(String username, String password) {
        if (this.username != null && this.password != null &&
                this.username.equals(username) && this.password.equals(password)) {
            System.out.println("Login successful to Mobile Banking");
            return true;
        } else {
            System.out.println("Login failed");
            return false;
        }
    }

    public void displayHomePage() {
        if (username != null && password != null) {
            System.out.println("=======================================");
            System.out.println("Welcome to the Mobile Banking Home Page");
            System.out.println("Username: " + username);
        } else {
            System.out.println("You are not logged in.");
        }
    }

    public void displayMenuOptions() {
        if (username != null && password != null) {
            System.out.println("1. Go back to Home Page");
            System.out.println("2. Login/Register again");
            System.out.println("3. View user data");
            System.out.println("4. Exit");
        }
    }

    public void displayUserData() {
        if (!userDataList.isEmpty()) {
            System.out.println("\nAll Registrations:");
            System.out.println("=================:");
            for (int i = 0; i < userDataList.size(); i++) {
                UserData userData = userDataList.get(i);
                System.out.println("DATA NO : " + i);
                System.out.println("\nUsername: " + userData.getUsername());
                System.out.println("Email: " + userData.getEmail());
                System.out.println("Phone Number: " + userData.getPhoneNumber());
                System.out.println("Date of Birth: " + userData.getDateOfBirth());
                System.out.println();
            }
        } else {
            System.out.println("No registrations found.");
        }
    }
}

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int option;

            do {
                System.out.println("1. Enter NIM");
                System.out.println("2. Exit");
                System.out.print("Enter your choice: ");
                option = scanner.nextInt();

                if (option == 1) {
                    int nim;

                    System.out.print("\nEnter NIM: ");
                    nim = scanner.nextInt();

                    Authentication auth;
                    String systemType;

                    if (nim % 3 == 0) {
                        auth = new Facebook();
                        systemType = "Facebook";
                    } else if (nim % 3 == 1) {
                        auth = new GenshinImpact();
                        systemType = "Genshin Impact";
                    } else {
                        auth = new MobileBanking();
                        systemType = "Mobile Banking";
                    }
                    
                    System.out.println("\nLogin and Registration System for " + systemType);

                    do {
                        System.out.println("1. Login");
                        System.out.println("2. Register");
                        System.out.println("3. View user data");
                        System.out.println("4. Exit");
                        System.out.print("Enter your choice: ");
                        option = scanner.nextInt();

                        switch (option) {
                            case 1:
                                System.out.print("\nEnter username: ");
                                String username = scanner.next();
                                System.out.print("Enter password: ");
                                String password = scanner.next();
                                auth.login(username, password);
                                break;
                            case 2:
                                System.out.print("\nEnter username: ");
                                username = scanner.next();
                                System.out.print("Enter password: ");
                                password = scanner.next();
                                System.out.print("Enter email: ");
                                String email = scanner.next();
                                System.out.print("Enter phone number: ");
                                String phoneNumber = scanner.next();
                                System.out.print("Enter date of birth: ");
                                String dateOfBirth = scanner.next();
                                auth.register(username, password, email, phoneNumber, dateOfBirth);
                                break;
                            case 3:
                                auth.displayUserData();
                                break;
                            case 4:
                                System.out.println("\nExiting...");
                                break;
                            default:
                                System.out.println("\nInvalid option.");
                                break;
                        }
                    } while (option != 4);
                }
            } while (option != 2);
        }
    }
}
