package com.thoughtworks.capability.gtb.entrancequiz.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class StudentControllerTest {
    @Autowired
    MockMvc mockMvc;
    @Test
    public void should_return_all_student_by_divide() throws Exception {
        mockMvc.perform(get("/students")).andExpect(status().isOk());
        mockMvc.perform(get("/studentList"))
                .andExpect(jsonPath("$.formatter",hasSize(6)))
                .andExpect(status().isOk());
    }
}