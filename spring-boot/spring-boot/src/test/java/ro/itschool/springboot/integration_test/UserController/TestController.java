package ro.itschool.springboot.integration_test.UserController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import ro.itschool.springboot.models.dtos.UserDTO;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@Slf4j
@Transactional
@AutoConfigureTestDatabase
 class TestController {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testCreateUser() throws Exception{
        UserDTO userHagi = new UserDTO();
        userHagi.setName("hagi");
        userHagi.setEmail("hagi@yahoo.com");
        userHagi.setAge(32);
//
//        mockMvc.perform(post(API_USERS_URL)
//                .contentType((MediaType).APPLICATION_JSON)
//                .content(Object.requireNonNull(objectToJsonString(userHagi))))
    }

    @Test
    void testGetUsers() throws Exception {
        mockMvc.perform(get("/api/users")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is(200));
    }

    public String objectToJsonString(Object response) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.findAndRegisterModules();
            String json = mapper.writeValueAsString(response);
            if (!json.contains("logo")) {
                log.info("Resulting JSON string: " + json);
            }
            return json;
        } catch (JsonProcessingException e) {
            log.error("Error processing input ", e.getMessage());
        }
        return null;
    }

}
