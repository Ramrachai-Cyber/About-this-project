public class MainApp {
    public static void main(String[] args) {
        // Initialize the application
        System.out.println("Launching Mobile App...");

        // Example user creation and feature execution
        User user = new User("Jane Doe", "password456");
        user.displayUserInfo();

        // Example of executing a feature
        Feature dashboard = new Feature("Dashboard");
        dashboard.execute();
    }
}

class User {
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void displayUserInfo() {
        System.out.println("User: " + name);
    }
}

class Feature {
    private String featureName;

    public Feature(String featureName) {
        this.featureName = featureName;
    }

    public void execute() {
        System.out.println("Executing feature: " + featureName);
    }
}
