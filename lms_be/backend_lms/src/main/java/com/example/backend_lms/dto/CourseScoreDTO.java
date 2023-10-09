package com.example.backend_lms.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import lombok.Data;

import java.util.List;

@Data
public class CourseScoreDTO{
    @JsonIncludeProperties({"name","id"})
    private CourseDTO courseDTO;

    @JsonIncludeProperties({"name","id"})
    private StudentDTO studentDTO;

    private Double GPA;

    private List<ScoreExamDTO> scoreExamDTOS;
    
    private List<ScoreExerciseDTO> scoreExerciseDTOS;
}