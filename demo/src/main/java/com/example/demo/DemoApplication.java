package com.example.demo;
//Los import son del framework spring y spring boot
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//las anotaciones se usan mucho, para denotar clases con una funcionalidad determinada en el framework y tambien para generar codigo 
@SpringBootApplication //es una clase de una app springboot
@RestController //seguimos el diseño RestFull, es por tanto, un controlador rest (puede haber mas de una)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args); //se ejecuta la app Spring
	}

  	@GetMapping("/hello") //metodo por el que la clase es un rest controller. El metodo esta asociado a una peticion GET en la ruta /hello 
   	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		   //tiene un argumento name pero tambien una notacion para asociar el parametro con la peticion GET, el @Request... entonces lo que llega ?nombre=valor en la URL se asocia a esos dos argumentos de entrada
   		return String.format("Hello %s!", name); //retorna una cadena con el nombre que le pasemos
   	}


}

