package org.experiments.hateoas.model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.ResourceSupport;

@Getter
@Setter
@Builder
public class Student extends ResourceSupport {
    private String studentName;
    private String courseName;
    private int courseDurationInMonths;

}
