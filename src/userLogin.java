import java.util.Scanner;

public class userLogin {
    public static void main(String[] args){
        String username, password, newPassword ;
        String reelUserName = "ebachilles";
        String reelPassword = "istebenimsifrem";

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your username ? : ");
        username = scan.nextLine();


        System.out.println("What is your password ? : ");
        password = scan.nextLine();

        String yesOrNo;
        if (!((password.equals(reelPassword)) && (username.equals(reelUserName)))) {
            System.out.println("Your password or username is wrong. Did you forgot your password ? ");
            yesOrNo = scan.nextLine();
            if (yesOrNo.equals("e")){
                System.out.println("What is your new password ? ");
                newPassword = scan.nextLine();
                if (newPassword.equals(password)) {
                    System.out.println("It is former password. Try again. ");
                }
                    else{ System.out.println("Operation succesful!");}

                }
            }
        else { System.out.println("Logging..");}
        }


    }

