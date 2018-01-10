package com.eshop.springreactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringReactiveApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(SpringReactiveApplication.class, args);
	}

	/*	movieRepository.deleteAll()
			.thenMany(
				Flux.just("Silence of the Lambdas", "AEon Flux", "Enter the Mono<Void>", "The Fluxxinator",
					"Back to the Future", "Meet the Fluxes", "Lord of the Fluxes")
					.map(title -> new Movie(title, UUID.randomUUID().toString()))
					.flatMap(movieRepository::save))
			.subscribe(null, null, () -> {
				movieRepository.findAll().subscribe(System.out::println);
			});
	}*/
}
