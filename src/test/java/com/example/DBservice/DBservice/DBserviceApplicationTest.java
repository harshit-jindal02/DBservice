package com.example.DBservice.DBservice;

import com.example.DBservice.DBservice.model.Department;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DBserviceApplicationTest {

	@Test
	void contextLoads() {
	}

//	@Autowired
//	private TestRestTemplate restTemplate;
//
//	@LocalServerPort
//	private int port;
//
//
//	@Test
//	void testDepartment() throws InterruptedException {
//		getDepartment();
//		// addDepartment();
//		// getDepartment();
//	}
//
//	void getDepartment() throws InterruptedException {
//
//		WebClient client = WebClient.create("http://localhost"+port);
//		Flux<Department> departmentFlux =
//				client.get().uri("/departments").exchangeToFlux(Department.class);
//
//		departmentFlux.subscribe(System.out::println);
//
//
//// Make a GET request to retrieve the book
//		ResponseEntity<EntityModel> response =
//		//restTemplate.getForEntity("http://localhost:"+port + "/departments", Department[].class);
//
//				restTemplate.getForEntity("http://localhost:"+port+"/departments",
//						EntityModel.class);
//
//
//
//		restTemplate.exchange("http://localhost:" + port + "/departments",
//				HttpMethod.GET,
//				null,
//				new ParameterizedTypeReference<>() {
//				});
//
//		assertEquals(HttpStatus.OK, response.getStatusCode());
//		EntityModel<Department[]> bookResource = response.getBody();
//		//assertNotNull(bookResource);
//		//assertEquals(book.getTitle(), bookResource.getContent().getTitle());
//		 */
//
//		// Verify the self link
//		//assertTrue(bookResource.hasLink("self"));
//		//Link selfLink = bookResource.getLink("self").orElseThrow(() -> new AssertionError("Self link not found"));
//		//assertEquals(baseUrl + "/" + book.getId(), selfLink.getHref());
//
//		//assert bookResource != null;
//		//System.out.println(bookResource.toString());
//
//	}
//
//
//	void addDepartment(){
//
//		Department department = new Department();
//		department.setDepartmentName("ASET");
//
//		webTestClient
//				.post()
//				.uri("/departments")
//				.body(Mono.just(department), Department.class)
//				.exchange()
//				.expectStatus().is2xxSuccessful().expectBody();
//	}
//
//
}
