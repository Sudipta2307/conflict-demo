package com;

public class UserService {
    public String getUserDetails() {
        return "Merged version: User from both branches";
    }

    public boolean isUserActive(String userId) {
        return true;
    }
}
