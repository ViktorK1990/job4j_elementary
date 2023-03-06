package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for(User user : users){
            if(login.equals(user.getUsername())){
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }
    public static boolean validate(User user) throws UserInvalidException {
       if(user.getUsername().length() > 3){
           return true;
       }
       throw new UserInvalidException("User name is less then 3");
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petor Arsentev", true)
        };
        try {User user = findUser(users, "Petor Arsentev");
        if (validate(user)) {
            System.out.println("This user has an access");}
        }
        catch (UserNotFoundException | UserInvalidException exception){
            exception.printStackTrace();
        }
    }
}