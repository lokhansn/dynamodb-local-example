package com.sgl.dynamodb.api.model.request;

import lombok.Data;
@Data
public class MemberCreationRequest {
    private String firstName;
    private String lastName;
}