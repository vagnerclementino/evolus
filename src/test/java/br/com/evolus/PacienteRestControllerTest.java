package br.com.evolus;

import java.nio.charset.Charset;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class PacienteRestControllerTest {
	
	 private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
	            MediaType.APPLICATION_JSON.getSubtype(),
	            Charset.forName("utf8"));

	    private MockMvc mockMvc;


	    private HttpMessageConverter mappingJackson2HttpMessageConverter;
	    
	    
	    @Before
	    public void setup() throws Exception{
	    	
	        //this.mockMvc = webAppContextSetup().build();

		}

}
