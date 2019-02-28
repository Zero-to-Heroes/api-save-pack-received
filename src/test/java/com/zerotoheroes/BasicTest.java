package com.zerotoheroes;

import org.assertj.core.api.WithAssertions;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BasicTest implements WithAssertions {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    @Ignore
    public void test() throws Exception {
        String jsonRequest = buildJsonRequest();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> request = new HttpEntity<>(jsonRequest, headers);
        String url = "http://localhost:" + this.port + "/packstats";

        ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    private String buildJsonRequest() {
        return "{\n"
                + "\t\"creationDate\": \"2018-10-08T08:04:30.555\",\n"
                + "\t\"userId\": \"fakeUserId\",\n"
                + "\t\"userMachineId\": \"fakeUserMachineId\",\n"
                + "\t\"userName\": \"fakeUserName\",\n"
                + "\t\"setId\": \"boomsday\",\n"
                + "\t\"card1Id\": \"card1Id\",\n"
                + "\t\"card1Type\": \"NORMAL\",\n"
                + "\t\"card1Rarity\": \"common\",\n"
                + "\t\"card2Id\": \"card2Id\",\n"
                + "\t\"card2Type\": \"NORMAL\",\n"
                + "\t\"card2Rarity\": \"common\",\n"
                + "\t\"card3Id\": \"card3Id\",\n"
                + "\t\"card3Type\": \"NORMAL\",\n"
                + "\t\"card3Rarity\": \"common\",\n"
                + "\t\"card4Id\": \"card4Id\",\n"
                + "\t\"card4Type\": \"NORMAL\",\n"
                + "\t\"card4Rarity\": \"rare\",\n"
                + "\t\"card5Id\": \"card5Id\",\n"
                + "\t\"card5Type\": \"GOLDEN\",\n"
                + "\t\"card5Rarity\": \"common\"\n"
                + "}";
    }
}
