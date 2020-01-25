/*
 *
 *  * Copyright 2019-2020 the original author or authors.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      https://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package test.org.springdoc.api.app78;

<<<<<<< HEAD
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value = "/person1", method = RequestMethod.GET)
	private CompletionStage<ResponseEntity<PersonDTO>> getPerson1(String str) {
		return null;
	}

	@RequestMapping(value = "/person2", method = RequestMethod.GET)
	private CompletableFuture<PersonDTO> getPerson2(String str) {
		return null;
	}

}
=======
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloController {

	@GetMapping(produces = MediaType.TEXT_PLAIN_VALUE, path = "/test")
	public String echo(@RequestParam Optional<String> text) {
		return text.orElse("not-specified");
	}

}
>>>>>>> 945f0e9e8cbfe98accf6bb98cc7274552fa47441
