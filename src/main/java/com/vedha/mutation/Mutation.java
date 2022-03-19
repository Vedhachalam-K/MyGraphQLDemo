package com.vedha.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.vedha.model.CreateStudentRequest;
import com.vedha.response.StudentResponse;
import com.vedha.service.CreateStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    private CreateStudentService createStudentService;

    public StudentResponse createStudent(CreateStudentRequest createStudentRequest) {
        return createStudentService.createStudent(createStudentRequest);
    }

}
