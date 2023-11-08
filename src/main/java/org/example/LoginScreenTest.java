package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginScreenTest {
    @Test
    public void testSuccessfullLogin() {
        LoginScreen loginScreen = new LoginScreen();
        assertTrue(loginScreen.login("pedro", "password123"));
    }

    @Test
    public void testFaledLogin() {
        LoginScreen loginScreen = new LoginScreen();
        assertFalse(loginScreen.login("pedro", "wrongpassword"));
    }

    @Test
    public void testAddUser() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.addUser("testUser", "testPassword");
        assertTrue(loginScreen.login("testUser", "testPassword"));
    }
}