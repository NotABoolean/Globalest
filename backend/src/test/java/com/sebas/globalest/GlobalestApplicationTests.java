package com.sebas.globalest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class) // <-- Esto levanta Docker con PostGIS para el test
@SpringBootTest
class GlobalestApplicationTests {

	@Test
	void contextLoads() {
	}

}
