package com.sgl.dynamodb.api.model.request;

import lombok.Data;
@Data
public class AuthorCreationRequest {
    private String firstName;
    private String lastName;
}