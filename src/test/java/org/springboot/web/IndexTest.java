package org.springboot.web;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.data.jpa.mapping.JpaMetamodelMappingContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IndexTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void main_loading() {
        //when
        String body = this.restTemplate.getForObject("/", String.class);

        // Log the response body
        System.out.println("Response body: " + body);

        //then
        assertThat(body).contains("스프링 부트로 시작하는 웹 서비스");
    }

}
