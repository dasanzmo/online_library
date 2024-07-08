package com.workshop.library.api.dto.request;

import com.workshop.library.utils.enums.RoleType;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    @NotBlank(message = "The user name is required.")
    private String userName;

    @Size(min = 0, max = 100)
    @Email(message = "The email must be a valid email address.")
    @NotBlank(message = "The user email is required.")
    private String email;

    @Size(min = 8, max = 20, message = "The password requires min 8 characters")
    @NotBlank(message = "The user password is required.")
    private String password;

    @NotBlank(message = "The full name is required.")
    private String fullName;

    @Size(min = 0, max = 32)
    @NotBlank(message = "The user role Id is required.")
    private RoleType role;
}