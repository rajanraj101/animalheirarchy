package demo.assignment.test;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class AnimalControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void animalCount_when_statusIsOk() throws Exception {

        this.mockMvc.perform(get("/animalCount"))
        			.andDo(print())
        			.andExpect(status().isOk());
        
    }
    
   @Test
    public void animalCount_when_countMatches() throws Exception {
 
	 this.mockMvc.perform(get("/animalCount"))
        					.andExpect(jsonPath("$.fly").value(1))
							.andExpect(jsonPath("$.walk").value(1))
        					.andExpect(jsonPath("$.swim").value(5))
        					.andExpect(jsonPath("$.sing").value(4));
    }

}
