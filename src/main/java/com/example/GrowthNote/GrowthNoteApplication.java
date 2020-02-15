package com.example.GrowthNote;


import com.example.GrowthNote.controllers.UserController;

import java.util.Scanner;

public class GrowthNoteApplication {

    public static void main(String[] args) {
        UserController userController = new UserController();

        boolean loginResult = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input the newly registered username");
		String newUserName = scan.next();
		System.out.println("Please input the newly registered password");
		String newPassword = scan.next();
		userController.addANewUser(newUserName,newPassword);
        while (!loginResult) {
			System.out.println("Please input username");
			String usernameInput = scan.next();
			System.out.println("Please input password");
			String passwordInput = scan.next();
			System.out.println("username:" + usernameInput);
			System.out.println("password:" + passwordInput);
			System.out.print("Check result: ");
			loginResult = userController.getUserByNameAndPassword(usernameInput, passwordInput);
			System.out.println(loginResult);
		}
        System.out.println("login has succeeded~");
    }

}
